package Java_Junior.DZ2.task1;

public class Cat extends Animal {

    String cat_breed;
    public Cat(String name, int age, String cat_breed) {
        super(name, age);
        this.cat_breed = cat_breed;
    }

    @Override
    public void voice() {
        System.out.println(super.getName() + " говорит: Мяу");
    }

    public String makeSound() {
        return "Дайте молока! Пожалуйста";
    }

}
