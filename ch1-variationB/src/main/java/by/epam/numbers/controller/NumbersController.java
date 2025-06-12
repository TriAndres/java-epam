package by.epam.numbers.controller;

import by.epam.numbers.file.NumbersFile;
import by.epam.numbers.service.NumbersServiceImpl;

import static by.epam.numbers.file.NumbersFile.loadFromFileNumbers;

public class NumbersController {
    private static final String file = "ch1-variationB\\src\\main\\java\\by\\epam\\numbers\\file";
    private static final NumbersFile numbersFile = loadFromFileNumbers(file);
    public static NumbersServiceImpl numbersService() {
        return new NumbersServiceImpl(numbersFile);
    }
}
