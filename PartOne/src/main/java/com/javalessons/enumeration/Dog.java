package com.javalessons.enumeration;

public class Dog {
    private Size size;

    public void bark(){
        switch (size){
            case BIG: case AVERAGE:
                System.out.println("Wof-Wof");
                break;
            case SMALL:
                System.out.println("Tiaf-Tiaf");
                break;
        }
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
