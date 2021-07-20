package org.kie.kogito.thegame.employee;

public class EmployeeResult {
    private String firstName;
    private String lastName;
    private String address;
    public EmployeeResult(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
}