public class Veterinary {
    public void treatAnimal(Animal animal) {
        System.out.print("На приём пришёл: ");
        animal.getDescription();
        System.out.print("\"" + animal.getName() + "\"");
        System.out.println();
    }

}
