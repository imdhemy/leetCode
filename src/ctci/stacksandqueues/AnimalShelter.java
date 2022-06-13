package ctci.stacksandqueues;

import java.sql.Timestamp;
import java.util.LinkedList;

public class AnimalShelter {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();

    public void enque(Animal animal) {
        if (animal instanceof Dog)
            dogs.addLast((Dog) animal);
        else
            cats.addLast((Cat) animal);
    }

    public Animal dequeue() {
        if (dogs.isEmpty()) return dequeueCat();
        else if (cats.isEmpty()) return dequeueDog();

        return dogs.peek().isOlder(cats.peek()) ? dequeueDog() : dequeueCat();
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.poll();
    }

    public static abstract class Animal {
        protected int createdAt;

        public Animal() {
            createdAt = (int) new Timestamp(System.currentTimeMillis()).getTime();
        }

        public int getCreatedAt() {
            return createdAt;
        }

        public boolean isOlder(Animal animal) {
            return createdAt < animal.createdAt;
        }
    }

    public static class Dog extends Animal {
    }

    public static class Cat extends Animal {
    }
}
