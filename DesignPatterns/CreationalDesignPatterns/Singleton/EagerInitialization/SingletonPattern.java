package DesignPatterns.CreationalDesignPatterns.Singleton.EagerInitialization;

//Eager Initialization
//Instance is created immediately when the class is loaded
class Singleton {
    private static final Singleton instance=new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return instance;
    }
    void display(){
        System.out.println("Eager Singleton Initialization");
    }
}
public class SingletonPattern {
    public static void main(String[] args){
        Singleton singleton=Singleton.getInstance();
        singleton.display();
    }
}
