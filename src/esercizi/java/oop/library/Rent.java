package oop.library;

import java.time.LocalDate;
import java.util.Objects;

public class Rent {

    private Item item;
    private Person person;
    private LocalDate start;
    private LocalDate end;

    public Rent(Item item, Person person, LocalDate start, LocalDate end){
        this.item = item;
        this.person = person;
        this.start = start;
        this.end = end;
    }

    public Person getPerson() {
        return person;
    }

    public Item getItem() {
        return item;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isExpired(LocalDate now){
        return end.isBefore(now);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(obj.getClass() != getClass()){
            return false;
        }

        return (

                ((Rent)obj).person.equals(this.person) &&
                ((Rent)obj).end.equals(this.end) &&
                ((Rent)obj).start.equals(this.start) &&
                ((Rent)obj).item.equals(this.item)

        );

    }


    @Override
    public int hashCode() {
        return Objects.hash(person,item,start,end);
    }


    @Override
    public String toString() {
        return "Rent{" + "item=" + item + ", person=" + person + ", begin=" + start + ", end=" + end + '}';
    }
}
