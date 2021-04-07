package ui;

import cars.CarController;
import database.HibernateUtil;

public class HibernateApp {

    public static void main(String[] args) {
        HibernateUtil.setup();

        CarController.addCar("Toyota", "Camry", 2021);
    }
}
