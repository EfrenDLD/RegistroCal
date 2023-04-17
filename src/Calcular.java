public class Calcular {
    public double[] obtenerCalificaciones(String[] arr) {
        int size = arr.length;
        double[] cal = new double[size];
        for (int i = 0; i < size; i++) {
            int p1 = arr[i].indexOf(" ");//recibe el dato de en forma de String y lo convierte a Double
            String c = arr[i].substring(p1 + 1);
            cal[i] = Double.parseDouble(c);
        }
        return cal;
    }
    public String[] obtenerNombreMateria(String[] arr){//En esta parte se obtiene el caracter sin tener ningun cambio
        int size = arr.length;
        String[] mat = new String[size];
        for (int i = 0; i < size; i++) {
            int p1 = arr[i].indexOf(" ");
            String c = arr[i].substring(0, p1);
            mat[i] = c;
        }
        return mat;
    }
}



