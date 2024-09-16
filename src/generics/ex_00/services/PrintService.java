package generics.ex_00.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    List<T> numbers = new ArrayList<>();

    public List<T> getNumbers() {
        return numbers;
    }

    public T first() {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return numbers.get(0);
    }

    public void addValue(T value) {
        numbers.add(value);
    }

    public void print() {
        System.out.println(numbers);
    }
}
