import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Dragon;

public class App {
    public static void main (String[] args){
        Dog dog = new Dog("Samoi");
        System.out.println(dog.eat());
        dog.setBreed("Stafford");
        System.out.println(dog.getBreed());
        Cat cat = new Cat();
        System.out.println(cat.sleep());
        Dragon dragon = new Dragon();
        System.out.println(dragon.eat());
    }

}

