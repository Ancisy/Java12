import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Tạo Danh sách cầu thủ
        PlayerService servicePlayer = new PlayerService();
        ArrayList<Player> allPlayers = servicePlayer.getAllPlayer();

        //Tạo Team
        TeamService serviceTeam = new TeamService();
        Team team = serviceTeam.getTeam(allPlayers);

        //In thông tin toàn bộ cầu thủ trong team
        ArrayList<Player> person = team.getAllPlayers();
        for(Player p : person){
            System.out.println(p);
        }

        //Lựa chọn cầu thủ trong team vào đội hình 1GK - 4DF - 4MF - 2FW
        ArrayList<Player> myTeam = serviceTeam.getTeamByNumber(allPlayers,1,4,4,2);
        for(Player p : myTeam){
            System.out.println("cầu thủ " + p);
        }


    }
}
