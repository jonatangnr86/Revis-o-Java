package Vetores.e03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacienteHashMap {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>(); // Lista de chaves e valores

        map.put("Diogo", new ArrayList<>());  //Cria uma lista pra Diogo
        map.put("Jonatan", new ArrayList<>()); // Cria uma Lista para Jonatan

        map.get("Diogo").add("Dipirona");
        map.get("Jonatan").add("Paracetamol");

        for (Map.Entry<String, List<String>> m : map.entrySet()) {
            System.out.println("Nome: " + m.getKey() + " Medicamentos: " + m.getValue());
        }
        System.out.println(map.get("Jonatan"));
    }
}
