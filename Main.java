import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola();
        Pila pila = new Pila();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar con cola");
            System.out.println("2. Eliminar con cola");
            System.out.println("3. Agregar con pila");
            System.out.println("4. Eliminar con pila");
            System.out.println("5. Mostrar datos");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a agregar con cola: ");
                    int datoCola = Integer.parseInt(scanner.nextLine());
                    cola.encolar(datoCola);
                    System.out.println("Dato agregado a la cola: " + datoCola);
                    break;

                case 2:
                    cola.desencolar();
                    break;

                case 3:
                    System.out.print("Ingrese el dato a agregar con pila: ");
                    int datoPila = Integer.parseInt(scanner.nextLine());
                    pila.push(datoPila);
                    System.out.println("Dato agregado a la pila: " + datoPila);
                    break;

                case 4:
                    pila.pop();
                    break;

                case 5:
                    System.out.println("Datos en la cola: ");
                    cola.Mostrar();
                    System.out.println("Datos en la pila: ");
                    pila.Mostrar();
                    break;
                    
                case 0:
                    System.out.println("Cerrando programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}