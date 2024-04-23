package april20.compositions;

public class Address {
    String street;
    String city;
    String country;
    String postalCode;

    public Address(String street, String city, String country, String postalCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return street;
    }
}
