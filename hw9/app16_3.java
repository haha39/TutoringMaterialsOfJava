import java.util.*;

public class app16_3 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        String str1 = "puppy";
        String str2 = "kitty";

        System.out.println("hash empty : " + hset.isEmpty());

        hset.add("monkey");
        hset.add("bunny");
        hset.add(str1);
        hset.add(str2);

        hset.remove(str2);

        hset.remove("bunny");

        // hset.clear();

        System.out.println(hset.size());
        System.out.println(hset);

    }
}
