// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Address address = new Address.Builder()
                .street("street")
                .city("city")
                .apartmentNumber("42")
                .country("Poland")
                .district("district")
                .build();

    }
}