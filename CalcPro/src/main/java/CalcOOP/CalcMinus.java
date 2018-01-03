package CalcOOP;

public class CalcMinus extends CalcOperation {
    public CalcMinus (String nameOperation,int FirstNumber, int SecondNumber ) {
        super(nameOperation, FirstNumber, SecondNumber);

    }
    // Вычисляет разность getFirstNumber и getSecondNumber
    public int Calculate() {
        return getFirstNumber() - getSecondNumber() ;
    }

    @Override
    public String toString() {
        return "CalcMinus+["+ super.toString()+"]" ;
    }
}



