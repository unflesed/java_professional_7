package java_professional_7.task_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "address_book")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressBook {
    @XmlElement(name = "address")
    private List<Address> al = new ArrayList<>();

    public void addAddress(Address address) {
        al.add(address);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(al.toArray());
    }
}

