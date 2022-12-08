import java.util.*;

public class balanced_brackets {
    public static int isValid(String A) {
        Stack<Character> stack = new Stack<Character>();
        int N = A.length();
        for (int i=0; i<N; i++) {
            char ch = A.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);

            else if (stack.isEmpty())
                return 0;

            else if (ch == ')' && stack.peek() == '(')
                stack.pop();

            else if (ch == '}' && stack.peek() == '{')
                stack.pop();

            else if (ch == ']' && stack.peek() == '[')
                stack.pop();                

            else return 0;
        }

        if (stack.isEmpty())
            return 1;

        else return 0;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String expn;

        System.out.println("Enter a expression: ");
        expn = sc.nextLine();

        isValid(expn);
        sc.close();
    }
}
