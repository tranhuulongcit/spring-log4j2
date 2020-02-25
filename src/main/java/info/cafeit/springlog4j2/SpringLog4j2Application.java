package info.cafeit.springlog4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLog4j2Application implements CommandLineRunner {

    private final Logger LOGGER = LoggerFactory.getLogger(SpringLog4j2Application.class);


    public static void main(String[] args) {
        SpringApplication.run(SpringLog4j2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        LOGGER.debug("OK");
        int a = 10/0;
    }
}
