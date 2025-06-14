package by.epam.numbers.repository;

import by.epam.numbers.model.Numbers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class NumbersRepositoryImpl implements NumbersRepository {
    private final Map<Long, Numbers> numbersMap = new HashMap<>();

    @Override
    public Collection<Numbers> findAll() {
        return numbersMap.values();
    }

    @Override
    public Numbers save(Numbers numbers) {
        return numbersMap.put(numbers.getId(), numbers);
    }

    @Override
    public Numbers findById(long id) {
        return numbersMap.get(id);
    }

    @Override
    public void deleteById(long id) {
        numbersMap.remove(id);
    }

    @Override
    public void deleteAll() {
        numbersMap.clear();
    }
}