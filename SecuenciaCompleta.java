import java.util.HashSet;
import java.util.Set;

public class SecuenciaCompleta {
    public static String secuenciaCompleta(String numeros) {
        // Convertir el string a un conjunto de enteros
        HashSet<Integer> valores = new HashSet<>();
        String[] partes = numeros.split(" ");
        for (String parte : partes) {
            valores.add(Integer.parseInt(parte));
        }

        // Encontrar el rango de números (mínimo y máximo)
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : valores) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        String faltantes = "";
         for (int i = min; i <= max; i++) {
          if (!valores.contains(i)) {
            if (faltantes.length() > 0) {
            faltantes += " ";  // Añadir espacio si ya hay números en la cadena
           }
            faltantes += i;  // Concatenar el número faltante
    }
}

        // Si faltan números, los mostramos; si no, devolvemos "1"
        return faltantes.length() > 0 ? faltantes.toString() : "1";
    }

    public static void main(String[] args) {
        System.out.println(secuenciaCompleta("1 3 4 6")); // "2 5"
        System.out.println(secuenciaCompleta("1 2 3 4 5")); // "1"
        System.out.println(secuenciaCompleta("5 7 9 10")); // "6 8"
    }
}
