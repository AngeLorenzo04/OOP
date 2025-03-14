package esempio_classi;

public class SpecialPlayer extends Player{
    public SpecialPlayer(double x, double y, double energy) {
        super(x,y,energy);
    }


    @Override
    public void moveDown() {
        y += 2;
    }

    @Override
    public void moveUP() {
        y -= 2;
    }

    @Override
    public void moveLeft() {
        x+=2;
    }

    @Override
    public void moveRight() {
        x-=2;
    }
}
