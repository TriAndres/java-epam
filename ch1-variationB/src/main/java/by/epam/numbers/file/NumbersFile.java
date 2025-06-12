package by.epam.numbers.file;

import by.epam.numbers.model.Numbers;
import by.epam.numbers.repository.NumbersRepositoryImpl;

import java.io.*;
import java.util.Collection;

public class NumbersFile extends NumbersRepositoryImpl {
    private final String file;

    public NumbersFile(String file) {
        this.file = file;
    }

    private void saveNumbers() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Numbers numbers : findAll()) {
                writer.write(numbers.toString());
                writer.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Collection<Numbers> findAll() {
        return super.findAll();
    }

    @Override
    public Numbers save(Numbers numbers) {
        Numbers numbers1 = super.save(numbers);
        saveNumbers();
        return numbers1;
    }

    @Override
    public Numbers findById(long id) {
        Numbers numbers = super.findById(id);
        saveNumbers();
        return numbers;
    }

    @Override
    public void deleteById(long id) {
        super.deleteById(id);
        saveNumbers();
    }

    @Override
    public void deleteAll() {
        super.deleteAll();
        saveNumbers();
    }

    public static NumbersFile loadFromFileNumbers(String file) {
        NumbersFile numbersFile = new NumbersFile(file);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split("/");
                numbersFile.save(
                        new Numbers(
                                Long.parseLong(row[0]),
                                Integer.parseInt(row[1])
                        )
                );
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return numbersFile;
    }
}
