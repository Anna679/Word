package CalcOOP;

public class CalcPlus extends CalcOperation {
    public CalcPlus (String nameOperation,int FirstNumber, int SecondNumber ) {
        super(nameOperation, FirstNumber, SecondNumber);

    }
    // Вычисляет сумму getFirstNumber и getSecondNumber
    public int Calculate() {
        return getFirstNumber() + getSecondNumber() ;
    }

    @Override
    public String toString() {
        return "CalcPlus+["+ super.toString()+"]" ;
    }
}

