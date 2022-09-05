package ch8;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello");

        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[3]);


        System.out.println(Eat.hamburger());
    }

    static class Eat {
        static String hamburger(){
            return "Eat Hamburger";
        }
    }
}
