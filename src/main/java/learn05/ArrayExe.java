package learn05;

public class ArrayExe {
    public static void main(String args[]){
        //single dimension array
        int arr[]={1,2,3,4,5,6,7,8,9};
        for(int i :  arr){
            System.out.print(i);
        }
        System.out.println(" ");
        //two dimension array
        int arr2[][]= { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8}};
        //System.out.println(arr2[2][2]);//array index out of bond
        for (int[] j: arr2){
            for (int k: j){
                System.out.print(k);
            }
        }

    }
}
