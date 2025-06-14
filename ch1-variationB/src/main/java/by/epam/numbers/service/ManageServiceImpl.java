package by.epam.numbers.service;

import by.epam.numbers.file.NumbersFile;

public class ManageServiceImpl {
    private final NumbersFile numbersFile;
    public ManageServiceImpl(NumbersFile numbersFile) {
        this.numbersFile = numbersFile;
    }
}
