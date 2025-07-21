package oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {

    final Person[] phoneBook;


    public PhoneBookArray() {
        phoneBook = new Person[MAX_PERSONS];
    }


    @Override
    public boolean addPerson(Person p) {

        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] != null && phoneBook[i].equals(p)) {
                return false;
            }
        }

        for(int i = 0 ; i < phoneBook.length; i++){
            if(phoneBook[i] == null){
                phoneBook[i] = p;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
       for(int i = 0 ; i < MAX_PERSONS; i++){
           if(phoneBook[i] != null && phoneBook[i].equals(p)){
               phoneBook[i] = null;
               return true;
           }
       }
       return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        int k = 0;
        Person[] trovati = new Person[MAX_PERSONS];
       for(int i = 0; i < MAX_PERSONS; i++){
           if(phoneBook[i] != null && phoneBook[i].getLastname().equals(lastname)){
               trovati[k++] = phoneBook[i];
           }
       }
        return Arrays.copyOf(trovati,k);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        int k = 0;
        Person[] trovati = new Person[MAX_PERSONS];
        for(int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] != null  && phoneBook[i].getName().equals(name) && phoneBook[i].getLastname().equals(lastname)){
                trovati[k++] = phoneBook[i];
            }
        }
        return Arrays.copyOf(trovati,k);
    }
}
