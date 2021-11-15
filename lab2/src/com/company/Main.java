package com.company;

import com.company.factory.*;
import com.company.furniture.Furniture;
import com.company.technique.PC;
import com.company.technique.Playstation;
import com.company.technique.TV;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        BaseFurnitureFactory steampunkFactory = SteampunkFurnitureFactory.getSteampunkFurnitureFactoryFactory();
        TV tv = new TV();
        Playstation ps5 = new Playstation();
        PC predator = new PC();
        TechniqueAdapter tvAdapter = new TechniqueAdapter(tv);
        TechniqueAdapter ps5Adapter = new TechniqueAdapter(ps5);
        TechniqueAdapter pcAdapter = new TechniqueAdapter(predator);
        House house = House.getHouse();
        house.arrangeHouse(tvAdapter,ps5Adapter,pcAdapter
                ,steampunkFactory.createFurniture("sofa")
                ,steampunkFactory.createFurniture("chair")
                ,steampunkFactory.createFurniture("table"));

        System.out.println("\n-----------------------------------------------------------------------\n");

        FurnitureCustomizer customizer = new FurnitureCustomizer(steampunkFactory);


        System.out.println(customizer.getCustomFurniture("sofa", "pink", "My Style"));
        System.out.println(customizer.getCustomFurniture("chair", "blue", "Custom Style"));
        System.out.println(customizer.getCustomFurniture("table", "red", "My own style"));


        System.out.println(steampunkFactory.createFurniture("chair").toString());
        System.out.println(steampunkFactory.createFurniture("sofa").toString());
        System.out.println(steampunkFactory.createFurniture("table").toString());

        BaseFurnitureFactory vintageFactory = VintageFurnitureFactory.getVintageFurnitureFactory();
        System.out.println(vintageFactory.createFurniture("chair").toString());
        System.out.println(vintageFactory.createFurniture("sofa").toString());
        System.out.println(vintageFactory.createFurniture("table").toString());

        BaseFurnitureFactory modernFactory = ModernFurnitureFactory.getModernFurnitureFactory();
        System.out.println(modernFactory.createFurniture("chair").toString());
        System.out.println(modernFactory.createFurniture("sofa").toString());
        System.out.println(modernFactory.createFurniture("table").toString());

    }

}
