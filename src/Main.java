import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Котик", "Мурзик");
        Animal dog = new Dog("Пёсик", "Тузик");
        Animal bear = new Bear("Мишка", "Топа");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(bear);

        Veterinary veterinary = new Veterinary();

        for (int i = 0; i < animalList.size(); i++) {
            System.out.print(i + 1 + ". ");
            veterinary.treatAnimal(animalList.get(i));
        }

        System.out.println();

        for (int j = 0; j < animalList.size(); j++) {
            System.out.print(animalList.get(j).getAnimalType() + " ");
            System.out.println("\"" + animalList.get(j).getName() + "\"");
            animalList.get(j).makeNoise();
            animalList.get(j).eat();
            System.out.println();
        }

    }
}
