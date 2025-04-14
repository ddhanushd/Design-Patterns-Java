package DesignPatterns.CreationalDesignPatterns.Singleton.Static_Inner_helper_class;

//It is also called Bill Pugh Singleton Design
class Singleton {
    private Singleton(){}

    private static class SingletonHelper{
        private static final Singleton instance=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHelper.instance;
    }
    void display(){
        System.out.println("Static Inner Helper Inner Class");
    }
}
public class SingletonPattern {
    public static void main(String[] args){
        Singleton.getInstance().display();
    }
}
