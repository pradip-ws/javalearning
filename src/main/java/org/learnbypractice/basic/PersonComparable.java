package org.learnbypractice.basic;
/*
* Use Comparable when you want to define a single, default way of sorting objects of a class, and that sorting logic belongs within the class itself.
* */

public class PersonComparableExample implements Comparable<PersonComparableExample> {
    private String name;
    private int age;

    public PersonComparableExample(String name,int age) {
        this.age =age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(PersonComparableExample o) {
        return this.age-o.age;// Sort by age in ascending order
    }

    @Override
    public String toString() {
        return "PersonComparableExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
