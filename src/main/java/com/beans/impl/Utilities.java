package com.beans.impl;

import com.beans.IUtilities;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Alternative;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.out;
/**
 * Created by hhernandez on 1/07/16.
 */

@Alternative
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
