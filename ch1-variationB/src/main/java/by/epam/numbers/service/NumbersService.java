package by.epam.numbers.service;

import by.epam.numbers.model.Numbers;

public interface NumbersService {
    void findAll();

    void create(Numbers numbers);

    void update(Numbers numbers);

    void findById(long id);

    void deleteById(long id);

    void deleteAll();
}
