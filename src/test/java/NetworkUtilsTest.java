import org.junit.Test;

/**
 * @author Дмитрий Карпушов 27.09.2022
 */
public class NetworkUtilsTest {
    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThanSec(){
        NetworkUtils.getConnection();
    }
}
