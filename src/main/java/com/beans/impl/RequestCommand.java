package com.beans.impl;

import com.beans.ICommand;

import javax.inject.Named;

import static java.lang.System.out;
/**
 * Created by hhernandez on 1/07/16.
 */

@Named("requestCommand")
public class RequestCommand implements ICommand
{
    @Override
    public void execute() {
        out.println("requestcommand");
    }
}
