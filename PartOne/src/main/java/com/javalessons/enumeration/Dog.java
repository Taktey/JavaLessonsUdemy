package com.javalessons.enumeration;

public class Dog {
    private Size size = Size.UNDEFINED;

    public void bark(){
        switch (size){
            case BIG: case AVERAGE:
                System.out.println("Wof-Wof");
                break;
            case SMALL:
                System.out.println("Tiaf-Tiaf");
                break;
            default:
                System.out.println("Dog's size is undefined");
        }
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
