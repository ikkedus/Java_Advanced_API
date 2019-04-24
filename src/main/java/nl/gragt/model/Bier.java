package nl.gragt.model;


public class Bier {
    String id,name,brand;
    Double alcoholPercentage;

    public Bier(String id, String name, String brand, Double alcoholPercentage) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.alcoholPercentage = alcoholPercentage;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(Double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }
}
