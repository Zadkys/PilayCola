public class Nodo {

    private int value; //almacenar el dato
    public Nodo next; //Puntero

    public Nodo(int value){
        this.value = value;
        this.next = null;
    }

	public int getValue(){
		return value;
	}

	public void setValue(int value){
		this.value = value;
	}

	public Nodo getNext(){
		return next;
	}

	public void setNext(Nodo next){
		this.next = next;
	}
}