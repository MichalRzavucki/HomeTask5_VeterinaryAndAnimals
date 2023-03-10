public class Bear extends Animal {

    Bear(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    void makeNoise() {
        System.out.println("Рычит");
    }

    @Override
    void eat() {
        System.out.println("Питается:\n" +
                "1. Мёдом\n" +
                "2. Ягодами\n" +
                "3. Вкусностями");
    }

    @Override
    void getDescription() {
        System.out.print("Мишка плутишка ");
    }
}
