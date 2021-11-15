package com.company;

import com.company.furniture.builder.ChairBuilder;
import com.company.furniture.builder.FurnitureBuilder;
import com.company.furniture.builder.SofaBuilder;
import com.company.furniture.builder.TableBuilder;

public class Director {

    public FurnitureBuilder makeModernChair(ChairBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Modern");
        builder.setPrice(400f);
        return builder;
    }

    public FurnitureBuilder makeModernSofa(SofaBuilder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Modern");
        builder.setPrice(1000f);
        return builder;
    }

    public FurnitureBuilder makeModernTable(TableBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Modern");
        builder.setPrice(1200f);
        return builder;
    }

    public FurnitureBuilder makeVintageChair(ChairBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Vintage");
        builder.setPrice(650f);
        return builder;
    }

    public FurnitureBuilder makeVintageSofa(SofaBuilder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Vintage");
        builder.setPrice(1650f);
        return builder;
    }

    public FurnitureBuilder makeVintageTable(TableBuilder builder){
        builder.reset();
        builder.setName("Table");
        builder.setStyle("Vintage");
        builder.setPrice(2050f);
        return builder;
    }

    public FurnitureBuilder makeSteampunkChair(ChairBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Steampunk");
        builder.setPrice(1100f);
        return builder;
    }

    public FurnitureBuilder makeSteampunkSofa(SofaBuilder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Steampunk");
        builder.setPrice(8999.99f);
        return builder;
    }

    public FurnitureBuilder makeSteampunkTable(TableBuilder builder){
        builder.reset();
        builder.setName("Table");
        builder.setStyle("Steampunk");
        builder.setPrice(10000f);
        return builder;
    }
}
