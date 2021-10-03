# Topic: Creational Design Patterns
## Author: Tcacenco Igor, FAF-191

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

## Implementation:<br>
In this project I've implemented 4 creational design patterns i.e(Abstract Factory, Factory Method, Singleton and Builder) with 
the emphasis on the objects of type Furniture:Chair, Table, Sofa. Type Furniture contains 3 attributes, *get* and *set* methods and *toString*, which is used 
for output.<br>
**Singleton DP**, I've implemented in **SteampunkFurnitureFactory**, **ModernFurnitureFactory** and **VintageFurnitureFactory** classes. For this I use a
static attribute for instance.<br><br>
`private static VintageFurnitureFactory vintageFurnitureFactory;`<br>
`private static SteampunkFurnitureFactory steampnkFurnitureFactory;`<br>
`private static  ModernFurnitureFactory modernFurnitureFactory;`<br><br>
Then I declare the constructor as private:<br><br>
`private VintageFurnitureFactory () {}`<br>
`private SteampunkFurnitureFactory() {}`<br>
`private ModernFurnitureFactory() {}`<br><br>
So that the class could be instantiated only from *getInstance()* method which is a
static and by a simple if i.e.:<br>
```
public static ModernFurnitureFactory getModernFurnitureFactory() {
        if (modernFurnitureFactory == null)
            synchronized (ModernFurnitureFactory.class) {
                modernFurnitureFactory = new ModernFurnitureFactory();
            }
        return modernFurnitureFactory;
    }
```
<br>

The __Builder DP__ ensures that a program can create different objects by the same creational process.
In my project there are 2 stages to create the furniture object. First is chosen the factory by the style of furniture(Vintage, Modern,
 Steampunk) and then in the coresponding factory is chosen a builder class. The creation methods are implemented in __Director__ class.<br>
<br>
The factory methods that I've used in my project are in Builder package ,FurnitureBuilder interface.
There are multiple classes which implement the interface(ChairBuilder, SofaBuilder, TableBuilder). Then based on the type parameter it is chosen one of them.<br>
<br>
Above that I have the factories which get the coresponding builder for each *style* .
These factories implements the **BaseFactory** interface. <br>
<br>
The process of creating different types of furnitures of different styles is in the following lines from **Main** class:
<br>

```

BaseFactory cyberPunkFactory = SteampunkFurnitureFactory.getSteampunkFurnitureFactoryFactory();
        System.out.println(steampunkFactory.createFurniture("chair").toString());
        System.out.println(steampunkFactory.createFurniture("sofa").toString());
        System.out.println(steampunkFactory.createFurniture("table").toString());

        BaseFactory artDecoFactory = VintageFurnitureFactory.getVintageFurnitureFactory();
        System.out.println(vintageFactory.createFurniture("chair").toString());
        System.out.println(vintageFactory.createFurniture("sofa").toString());
        System.out.println(vintageFactory.createFurniture("table").toString());

        BaseFactory moderFactory = ModernFurnitureFactory.getModernFurnitureFactory();
        System.out.println(modernFactory.createFurniture("chair").toString());
        System.out.println(modernFactory.createFurniture("sofa").toString());
        System.out.println(modernFactory.createFurniture("table").toString());
```

<br>

### Program output:<br>
![Output](https://github.com/gitkobaltoff/TMPS/blob/main/lab1/img/output.jpg)
<br>
### Diagram of program structure:
![Output](https://github.com/gitkobaltoff/TMPS/blob/main/lab1/img/diagram1.jpg)
<br>
### UML diagram of program structure:
![Output](https://github.com/gitkobaltoff/TMPS/blob/main/lab1/img/diagram2.jpg)
