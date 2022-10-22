package ch13;

public class ThreadEx3 {
    public static void main(String[] args) {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        System.out.println(1);
        t1.run();
        System.out.println(2);
        System.out.println(3);
    }
}

class ThreadEx3_1 extends Thread {
    @Override
    public void run() {
        throwException();
        System.out.println(4);
    }

    private void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
