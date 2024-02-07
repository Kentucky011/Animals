package Animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed){
        super(4, 2);
        this.breed = breed;
    }

    @Override
    public String walk() {
       return "тык-тык-тык";
    }

    @Override
    public String sleep() {
        return "ZzzzZZzzzZZzzz";
    }

    @Override
    public String say() {
        return "Гав-Гав";
    }

    @Override
    public String eat() {
        return "ОМномномнмом";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
