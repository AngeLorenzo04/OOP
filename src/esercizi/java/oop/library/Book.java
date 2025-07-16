package oop.library;

import java.util.Objects;

public class Book extends Item {

    public int pages;

    protected Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
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
                ((Book) obj).pages == this.pages
                && Objects.equals(((Book) obj).title, this.title)
                && ((Book) obj).year == this.year
        );

    }

    @Override
    public int hashCode() {
        return Objects.hash(title,year,pages);
    }


    @Override
    public String toString() {
        return "Titolo: " + title + " Anno: " + year + " Pagine: " + pages;
    }

}
