package ru.kondratyev.task29;

public class Person {

    private int age;
    private String surname;
    private String gender;

    public Person(int age, String surname, String gender) {
        this.age = age;
        this.surname = surname;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        return gender != null ? gender.equals(person.gender) : person.gender == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + ( surname != null ? surname.hashCode() : 0 );
        result = 31 * result + ( gender != null ? gender.hashCode() : 0 );
        return result;
    }
}
