package org.learnbypractice.immutableclass;

import java.util.ArrayList;
import java.util.List;

// Step 1: Declare the class as final
public final class ImmutableClass {
    // Step 2: Make all fields private and final
    private final String name;
    private final int age;
    private final List<String> hobbies;

    // Step 4: Initialize fields via a constructor
    public ImmutableClass(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        // Step 5: Deep copy the mutable object to ensure immutability
        this.hobbies = new ArrayList<>(hobbies);
    }

    // Step 3: No setter methods provided, only getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //Step 6: Return a defensive copy of the mutable object
    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }
}
// Example usage
//class Main {
//    public static void main(String[] args) {
//        List<String> hobbies = new ArrayList<>();
//        hobbies.add("Reading");
//        hobbies.add("Gaming");
//
//        ImmutableClass person = new ImmutableClass("John", 25, hobbies);
//
//        // Access the immutable data
//        System.out.println(person.getName()); // Output: John
//        System.out.println(person.getAge());  // Output: 25
//        System.out.println(person.getHobbies()); // Output: [Reading, Gaming]
//
//        // Trying to modify the hobbies list won't affect the ImmutableClass object
//        hobbies.add("Swimming");
//        System.out.println(person.getHobbies()); // Output: [Reading, Gaming]
//
//        // Even if you get the hobbies list and modify it, it won't affect the internal state
//        List<String> newHobbies = person.getHobbies();
//        newHobbies.add("Swimming");
//        System.out.println(person.getHobbies()); // Output: [Reading, Gaming]
//    }
//}