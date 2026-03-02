package src.ss16;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {

    private Map<String, Customer> customers = new HashMap<>();

    public boolean register(Customer customer) {

        for (Customer c : customers.values()) {
            if (c.getPhone().equals(customer.getPhone())) {
                return false;
            }
        }

        customers.put(customer.getId(), customer);
        return true;
    }

    public Customer findById(String id) {
        return customers.get(id);
    }

    public void showAll() {
        customers.values().forEach(System.out::println);
    }
}