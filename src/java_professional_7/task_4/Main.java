package java_professional_7.task_4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addAddress(new Address(new City("Minsk","big"), "Y. Kolasa", 11));
        addressBook.addAddress(new Address(new City("Kiev","big"), "T. Shevchenko", 7));

        File file = new File("C:\\Users\\user\\IdeaProjects\\java_professional_7\\src\\java_professional_7\\task_4\\output.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AddressBook.class);
            Marshaller mar = jaxbContext.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            mar.marshal(addressBook, file);
            mar.marshal(addressBook, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
