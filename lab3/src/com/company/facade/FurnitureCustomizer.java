package com.company.facade;

import com.company.factory.BaseFurnitureFactory;
import com.company.factory.wrappers.BaseFurnitureFactoryDecorator;
import com.company.factory.wrappers.ColorCustomizer;
import com.company.furniture.Furniture;

public class FurnitureCustomizer {

    private final BaseFurnitureFactory furnitureFactory;

    public FurnitureCustomizer(BaseFurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public Furniture getCustomFurniture(String type, String customColor, String style) {
        BaseFurnitureFactoryDecorator customizer = new ColorCustomizer(furnitureFactory, customColor);
        Furniture customFurniture = customizer.createFurniture(type);
        customFurniture.setStyle(style);
        return customFurniture;
    }
}
