/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author felixsima
 */
import java.awt.Rectangle;


public class SomethingIsWrong {
    
    public static int area(Rectangle r){
        
        return r.width * r.height;
        
    }


    public static void main(String[] args){

        Rectangle myRect;
        
        myRect = new Rectangle();
        
        myRect.width = 40;

        myRect.height = 50;
        
        System.out.println("myRect's area is " + area(myRect));

    }
    

}