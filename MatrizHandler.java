public class MatrizHandler {
    public static boolean verificarDiagonales(int[][] matriz) {
        
        if (matriz == null || matriz.length == 0) {
            return false;
        }
        
        int primeraColumna = matriz[0][0];
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][0] != primeraColumna) {
                return false;
            }
        }
        
        int ultimaFila = matriz[matriz.length - 1][0];
        for (int j = 1; j < matriz[0].length; j++) {
            if (matriz[matriz.length - 1][j] != ultimaFila) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println(verificarDiagonales(matriz1)); // true
        System.out.println(verificarDiagonales(matriz2)); // false
    }
}

