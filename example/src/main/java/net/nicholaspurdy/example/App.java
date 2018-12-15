package net.nicholaspurdy.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App implements RequestHandler<ScheduledEvent, String> {

    private final static Logger log = LoggerFactory.getLogger(App.class);
    private static final Utility util;

    static {
        util = new Utility();
    }

    public static void main(String[] args) {

        log.info("Just putting the main method in this so you can see what the logs look like locally.");

        try {
            util.doSomething();
        } catch (Exception e) {
            log.warn("We just caught an exception.", e);
        }

        log.info("End of main.");
    }

    @Override
    public String handleRequest(ScheduledEvent scheduledEvent, Context context) {

        log.info("Lambda function beginning...");

        try {
            util.doSomething();
        } catch (Exception e) {
            log.warn("We just caught an exception.", e);
        }

        log.info("End of lambda function.");
        return "Lambda complete";
    }
}
