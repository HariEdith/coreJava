package learn04;

class Vechical{
    private String name;
    private String color;

    public Vechical(String name,String color){
        this.name=name;
        this.color=color;
    }
    public void info(){
        System.out.println("name :"+ name);
        System.out.println("color :"+ color);
    }
}
class Car extends Vechical{
    private int number;
    public Car(String name,String color,int number){
        super(name,color);
        this.number=number;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("number : "+ number);
    }
}
public class InheritanceExe02 {
    public static void main(String args[]){
        Car car=new Car("bmw","yello",12);
        car.info();

    }
}
