public class Dog {
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

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String bark(){
        return "woof";
    }

    private String name;
    private int age;
}
