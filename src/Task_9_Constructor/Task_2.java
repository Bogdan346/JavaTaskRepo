package Task_9_Constructor;

public class Task_2 {
    //Создать второй конструктор в котором будет выводится Имя класса и названия того кто его делал
    public Task_2( ) {
        System.out.println( this.autorName = autorName);
        System.out.println("Class name: "+getClass().getSimpleName());
    }

    private String autorName = "Autor";


    public static void main(String[] args) {
        Task_2 t2 = new Task_2();
    }
}
