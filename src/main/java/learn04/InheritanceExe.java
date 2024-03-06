package learn04;

class Animal{
    void sound(){
        System.out.println("make soound");
    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("barking");
    }
}
public class InheritanceExe {
    public static void main(String args[]){
        Dog d=new Dog();
        Animal a=new Animal();
        //a.sound();

    }
}
