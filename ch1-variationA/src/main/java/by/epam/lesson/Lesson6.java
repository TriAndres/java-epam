package by.epam.lesson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static by.epam.controller.Controller.consoleService;

public class Lesson6 extends Lesson {
    @Override
    public void game() {
        System.out.println("6. Вывести фамилию разработчика, дату и время " +
                "получения задания, а также дату и время сдачи задания. ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Введите фамилию:");
        String name = consoleService().getString();

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Получения задания:\n" + name + " " + localDateTime.format(formatter));

        int day;
        do {
            System.out.println("Через сколько дней сдадите задание:");
            day = consoleService().getInteger();
        } while (day <= 0);

        System.out.println("Cдачи задания:\n" + name + " " + localDateTime.plusDays(day).format(formatter));
    }
}