package kegiatan1;

import java.util.Scanner;
import java.util.Stack;

public class kegiatan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input : ");
        String str = input.nextLine();

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversedStr = "";
        while (!stack.isEmpty()) {
            reversedStr += stack.pop();
        }

        System.out.println("Reversed : " + reversedStr);
    }
}
