/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enumproject1;

/**
 *
 * @author ROTONDWA
 */

public class EnumProject1{
    
    public enum carDealership{
        car1("Mercedes-Benz" , 'R' , 850000),
        car2("Lamborghini" , 'R' , 4500000),
        car3("McLaren" , 'R' , 3200000);
        
        public String car;
        public char currency;
        public double price;
        carDealership(String car , char currency , double price){
            this.car = car;
            this.currency = currency;
            this.price = price;
        }
    }
    
    public static void main(String[] args){
        carDealership[] car = {
         carDealership.car1,
         carDealership.car2,
         carDealership.car3
        };
         for(int i = 0 ; i < car.length ; i++){ 
            System.out.println("CAR_NAME: " + car[i].car  + "  " + "CAR_PRICE: " + car[i].currency + car[i].price);
    }        }

}