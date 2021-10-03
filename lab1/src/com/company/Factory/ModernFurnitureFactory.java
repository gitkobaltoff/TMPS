package com.company.Factory;

import com.company.Director;
import com.company.Furniture.Builder.ChairBuilder;
import com.company.Furniture.Builder.SofaBuilder;
import com.company.Furniture.Builder.TableBuilder;
import com.company.Furniture.Furniture;

public class ModernFurnitureFactory implements BaseFactory{

    private static volatile ModernFurnitureFactory modernFurnitureFactory;
    private Director director = new Director();

    public static ModernFurnitureFactory getModernFurnitureFactory() {
        if (modernFurnitureFactory == null)
            synchronized (ModernFurnitureFactory.class) {
                if (modernFurnitureFactory == null)
                    modernFurnitureFactory = new ModernFurnitureFactory();
            }
        return modernFurnitureFactory;
    }

    private ModernFurnitureFactory() {}

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
                return  null;
        }
    }
}
