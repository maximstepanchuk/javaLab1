package com.company;

public class Main {

    public static void main(String[] args) {
        Leash firstLeah = new Leash("ODESSA",77, 15, "space gray", "shurok", 5000, true);
        Leash secondLeah = new Leash("NOVOVOLYNSK", 55, 12);
        Leash thirdLeah = new Leash();

        System.out.println(firstLeah);
        System.out.println(secondLeah);
        System.out.println(thirdLeah);
    }
}
