package app.main;
import mypackage.operations.Arithmetic;
import mypackage.display.ResultDisplay;
public class mainprogram
{
    public static void main(String[] args) {
        Arithmetic op = new Arithmetic();
        ResultDisplay rd = new ResultDisplay();
        int a = 10, b = 5;
        rd.showResult("Addition", op.add(a, b));
        rd.showResult("Subtraction", op.subtract(a, b));
        rd.showResult("Multiplication", op.multiply(a, b));
        rd.showResult("Division", op.divide(a, b));
    }
}
