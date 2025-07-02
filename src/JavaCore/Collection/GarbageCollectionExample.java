package JavaCore.Collection;

import java.lang.ref.WeakReference;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Samsung", "S25 Ultra"));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try {
            Thread.sleep(5000); // Sleep for 5 seconds to allow garbage collection to occur
        } catch (Exception e) {
        }
        System.out.println(phoneWeakReference.get());

    }
}

class Phone {
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" + "brand='" + brand + "', model='" + model + "'}";
    }
}