import java.util.ArrayList;

public class Team {
    private ArrayList<Player> allPlayers;

    public Team() {
    }

    public Team(ArrayList<Player> allPlayers) {
        this.allPlayers = allPlayers;
    }

    public ArrayList<Player> getAllPlayers() {
        return allPlayers;
    }

    public void setAllPlayers(ArrayList<Player> allPlayers) {
        this.allPlayers = allPlayers;
    }
}
