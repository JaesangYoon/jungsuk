package ch6;


class MyMath2 {
    long a, b;

    long add() { return a + b; } // a, b는 인스턴스 변수
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    long divide() { return a / b; }

    static long add(int a, long b) { return a + b; } // a, b는 지역변수
//    static long add(long a, int b) { return a + b; } // a, b는 지역변수
    static long subtract(int a, int b){ return a - b; }
    static long multiply(int a, int b) { return a * b; }
    static long divide(int a, int b) { return a / b; }
}

public class Ex6_9 {
    public static void main(String[] args) {
        MyMath2 myMath2 = new MyMath2();
        long result = myMath2.add(2, 3);
        System.out.println(result);

        long subtractResult = MyMath2.subtract(6, 3);
        System.out.println(subtractResult);

        System.out.println("MyMath2.add(2,3) = " + MyMath2.add(2, 3));

    }
}
