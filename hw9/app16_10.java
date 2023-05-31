import java.util.*;
//non map

public class app16_10 {
    public static void main(String[] args) {
        HashSet<String> test2 = new HashSet<String>();

        test2.add("monkey");
        test2.add("bunny");
        test2.add("puppy");
        test2.add("kitty");

        Iterator<String> itr = test2.iterator();
        String str = "";

        System.out.println("test2 : ");

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + "    ");
        }

        itr.remove();
        System.out.println("test2 : ");
        System.out.println(test2);

    }
}
