package lesson15;

import lesson12.Person;

import java.util.ArrayList;
import java.util.List;


public class Collection {
    public static void main(String[] args) {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person());
        arrayList.add(new Person("Витя", 56));
        Person p = new Person();
        arrayList.add(p);
        System.out.println("Размер коллекции: " + arrayList.size());
        enumerateCollection(arrayList);
        System.out.println("\n");
        Person p1 = arrayList.get(1);
        p1.setAge(18);
        arrayList.set(1, p1);
        enumerateCollection(arrayList);
        System.out.println(" размер " + arrayList.size());
        arrayList.remove(arrayList.size() - 1);
        System.out.println(" размер " + arrayList.size());
        System.out.println(arrayList);
        Object[] objects = arrayList.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
        System.out.println("\n");
        Person[] persons = new Person[arrayList.size()];
        arrayList.toArray(persons);
        for (Person person : persons) {
            System.out.println(person.getFullName());
        }
        recievePersonArray2(arrayList);
        arrayList.clear();
    }

    public static void enumerateCollection(List<Person> arrayList) {
        for (Person person : arrayList) {
            System.out.println("Элемент " + person);
        }
    }

    public static void recievePersonArray2(List<Person> arrayList) {
        Person[] persons = arrayList.toArray(new Person[0]);
        for (Person p : persons) {
            System.out.println("Элемент2: " + p.getFullName());
        }
    }
}
