/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author User
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int idade = 30;
        *String valor = Integer.toString(idade);
        *System.out.println(valor);*/
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.3f",idade);
         /*String p1 = "Curso";
         String p2 = "Video";
         String p3 = p1 + p2;
         String p4 = "CursoVideo";
         System.out.println(p3 == p4);
         System.out.println(p3.equals(p4));*/
    }
    
}
