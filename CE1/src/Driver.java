public class Driver {

    public static void main(String[] args){

        SoccerClass s1 = new SoccerClass();
        s1.setTeamOneName("Mustangs");
        s1.setTeamTwoName("Mustangs");
        s1.setTeamOneScore(0);
        s1.setTeamTwoScore(0);
        s1.setTeamOneShots(4);
        s1.setTeamTwoShots(7);
        s1.setGameDate(2024, 11, 24, 22, 30);

        System.out.println(s1);


        SoccerClass game2 = new SoccerClass();
        game2.setTeamOneName("Wildcats");
        game2.setTeamTwoName("Panaroma");
        game2.setTeamOneScore(0);
        game2.setTeamTwoScore(3);
        game2.setTeamOneShots(11);
        game2.setTeamTwoShots(14);
        game2.setGameDate(2024, 9, 24, 21, 15);

        System.out.println(game2);

        /***
         * Using Copy Constructor
         */
        SoccerClass game3 = new SoccerClass(game2);

        System.out.println(game3);

    }
}
