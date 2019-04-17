package Task_7_Exeptions;

public class Task_1 {
    public static void main(String[] args) {
      //  1. Завернуть в try catch 1/0 и вывести на ноль делить нельзя
        double sum = 0;

        try {
        sum=1/0;
        }catch (Exception ex){
            System.out.println("На ноль делить нельзя");
        }
    }
}
