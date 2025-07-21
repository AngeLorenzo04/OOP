package oop.library;

import java.util.Objects;

public class Person {

    private String id;
    private String lastname;
    private  String name;

    public Person(String id, String  lastname, String name){
        this.id = id;
        this.lastname = lastname;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(getClass() != o.getClass()){
            return false;
        }

        return (
            Objects.equals(this.name, ((Person) o).name) &&
            Objects.equals(this.id, ((Person) o).id) &&
            Objects.equals(this.lastname, ((Person) o).lastname)
        );
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,lastname,id);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + ", id='" + id + '\'' + '}';
    }

}
