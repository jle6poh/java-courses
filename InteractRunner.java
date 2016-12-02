/**
 * Created by User on 02.12.2016.
 */

import java.util.Scanner;
/**
 класс для зааапуск калькулятора. Поддерживает ввод пользователя
 */

public class InteractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculate calc = new Calculate();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter firs arg : ");
                String first = reader.next();
                System.out.println("Enter second arg : ");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result :" + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit : yes/no");
                exit = reader.next();
            }
        }finally {
            reader.close();

            }

        }

    }


