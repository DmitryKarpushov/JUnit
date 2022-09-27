import org.junit.Assert;
import org.junit.Test;

/**
 * @author Дмитрий Карпушов 27.09.2022
 */
public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void checkZeroDivideShouldThrowException() {
        MyMath.divide(1, 0);
    }
}
