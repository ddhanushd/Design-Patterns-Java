package DesignPatterns.CreationalDesignPatterns.Singleton.Enum;

enum Singleton {
    instance;

    void display(){
        System.out.println("Enum Singleton");
    }
}
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.instance;
        singleton.display();
    }
}
