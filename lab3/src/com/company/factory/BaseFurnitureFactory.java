package com.company.factory;

import com.company.furniture.Furniture;

public interface BaseFurnitureFactory {
    Furniture createFurniture(String type);
}
