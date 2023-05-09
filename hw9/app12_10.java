public class app12_10 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Black & White");

        System.out.println(str);
        System.out.println("length = " + str.length());
        System.out.println(str.replace(0, 5, "cat"));
        System.out.println(str.replace(7, 12, "dogs"));
        System.out.println(str.reverse());
        System.out.println(str);

    }
}
