package GPT;

public class PersonDemo {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "D";
        p1.age = 28;

        Person p2 = new Person();
        p2.name = "K";
        p2.age = 36;

        p1.introduce();
        p2.introduce();
    }
}
