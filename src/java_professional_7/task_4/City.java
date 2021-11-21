package java_professional_7.task_4;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class City {

    String name;
    String description;
    public  City(){}

    public City(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    @XmlValue
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    @XmlAttribute(name = "size")
    public void setDescription(String description) {
        this.description = description;
    }
}
