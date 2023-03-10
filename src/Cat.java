public class Cat extends Animal {

    Cat(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    void makeNoise() {
        System.out.println("Мяукает");
    }

    @Override
    void eat() {
        System.out.println("Питается:\n" +
                "1. Кошачьим кормом\n" +
                "2. Молочком\n" +
                "3. Мышками");
    }

    @Override
    void getDescription() {
        System.out.print("Весёлый котик ");
    }

}
