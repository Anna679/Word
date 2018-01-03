package CalcOOP;

public class CalcDivide extends CalcOperation {
    public CalcDivide (String nameOperation,int FirstNumber, int SecondNumber ) {
        super(nameOperation, FirstNumber, SecondNumber);

    }
    public int Calculate() {
        return getFirstNumber() / getSecondNumber() ;
    }

    @Override
    public String toString() {
        return "CalcDivide+["+ super.toString()+"]" ;
    }
}
