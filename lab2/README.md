# Topic: Creational Design Patterns
## Author: Tcacenco Igor, FAF-191
## Objectives:
1. **Study the Structural Design Patterns**<br>
2. **Expanding previous laboratory work by adding some additional functionalities using some structural design patterns**<br>

## Theory:
In software engineering, a design pattern is a general repeatable
 solution to a commonly occurring problem in software design.
 A design pattern isn't a finished design that can be transformed 
 directly into code. It is a description or template for how to 
 solve a problem that can be used in many different situations.
 Creational design patterns are all about class instantiation. 
 This pattern can be further divided into class-creation patterns 
 and object-creational patterns. 
While class-creation patterns use inheritance effectively in the
 instantiation process, object-creation patterns use delegation 
 effectively to get the job done.<br>
<br>
**Creational Design Patterns** provide various object creation mechanisms,
 which increase flexibility and reuse of existing code.<br>
Some examples of this kind of design patterns are:<br>
- Singleton
- Builder
- Prototype
- Object Pooling
- Factory Method
- Abstract Factory
<br>
##
**Design patterns** are typical solutions to common problems
in software design. Each pattern is like a blueprint
that can be customized to solve a particular
design problem.They define a common language that helps developer teams
communicate more efficiently.<br>
<br>
In software engineering, the **Structural Design Patterns** are concerned with how classes and objects are composed
 to form larger structures.
 Structural class patterns use inheritance to create a hierarchy of classes/abstractions,
 but the structural object patterns use composition which is generally a more flexible alternative to inheritance.<br>
Some examples of from this category of design patterns are:<br>
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

## Implementation:<br>
Thre structural design patterns are implemented in this project: Decorator, Facade and Adapter with 
the emphasis on the objects of type Furniture:Chair, Table, Sofa and objects of type Technique:
PC, TV, Playstation.Type Furniture contains 4 attributes, *get* and *set* methods and *toString*, which is used 
for output,type Technique contains 3 attributes and same methods as Furniture type.<br>
**Adapter DP**, I've implemented in **TechniqueAdapter** using composition:
```
public class TechniqueAdapter extends AdapterUtil {

    private final Technique object;
```
It allows me to use method _arrangeHouse(Furniture... furnishes)_ from class House, 
with parameters of type Technique instead of type Furniture, which are incompatible types because of different attributes (_Style_ and _Brand_)<br>

```
    void arrangeHouse(Furniture... furnishes){
        System.out.println("\nCreated house contain objects:\n");
        for (Furniture furniture : furnishes)
            System.out.println(furniture.toString());
    }
```
<br>

The __Decorator DP__  lets us attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
In my project I have implemented it in __BaseFurnitureFactoryDecorator__ class from package wrappers, using composition:
```
public class BaseFurnitureFactoryDecorator  {

    protected BaseFurnitureFactory wrapper;
```
With its help I attach new behavior _Color setting_ from __ColorCustomizer__ class.
__ColorCustomizer__ allow us to add new function to our factory, which now instead of creating a standard furniture object, in our case attribute _color_
is set to _standard_, will create a furniture object with desired color.
<br>

```
@Override
    public Furniture createFurniture(String type) {
        Furniture furniture = super.createFurniture(type);
        furniture.setColor(this.customColor);
        return furniture;
    }
```

Third structural DP that I had implemented is **Facade DP** which allows me to hide the complex process of creating  and customizing furniture item
and make this processes simpler for user. I have implemented this DP in **FurnitureCustomizer** class:
Method *getCustomFurniture()* allows user to obtain furniture item with his personal color and in his own style.

```

public Furniture getCustomFurniture(String type, String customColor, String style) {
        BaseFurnitureFactoryDecorator customizer = new ColorCustomizer(furnitureFactory, customColor);
        Furniture customFurniture = customizer.createFurniture(type);
        customFurniture.setStyle(style);
        return customFurniture;
    }
```

Methods from **Director** class simplify process of building furniture items using builder:
```
public FurnitureBuilder makeModernChair(ChairBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Modern");
        builder.setPrice(400f);
        return builder;
    }
```
<br>

