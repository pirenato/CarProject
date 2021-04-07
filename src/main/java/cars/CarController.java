package cars;

import database.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarController {

    public static void addCar(String brand, String model, int year) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Car car = new Car();
        car.setBrand(brand);
        car.setModel(model);
        car.setYear(year);

        session.save(car);
        transaction.commit();

        session.close();
    }
}
