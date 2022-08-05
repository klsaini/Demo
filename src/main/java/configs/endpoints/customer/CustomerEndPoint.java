package configs.endpoints.customer;

public enum CustomerEndPoint {

    GET_USER("api/users/${0}"),
    LIST_USERS("api/users"),
    CREATE_USER("api/users"),
    UPDATE_USER("api/users/${0}"),
    DELETE_USER("api/users/${0}");
    private String name;
    public String getApiPath(){
        return name;
    }
    CustomerEndPoint(String apiEndpoint) {
        name=apiEndpoint;
    }

    @Override
    public String toString() {
        return name;
    }
}
