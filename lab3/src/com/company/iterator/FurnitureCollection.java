package com.company.iterator;

import com.company.furniture.Furniture;

import java.util.Iterator;

public interface FurnitureCollection {
    Iterator<Furniture> iterator();
}
