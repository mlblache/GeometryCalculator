/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrytutor;
import java.util.Scanner;
/**
 *
 * @author S-Mercedes.Blache
 */
public class GeometryTutor {
    /**
     * @param args the command line arguments
     */
    /**
     * Using this method to validate user input throughout entire code. 
     * @param prompt what the user is being prompted to enter.
     * @return if the input what correct or false. 
     * @throws IllegalArgumentException 
     */
    public static int validateInt(String prompt)throws IllegalArgumentException {
        boolean go = true;
        int n = 0;
        while(go){
        System.out.print(prompt);
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();
        try{
        n = Integer.parseInt(str);
        if(n>0)go = false; //making sure numbers are positive.
            else {
            throw new IllegalArgumentException();
                }
        }
        catch(IllegalArgumentException e){
            System.out.print("ERROR: Not an integer "+ e.getMessage()+"\n");
        }
            }
        return n;
    }
    
    public static void main(String[] args) {           

       int choice = validateInt("Geometry Calculator: \n 1.Calculate the Area of a Circle\n "
                + "2. Calculate the Area of a Rectangle\n "
                + "3. Calculate the Area of a Triangle\n "
                + "4. Quit \n"
                + "Enter your choice(1-4): ");
        
        switch (choice){
            case 1:
                int r = 0;
                
                r = validateInt("Please enter the radius: ");

                double area = Math.PI*(Math.pow(r,2));
                System.out.print("the area is: " +area+ "");
                break;
            case 2:
                int l = 0;
                int w = 0;
                l = validateInt("Please enter the length: ");
                w = validateInt("Please enter the width: ");

                int a = l*w;
                System.out.print("The area is: "+a+ "");
                break;
            case 3:
                int b = 0;
                int h = 0;
                b = validateInt("Please enter the length of the triangles base: ");
                h = validateInt("Please enter the height: ");
                
                a = (b*h)/2;
                System.out.println("The area is: " +a+ "");
                break;
            case 4:
                System.out.println("You Quit: ");
                break;
            default:
                System.out.println("Thats not any of the numbers:");
                
        }
        
        
        
        
                
        
        
    }
    
}
