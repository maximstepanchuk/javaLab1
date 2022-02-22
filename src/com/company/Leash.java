package com.company;

public record Leash(String manufacturer, int maxLeashLenghtInMeters, int maxWeightOfTheAnimalInKilos, String colour, String material, int priceInUah, boolean availabilityOfCollar) {
    //Статичне поле
    public static String pointOfSale = "All For Pets Shop";

    public Leash (){
        this("", 0, 0);
    }

    public Leash(String manufacturer, int maxLeashLenghtInMeters, int maxWeightOfTheAnimalInKilos) {
        this(manufacturer, maxLeashLenghtInMeters, maxWeightOfTheAnimalInKilos, null, null, 0, false);
    }
    //Перевизначений метод, що повертає стрічкове представлення класу (toString())
    @Override
    public String toString() {
        return "Leash{" +
                "manufacturer='" + manufacturer + '\'' +
                ", maxLeashLenghtInMeters=" + maxLeashLenghtInMeters +
                ", maxWeightOfTheAnimalInKilos=" + maxWeightOfTheAnimalInKilos +
                ", colour='" + colour + '\'' +
                ", material='" + material + '\'' +
                ", priceInUah=" + priceInUah +
                ", availabilityOfCollar=" + availabilityOfCollar +
                '}';
    }
    //Статичний метод, що повертає значення статичного поля
    public static String getPointOfSale() {
        return pointOfSale;
    }

}
