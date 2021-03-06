package com;

import com.beans.ICommand;
import com.beans.IHelpers;
import com.beans.IUtilities;
import com.qualifiers.PerformancePassed;
import com.qualifiers.PoorPerformance;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;

import static java.lang.System.out;
/**
 * Created by hhernandez on 1/07/16.
 */
@Singleton
public class Application {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(Application.class);

    //Usando alternatives
    @Inject
    private IUtilities myUtilities;

    //Usando qualifiers
    @Inject @PerformancePassed
    private IHelpers helper;

    @Inject @PoorPerformance
    private IHelpers anotherHelper;

    @Inject @PoorPerformance
    private IHelpers poorHelper;

    //Usando named
    @Inject @Named("basicCommand")
    private ICommand command1;

    @Inject @Named("requestCommand")
    private ICommand command2 ;

    @Inject
    //@PersistenceContext(unitName = "myName")
    private EntityManager em;

    public void run() {
        out.println("application initialized");
        out.println(myUtilities.getCurrentDate());

        out.println("Test helper (Performance Accepted):");
        out.println(helper.add(1,2));

        out.println("Test helper (Poor Performance):");
        out.println(poorHelper.add(1,2));

        out.println("Commands 1:");
        command1.execute();

        out.println("Commands 2:");
        command2.execute();

        out.println("EM: " + em.isOpen());

    }

    @PostConstruct
    public void post() {
        out.println("Application.post");
    }
}
