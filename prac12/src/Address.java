import java.util.StringTokenizer;

public class Address {
    private final String country;
    private final String region;
    private final String city;
    private final String street;
    private final String house;
    private final String flat;

    Address(String text){
        StringTokenizer stringTokenizer = new StringTokenizer(text, ";:.,-");
        country = stringTokenizer.nextToken();
        region = stringTokenizer.nextToken();
        city = stringTokenizer.nextToken();
        street = stringTokenizer.nextToken();
        house = stringTokenizer.nextToken();
        flat = stringTokenizer.nextToken();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
