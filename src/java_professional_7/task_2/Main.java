package java_professional_7.task_2;

import java_professional_7.additional.Animal;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\java_professional_7\\src\\java_professional_7\\additional\\animal.txt");
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Animal animal = (Animal)ois.readObject();
            System.out.println(animal);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
