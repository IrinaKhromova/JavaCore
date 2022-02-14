package ru.geekbrains.lesson1;

public abstract class Sportsman implements Participant {

    private final String name;
    private final int maxJumpHeight;
    private final int RaceTime;
    private boolean distanceCovered;

    public Sportsman(String name, int maxJumpHeight, int RaceTime) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.RaceTime = RaceTime;
        this.distanceCovered = true;
    }

    public boolean isDistanceCovered() {
        return distanceCovered;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " successful ski jump");
        } else {
            System.out.println(name + " fall from the ski jump");
            distanceCovered = false;
        }
    }

    @Override
    public void race(int time) {
        if (time >= RaceTime) {
            System.out.println(name + " passed the distance");
        } else {
            System.out.println(name + " exceeded the passing distance time");
            distanceCovered = false;
        }
    }
}