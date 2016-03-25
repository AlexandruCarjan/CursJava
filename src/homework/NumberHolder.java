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
public class NumberHolder {

    public int anInt;

    public float aFloat;
    
    public static void main(String[] args){
        NumberHolder n;
        n = new NumberHolder();
        n.anInt = 314;
        n.aFloat = 3.14f;
        System.out.println(n.anInt + "----" + n.aFloat);
    }
    

}

