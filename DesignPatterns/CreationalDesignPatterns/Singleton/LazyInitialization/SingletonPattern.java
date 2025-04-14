package DesignPatterns.CreationalDesignPatterns.Singleton.LazyInitialization;

//Lazy Initialization
//Instance is created only when it is requested for the first time.
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public void displayMessage(){
        System.out.println("Lazy Singleton Initialization");
    }
}
public class SingletonPattern {
    public static void main(String[] args){
        Singleton singleton=Singleton.getInstance();
        singleton.displayMessage();
    }
}
