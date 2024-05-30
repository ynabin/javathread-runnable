/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Nabin Yaduvanshi
 */
public class JavaApplication7 implements Runnable {
    
    
    
    public void run()
    {
        System.out.print("dddd");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Runnable rl = new JavaApplication7();
        Thread thl = new Thread(rl, "My new thread");
        thl.start();
        // TODO code application logic here
    }
    
}
