package co.micol.prj20220506;

import java.util.Scanner;
import java.util.Stack;

public class App

/*
 * stack -- LIFO push(data in) - pop(data-out)
 */
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		stack.setSize(3);

		System.out.println("숫자를 입력하세요.");
		for (int i = 0; i < stack.size(); i++) {
			stack.set(i, sc.nextInt());
		}
		System.out.print(stack + " ");
		if (!stack.isEmpty()) {
			stack.pop();
		}
		System.out.println();
	}
	
	
}
