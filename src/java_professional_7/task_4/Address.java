package java_professional_7.task_4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "address")
public class Address {
    City city;
    String street;
    int house;
    public Address(){}
    public Address(City city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }


    public City getCity() {
        return city;
    }
    @XmlElement
    public void setCity(City city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }
    @XmlElement
    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }
    @XmlElement
    public void setHouse(int house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return city + " " + street + " " + house;
    }
}
