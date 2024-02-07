import Animals.Animal;
import Animals.Dog;

public class App {
    public static void main (String[] args){
        Dog dog = new Dog("Samoi");
        System.out.println(dog.eat());
        dog.setBreed("Stafford");
        System.out.println(dog.getBreed());
    }

}

