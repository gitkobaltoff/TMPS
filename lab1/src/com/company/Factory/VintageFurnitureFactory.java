package com.company.Factory;

import com.company.Director;
import com.company.Furniture.Builder.ChairBuilder;
import com.company.Furniture.Builder.SofaBuilder;
import com.company.Furniture.Builder.TableBuilder;
import com.company.Furniture.Furniture;

public class VintageFurnitureFactory implements BaseFactory{

    private static volatile VintageFurnitureFactory vintageFurnitureFactory;
    private Director director = new Director();

    private VintageFurnitureFactory () {}

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
                return  null;
        }
    }
}
