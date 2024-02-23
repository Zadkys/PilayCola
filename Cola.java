public class Cola {

    public Nodo queue;

    public Cola(){
        queue = null;
    }

    public void encolar(int value){
        Nodo node = new Nodo(value);

        if(queue == null){
            queue = node;
        } else {
            Nodo temporal = queue;

            while(temporal.getNext() != null) {
                    temporal = temporal.getNext();
            }
            temporal.setNext(node);
        }
    }

    public void desencolar(){
        Nodo temporal = queue;

        if(queue == null){
            System.out.println("la cola esta vacia...");
        } else {
            if(temporal.getNext() == null) {
                queue = null;
            } else {
                System.out.println("elemento "+ temporal.getValue() +" eliminado");
                queue = temporal.getNext();
            }
        }
    }

    public void Mostrar(){
        Nodo temporal = queue;

        if(queue == null){
            System.out.println("la cola esta vaciisima...");
        } else {
            System.out.println("Lista:");
            while (temporal != null) {
                System.out.println(temporal.getValue() + "");
                temporal = temporal.getNext();
            }
        }
    }
}
