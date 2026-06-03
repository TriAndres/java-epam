package ru.epam.lessonC.controller;

import ru.epam.lessonC.lesson.CLesson;
import ru.epam.lessonC.lesson.*;

public class CController {
    private CLesson lesson;

    public void CLesson1() {
        lesson = new CLesson1();
        lesson.game();
    }

    public void CLesson2() {
        lesson = new CLesson2();
        lesson.game();
    }
}