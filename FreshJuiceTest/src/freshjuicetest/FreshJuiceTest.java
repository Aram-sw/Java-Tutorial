/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freshjuicetest;

import freshjuicetest.FreshJuice.TotalPrice;

/**
 *
 * @author Alaa-sw 26.02.2018
 * 22:43 Uhr
 */


class FreshJuice {
    
   enum FreshJuiceSize { XS,SMALL, MEDIUM, LARGE, XL, XXL, XXXL }
   FreshJuiceSize size;
   
   enum FreshJuiceColor {RED, ORANGE, BLUE}
   FreshJuiceColor color;
   
   enum FreshJuicePrice {$,SP}
   FreshJuicePrice price;
   
   enum TotalPrice {
   p0(5),
   p1(10),
   p2(20),
   p3(30);
   
        private final Integer totalprice;
        
        TotalPrice(Integer totalprice){
            
        this.totalprice=totalprice;
        
        }
        
        public Integer totalprice()
        {
          return totalprice;
        }
   
   }
}

public class FreshJuiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        // TODO code application logic here
        FreshJuice juice = new FreshJuice();
        juice.size= FreshJuice.FreshJuiceSize.XXL;
        System.out.println("Size :" + juice.size);
 
        // Juice Color
        juice.color = FreshJuice.FreshJuiceColor.BLUE;
        System.out.println("Color : " + juice.color);
        
        // Total Price and currency Type
        juice.price = FreshJuice.FreshJuicePrice.$;
        System.out.println("Price : " + TotalPrice.p0.totalprice()+ "" +juice.price);
    }
}
