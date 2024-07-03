package collections;

import java.util.Stack;

public class QStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		
		System.out.println(stack);
		
		Integer pop = stack.pop();
		System.out.println(pop);
		System.out.println(stack);
		
		Integer peek = stack.peek();
		System.out.println(peek);
		
		stack.push(6);
		System.out.println(stack);

	}

}
