package task_4;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Васька", 45, false);
        System.out.println(cat);

        Animal cat1 = new Animal("Васька", 45, true);
        System.out.println(cat.equals(cat1));
        System.out.println(cat.hashCode());
        System.out.println(cat1.hashCode());
    }
}
