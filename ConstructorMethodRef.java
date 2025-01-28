class Human{
    private String name;
    private int age;
    private float weight;
    
    public Human(String name, int age, float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString(){
        return String.format("Name= %s, Age= %d, Weight= %.2f",name, age, weight);
    }
}

interface HumanFactory{
    Human create(String name, int age, float weight);
}


public class ConstructorMethodRef {
    public static void main(String[]args){
        HumanFactory human = Human::new;
        Human human2 = human.create("madhu", 23, 49.5f);
        System.out.println(human2);
    }
    
}
