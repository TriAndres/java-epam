package ru.yandex.lessonA.lesson;


import static ru.yandex.console.ReadConsole.getDouble;
import static ru.yandex.user.controller.UserController.getDefaultUser;

public class ALesson9 extends ALesson {
    @Override
    public void game() {
        System.out.println("9 Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой.");

        System.out.println("""
                Введите три чесла через Enter a b c
                Где a, b, c — коэффициенты квадратного уравнения ax^2 + bx + c = 0.
                пример: 1 -3 2""");

        double a = getDouble();
        double b = getDouble();
        double c = getDouble();

        if (a == 0) {
            System.out.println("Коэффициент 'a' не может быть равен нулю, иначе это не квадратное уравнение.");
        }

        double discriminant = b * b - 4 * a * c;

        // Определение корней на основе значения дискриминанта
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Уравнение имеет два корня:%nx1 = %.4f%n", x1);
            System.out.printf("x2 = %.4f%n", x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.printf("Уравнение имеет один корень (кратный):%nx = %.4f%n", x);
        } else {
            System.out.println("Дискриминант меньше нуля. Уравнение не имеет вещественных корней.");
        }

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new ALesson9().game();
    }
}