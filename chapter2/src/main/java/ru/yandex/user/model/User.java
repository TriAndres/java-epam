package ru.yandex.user.model;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String name;
    private LocalDateTime localDateTime1;
    private Long day;
    private LocalDateTime localDateTime2;

    public User() {
    }

    public User(Long id,
                String name,
                LocalDateTime localDateTime1,
                Long day,
                LocalDateTime localDateTime2) {
        this.id = id;
        this.name = name;
        this.localDateTime1 = localDateTime1;
        this.day = day;
        this.localDateTime2 = localDateTime2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime1() {
        return localDateTime1;
    }

    public void setLocalDateTime1(LocalDateTime localDateTime1) {
        this.localDateTime1 = localDateTime1;
    }

    public Long getDay() {
        return day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    public LocalDateTime getLocalDateTime2() {
        return localDateTime2;
    }

    public void setLocalDateTime2(LocalDateTime localDateTime2) {
        this.localDateTime2 = localDateTime2;
    }
}