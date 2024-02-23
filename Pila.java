public class Pila {
	public Nodo stack;

	public Pila(){
		stack = null;
	}

	public void push(int value){
		Nodo node = new Nodo(value);

		if(stack == null){
			stack = node;
		} else {
			Nodo temp = stack;
			stack = node;
			node.setNext(temp);
		}
	}

	public void pop(){
		Nodo temp = stack;

		if(stack == null){
			System.out.println("la pila esta vacia");
		} else {
			if(temp.getNext() == null) {
				stack = null;
			} else {
				stack = temp.getNext();
				System.out.println("primer elemento eliminado.");
			}
		}
	}

	public void Mostrar(){
		Nodo temp = stack;

		if(stack == null){
			System.out.println("la pila esta vacia...");
		} else {
			System.out.println("Lista:");
			while (temp != null) {
				System.out.println(temp.getValue() + "");
				temp = temp.getNext();
			}
		}
	}
}