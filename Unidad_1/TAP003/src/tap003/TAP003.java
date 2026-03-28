/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tap003;

/**
 *
 * @author yahir
 */
public class TAP003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int m = 2000;
        int c = 3;
        int Xn = 10;
                
        for(int i = 1 ; i <=5; i++){
            int xn1 = (a * Xn + c) % m;
            double Un = (double) xn1/m;
            
            System.out.println(i + "\t\t" + xn1 + "\t" + Un);
            Xn = xn1;
        }
        
        
          
    }
    
}
