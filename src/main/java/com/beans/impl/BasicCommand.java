package com.beans.impl;

import com.beans.ICommand;

import javax.inject.Named;

import static java.lang.System.out;
/**
 * Created by hhernandez on 1/07/16.
 */

@Named("basicCommand")
public class BasicCommand implements ICommand {
    @Override
    public void execute() {
        out.println("basic command");
    }
}
