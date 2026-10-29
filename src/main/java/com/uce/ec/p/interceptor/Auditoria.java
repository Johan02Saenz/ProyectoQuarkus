package com.uce.ec.p.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

@InterceptorBinding //Comportamiento de Interceptor
//Lombok se ejcuta en compilacion
@Retention(RetentionPolicy.RUNTIME)  // Cuando se ejecutara
@Target({ElementType.TYPE, ElementType.METHOD})//Sobre que elementos se aplicara type-> clase method-> metodo
public @interface Auditoria {

    

}
