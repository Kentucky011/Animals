package Animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed){
        super(4, 2);
        this.breed = breed;
    }

    @Override
    public String walk() {
       return "Пёс радостно несется к вам сметая всё на своем пути.";
    }

    @Override
    public String sleep() {
        return "Пёс лежит на спине подняв лапы к верху и тихо похрапывает: Хрппп-Хрппп.";
    }

    @Override
    public String say() {
        return "Пес игриво подпрыгивает и радостно лает: Гав-Гав-Гав.";
    }

    @Override
    public String eat() {
        return "Пёс с огромным удовольствием уплетает свой корм: ОМномномнмом.";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String dogTrait(){
        return "Кажется, ваш любимый пес, виляя хвостом побежал есть чужие какашки.";
    }
}
