package ru.geekbrains.lesson1;

public class Team {
        private final String name;
        private final Participant[] participants;

        public Team(String name, Participant ... participantsTeam ) {
            this.name = name;
            this.participants = participantsTeam;
        }

        public void getTeamInfo() {
            System.out.println("Team: " + this.name);
            for (Participant participant : participants) {
                if (participant instanceof Women) {
                    System.out.println("Women: " + participant.getName());
                }
                if (participant instanceof Men) {
                    System.out.println("Men: " + participant.getName());
                }
            }
        }

    public void doIt(Obstacle obstacle){
        for (Participant participant : participants) {
            obstacle.doIt(participant);
        }
    }

        public void showResults(){
            for (Participant participant : participants) {
                if (!participant.isDistanceCovered()) {
                    break;
                }
            }
        }
    }

