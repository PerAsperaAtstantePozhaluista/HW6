package Lesson6;

//1.Создать классы Собака и Кот с наследованием от класса Животное.
public class Dog extends Animals {

    Animals Dog = new Animals("Chips", true, true);

    // У каждого животного есть ограничения на действия
    // (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

    @Override

    public void run(int runDistance) {
        super.run(500);
    }

    @Override
    public void swim(int swimDistance) {
        super.swim(10);
    }
}


