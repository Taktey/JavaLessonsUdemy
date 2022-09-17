package com.javalessons.oop.interfaces;

public interface Priceable extends Deliverable, Orderable{
    default int calcPrice(){
        return calcOrderPrice()+calcDeliveryPrice();
    }
    static void doSmth(){

    }
}
