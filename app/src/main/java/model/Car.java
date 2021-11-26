package model;

import androidx.annotation.NonNull;

public class Car {
    private int id;
    private String brand;
    private float km;

    public Car(int id, String brand, float km) {
        this.id = id;
        this.brand = brand;
        this.km = km;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    @NonNull
    @Override
    public String toString() {
        return brand+"and"+km;
    }
}
