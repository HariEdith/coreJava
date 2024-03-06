package learn08;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExe {
    public static void main(String args[]){
        //-----------HashSet----------------//
        //allows null
        Set<String> hashSet=new HashSet<>();

        hashSet.add("apple");
        hashSet.add("orrange");
        hashSet.add("banana");
        hashSet.add("mango");
        hashSet.add("mango");// duplicate not allowed

        //print hashSet
        System.out.println("HashSet elements: " + hashSet);

        //-----------TreeSet--------------//
        Set<String> treeSet= new TreeSet<>();
        //treeSet.add();// null not allowed
        treeSet.add("apple");
        treeSet.add("orange");
        treeSet.add("banana");
        treeSet.add("mango");
        treeSet.add("mango");

        //print
        System.out.println("TreeSet Ellements :" + treeSet);//natural order


    }
}
