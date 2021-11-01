public class Artifact {
int id;
String kultura;
int century;

public Artifact(int id){
    this.id = id;
    System.out.println("Объект успешно создан! ID: " + id + ". Век: Неизвестно. Культура: Неизвестно.");
    }

    public Artifact(int id, String kultura){
        this.id = id;
        this.kultura = kultura;
        System.out.println("Объект успешно создан! ID: " + id + ". Век: Неизвестно. Культура: " + kultura);
    }
    public Artifact(int id, String kultura, int century){
        this.id = id;
        this.kultura = kultura;
        this.century =century;
        System.out.println("Объект успешно создан! ID: " + id + ". Век: " + century +  "  Культура: " + kultura);
    }
    public static void main(String[] args) {
        Artifact a1 = new Artifact(21);
        Artifact a2 = new Artifact(22, "Ацтеки");
        Artifact a3 = new Artifact(23, "Россия", 17);
    }
}