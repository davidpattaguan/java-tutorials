public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    public void wagTail() {
        System.out.println("The dog wags its tail");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void fetch() {
        System.out.println("The dog fetches a ball");
    }
}
