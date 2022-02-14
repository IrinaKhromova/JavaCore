package ru.geekbrains.lesson1;

public class SkiJump extends Obstacle {
    private final int height;

    public SkiJump(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}