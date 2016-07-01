package com;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.io.IOException;

/**
 * Created by hhernandez on 1/07/16.
 */
public class EntryPoint {

    public static void main(String[] args) throws IOException {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        Application application = container.instance().select(Application.class).get();
//        MyBasicApplication application = container.instance().select(MyBasicApplication.class).get();
        application.run();
        weld.shutdown();
    }
}
