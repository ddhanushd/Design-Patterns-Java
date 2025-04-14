package DesignPatterns.CreationalDesignPatterns.Singleton.DoubleCheckedLocking;

//A more efficient way of implementing a thread-safe Singleton.
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                instance=new Singleton();
            }
        }
        return instance;
    }
    void display(){
        System.out.println("Thread Safe Singleton");
        System.out.println("A more efficient way of implementing a thread-safe Singleton.");
    }
}
public class SingletonPattern {
    public static void main(String[] args){
        Singleton.getInstance().display();
    }
}
