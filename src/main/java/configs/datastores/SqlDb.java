package configs.datastores;

public enum SqlDb {
    CUSTOMER_DB("customer");
    private String name;
    public String getName() {
        return name;
    }
    SqlDb(String dbName) {
        name = dbName;
    }
    @Override
    public String toString() {
        return name;
    }
}
