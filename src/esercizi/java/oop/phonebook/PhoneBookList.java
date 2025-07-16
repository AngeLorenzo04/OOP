package oop.phonebook;

import java.util.ArrayList;
import java.util.Map;

public class PhoneBookList implements PhoneBook {

    private final ArrayList<Person> phonebook;

    public PhoneBookList(){
        this.phonebook = new ArrayList<Person>();
    }



    @Override
    public boolean addPerson(Person p) {
       if(phonebook.contains(p) || phonebook.size() >= MAX_PERSON){
           return false;
       }
       phonebook.add(p);
       return true;
    }

    @Override
    public boolean removePerson(Person p) {
        if(!phonebook.contains(p)) return false;
        phonebook.remove(p);
        return true;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p : phonebook) {
            if (p.getLastname().equals(lastname)) {
                tmp.add(p);
            }
        }
        return tmp.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p : phonebook) {
            if (p.getLastname().equals(lastname) && p.getName().equals(name)) {
                tmp.add(p);
            }
        }
        return tmp.toArray(new Person[]{});
    }
}
