//Irina Khromova Java Core HW1

package ru.geekbrains.lesson1;

public class MainApp {

    public static void main(String[] args) {

        Course c = new Course(new SkiJump(90),
                new SkiRace(28));
        Team team = new Team("Mixed Team",
                new Men("Ivan", 123, 21),
                new Women("Svetlana", 90, 24),
                new Men("Alexandr", 95, 29),
                new Women("Vera", 75, 25));
        team.getTeamInfo();

        c.doIt(team);
        team.showResults();
    }
}