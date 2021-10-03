package com.company;

import com.company.Furniture.Builder.ChairBuilder;
import com.company.Furniture.Builder.FurnitureBuilder;
import com.company.Furniture.Builder.SofaBuilder;
import com.company.Furniture.Builder.TableBuilder;

public class Director {

    public FurnitureBuilder makeModernChair(ChairBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Modern");
        builder.setPrice(875f);
        return builder;
    }

    public FurnitureBuilder makeModernSofa(SofaBuilder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Modern");
        builder.setPrice(3000f);
        return builder;
    }

    public FurnitureBuilder makeModernTable(TableBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Modern");
        builder.setPrice(2100f);
        return builder;
    }

    public FurnitureBuilder makeVintageChair(ChairBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Vintage");
        builder.setPrice(690f);
        return builder;
    }

    public FurnitureBuilder makeVintageSofa(SofaBuilder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Vintage");
        builder.setPrice(2400f);
        return builder;
    }

    public FurnitureBuilder makeVintageTable(TableBuilder builder){
        builder.reset();
        builder.setName("Table");
        builder.setStyle("Vintage");
        builder.setPrice(1600f);
        return builder;
    }

    public FurnitureBuilder makeSteampunkChair(ChairBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Steampunk");
        builder.setPrice(315f);
        return builder;
    }

    public FurnitureBuilder makeSteampunkSofa(SofaBuilder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Steampunk");
        builder.setPrice(4200f);
        return builder;
    }

    public FurnitureBuilder makeSteampunkTable(TableBuilder builder){
        builder.reset();
        builder.setName("Table");
        builder.setStyle("Steampunk");
        builder.setPrice(1475f);
        return builder;
    }
}
