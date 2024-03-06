package learn03;

class Car{
    String name;
    int model;

    public Car(String name,int model){
        this.name=name;
        this.model=model;
    }
    public void displayInfo(){
        System.out.println("name"+name);
        System.out.println("model"+model);
    }
}
public class ClassAndOBjects {
    public static void main (String args[]){
        Car c1=new Car("audi",1);
        Car c2=new Car("bmw",2);
        c1.displayInfo();
        c2.displayInfo();

    }
}
