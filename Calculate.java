/**
 * Created by User on 02.12.2016. // 03.04.2024 by isushkov
 */
public class Calculate {

    /**
     результат вычисления.
     */
    private int result;

    /**
     сумируем аргументы
     @param params Аргументы суммирования.
     */
    public void add(int ... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    /**
     Получить результат.
     @return результат вычисления.
     */
    public int getResult() {
        return this.result;
    }
    /**
     Очистить результат вычисления
     */
    public void cleanResult(){
        this.result = 0;
    }
}

