package oop.phonebook;

import java.util.Objects;

public class Person {

    private String name;
    private String lastname;
    private String phone;

    public Person(String name, String lastname, String phone){
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(getClass() != obj.getClass()){
            return false;
        }

        return( Objects.equals(((Person) obj).name, this.name) &&
                Objects.equals(((Person) obj).lastname, this.lastname) &&
                Objects.equals(((Person) obj).phone, this.phone) );
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + ", phone='" + phone + '\'' + '}';
    }
}
