package java_professional_7.task_3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();
        Element root = doc.createElement("address_book");
        doc.appendChild(root);

        Element address1 = doc.createElement("address");
        root.appendChild(address1);

        Element city1 = doc.createElement("city");
        city1.setAttribute("size","big");
        city1.setTextContent("Minsk");
        address1.appendChild(city1);

        Element street1 = doc.createElement("street");
        street1.setTextContent("Y. Kolasa");
        address1.appendChild(street1);

        Element house1 = doc.createElement("house");
        house1.setTextContent("11");
        address1.appendChild(house1);

        Element address2 = doc.createElement("address");
        root.appendChild(address2);

        Element city2 = doc.createElement("city");
        city2.setAttribute("size","big");
        city2.setTextContent("Kiev");
        address2.appendChild(city2);

        Element street2 = doc.createElement("street");
        street2.setTextContent("T. Shevchenko");
        address2.appendChild(street2);

        Element house2 = doc.createElement("house");
        house2.setTextContent("7");
        address2.appendChild(house2);

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult sr = new StreamResult(new File("C:\\Users\\user\\IdeaProjects\\java_professional_7\\src\\java_professional_7\\task_3\\1.xml"));
        t.transform(source, sr);
    }
}
