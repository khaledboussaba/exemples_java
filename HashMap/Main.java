package fr.HashMap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> departements = new HashMap<Integer, String>();
        departements.put(75, "Paris");
        departements.put(95, "Val d'Oise");
        departements.put(92, "Haut de Seine");

        System.out.println(departements);
        System.out.println(departements.get(92));

        for (Integer i : departements.keySet()) {
            System.out.println(i);
        }

        for (String i : departements.values()) {
            System.out.println(i);
        }

        for (Integer i : departements.keySet()) {
            System.out.println("Numéro de département : " + i + ", nom du départemet : " + departements.get(i));
        }

    }

}
