package esempio_classi;

public class Player {

    double x,y,energy;

    public Player(double x, double y, double energy) {
        this.x = x;
        this.y = y;
        this.energy = energy;
    }

    public Player(){
        x = y = energy = 0.0;
    }


    public void moveUP(){
        y++;
    }
    public void moveDown(){
        y--;
    }
    public void moveRight(){
        x++;
    }
    public void moveLeft(){
        x--;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
