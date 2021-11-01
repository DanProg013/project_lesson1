public class User {

    String name;
    short age;
    int height;

    public User(String name, short age, int height){//1
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User(short age, String name, int height){//2
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public User(int height, short age, String name){//3
        this.height = height;
        this.age = age;
        this.name = name;
    }
    public User(String name, int height, short age){//4
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public User(short age, int height, String name){//5
        this.age = age;
        this.height = height;
        this.name = name;
    }
    public User(int height, String name, short age){//6
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
      User u1 = new User((short) 25, "Алексей", 182);
      System.out.println(u1.name +", " + u1.age +", " + u1.height);
      User u2 = new User((short) 18, 183, "Алеся");
        System.out.println(u2.age +", "+ u2.name +", " + u2.height);
      User u3 = new User((short) 29, "Олег", 177);
        System.out.println(u3.height + ", " + u3.age + ", " + u3.name);
      User u4 = new User((short) 35, "Виталий" , 190);
        System.out.println(u4.name + ", " + u4.height + ", " + u4.age);
      User u5 = new User((short) 19, "Алина", 192);
        System.out.println(u5.age + ", " + u5.height + ", " + u5.name);
      User u6 = new User(182, "Марина", (short) 35);
        System.out.println(u6.height + ", " + u6.name + ", " + u6.age);
    }
}