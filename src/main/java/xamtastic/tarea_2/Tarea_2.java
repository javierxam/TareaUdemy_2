/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamtastic.tarea_2;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
 
public class Tarea_2 {   
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor::");
        String autor = scanner.nextLine();
        System.out.println ( titulo + " fue escrito por " + autor);    
    }
}
