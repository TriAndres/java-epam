package ru.epam.user.service;

import ru.epam.user.model.User;
import ru.epam.user.repository.UserRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static ru.epam.console.ReadConsole.getInteger;
import static ru.epam.console.ReadConsole.getString;

public class UserService {
    private final UserRepository userRepository;
    private final long id;
    private final DateTimeFormatter formatter1;
    private final DateTimeFormatter formatter2;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        id = getNextId();
        formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");
        formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd 10:00:00 ");
    }

    public void activationUser() {
        System.out.println("Введите фамилию разработчика:");

        String name = getString();
        LocalDateTime dateTime1 = LocalDateTime.now();
        String time1 = dateTime1.format(formatter1);
        System.out.println(name + " в " + time1 + ", получили задание.\n" +
                "Через сколько дней задание сдадите:");

        long dayTamer = getInteger();
        LocalDateTime dateTime2= dateTime1.plusDays(dayTamer);
        String time2 = dateTime2.format(formatter2);
        System.out.println(name + " в " + time2 + ", сдадите задание.\n");

        userRepository.createUser(new User(id, name, dateTime1, dayTamer, dateTime2));
    }

    public void infoUser() {
        User user = userRepository.findByIdUser(id);
        String name = user.getName() + " в " + user.getLocalDateTime1().format(formatter1) + ", получили задание.\n" +
                user.getName() + " в " + user.getLocalDateTime2().format(formatter2) + ", сдадите задание.\n";
        System.out.println("\n" + name);
    }

    public boolean isUser() {
        return userRepository.findAllUser().isEmpty();
    }

    private long getNextId() {
        assert userRepository != null;
        long currentMaxId = userRepository.findAllUser()
                .stream()
                .mapToLong(User::getId)
                .max()
                .orElse(0);
        return ++currentMaxId;
    }
}