package com.company.factory;

import com.company.facade.Director;
import com.company.furniture.builder.ChairBuilder;
import com.company.furniture.builder.SofaBuilder;
import com.company.furniture.builder.TableBuilder;
import com.company.furniture.Furniture;

public class ModernFurnitureFactory implements BaseFurnitureFactory {

    private static volatile ModernFurnitureFactory modernFurnitureFactory;
    private final Director director = new Director();

    public static ModernFurnitureFactory getModernFurnitureFactory() {
        if (modernFurnitureFactory == null)
            synchronized (ModernFurnitureFactory.class) {
                if (modernFurnitureFactory == null)
                    modernFurnitureFactory = new ModernFurnitureFactory();
            }
        return modernFurnitureFactory;
    }

    private ModernFurnitureFactory() {
    }

    @Override
    public Furniture createFurniture(String type) {
        switch (type) {
            case "chair":
                ChairBuilder chairBuilder = new ChairBuilder();
                director.makeModernChair(chairBuilder);
                return chairBuilder.getProduct();
            case "sofa":
                SofaBuilder sofaBuilder = new SofaBuilder();
                director.makeModernSofa(sofaBuilder);
                return sofaBuilder.getProduct();
            case "table":
                TableBuilder tableBuilder = new TableBuilder();
                director.makeModernTable(tableBuilder);
                return tableBuilder.getProduct();
            default:
                return null;
        }
    }
}
