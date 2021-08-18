package ArrayLists.AutoBoxingUnBoxingLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Linked list
        LinkedList<String> placesToVist = new LinkedList<String>();
        placesToVist.add("Japan");
        placesToVist.add("Norway");
        placesToVist.add("Spain");
        placesToVist.add("Sweden");

        printList(placesToVist);
        placesToVist.add(1, "France");
    }

    private static void printList(LinkedList<String> placesToVist) {
        Iterator<String> i = placesToVist.listIterator();
        while (i.hasNext()){
            System.out.println("Now visiting..." + i.next());
        }
        System.out.println("==============================");
    }
}


