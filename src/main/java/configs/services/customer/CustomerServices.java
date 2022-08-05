package configs.services.customer;

public enum CustomerServices {
    BASE_OMS_SERVICE("base-oms");

    private final String name;

    CustomerServices(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
