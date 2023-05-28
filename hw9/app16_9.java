import java.util.*;

public class app16_9 {
    public static void main(String[] args) {
        HashSet<String> test1 = new HashSet<String>();

        test1.add("monkey");
        test1.add("bunny");
        test1.add("puppy");
        test1.add("kitty");

        for (String i : test1)
            System.out.println(i + "  ");
    }
}
