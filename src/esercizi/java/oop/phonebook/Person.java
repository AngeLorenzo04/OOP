package oop.phonebook;

import java.util.Objects;

public class Person {
    private String name;
    private String lastname;
    private String phone;

    public Person(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone  = phone;
    }

    public String getLastname(){
        return lastname;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(o.getClass() != getClass()){
            return false;
        }

        return Objects.equals(((Person) o).lastname, this.lastname) &&
                Objects.equals(((Person) o).name, this.name) &&
                Objects.equals(((Person) o).phone, this.phone);
    }


    @Override
    public int hashCode(){
        return Objects.hash(lastname,name,phone);
    }

    @Override
    public String toString(){
        return "Person{name="+name+", lastname="+lastname+", phone="+phone+"}";
    }

}
