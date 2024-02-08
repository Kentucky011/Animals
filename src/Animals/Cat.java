package Animals;

public class Cat extends Animal{
    public Cat(){
        super(4,2);
    }
    @Override
    public String walk() {
        return "Кот бесшумно крадется на мягких лапках.";
    }

    @Override
    public String sleep() {
        return "Кот сладко сопит свернувшись калачиком: ZzzzZzzzZzz.";
    }

    @Override
    public String say() {
        return "Код радостно мяукает: Мяу-Мяу.";
    }

    @Override
    public String eat() {
        return "Кот с большим удовольствием уплетает еду.";
    }
    public String catTrait(){
        return "Кот очень рад вас видеть и поэтому громко мурчит: МуррМуррМурр.";
    }
}
