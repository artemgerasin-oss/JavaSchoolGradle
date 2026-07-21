package ru.alfabank.HomeWork_13;

public class Training_collection {

    public static void main(String[] args) {

        String[] arr = {"Vasya", "Petya", "Masha"};
        String target = "Petya";

        boolean found = false;

        for (String s : arr) {
            if (s != null && s.equals(target)) { // или s.equalsIgnoreCase(target)
                found = true;
                break; // можно выйти из цикла, если нашли
            }
        }

        if (found) {
            System.out.println("found: " + target);
        } else {
            System.out.println("not found: " + target);
        }




    }
}
