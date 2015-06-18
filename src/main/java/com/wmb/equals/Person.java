package com.wmb.equals;

/**
 * Created by rob on 6/17/15.
 */
public class Person {
    private int instanceId;
    private String name;
    private int age;

    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
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

    // same-type-comparison implementation of equals()
    public boolean equals2(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person animal = (Person) o;

        if (instanceId != animal.instanceId) return false;

        return true;
    }


    //Mixed-type-comparison implementation of equals()
    public boolean equals1(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person animal = (Person) o;

        if (instanceId != animal.instanceId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return instanceId;
    }
}
