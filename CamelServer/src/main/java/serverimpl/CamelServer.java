package serverimpl;

/**
 * @author David david.bajko@senacor.com
 */
public class CamelServer {

    public static void main(String[] args) {
        try {
            org.apache.camel.spring.Main main = new org.apache.camel.spring.Main();

            main.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
