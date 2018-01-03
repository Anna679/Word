package CalcOOP;

public class CalcMultiply extends CalcOperation {
    public CalcMultiply (String nameOperation,int FirstNumber, int SecondNumber ) {
        super(nameOperation, FirstNumber, SecondNumber);

    }
    // Вычисляет разность getFirstNumber и getSecondNumber
    public int Calculate() {
        return getFirstNumber() * getSecondNumber() ;
    }

    @Override
    public String toString() {
        return "CalcMultiply+["+ super.toString()+"]" ;
    }
}

