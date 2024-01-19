public class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The Cat Meows");
    }

    public void wagTail() {
        System.out.println("The Cat wags its tail");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void attack() {
        System.out.println("The Cat Scratches you!");
    }
}
