package ru.geekbrains.lesson1;

public class SkiRace extends Obstacle {
    private final int time;

    public SkiRace(int time) {
        this.time = time;
    }

    @Override
    public void doIt(Participant participant) {
        participant.race(time);
    }
}