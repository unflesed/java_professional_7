package practise.task_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("C:\\Users\\user\\IdeaProjects\\java_professional_7\\menu.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(xmlFile);
            Element root = doc.getDocumentElement();
            System.out.println("Root: " + root.getNodeName());
            System.out.println("-----------------------");
            NodeList nl = root.getChildNodes();
            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);
                if (node.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                System.out.println("Food: " );
                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node childNode = childNodes.item(j);
                    if (childNode.getNodeType() != Node.ELEMENT_NODE) {
                        continue;
                    }
                    String name = childNode.getNodeName();
                    if (name.equals("name")) {
                        System.out.println("Name: " + childNode.getTextContent());
                    }else if(name.equals("price")){
                        System.out.println("Price: " + childNode.getTextContent());
                    }else if (name.equals("description")) {
                        System.out.println("Description: " + childNode.getTextContent());
                    }else if (name.equals("calories")) {
                        System.out.println("Calories: " + childNode.getTextContent());
                    }
                }
                System.out.println("-----------------------");
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
