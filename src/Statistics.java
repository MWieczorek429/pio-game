import java.util.HashMap;
import java.util.Map;

public class Statistics {

    private Map<Player, Integer> stats = new HashMap();


    void addPlayer(Player player){
        stats.put(player, 0);
    }

    void updatePlayer(Player player){
        int pts = stats.getOrDefault(player, 0);
        stats.put(player, pts + 1);
    }

    void print(){
        stats.forEach( (player, pts) -> {
            System.out.println(player.getName() + " : " + pts);
        });
    }
}
