package Lesson6;

public class Animals {

    protected String name;
    protected boolean runAbility;
    protected boolean swimAbility;

    public Animals() {

    }

    public Animals(String name, boolean runAbility, boolean swimAbility) {
        this.name = name;
        this.runAbility = runAbility;
        this.swimAbility = swimAbility;
    }
//    Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//    Результатом выполнения действия будет печать в консоль.
//    (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.')

    public void run(int runDistance) {
        if (runAbility = true) {
            System.out.println(name + " run " + runDistance + "m");
        } else {
            System.out.println(name + "cannot run");
        }
    }

        public void swim(int swimDistance){
            if (swimAbility = true) {
                System.out.println(name + " swam " + swimDistance + "m");
            } else {
                System.out.println(name + "cannot swim");

            }
        }

        //4*. Добавить подсчет созданных котов, собак и животных
//        public void countAnimals ()
    }

