package ch13;

public class ThreadEx2 {
    public static void main(String[] args) {
    ThreadEx2_1 t1 = new ThreadEx2_1();
    t1.start();

        System.out.println(1);
        System.out.println(2);

    }
}

class ThreadEx2_1 extends Thread {
    @Override
    public void run() {
        System.out.println(3);
        System.out.println(4);
        throwException();
    }

    private void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}