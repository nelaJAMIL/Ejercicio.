import java.util.Scanner;

public class no {
    public static class Libro {

        public static void main(String[] args) {
            String[] libros = { "Libro1", "Libro2", "Libro3", "Libro3", "Libro4", "Libro5" };
            String[] IBM = { "11111111-A", "11111111-B", "11111111-C", "11111111-D", "11111111-E", "11111111-F" };

            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el IBM para buscar:");
            String consulta = teclado.nextLine();

            boolean encontrado = false;

            for (int i = 0; i < IBM.length; i++) {
                if (IBM[i].equals(consulta)) {
                    System.out.println(libros[i] + " " + IBM[i]);
                    encontrado = true; //
                    break;
                }
            }

            if (!encontrado) { //
                System.out.println("No existe ningún lIBRO con X IBM: " + consulta);
            }
        }
    }
}
