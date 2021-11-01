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
      System.out.println(u1.age +", " + u1.name +", " + u1.height);
      User u2 = new User((short) 18,  );
    }
}