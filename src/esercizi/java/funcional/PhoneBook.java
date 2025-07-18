package funcional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PhoneBook {

    final List<Person> people;

    public PhoneBook(List<Person> people) {
        this.people = people;
    }

    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person (String name, String lastname, String phone){
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
        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, person.phone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, lastname, phone);
        }
    }




    public Optional<Person> searchByLastname(String lastname){
        return people.stream().filter(p -> p.lastname.equals(lastname)).findFirst();
    }
    public Optional<Person> searchByNameAndLastname(String name, String lastname){
        return people.stream().filter(p -> p.lastname.equals(lastname) && p.name.equals(name)).findFirst();
    }

}
