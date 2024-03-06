package learn08;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExe {
    public static void main(String[] args) {
        // Creating ArrayList
        List<String> arrayList = new ArrayList<>();
        // Adding elements to ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Creating LinkedList
        List<Integer> linkedList = new LinkedList<>();
        // Adding elements to LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Creating Vector
        List<Double> vector = new Vector<>();
        // Adding elements to Vector
        vector.add(3.14);
        vector.add(2.718);
        vector.add(1.618);

        // Displaying elements of ArrayList
        System.out.println("ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Displaying elements of LinkedList
        System.out.println("\nLinkedList elements:");
        for (int num : linkedList) {
            System.out.println(num);
        }

        // Displaying elements of Vector
        System.out.println("\nVector elements:");
        for (double num : vector) {
            System.out.println(num);
        }
    }
}
