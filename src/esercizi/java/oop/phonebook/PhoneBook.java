package oop.phonebook;

public interface PhoneBook {

    public static final int MAX_PERSONS = 256;
    public boolean addPerson(Person p);
    public boolean removePerson(Person p);
    public Person[] searchByLastname(String lastname);
    public Person[] searchByNameAndLastname(String lastname, String name);


}
