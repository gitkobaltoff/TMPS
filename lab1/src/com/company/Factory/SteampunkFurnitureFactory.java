package com.company.Factory;

import com.company.Director;
import com.company.Furniture.Builder.ChairBuilder;
import com.company.Furniture.Builder.SofaBuilder;
import com.company.Furniture.Builder.TableBuilder;
import com.company.Furniture.Furniture;

public class SteampunkFurnitureFactory implements BaseFactory{

    private static volatile SteampunkFurnitureFactory steampunkFurnitureFactory;
    private Director director = new Director();

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
