package week5;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this(name, 0);  // run here the other constructor's code and set the age parameter to 0
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }


    public void printPerson() {
        System.out.println(this.name + " I am " + this.age + " years old");
    }

    public void becomeOlder() {
        this.becomeOlder(1);
    }

    public void becomeOlder(int years) {
        this.age = this.age + years;
    }

    public boolean adult(){
        if ( this.age < 18 ) {
            return false;
        }

        return true;
    }

    public double weightIndex(){
        double heightInMeters = this.height/100.0;

        return this.weight / (heightInMeters*heightInMeters);
    }

    public String toString(){
        return this.name + " I am " + this.age + " years old, my weight index is " + this.weightIndex();
    }


    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }
}
