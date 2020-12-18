package deitelCapitulo16.examples.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {

		// cria uma pilha
		Stack<Number> stack = new Stack<>();

		stack.push(12L);// long value
		System.out.println("Adicionado 12L");
		printStack(stack);

		stack.push(344567);
		System.out.println("Adicionado 34567");
		printStack(stack);

		stack.push(1.0F);
		System.out.println("Adicionado 1.0F");
		printStack(stack);

		stack.push(1234.5678);
		System.out.println("Adicionado 1234.5678");
		printStack(stack);

		// removendo itens da pilha
		try {
			Number objetoRemovido = null;

			while (true) {
				objetoRemovido = stack.pop();
				System.out.printf("Removido %s%n", objetoRemovido);
				printStack(stack);
			}

		} catch (EmptyStackException emptyStackException) {
			emptyStackException.printStackTrace();
		}
	}

	private static void printStack(Stack<Number> stack) {
		if (stack.isEmpty())
			System.out.printf("stack esta vazia");
		else
			System.out.printf("stack contem: %s (top)%n", stack);
	}
}
