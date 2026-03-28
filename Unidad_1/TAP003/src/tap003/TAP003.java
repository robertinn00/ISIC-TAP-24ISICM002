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

    public static void MetodoCL(int a, int m, int c, int Xn){
        for(int i = 1 ; i <=5; i++){
            int xn1 = (a * Xn + c) % m;
            double Un = (double) xn1/(m-1);
            
            System.out.println(i + "\t\t" + xn1 + "\t" + Un);
            Xn = xn1;
        }
    }
    
    
    public static void main(String[] args) {
        /*int a = 13;
        int m = 64;
        int c = 9;
        int Xn = 11;*/
                
        MetodoCL(13, 64, 9, 11);
        System.out.println(" ");
        MetodoCL(7, 31, 4, 5);
        
        
          
    }
    
}
