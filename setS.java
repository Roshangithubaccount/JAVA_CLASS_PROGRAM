package set;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class setS {
    public static void main(String[] args) {
        Set<String> gods = new HashSet<>();
        System.out.println("My empty set is :"+gods);
        gods.add("Raghav");
        gods.add("Bhim");
        gods.add("Lakshaman");
        gods.add("Ravan");
        gods.add("Satrudhan");
        gods.add("Ravan");
        System.out.println("My Empty Set After Adding "+ gods);  // here it shows unorder property

        gods.remove("Satrudhan")   ;
        System.out.println("My removed set is :"+ gods);


        for (String new1: gods){
            System.out.println("My empty set using for loop :"+ new1);
        }
    }
}
