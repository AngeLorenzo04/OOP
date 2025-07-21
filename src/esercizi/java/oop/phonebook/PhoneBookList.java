package oop.phonebook;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBookList implements PhoneBook{

    private final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>(MAX_PERSONS);
    }

    public boolean addPerson(Person p ) {
        if(phoneBook.size() == MAX_PERSONS) return false;
        phoneBook.add(p);
        return true;
    }
    public boolean removePerson(Person p){
        if(phoneBook.isEmpty()) return false;
        phoneBook.remove(p);
        return true;
    }
    public Person[] searchByLastname(String lastname ) {
        Person[] trovati = new Person[phoneBook.size()];
        return phoneBook.stream().filter(s -> Objects.equals(s.getLastname(), lastname)).toList().toArray(trovati);
    }
    public Person[] searchByNameAndLastname(String lastname, String name){
        Person[] trovati = new Person[phoneBook.size()];
        return phoneBook.stream().filter(s -> Objects.equals(s.getLastname(), lastname) && Objects.equals(s.getName(),name)).toList().toArray(trovati);
    }

}
