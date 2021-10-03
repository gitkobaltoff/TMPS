package com.company;

import com.company.Factory.BaseFactory;
import com.company.Factory.VintageFurnitureFactory;
import com.company.Factory.SteampunkFurnitureFactory;
import com.company.Factory.ModernFurnitureFactory;

public class Main {

    public static void main(String[] args) {
        BaseFactory steampunkFactory = SteampunkFurnitureFactory.getSteampunkFurnitureFactoryFactory();
        System.out.println(steampunkFactory.createFurniture("chair").toString());
        System.out.println(steampunkFactory.createFurniture("sofa").toString());
        System.out.println(steampunkFactory.createFurniture("table").toString());

        BaseFactory vintageFactory = VintageFurnitureFactory.getVintageFurnitureFactory();
        System.out.println(vintageFactory.createFurniture("chair").toString());
        System.out.println(vintageFactory.createFurniture("sofa").toString());
        System.out.println(vintageFactory.createFurniture("table").toString());

        BaseFactory moderFactory = ModernFurnitureFactory.getModernFurnitureFactory();
        System.out.println(moderFactory.createFurniture("chair").toString());
        System.out.println(moderFactory.createFurniture("sofa").toString());
        System.out.println(moderFactory.createFurniture("table").toString());

    }
}
