import java.util.HashMap;

public class EspeciesHandler {

    public static int especiesDuplicadas(String[] especies) {
        
        HashMap<String, Integer> contador = new HashMap<>();
        
        for (String especie : especies) {
            String especieLower = especie.toLowerCase();
            contador.put(especieLower, contador.getOrDefault(especieLower, 0) + 1);
        }
        
        int duplicadas = 0;
        for (int count : contador.values()) {
            if (count > 1) {
                duplicadas++;
            }
        }
        
        return duplicadas;
    }
    
    public static void main(String[] args) {
        String[] lista1 = {"Rosa", "Lirio", "rosa", "Tulipan", "LIRIO", "Margarita"};
        String[] lista2 = {"Orquidea", "Girasol", "Clavel", "Azucena"};
        String[] lista3 = {"Bambu", "bambu", "BAMBU", "Bambu"};
        
        System.out.println(especiesDuplicadas(lista1)); // 2
        System.out.println(especiesDuplicadas(lista2)); // 0
        System.out.println(especiesDuplicadas(lista3)); // 1
    }
}
