import java.util.*;

public class Game {

    private int counter = 1;
    private Random dice = new Random();

    private List<Player> players = new ArrayList();
    Statistics statistics = new Statistics();


    /*void printStats(){
        for(Player player : stats.keySet()){
            System.out.println(player.getName() + " : " + stats.get(player));
        }
    }*/

    void addPlayer(Player player){
        players.forEach(p ->{
            if(player.getName().equals(p.getName())){
                player.setName(player.getName() + counter);
                ++counter;
            }
        });

        players.add(player);
        statistics.addPlayer(player);

    }

    void  removePlayer(String name) {
        players.removeIf(player -> player.getName().equals(name));
    }



/*        Iterator<Player> it = players.iterator();
        while (it.hasNext()){
            Player player = it.next();
            if(player.getName().equals(name)){
                it.remove();
            }
        }
*/

    void printPlayers(){
        System.out.println("----[ Lista Graczy ]-----");

        players.forEach(player -> {
                System.out.println(player.getName());
        });

//        players.forEach(System.out::println);

    }

    void printStats(){
        statistics.print();
    }

    void play(){

        int number, guess;

        boolean repeat;

        do {
            System.out.println("---------------------");

            repeat = true;

            number = dice.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : players) {
                guess = player.guess();
                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("PUDŁO!");
                } else {
                    System.out.println("BRAWO!");
                    repeat = false;

                    /*Integer pts = stats.get(player);
                    if(pts != null)
                        pts += 1;
                    else
                        pts = 1;
                    stats.put(player, pts);*/
                    statistics.updatePlayer(player);

                }
            }

        } while (repeat);

        System.out.println("BRAWO!");
    }

}
