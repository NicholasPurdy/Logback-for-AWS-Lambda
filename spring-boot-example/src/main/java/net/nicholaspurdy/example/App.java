package net.nicholaspurdy.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements RequestHandler<ScheduledEvent, String> {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public String handleRequest(ScheduledEvent scheduledEvent, Context context) {
        SpringApplication.run(App.class);

        return "END";
    }
}
