package learn04;

class Calculation {
    // make objects as private for encapsulation
    private int i;
    private int j;

    //getters and setters
    public int getI() {return i;}
    public void setI(int i) {this.i = i;}
    public int getJ() {return j;}
    public void setJ(int j) {this.j = j;}

    //add method
    public int add(int i, int j) {return i + j;}
}

public class Encapsulation {
    public static void main (String args[]){
        Calculation c=new Calculation();
        int m=c.add(1,2);
        System.out.println(m);
    }
}
