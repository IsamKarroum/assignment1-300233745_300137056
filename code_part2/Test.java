public class Test {

    public static void main(String[] args){

        Employee o1 = new Employee("Falcao");
        o1.setHours(40);
        o1.setRate(15.50);
        o1.setAddress(0, new Address("Queen", 48, "K1P1N2"));
        o1.setAddress(1, new Address("King Edward", 800, "K1N6N5"));



////  ***** ***** ***** ***** ***** PRINT TEST RESULTS ***** ***** ***** ***** *****


    //    System.out.println("Name: " + o1.getName());
    //    System.out.println("Hours: " + o1.getHours());
    //    System.out.println("Rate: " + o1.getRate());
    //    System.out.println("NumAddresses: " + o1.getNumAddresses());
    //    System.out.println("Addr1: " + o1.getAddress(0));
    //    System.out.println("Addr2: " + o1.getAddress(1));

    }
}
