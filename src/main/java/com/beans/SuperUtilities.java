package com.beans;

import javax.enterprise.inject.Alternative;

/**
 * Created by hhernandez on 1/07/16.
 */
@Alternative
public class SuperUtilities implements IUtilities{

    @Override
    public String getCurrentDate() {
        return new Long(System.currentTimeMillis()).toString();
    }
}
