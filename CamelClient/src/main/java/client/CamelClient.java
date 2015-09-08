package client;

import org.apache.camel.ProducerTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author David david.bajko@senacor.com
 */
public class CamelClient {

    public static void main(final String[] args) throws Exception {
        System.out.println("Notice this client requires that the CamelServer is already running!");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        ProducerTemplate camelTemplate = context.getBean("camelTemplate", ProducerTemplate.class);

        System.out.println("Invoking the multiply with 22");
        // as opposed to the CamelClientRemoting example we need to define the service URI in this java code
        int response = (Integer) camelTemplate.requestBody("jms:queue:numbers",  22);
        System.out.println("... the result is: " + response);

        // we're done so let's properly close the application context
        System.exit(0);
    }
}
