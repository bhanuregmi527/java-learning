package oop.interfaces;

public class Car implements  Engine,Brake,Media {

    @Override
    public void start() {
        System.out.println("startimg ....");
    }

    @Override
    public void stop() {
        System.out.println("stoping ....");

    }

    @Override
    public void acc() {
        System.out.println("accelerating ....");

    }
}
