/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

/**
 *
 * @author Pablo
 */
public class Matriz {
    int matriz[][] = new int[4][];
    
    public void armar(){
        
        int i=3;
        matriz[0] = new int[4];
        matriz[1] = new int[3];
        matriz[2] = new int[5];
        matriz[3] = new int[2];
        
        for(int f=0;f<matriz.length;f++){
        
            for(int c=0;c<matriz[f].length;c++){
                matriz[f][c]=i;
                i = i+3;
            }
        }
        
        for(int f=0;f<matriz.length;f++){
            
            System.out.print("Fila" + (f+1) + "-> ");
            for(int c=0;c<matriz[f].length;c++){
                
                if (matriz[f][c]%2==0){
                    System.out.print(matriz[f][c] + " ");
                }
            
            }
            System.out.println("");
            
        }
    }
    
    
}
