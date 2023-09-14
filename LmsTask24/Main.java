package LmsTask24;

import LmsTask24.Impl.GenericInterfaceImpl;
import LmsTask24.Model.Animal;
import LmsTask24.Model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1, "Lion", 5);
        Animal animal2 = new Animal(2, "Tiger", 6);
        Animal animal3 = new Animal(3, "Elephant", 10);
        Animal animal4 = new Animal(4, "Giraffe", 7);
        Animal animal5 = new Animal(5, "Zebra", 4);
        List<Animal>animals = new ArrayList<>(Arrays.asList(animal1,animal2,animal3,animal4));

        Person person1 = new Person(1, "Alice", 25);
        Person person2 = new Person(2, "Bob", 30);
        Person person3 = new Person(3, "Charlie", 28);
        Person person4 = new Person(4, "David", 35);
        Person person5 = new Person(5, "Eve", 22);
        List<Person>people = new ArrayList<>(Arrays.asList(person1,person2,person3,person4));

        GenericInterfaceImpl animalService = new GenericInterfaceImpl(animals);
        GenericInterfaceImpl personService = new GenericInterfaceImpl(people);

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Person\n2.Animal");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                while (true) {
                    System.out.println("1.Add\n2.GetById\n3.GetAll\n4.SortByName\n5.Clear");
                    System.out.println("Выберите операцию ");
                    int n = sc.nextInt();
                    switch (n) {
                        case 1:
                            System.out.println(personService.add(person5));
                            break;
                        case 2:
                            System.out.println("Введите айди ");
                            long id = sc.nextLong();
                            System.out.println(personService.getById(id));
                            break;
                        case 3:
                            System.out.println(personService.getAll());
                            break;
                        case 4:
                            System.out.println("1. Сортировка по возрастанию\n2. Сортировка по убыванию");
                            int sort = sc.nextInt();
                            if (sort == 1) {
                                System.out.println(personService.sortByName(sort));
                            } else if (sort == 2) {
                                System.out.println(personService.sortByName(sort));
                            }
                            break;
                        case 5:
                            personService.clear();
                            System.out.println("Data cleared.");
                            break;
                    }
                }
            case 2:
            while (true) {
                System.out.println("1.Add\n2.GetById\n3.GetAll\n4.SortByName\n5.Clear");
                System.out.println("Выберите операцию ");
                int b = sc.nextInt();
                switch (b) {
                    case 1:
                        System.out.println(animalService.add(animal5));
                        break;
                    case 2:
                        System.out.println("Введите айди ");
                        int id = sc.nextInt();
                        System.out.println(animalService.getById((long) id));
                        break;
                    case 3:
                        System.out.println(animalService.getAll());
                        break;
                    case 4:
                        System.out.println("1. Сортировка по возрастанию\n2. Сортировка по убыванию");
                        int sort = sc.nextInt();
                        if (sort == 1) {
                            System.out.println(animalService.sortByName(sort));
                        } else if (sort == 2) {
                            System.out.println(animalService.sortByName(sort));
                        }
                        break;
                    case 5:
                        animalService.clear();
                        System.out.println("Data cleared.");
                        break;
                }
            }
        }
    }
}
