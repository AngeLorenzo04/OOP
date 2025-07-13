package oop.phonebook;


public class PhoneBookArray  implements PhoneBook{

    private final Person[] phoneBook;

    public PhoneBookArray(Person[] phoneBook){

        this.phoneBook = new Person[MAX_PERSON];
    }

    @Override
    public boolean addPerson(Person p){
        for(int i = 0; i < MAX_PERSON; i++){
            if(phoneBook[i].equals(p)){
                return false;
            }
        }

        for(int i = 0; i < MAX_PERSON; i++){
            if(phoneBook[i] == null){
                phoneBook[i] = p;
            }

        }

        return true;
    }

    @Override
    public boolean removePerson(Person p) {
        for(int i = 0; i < MAX_PERSON; i++){
            if(phoneBook[i].equals(p)){
                phoneBook[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        System.out.println("La ricerca per cognome " + "(" + lastname + ")" +" ha restituito: ");
        Person[] find = new Person[MAX_PERSON];
        int j = 0;
        for(Person p : phoneBook){
            if(p.getLastname().equals(lastname)){
                System.out.println("- " + p.toString());
                find[j] = p;
                j++;
            }
        }
        return find;
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        System.out.println("La ricerca per nome e cognome " + "(" + name + "," + lastname + ")" +" ha restituito: ");
        Person[] find = new Person[MAX_PERSON];
        int j = 0;
        for(Person p : phoneBook){
            if(p.getLastname().equals(lastname) && p.getName().equals(name)){
                System.out.println("- " + p.toString());
                find[j] = p;
                j++;
            }
        }
        return find;
    }


}
