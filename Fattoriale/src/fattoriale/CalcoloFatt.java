/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fattoriale;

/**
 *
 * @author Studente
 */
public class CalcoloFatt extends Thread{
    public int fat = 1;
    public int n;
    public CalcoloFatt(int n){
        this.n = n;
    }
    public void run(){
        int i = n;
        while(i>0){
            this.fat *= i;
            i--;
        }
        System.out.println(n+"!="+fat);
    } 
}
