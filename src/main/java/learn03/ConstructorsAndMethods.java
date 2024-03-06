package learn03;

class Rectangel {
    int n1;
    int n2;

    //constructor
    public Rectangel(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int area() {
        return n1 * n2;
    }

    public int parameter() {
        return 2 * (n1 + n2);
    }
}
public class ConstructorsAndMethods {
        public static void main(String args[]){
            Rectangel r1=new Rectangel(2,3);
            int area1=r1.area();
            int parameter1=r1.parameter();
            System.out.println(area1);
            System.out.println(parameter1);

        }
}

