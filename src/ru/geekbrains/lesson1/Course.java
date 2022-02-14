package ru.geekbrains.lesson1;

public class Course {
    private final Obstacle[] obstacles;

    public Course(Obstacle ... obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for (Obstacle obstacle : obstacles) {
            team.doIt(obstacle);
        }
    }
}