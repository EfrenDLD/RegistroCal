public class Mostrar {
    Truncar truncar = new Truncar();//instanciamos truncar
    public void mostrar(double[] calificacion, String[] nombres) {
        int size = calificacion.length;
        double prom = 0;
        for (int i = 0; i < size; i++) {
            prom += calificacion[i] / size;
            System.out.println("\n Nombre de materia: " + nombres[i] + " \n Calificación de parcial: " + calificacion[i]);
        }
        System.out.println("\n\n El promedio del parcial es: " + truncar.truncar(prom));
    }
}


