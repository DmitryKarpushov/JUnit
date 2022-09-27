import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Дмитрий Карпушов 27.09.2022
 */
public class Vector2DTest {
    /**
     * Тестовый сценарий
     */
    private final static double EPS = 1e-9;
    private static Vector2D v1;//action

    @BeforeClass
    public static void createNewVector() {
        v1 = new Vector2D();//action
    }


    @Test
    public void newVectorShouldHaveZeroLenght() {
        //assertion
        //1e-9 = 0.0000..001
        Assert.assertEquals(0, v1.lenght(), EPS); //delta - точность; expected - чего ждем(Ожидания)
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        //assertion
        //1e-9 = 0.0000..001
        Assert.assertEquals(0, v1.getX(), EPS); //delta - точность; expected - чего ждем(Ожидания)
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        //assertion
        //1e-9 = 0.0000..001
        Assert.assertEquals(0, v1.getY(), EPS); //delta - точность; expected - чего ждем(Ожидания)
    }
    @Test
    public void newVectorShouldHaveZeroYAndZeroY() {
        //assertion
        //1e-9 = 0.0000..001
        Assert.assertEquals(0, v1.getY(), EPS); //delta - точность; expected - чего ждем(Ожидания)
        Assert.assertEquals(0, v1.getY(), EPS); //delta - точность; expected - чего ждем(Ожидания)
    }
}
