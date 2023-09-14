package LmsTask24.Service;

import java.util.List;

public interface GenericInterface <T> {
    String add(T t);
    T getById(Long id);
    List<T> getAll();
    List<T> sortByName (int sortOrder);
    List<T> clear();
}
