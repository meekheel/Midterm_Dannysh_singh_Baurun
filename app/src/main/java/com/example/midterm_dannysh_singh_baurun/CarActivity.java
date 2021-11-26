package com.example.midterm_dannysh_singh_baurun;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import model.Car;

public class CarActivity extends AppCompatActivity {

    Car[] cars;
    int widgets[] = {R.id.ivCar1, R.id.ivCar2, R.id.ivCar3,
            R.id.ivCar4, R.id.ivCar5, R.id.ivCar6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        initialize();
    }

    private void initialize() {
        cars = new Car[widgets.length];
        cars[0] = new Car(0, "Toyota", 0);
        cars[1] = new Car(1, "Honda", 12000);
        cars[2] = new Car(2, "Mazda", 90000);
        cars[3] = new Car(3, "Hyundai", 75000);
        cars[4] = new Car(4, "Honda", 67000);
        cars[5] = new Car(5, "Mazda", 0);
    }
}