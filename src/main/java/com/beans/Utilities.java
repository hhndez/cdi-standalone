package com.beans;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.out;
/**
 * Created by hhernandez on 1/07/16.
 */
public class Utilities implements IUtilities {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    public String getCurrentDate() {
        return sdf.format(new Date());
    }

    @PostConstruct
    public void post() {
        out.println("Utilities.post");
    }
}
