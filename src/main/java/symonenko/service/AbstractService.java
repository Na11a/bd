package symonenko.service;

import java.util.List;

public interface AbstractService<T> {
    T getElementById(Integer id);
    List<T> getAllElements();
    T createElement(T element);
    T updateElement(T element);
    void deleteElement(Integer id);
}
