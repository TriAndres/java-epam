package by.epam.numbers.service;

import by.epam.numbers.file.NumbersFile;
import by.epam.numbers.model.Numbers;

public class NumbersServiceImpl implements NumbersService {
    private final NumbersFile numbersFile;
    public NumbersServiceImpl(NumbersFile numbersFile) {
        this.numbersFile = numbersFile;
    }

    @Override
    public void findAll() {

    }

    @Override
    public void create(Numbers numbers) {

    }

    @Override
    public void update(Numbers numbers) {

    }

    @Override
    public void findById(long id) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void deleteAll() {

    }
}