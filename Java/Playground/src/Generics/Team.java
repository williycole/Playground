//package Generics;
//
//import java.util.ArrayList;
//
//public class Team<T extends Player> implements Comparable<Team<T>> {
//
//    private String name;
//    int played = 0;
//    int won = 0;
//    int lost = 0;
//    int tied = 0;
//
//    private ArrayList<T> teamMembers = new ArrayList<>();
//
//    public Team(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean addTeamMember(T player) {
//        if (teamMembers.contains(player)) {
//            System.out.println(((Player) player).getName() + " is already on the team.");
//            return false;
//        } else {
//            teamMembers.add(player);
//            System.out.println(((Player) player).getName() + " has been added to the " + this.name + " team.");
//            return true;
//        }
//    }
//
//    public int numPlayers() {
//        return this.teamMembers.size();
//    }
//
//    public void matchResults(Team<T> opponent, int ourScore, int theirScore) {
//        String message;
//
//        if (ourScore > theirScore) {
//            won++;
//            message = " beat ";
//        } else if (ourScore == theirScore) {
//            tied++;
//            message = " tied with ";
//        } else {
//            lost++;
//            message = " lost to ";
//        }
//        played++;
//        if (opponent != null) {
//            System.out.println(this.getName() + message + opponent.getName());
//            opponent.matchResults(null, theirScore, ourScore);
//        }
//    }
//
//    public int ranking() {
//        return (won * 2) + tied;
//    }
//
//    @Override
//    public int compareTo(Team<T> team) {
//        if (this.ranking() > team.ranking()) {
//            return -1;
//        } else if (this.ranking() < team.ranking()) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
//}
