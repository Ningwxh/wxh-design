package com.wxh.factory.simpleFactory;

public class LogFactory {

    public Loggers getType(String type){
        if ("TxtLog".equals(type)) {
            return new TxtLog();
        } else if ("DbLog".equals(type)){
            return new DbLog();
        }
        return null;
    }

}
