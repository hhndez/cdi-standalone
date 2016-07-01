package com.beans.impl;

import com.beans.IHelpers;
import com.qualifiers.PerformancePassed;

/**
 * Created by hhernandez on 1/07/16.
 */
@PerformancePassed
public class SuperHelperImpl implements IHelpers {
    @Override
    public int add(int a, int b) {
        return 1;
    }
}
