package com.interfaces;

public interface Figure {
    default void print(){
        System.out.println("figura");
    }
    int pokajiFiguru();

}
