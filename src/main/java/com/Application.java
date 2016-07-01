package com;

import com.beans.IUtilities;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;
import static java.lang.System.out;

/**
 * Created by hhernandez on 1/07/16.
 */
@Singleton
public class Application {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(Application.class);

    @Inject
    private IUtilities myUtilities;

    public void run() {
        out.println("application initialized");
        out.println(myUtilities.getCurrentDate());

    }

    @PostConstruct
    public void post() {
        out.println("Application.post");
    }
}
