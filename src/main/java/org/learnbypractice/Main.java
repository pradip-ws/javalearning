package org.learnbypractice;

import org.learnbypractice.basic.PersonComparableExample;
import org.learnbypractice.basic.PersonComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ComparableExample();

        ComparatorExample();
    }

    private static void ComparatorExample() {
        //Usage of PersonComparatorExample

        // Comparator to sort by name
        Comparator<PersonComparatorExample> nameComparator = (PersonComparatorExample p1,PersonComparatorExample p2)-> p1.getName().compareTo(p2.getName());

        // Comparator to sort by age
        Comparator<PersonComparatorExample> ageComparator =  (PersonComparatorExample p1,PersonComparatorExample p2)-> p1.getAge()-p2.getAge();

        // Usage
        List<PersonComparatorExample> peopleList = new ArrayList<>();
        peopleList.add(new PersonComparatorExample("Alice", 30));
        peopleList.add(new PersonComparatorExample("Bob", 25));

        Collections.sort(peopleList, nameComparator); // Sorts by name
        System.out.println("Sorts by name:"+peopleList);
        Collections.sort(peopleList, ageComparator);  // Sorts by age
        System.out.println("Sorts by age:"+peopleList);
    }

    private static void ComparableExample() {
        // Usage of PersonComparableExample
        List<PersonComparableExample> personList = new ArrayList<>();
        personList.add(new PersonComparableExample("pradip",12));
        personList.add(new PersonComparableExample("akshay",20));

        Collections.sort(personList);// Sorts using the natural order defined by compareTo()
        System.out.println("personList:"+personList);
    }

}