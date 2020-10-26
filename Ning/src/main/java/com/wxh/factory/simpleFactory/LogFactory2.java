package com.wxh.factory.simpleFactory;

public class LogFactory2 {
    public Object getType(Class<? extends Loggers> clazz){
        Object loggers = null;
        try {
            loggers = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return loggers;
    }
}
