package com.company.factory.wrappers;

import com.company.factory.BaseFurnitureFactory;
import com.company.furniture.Furniture;

public class ColorCustomizer extends BaseFurnitureFactoryDecorator {

    private final String customColor;

    public ColorCustomizer(BaseFurnitureFactory baseFurnitureFactory, String customColor) {
        super(baseFurnitureFactory);
        this.customColor = customColor;
    }

    @Override
    public Furniture createFurniture(String type) {
        Furniture furniture = super.createFurniture(type);
        furniture.setColor(this.customColor);
        return furniture;
    }

}
