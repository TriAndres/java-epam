package by.epam.numbers.repository;

import by.epam.numbers.model.Numbers;

import java.util.Collection;

public interface NumbersRepository {
    Collection<Numbers> findAll();

    Numbers save(Numbers numbers);

    Numbers findById(long id);

    void deleteById(long id);

    void deleteAll();
}