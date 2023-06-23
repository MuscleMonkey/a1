/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author onad
 */

public class Class1 {
    Class1(){
        System.out.println("Class1 is being used");
    }
    void triangle(int space){
        int i,j,k;
        int m = space;
        for(i = space; i > 0; i--){
            for ( k = m ; k < space; k++ ){
                System.out.print(" ");
            }   
            for(j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
            m--;
            
        }
    }
    public static void main(String[] args){
        //star
        Class1 dot = new Class1();
        dot.triangle(20);
    }
}//main_class End
