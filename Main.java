package homework6;

public class Main {
    public static void main(String [] args){
        Cat cat1= new Cat("Дымок");
        Cat cat2= new Cat("Бегемот");
        Cat cat3= new Cat("Васиуалий");

        Dog dog1= new Dog("Рекс");
        Dog dog2= new Dog("Барбос");
        Dog dog3= new Dog("Шепард");

        cat1.overall();
        cat2.overall();
        cat3.overall();

        dog1.overall();
        dog2.overall();
        dog3.overall();

        cat1.swim(5);
        cat2.run(200);
        cat3.jump(1);

        dog1.run(300);
        dog2.jump(0.1d);
        dog3.swim(10);
    }
}
