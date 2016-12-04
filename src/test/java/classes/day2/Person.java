package classes.day2;

/**
 * Created by Galek on 04.12.2016.
 */
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public boolean isWorking() {
        if(age >= 18 && age <= 68)
            return true;
        else
            return false;
    }

    public boolean isWorking2() {
        return age >= 18 && age <= 68;
    }

    public boolean isWorking3() {
        return (age >= 18 && age <= 68) ? true : false;

    }
}
