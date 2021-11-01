public class Car {  //Класс Car
    int hp;           //Его поля, параметры, переменные
    int year_production;
    String model;

    static int count = 0; // Переменная принадлежащая классу

    public void zavod (){ //Методы класса Car
        System.out.println("Завожусь");
    }
    public void ezda (){ //Методы класса Car
        System.out.println("Еду");
    }

    public Car (int hp, int year_production, String model) { //Конструктор класса Car
          this.hp = hp;
          this.year_production = year_production;
          this.model = model;
    }
    public static void main(String[] args) { //Метод принадлежащий всему классу
      Car kia = new Car(150, 2021, "Rio");//Создание обьекта из класса Car
      count++;
      Car BMW = new Car (249, 2020, "X3");//Создание обьекта из класса Car
      count++;
      System.out.println("Мы создали Машину: " + kia.model + " Год ее выпуска: " + kia.year_production+
              " Ее мощность :" + kia.hp + " Общее количетсво машин: " + count);
      kia.zavod();
      BMW.ezda();

    }
}
