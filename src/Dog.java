public class Dog extends Animal {

    Dog(String animalType, String name) {
        super(animalType, name);
        this.name = name;
    }

    @Override
    void makeNoise() {
        System.out.println("Гавкает");
    }

    @Override
    void eat() {
        System.out.println("Питается:\n" +
                "1. Собачьим кормом\n" +
                "2. Косточками\n" +
                "3. Мяском");
    }

    @Override
    void getDescription() {
        System.out.print("Послушный пёсик ");
    }

}
