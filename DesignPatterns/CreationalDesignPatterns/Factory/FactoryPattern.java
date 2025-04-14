package DesignPatterns.CreationalDesignPatterns.Factory;

interface Shape {
    void draw();
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle Drawn");
    }
}
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Recangle Drawn");
    }
}
class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        }
        return null;
    }
}
public class FactoryPattern {
    public static void main(String[] args){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1= shapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("rectangle");
        shape2.draw();
    }
}
