package com.company.factory.wrappers;

import com.company.factory.BaseFurnitureFactory;
import com.company.furniture.Furniture;

public class BaseFurnitureFactoryDecorator implements BaseFurnitureFactory{

    protected BaseFurnitureFactory wrapper;

    public BaseFurnitureFactoryDecorator(BaseFurnitureFactory baseFurnitureFactory){
        this.wrapper = baseFurnitureFactory;
    }

    public Furniture createFurniture(String type) {
        return wrapper.createFurniture(type);
    }
}
