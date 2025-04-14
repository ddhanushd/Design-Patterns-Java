package DesignPatterns.CreationalDesignPatterns.Singleton.ThreadSafe;

 class Singleton {
     private static Singleton instance;

     private Singleton() {
     }
     //To make it thread-safe, you can synchronize the method.
     public static synchronized Singleton getInstance(){
         if(instance==null){
             instance=new Singleton();
         }
         return instance;
     }
     void display(){
         System.out.println("Thread Safe Singleton");
     }
 }
public class SingletonPattern {
     public static void main(String[] args){
         Singleton.getInstance().display();
     }
}
