package learn04;

class Calculator{
    //runtime time polymorphism
    public int add(int a,int b){return a+b;}
    public int add(int a, int b, int c){return a+b+c;}
    public String add(String a,String b){return a+b;}

}
public class Overloading {
    public static void main(String args[]){
        Calculator c=new Calculator();
        String m=c.add("1","2");
        System.out.println(m);
    }
}
