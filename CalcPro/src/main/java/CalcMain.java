import CalcOOP.*;

import java.util.Scanner;

public  class CalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оператор ");
        String nameOperation;
        nameOperation = scanner.next();
        System.out.println(nameOperation);
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println (firstNumber);
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        System.out.println (secondNumber);
        CalcOperation operation;
operation=getOperation(nameOperation,firstNumber,secondNumber);

        int result ;
        if (operation!=null) {
        result=operation.Calculate();
            System.out.printf("Сумма: %d", result);
        }else System.out.println("Ошибка,значение операции=0!");
        // Получить со сканера знак операции в виде строки
        // Получить со сканера первый операнд
        //Получить со сканера второй операнд
        // Из полученных со сканера значений при помощи функции getOperation получить экземпляр базовой операции
        // Вычислить результат операции при помощи функции Calculate
    }

    public static CalcOperation getOperation(String nameOperation, int firstNumber, int secondNumber) {


        if (nameOperation.equals("+"))return new CalcPlus(nameOperation, firstNumber, secondNumber);
        if (nameOperation.equals("-")) return new CalcMinus(nameOperation, firstNumber, secondNumber);
        if (nameOperation.equals("*")) return new CalcMultiply(nameOperation, firstNumber, secondNumber);
        if (nameOperation.equals("/")) return new CalcDivide(nameOperation, firstNumber, secondNumber);
    return null;

    }

}

