package ArrayList;
import java.sql.SQLOutput;
import java.util.List;
import java.util.LinkedList;



public class Linked_List {
    public static void main(String[] args) {
        List<String> heros = new LinkedList<>();
        System.out.println("My LinkedList:"+heros);
        heros.add("NTR");
        heros.add("ANR");
        heros.add("NBK");
        heros.add("NKR");
        heros.add("Ram Charan");
        System.out.println("MY linkedList After Adding :"+heros);
        heros.remove(4);
        System.out.println("MY Removed Linked List:"+heros);
        String temp = heros.get(0);


        for (String hero :heros ){
            System.out.println("MY linkedList using Iterator:"+heros);
        }
        heros.add("Roshan");
        System.out.println("My LinkedList After Adding :"+heros);

        ((LinkedList<String>)heros).addFirst("Arjun");
        ((LinkedList<String>)heros).addLast("Alok");
        System.out.println("My LinkedList After Adding first :"+heros);
        System.out.println("My LinkedList After Adding Last :"+heros);
    }
}
