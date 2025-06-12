package by.epam.numbers.service;

import by.epam.numbers.file.NumbersFile;

public class NumbersServiceImpl implements NumbersService {
    private final NumbersFile numbersFile;
    public NumbersServiceImpl(NumbersFile numbersFile) {
        this.numbersFile = numbersFile;
    }
}