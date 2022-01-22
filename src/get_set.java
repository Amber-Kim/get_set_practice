class Person {
    // Field
    private String name;
    private int age;
    private int height;
    private int weight;

    // Constructor
    Person() {
    }

    Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Method
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void move() {
        System.out.println(getName() + " is moving...");
    }
}

class Villain extends Person {
    // Field
    private String unique_key;
    private int weapon;            // 1~9 distinguish weapon by number... 1) gun 2) spear 3) knife..
    private double power;

    // Constructor
    Villain() {
    }

    Villain(String name, int age, int height, int weight, String unique_key, int weapon, double power) {
        super(name, age, height, weight);
        this.unique_key = unique_key;
        this.weapon = weapon;
        this.power = power;
    }

    // Method
    public String getUnique_key() {
        return unique_key;
    }

    public void setUnique_key(String unique_key) {
        this.unique_key = unique_key;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    // printPerson()
    public void printPerson() {
        System.out.println("---------------------------------");
        System.out.println("Villain Name : " + getName());
        System.out.println("Villain Age : " + getAge());
        System.out.println("Villain Height : " + getHeight());
        System.out.println("Villain Weight : " + getWeight());
        System.out.println("Villain Number : " + getUnique_key());
        System.out.println("Villain Weapon : " + getWeaponName(getWeapon()));  // 숫자(1~9) --> 1: 창, 2: 방패, 3: 총..
        System.out.println("Villain Power : " + getPower());
        System.out.println("---------------------------------");
    }

    // getWeaponName()
    public String getWeaponName(int a) {
        String weapon;
        switch (a) {
            case 1:
                weapon = "Spear";
                break;
            case 2:
                weapon = "Shield";
                break;
            case 3:
                weapon = "Gun";
                break;
            default:
                weapon = "Wand";
                break;
        }
        return weapon;
    }
}

public class get_set {
    public static void main(String[] args) {

        // [1] : 객체 생성
        Villain v1 = new Villain("Zombie", 20, 180, 80, "15001231", 3, 99.5);
        v1.printPerson();
        v1.move();  // 부모 클래스의 move() 메서드를 호출.

        // [2] : 객체 생성
        Villain v2 = new Villain("Goblin", 30, 175, 70, "11001121", 2, 77.5);
        v2.printPerson();
        v2.move();

        // [3] : 객체 생성
        Villain v3 = new Villain("Captain America", 40, 180, 70, "10001010", 2, 6.9);
        v3.printPerson();
        v3.move();

    }
}
