package ru.geekbrains.lesson1;

public interface Participant {
    String getName();
    boolean isDistanceCovered();
    void jump(int height);
    void race(int time);
}
