package esempio_classi;

public class Main {

    public static void main(String[] args) {
        Player p1 = new Player();
        SpecialPlayer s1 = new SpecialPlayer(10,10,3);
        Player[] players = {
                new Player(),
                new SpecialPlayer(10,10,2)
        };

        for (Player player : players){
            player.moveDown();

        }
    }



}
