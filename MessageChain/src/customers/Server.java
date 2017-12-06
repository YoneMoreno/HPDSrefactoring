package customers;

import places.Address;
import places.City;
import places.Continent;
import places.Country;


public class Server {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public City getCity() {
        return getAddress().getCity();
    }

    public Country getCountry() {
        return getAddress().getCity().getCountry();
    }

    public Continent getContinent() {
        return getAddress().getCity().getCountry().getContinent();
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
