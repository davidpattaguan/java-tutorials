public class Person {



    private int age;
    private String name;
    private String gender;

    public Person() {
        this.age = 1;
        this.name = "default";
        this.gender = "Male";
    }
    public Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void introduceSelf(){
        System.out.println("Hi! I'm " + name + ". I'm " + age + " years old. " + gender );
    }

}
