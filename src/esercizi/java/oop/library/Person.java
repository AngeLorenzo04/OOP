package oop.library;

import java.util.Objects;

public class Person{

    private String id;
    private String surname;
    private String name;

    public Person(String id, String surname, String name){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
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
                Objects.equals(((Person) obj).surname, this.surname) &&
                Objects.equals(((Person) obj).id, this.id) &&
                Objects.equals(((Person) obj).name, this.name)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname,name,id);
    }

    @Override
    public String toString() {
        return "Nome: " + name + " Cognome: " + surname + " id: " + id;
    }
}
