import java.util.LinkedList;
import java.util.ListIterator;

public class app16_11 {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<Integer>();

        llist.add(5);
        llist.add(50);
        llist.add(500);
        llist.add(5000);

        ListIterator<Integer> litr1 = llist.listIterator();

        System.out.println("show linkedlist");
        while (litr1.hasNext()) {
            System.out.print(litr1.next() + " ");
        }
        System.out.println();

        ListIterator<Integer> litr2 = llist.listIterator(llist.size());

        System.out.println("previous show linkedlist");
        while (litr2.hasPrevious()) {
            System.out.print(litr2.previous() + " ");
        }
    }
}
