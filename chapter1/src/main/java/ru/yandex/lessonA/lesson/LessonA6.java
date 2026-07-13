package ru.yandex.lessonA.lesson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static ru.yandex.console.ReadConsole.getInteger;
import static ru.yandex.console.ReadConsole.getString;

public class LessonA6 extends LessonA{

    /*
    6 Вывести фамилию разработчика, дату и время получения задания,
    а также дату и время сдачи задания.
     */
    @Override
    public void game() {

        System.out.println("Введите фамилию разработчика:");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd 10:00:00 ");

        String name = getString();
        LocalDateTime time = LocalDateTime.now();
        String time1 = time.format(formatter1);
        System.out.println(name + " в " + time1 + ", получили задание.\n" +
                "Через сколько дней задание сдадите:");

        int tamer = getInteger();
        time = time.plusDays(tamer);
        String time2 = time.format(formatter2);
        System.out.println(name + " в " + time2 + ", сдадите задание.\n");

    }

    public static void main(String[] args) {
        new LessonA6().game();
    }
}