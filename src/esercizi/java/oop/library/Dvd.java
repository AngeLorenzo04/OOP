package oop.library;

import java.util.Objects;

public class Dvd extends Item {

    private int length;

    protected Dvd(String title, int year, int length) {
        super(title, year);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o){
        if( o == this){
            return true;
        }

        if(o.getClass() != getClass()){
            return false;
        }

        return (
            ((Dvd)o).length == length &&
            ((Dvd)o).year == year &&
            Objects.equals(((Dvd) o).title, title)
        );
    }

    @Override
    public int hashCode(){
        return Objects.hash(title,year,length);
    }
    @Override
    public String toString() {
        return "Dvd{" + "length=" + length + ", title='" + title + '\'' + ", year=" + year + '}';
    }
}
