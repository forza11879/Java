package soccerrankingteacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Team implements Comparable<Team> {

    public Team(String name, int gamesWon, int gamesLost) {
        this.name = name;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
    }

    @Override
    public String toString() {
        double perc = (double) gamesWon / (gamesWon + gamesLost) * 100;
        return String.format("Team %s: won %d, lost %d (%.2f%%)",
                name, gamesWon, gamesLost, perc);
    }
    String name;
    int gamesWon, gamesLost;

    @Override
    public int compareTo(Team t) {
        int result = this.gamesWon - t.gamesWon;
        return result;
        /*        if (result != 0) return result;
        return this.gamesLost - t.gamesLost;*/
    }
}

class SortByPercentageGamesWon implements Comparator<Team> {

    @Override
    public int compare(Team o1, Team o2) {
        double perc1 = (double) o1.gamesWon / (o1.gamesWon + o1.gamesLost);
        double perc2 = (double) o2.gamesWon / (o2.gamesWon + o2.gamesLost);
        if (perc1 == perc2) {
            return 0;
        }
        if (perc1 > perc2) {
            return -1;
        } else {
            return 1;
        }
    }

}

class SortTeamsByName implements Comparator<Team> {

    @Override
    public int compare(Team o1, Team o2) {
        return o1.name.compareTo(o2.name);
    }

}

public class SoccerRankingTeacher {

    static final String FILE_NAME = "input.txt";

    static ArrayList<Team> teamList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Scanner fileInput = new Scanner(new File(FILE_NAME));

        while (fileInput.hasNextLine()) {

            String line = fileInput.nextLine();
            String data[] = line.split(";");
            Team t = new Team(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            teamList.add(t);

        }
        //
        System.out.println("------- original order -------");
        for (Team t : teamList) {
            System.out.println(t);
        }
        //
        Collections.sort(teamList);
        System.out.println("------- by games won order -------");
        for (Team t : teamList) {
            System.out.println(t);
        }
        //
        Collections.sort(teamList, new SortTeamsByName());
        System.out.println("------- by names order --------");
        for (Team t : teamList) {
            System.out.println(t);
            // System.out.printf("%s %d:%d\n", t.name, t.gamesWon, t.gamesLost);
        }
        //
        Collections.sort(teamList, new SortByPercentageGamesWon());
        System.out.println("------- by perc won order --------");
        for (Team t : teamList) {
            System.out.println(t);
        }
    }

}
