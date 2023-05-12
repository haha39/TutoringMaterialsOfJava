class CMember<T> {
    private T id;

    public void setId(T value) {
        id = value;

    }

    public void show() {
        System.out.println("id = " + id);
    }
}

public class app16_2 {
    public static void main(String[] args) {
        CMember<Integer> obj1 = new CMember<Integer>();
        CMember<String> obj2 = new CMember<String>();

        obj1.setId(6);
        obj2.setId("lily");

        obj1.show();
        obj2.show();
    }
}
