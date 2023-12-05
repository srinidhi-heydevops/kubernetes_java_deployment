package uk.co.danielbryant.djshopping.shopfront;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = ShopfrontApplication.class)
public class ShopfrontApplicationTests {

    @Test
    public void contextLoads() {

livenessProbe:
initialDelaySeconds: 2
periodSeconds: 5
httpGet:
path: /health
port: 9876
    }

}
