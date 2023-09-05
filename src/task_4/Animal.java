package task_4;

import java.util.Objects;

/*
Створити клас task_4.Animal з ім'ям String, int віком, хвостом Boolean. У класі перевизначити метод toString, щоб висновок
був наступним «Ім'я: Васька, вік: 45, хвіст: ні». У класі task_4.Animal перевизначити методи equals & hashCode.
 */
public class Animal {
    String name;
    int age;
    Boolean tail;
    Animal(){
    }
    Animal(String name, int age, Boolean tail){
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getTail() {
        return tail;
    }

    public void setTail(Boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        String tail1 = "";
        if (tail){
            tail1 = "так";
        } else {
            tail1 = "ні";
        }

        return "Імʼя: '" + name + '\'' +
                ", вік: " + age +
                ", хвіст: " + tail1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(tail, animal.tail);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + name.hashCode();
        result = prime * result + Objects.hashCode(age);
        result = prime * result + (tail ? 1 : 0);

        return result;
    }
}
