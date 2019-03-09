package net.nicholaspurdy.example.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExampleRunner implements CommandLineRunner {

    Logger log = LoggerFactory.getLogger(ExampleRunner.class);

    @Override
    public void run(String... args) throws Exception {
        log.info("Inside Spring Boot application.");

        try {
            exceptionalMethod();
        }
        catch (Exception e) {
            log.warn("Just caught an Exception.", e);
        }

        log.info("Finished executing.");
    }

    private void exceptionalMethod() {
        log.info("About to throw an exception.");

        throw new RuntimeException("Something exceptional occurred.");
    }
}
