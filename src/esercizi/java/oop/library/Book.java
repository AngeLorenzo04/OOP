package oop.library;

import java.util.Objects;

public class Book extends Item{

    private int pages;

    public Book(String title, int year, int pages) {
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
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(o.getClass() != getClass()){
            return false;
        }

        return (
                Objects.equals(((Book) o).title, this.title) &&
                ((Book) o).year == this.year &&
                ((Book) o).pages == this.pages
        );
    }

    @Override
    public int hashCode(){
        return Objects.hash(year,title,pages);
    }

    @Override
    public String toString() {
        return "Book{" + "pages=" + pages + ", title='" + title + '\'' + ", year=" + year + '}';
    }

}
