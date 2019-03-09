package net.nicholaspurdy.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utility {

    private final static Logger log = LoggerFactory.getLogger(Utility.class);

    public void doSomething() {
        log.info("We're about to do something...");

        try {
            this.doSomethingExceptional();
        }
        catch (Exception e) {
            log.info("Just caught an exception, lets wrap it to demo multiple stack traces.");
            throw new RuntimeException("The stack trace for this exception should be a single CloudWatch event.", e);
        }
    }

    private void doSomethingExceptional() {
        log.info("Here comes an exception!");
        throw new IllegalStateException("Some kind of illegal state.");
    }

}
