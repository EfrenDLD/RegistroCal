import java.util.Scanner;

public class IngresarDatos {
    public String[] ingresarDatos(Scanner scanner) {
        System.out.print("Ingrese el número de materias: ");
        int numMaterias = scanner.nextInt();
        scanner.nextLine();
        String[] materiaCal = new String[numMaterias];

        for (int i = 0; i < numMaterias; i++) {
            System.out.print("Ingrese el nombre de la materia y la calificación : ");
            materiaCal[i] = scanner.nextLine();
        }
        return materiaCal;
    }
}

