package oop.library;

import java.time.LocalDate;
import java.util.Objects;

public class Rent {

    private Item item;
    private Person person;
    private LocalDate begin;
    private LocalDate end;

    public Rent(Item item, Person person, LocalDate begin, LocalDate end){
        this.item = item;
        this.person = person;
        this.begin = begin;
        this.end = end;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Item getItem() {
        return item;
    }

    public Person getPerson() {
        return person;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public boolean isExpired(LocalDate now){
        return now.isAfter(end);
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
            ((Rent)obj).begin == this.begin &&
            ((Rent)obj).item == this.item &&
            ((Rent)obj).person == this.person &&
            ((Rent)obj).end == this.end
        );
    }


    @Override
    public int hashCode() {
        return Objects.hash(begin,end,item,person);
    }

    @Override
    public String toString() {
        return "Inizio: " + begin + " Fine: " + end + " Id Utente: " + person.getId() + " Item: " + item.getTitle();
    }
}

