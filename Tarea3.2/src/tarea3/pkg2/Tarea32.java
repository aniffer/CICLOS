/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea3.pkg2;
import javax.swing.JOptionPane;
/**
 *
 * @author Anifer
 */
public class Tarea32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String val1=null;   
        String val2=null;   
        int can_notas=0;
        int nota=0;
        int mayor=0;
        int menor=100;
        int conta=0;
        int promedio=0;
        int suma=0;
        
        
        val2=JOptionPane.showInputDialog("Digite la cantidad de notas");
        can_notas=Integer.parseInt(val2);
        for (int i=1; i<=can_notas; i++){
            val1=JOptionPane.showInputDialog("Digite la nota obtenida");
            nota=Integer.parseInt(val1);
            suma = suma + i;
            promedio=promedio+suma/can_notas;
            
           
            
            if(nota>mayor){
                mayor=nota;
            }  
            
            if(nota < menor){
            menor = nota;
            }   
            
            if(nota >= 70){
            conta = conta +1;
            }   
        
        } 
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
        System.out.println("Cantidad de estudiantes aprobados: "+conta);
        System.out.println("El promedio es: "+promedio);
    }
    
}
