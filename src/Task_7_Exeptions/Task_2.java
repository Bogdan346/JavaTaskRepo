package Task_7_Exeptions;

public class Task_2 {
    public static void main(String[] args) {
      //  Проверить конструкцию без catch с final
        double sum = 0;

        try {
            sum=1/0;
        }finally {
            System.out.println("На ноль делить нельзя");
        }
    }
    }

