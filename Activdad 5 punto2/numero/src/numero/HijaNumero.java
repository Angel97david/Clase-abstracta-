/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

/**
 *
 * @author DELL
 */
public abstract class HijaNumero extends Numero{
    
    @Override  
       public void  suma(int a,int n){
        int c = a + n;
       }
       public void resta (int a,int n){
         int c = a - n;
       }
       public void multiplicaPor (int a,int n){
           int c = a *n ;
       }
       public void dividePor (int a,int n){
           int c = a / n;
       }
}
