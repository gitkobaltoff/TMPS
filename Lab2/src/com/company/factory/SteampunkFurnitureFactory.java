package com.company.factory;

import com.company.Director;
import com.company.furniture.builder.ChairBuilder;
import com.company.furniture.builder.SofaBuilder;
import com.company.furniture.builder.TableBuilder;
import com.company.furniture.Furniture;

public class SteampunkFurnitureFactory implements BaseFurnitureFactory {

    private static volatile SteampunkFurnitureFactory steampunkFurnitureFactory;
    private final Director director = new Director();

    private SteampunkFurnitureFactory() {}

    public static SteampunkFurnitureFactory getSteampunkFurnitureFactoryFactory() {
        if (steampunkFurnitureFactory == null)
            synchronized (SteampunkFurnitureFactory.class) {
                if (steampunkFurnitureFactory == null)
                    steampunkFurnitureFactory = new SteampunkFurnitureFactory();
            }
        return steampunkFurnitureFactory;
    }

    @Override
    public Furniture createFurniture(String type) {
        switch (type){
            case "chair":
                ChairBuilder chairPBuilder = new ChairBuilder();
                director.makeSteampunkChair(chairPBuilder);
                return chairPBuilder.getProduct();
            case "sofa":
                SofaBuilder sofaPBuilder = new SofaBuilder();
                director.makeSteampunkSofa(sofaPBuilder);
                return sofaPBuilder.getProduct();
            case "table":
                TableBuilder tablePBuilder = new TableBuilder();
                director.makeSteampunkTable(tablePBuilder);
                return tablePBuilder.getProduct();
            default:
                return null;
        }
    }
}
