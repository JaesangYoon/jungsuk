package ch11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage:java Ex11_3 \"Expression\"");
            System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
            System.exit(0);
        }

        Stack st = new Stack();
        String expression = args[0];

        System.out.println("expression: " + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            } // for문으로 조건문 돌아준 다음, 여는 괄호와 닫는 괄호가 일치하면 아래 코드로 계속 진행
            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        } // try-catch
    }
}
