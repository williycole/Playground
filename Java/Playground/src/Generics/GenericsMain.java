package Generics;


public class GenericsMain {
//    public static void MiscPuzzles.ShiftToLeft(String[] args) {
//        FootballPlayer joe = new FootballPlayer("Joe");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer beckham = new SoccerPlayer("Beckham");
//
//        Team<BaseballPlayer> baseBallTeam = new Team<>("Chicago Cubs");
//        baseBallTeam.addTeamMember(pat);
//
//
//        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
//        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//        adelaideCrows.addTeamMember(joe);
//        System.out.println(adelaideCrows.numPlayers());
//        // this one work now with football players because we have actually
//        //used generics here to set the type of the team
//        //adelaideCrows.addTeamMember(pat);//<--^^^^
//
//        hawthorn.matchResults(fremantle, 1, 0);
//        hawthorn.matchResults(adelaideCrows, 3, 8);
//        adelaideCrows.matchResults(fremantle, 2, 1);
//        fremantle.matchResults(adelaideCrows, 6, 2);
//        fremantle.matchResults(adelaideCrows, 2, 2);
//
//        //Below won't work because we defined the team type in matchResults(Team<T> opponent)
//        //the Team<T> make this a more concise use
//        //adelaideCrows.matchResults(baseBallTeam, 1, 1);
//        System.out.println("Rankings");
//        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
//        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
//        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
//
//        System.out.println(adelaideCrows.compareTo(hawthorn));
//        System.out.println(hawthorn.compareTo(adelaideCrows));
//
//        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
//        footballLeague.add(adelaideCrows);
//        footballLeague.add(hawthorn);
//        footballLeague.add(fremantle);
//
//        footballLeague.showLeagueTable();
//    }

}
/*
* Generics - allow us to create classes, interfaces and methods that take types as parameters
*
*
* //----------Generics--do it this way
*
    public static void MiscPuzzles.ShiftToLeft(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n){
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
    *
    *
    *
    * //----------Non generic type--don't do it this way
    *
    //public static void MiscPuzzles.ShiftToLeft(String[] args) {
        //ArrayList items = new ArrayList();
        //items.add(1);
        //items.add(2);
        //items.add(3);
        //items.add(4);
        //items.add(5);

        //printDoubled(items);
    //}

    //private static void printDoubled(ArrayList n){
        //for (Object i : n) {
            //System.out.println((Integer) i * 2);
        //}
    //}
//}
* */





