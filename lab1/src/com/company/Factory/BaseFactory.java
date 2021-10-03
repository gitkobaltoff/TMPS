package com.company.Factory;

import com.company.Furniture.Furniture;

public interface BaseFactory {
    Furniture createFurniture(String type);
}
