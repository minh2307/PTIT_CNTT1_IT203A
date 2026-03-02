package src.ss16;

public class ServiceRecord {
    private Pet pet;
    private String serviceType;

    public ServiceRecord(Pet pet, String serviceType) {
        this.pet = pet;
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Thú cưng: " + pet +
                " | Dịch vụ: " + serviceType;
    }
}