package oop.phonebook;

public interface PhoneBook {

    public static final int MAX_PERSON = 250;

    public boolean addPerson(Person p);

    public boolean removePerson(Person p);

    public Person[] searchByLastname(String lastname);

    public Person[] searchByNameAndLastname(String name, String lastname);

}
