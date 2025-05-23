package org.example;

import java.util.HashMap;
import java.util.TreeSet;

public class PhoneBook {

    private final TreeSet<String> names = new TreeSet<>();
    private final HashMap<String, String> nameToNumber = new HashMap<>();
    private final HashMap<String, String> numberToName = new HashMap<>();

    public int add(String name, String number){
        names.add(name);
        nameToNumber.put(name,number);
        numberToName.put(number, name);
        return names.size();
    }

    public String findByNumber(String number) {
        return numberToName.get(number);
    }

    public String findByName(String name) {
        return nameToNumber.get(name);
    }

    public Iterable<String> printAllNames() {
        return names;
    }

}
