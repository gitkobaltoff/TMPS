package com.company.factory;

import com.company.facade.Director;
import com.company.furniture.builder.ChairBuilder;
import com.company.furniture.builder.SofaBuilder;
import com.company.furniture.builder.TableBuilder;
import com.company.furniture.Furniture;

public class VintageFurnitureFactory implements BaseFurnitureFactory {

    private static volatile VintageFurnitureFactory vintageFurnitureFactory;
    private final Director director = new Director();

    private VintageFurnitureFactory() {
    }

    public static VintageFurnitureFactory getVintageFurnitureFactory() {
        if (vintageFurnitureFactory == null)
            synchronized (VintageFurnitureFactory.class) {
                if (vintageFurnitureFactory == null)
                    vintageFurnitureFactory = new VintageFurnitureFactory();
            }
        return vintageFurnitureFactory;
    }

    @Override
    public Furniture createFurniture(String type) {
        switch (type) {
            case "chair":
                ChairBuilder chairBuilder = new ChairBuilder();
                director.makeVintageChair(chairBuilder);
                return chairBuilder.getProduct();
            case "sofa":
                SofaBuilder sofaBuilder = new SofaBuilder();
                director.makeVintageSofa(sofaBuilder);
                return sofaBuilder.getProduct();
            case "table":
                TableBuilder tableBuilder = new TableBuilder();
                director.makeVintageTable(tableBuilder);
                return tableBuilder.getProduct();
            default:
                return null;
        }
    }
}
