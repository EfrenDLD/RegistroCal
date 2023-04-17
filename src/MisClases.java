import java.util.Scanner;

public class MisClases {
    public void misClases(){
        Scanner scanner = new Scanner(System.in);
        IngresarDatos ingresarDatos = new IngresarDatos();
        String[] materiaCal = ingresarDatos.ingresarDatos(scanner);
        Calcular calculadora = new Calcular();
        double[] calificacion = calculadora.obtenerCalificaciones(materiaCal);
        String[] nombres = calculadora.obtenerNombreMateria(materiaCal);
        Mostrar mostrar = new Mostrar();
        mostrar.mostrar(calificacion, nombres);
    }
}
