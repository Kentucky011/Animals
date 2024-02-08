package Animals;

import Animals.Interface.FlyingAnimals;

public class Dragon extends Animal implements FlyingAnimals {
    public Dragon(){
        super(4,2);
    }
    @Override
    public String walk() {
        return "Дракон тяжелой поступью направляется к вам, громко клацая когтями: Клац-клац-клац.";
    }

    @Override
    public String sleep() {
        return "Вы слышите кромкое сопение огромного дракона неподалеку.";
    }

    @Override
    public String say() {
        return "Дракон открывает свою пасть и до вас доносится гулкий рык: АГРРРХХ!";
    }

    @Override
    public String eat() {
        return "Дракон с недоверием глотает ваше печенье, в его глазах виднеется просьба чего-то по-крупнее.";
    }
    public String fly(){
        return "Дракон машет своими огромными крыльями вздымая высоко над крышами. Главное чтобы никто не заметил.";
    }
    public String dragonTrait(){
        return "Огонь резко вырывается из пасти вашего Дракона, жаль никого нельзя сжечь. Иногда хочется.";
    }
}
