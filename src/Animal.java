public abstract class Animal {
    protected String animalType;

    protected String name;

    Animal(String animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void makeNoise() {
    }

    void eat() {
    }

    void getDescription() {
    }
}