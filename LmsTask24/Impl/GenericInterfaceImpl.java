package LmsTask24.Impl;

import LmsTask24.Model.Animal;
import LmsTask24.Model.Person;
import LmsTask24.Service.GenericInterface;

import java.util.*;

public class GenericInterfaceImpl <T> implements GenericInterface<T> {
    private List<T> data;

    public GenericInterfaceImpl(List<T> data) {
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String add(T t) {
        data.add(t);
        return "Data added successfully";
    }

    @Override
    public T getById(Long id) {
            for (T item : data) {
                if (item instanceof Person) {
                    Person person = (Person) item;
                    if (person.getId() == id) {
                        return item;
                    }
                } else if (item instanceof Animal) {
                    Animal animal = (Animal) item;
                    if (animal.getId() == id) {
                        return item;
                    }
                }
            }
            return null;
        }

        @Override
    public List<T> getAll() {
        return data;
    }

    @Override
    public List<T> sortByName(int sortOrder) {
        Collections.sort(data, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if (o1 instanceof Person && o2 instanceof Person) {
                    Person person1 = (Person) o1;
                    Person person2 = (Person) o2;
                    return sortOrder == 1 ?
                            person1.getName().compareTo(person2.getName()) :
                            person2.getName().compareTo(person1.getName());
                } else if (o1 instanceof Animal && o2 instanceof Animal) {
                    Animal animal1 = (Animal) o1;
                    Animal animal2 = (Animal) o2;
                    return sortOrder == 1 ?
                            animal1.getName().compareTo(animal2.getName()) :
                            animal2.getName().compareTo(animal1.getName());
                }
                return 0;
            }
        });
        return data;
    }

    @Override
    public List<T> clear() {
        data.clear();
        return data;
    }
}

