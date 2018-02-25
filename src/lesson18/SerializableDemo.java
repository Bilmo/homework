package lesson18;

import lesson8.Horse;

import java.io.*;

/**
 * Created by student on 2/25/2018.
 */
public class SerializableDemo {

    public static final String HORSE_SER = "horse.ser";

    public static void main(String[] args) {
        Horse horse = new Horse();
        serialize(horse);
        Horse deserHorse = deserialize();
        System.out.println(horse.equals(deserHorse));
    }

    public static void serialize(Horse horse) {
        try (ObjectOutputStream oi = new ObjectOutputStream(new FileOutputStream(HORSE_SER))) {
            oi.writeObject(horse);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Horse deserialize() {
        Horse horse = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(HORSE_SER))) {
            horse = (Horse) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return horse;
    }
}
