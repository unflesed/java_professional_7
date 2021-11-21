package java_professional_7.additional;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Animal animal = new Animal("Rex", 4, "dog");
        File file = new File("C:\\Users\\user\\IdeaProjects\\java_professional_7\\src\\java_professional_7\\additional\\animal.txt");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(animal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
