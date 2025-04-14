package DesignPatterns.CreationalDesignPatterns.Factory.OCP;

interface Shape {
    void drawShape();
}
class Square implements Shape {

    @Override
    public void drawShape() {
        System.out.println("Drawing Square");
    }
}
class Circle implements Shape {

    @Override
    public void drawShape() {
        System.out.println("Drawing Circle");
    }
}

//Adding a new shape involves creating a new factory class, promoting better extensibility and adherence to the Open/Closed Principle.
interface ShapeFactory {
    Shape createShape();
}
class SquareFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Square();
    }
}
class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
public class FactoryPattern {
    public static void main(String[] args){
        ShapeFactory factory=new CircleFactory();
        Shape shape=factory.createShape();
        shape.drawShape();

        ShapeFactory factory1=new SquareFactory();
        Shape shape1=factory1.createShape();
        shape1.drawShape();
    }
}
