import java.util.ArrayList;
import java.util.Collections;

public class TeamService {
    public Team getTeam(ArrayList<Player> allPlayers){
        Team team = new Team(allPlayers);
        return team;
    }

    public ArrayList<Player> getTeamByNumber(ArrayList<Player> allPlayers, int numberGK,int numberDF,int numberMF,int numberFW){
        int x,y,z,k;
        x=y=z=k=0;

        ArrayList<Player> myTeam = new ArrayList<>();
        Collections.shuffle(allPlayers);
        for(Player p : allPlayers){
            if(p.getPosition().toString() == "GK" && x < numberGK){
                myTeam.add(p);
                x++;
            }
            if(p.getPosition().toString() == "DF" && y <numberDF){
                myTeam.add(p);
                y++;
            }

            if(p.getPosition().toString() == "MF" && z <numberMF){
                myTeam.add(p);
                z++;
            }

            if(p.getPosition().toString() == "FW" && k <numberFW){
                myTeam.add(p);
                k++;
            }

        }
        return myTeam;
    }
}
