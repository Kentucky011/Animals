import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Dragon;

public class App {
    public static void main (String[] args){
        Dog dog = new Dog("Samoi");
        dog.setBreed("Stafford");
        Cat cat = new Cat();
        Dragon dragon = new Dragon();
        Animal[] array = new Animal[3];
        array[0] = dog;
        array[1] = cat;
        array[2] = dragon;
        for (int index = 0; index < array.length; index++){
            System.out.println(array[index].walk());
        }

    }

}
