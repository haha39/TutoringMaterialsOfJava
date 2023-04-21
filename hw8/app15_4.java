public class app15_4 {
    public static void main(String[] args) {
        Ctest dog = new Ctest("doggy");
        Ctest cat = new Ctest("kitty");

        dog.start();
        try {
            dog.join();
            cat.start();
            cat.join();
        } catch (InterruptedException e) {
        }

        System.out.println("main() finished");

    }
}
