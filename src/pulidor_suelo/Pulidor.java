package pulidor_suelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;

public class Pulidor extends JFrame{
    Baldosa suelo_[][];
    public Pulidor(int filas, int columnas){
        super("Prueba2");
        suelo_= new Baldosa[filas][columnas];
        boolean obstaculos[][] = new boolean [filas][columnas];
        Random rnd = new Random();
        for (int ale=0; ale<5; ale++){
            int a=((int)(rnd.nextDouble()*10.0)) % filas;
            int b=((int)(rnd.nextDouble()*10.0)) % columnas;
            System.out.println(a+", "+b);
            if (obstaculos[a][b]){
                ale--;
            }
            obstaculos[a][b] = true;
        }
        
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                if (obstaculos[i][j] == false){
                    suelo_[i][j] = new Baldosa (false, i, j);
                    this.getContentPane().add(new Baldosa(false, i, j));
                    System.out.print(i+""+j+" ");
                }
                else {
                    suelo_[i][j] = new Baldosa (true, i, j);
                    this.getContentPane().add(new Baldosa(true, i, j));
                    System.out.print(i+""+j+" ");
                }
            }
            System.out.println();
        }    
        
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(filas,columnas,0,0));
        this.setVisible(true);
        
    }
    public static void main(String[] args){
        System.out.print("filas:");
        Scanner pop = new Scanner(System.in);
        int filas = pop.nextInt();
        System.out.print("columnas:");
        Scanner popo = new Scanner(System.in);
        int columnas = popo.nextInt();
        
        Pulidor pb = new Pulidor(filas,columnas);
    }
}