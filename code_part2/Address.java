public class Address {

    // Class variables
    private String street;
    private int number;
    private String postalCode;

    // Constructor
    public Address(String street, int number, String postalCode) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    public String toString() {
        return number + " " + street + ", " + postalCode;
    }

}
