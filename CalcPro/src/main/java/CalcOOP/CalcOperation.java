package CalcOOP;

public  abstract class CalcOperation {
    private String nameOperation;
    private int firstNumber;
    private int secondNumber;

public CalcOperation(){}

    public CalcOperation(String nameOperation, int firstNumber, int secodNumber) {
        this.nameOperation = nameOperation;
        this.firstNumber = firstNumber;
        this.secondNumber = secodNumber;
    }

    public String getNameOperation() {
        return nameOperation;
    }

    public void setNameOperation(String nameOperation) {
        this.nameOperation = nameOperation;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secodNumber) {
        this.secondNumber = secodNumber;
    }

    public abstract int Calculate () ;



    @Override
    public String toString() {
        return "nameOperation="+ nameOperation +",FirstNumber="+firstNumber+",SecondNumber="+secondNumber;
    }
}
