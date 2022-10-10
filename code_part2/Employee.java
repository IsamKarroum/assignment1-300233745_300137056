public class Employee {

    // Class variables
    private String name;
    private int hours;
    private double rate;
    private Address[] address;

    // Constructor
    public Employee (String name) {
        this.name = name;
        this.address = new Address[6];
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public int getNumAddresses() {

        int i=0;
        while (address[i] != null) {
            i++;
        }

        return i;
    }

    public String getAddress(int index) {
        return address[index].toString();
    }

    // Setter methods
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setAddress(int index, Address addr) {
        this.address[index] = addr;
    }

}
