package oop.library;

import java.util.Objects;

public class Dvd extends Item{

    private int lenght;

    protected Dvd(String title, int year, int lenght) {
        super(title, year);
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Item)){
            return false;
        }
        if(obj.getClass() != getClass()){
            return false;
        }

        return (
                ((Dvd) obj).lenght == this.lenght
                        && Objects.equals(((Dvd) obj).title, this.title)
                        && ((Dvd) obj).year == this.year
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,year,lenght);
    }

    @Override
    public String toString() {
        return "Titolo: " + title + " Anno: " + year + " Durata: " + lenght;
    }
}
