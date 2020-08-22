package com.lengleng.util;

public class ServiceFactory {
    private ServiceFactory(){}
    public static Object getProxy(Object service){
        return new TransactionInvocationHandler(service).getProxy();
    }
}
