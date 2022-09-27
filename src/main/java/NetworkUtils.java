/**
 * @author Дмитрий Карпушов 27.09.2022
 */
public class NetworkUtils {
    public static void getConnection(){
        //Получаем соединение с сервером
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return;
    }
}
