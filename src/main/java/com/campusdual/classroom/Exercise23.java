package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> hashMap = new HashMap<>();

        hashMap.put("person", new Person("John", "Smith"));
        hashMap.put("teacher", new Teacher("María", "Montessori", "Educación"));
        hashMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        hashMap.put("doctor", new Doctor("Gregory", "House", "Nefrología y Infectología"));

        return hashMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {

        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {

        for (Map.Entry<String, Person> entry : map.entrySet()) {
           entry.getValue().getDetails();
        }
    }

    public static void main(String[] args) {
        Map<String, Person> hashMap = createHashMap();

        Person oldOfficer = hashMap.get("police");
        addMapValue(hashMap, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));

        System.out.println("Se reemplazó al oficial de policía: " + (oldOfficer != hashMap.get("police")));

        System.out.println("Elementos del mapa: ");
        printMapValues(hashMap);
    }
}
