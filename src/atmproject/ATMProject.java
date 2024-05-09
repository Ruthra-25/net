/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmproject;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author itsupport
 */
public class ATMProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
             Class.forName("org.postgresql.Driver");
                Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_db", "postgres", "redleaf");
                Statement stm=con.createStatement();
                
            Scanner sc =new Scanner(System.in);
            System.out.println("HEY WELCOME TO ALL IN ONE ATM");
            System.out.println("ENTER YOUR PIN NUMBER");
            int pin=sc.nextInt();
             java.sql.ResultSet rs=stm.executeQuery("SELECT*FROM atm where acc_no=" +pin);
             String name=null;
             int count=0;
            int balance = 0;    
            while(rs.next()){
                name=rs.getString(3);
                balance=rs.getInt(4);
                count++;
            }
            int choice;
            int amount=0;
            int take_amount=0;          
           
            if(count>0){
                System.out.println("hello"+name);
                while(true){
                    System.out.println("PRESS 1 TO CHECK BALANCE");
                    System.out.println("PRESS 2 TO ADD AMOUNT");
                    System.out.println("PRESS 3 TO TAKE AMOUNT");
                    System.out.println("PRESS 4 TO PRINT THE RECEIPT");
                    System.out.println("PRESS 5 TO EXIT/QUIT");
                    System.out.println("ENTER YOUR CHOICE");
                    choice=sc.nextInt();
                   switch(choice){
                       case 1:
                              System.out.println("your balance is:" +balance);
                       break;
                       case 2: 
                           System.out.println("How much mount did you want to add");
                           amount=sc.nextInt();
                           balance = balance+amount;
                           int bal=stm.executeUpdate("update atm set balance=" +balance+"where acc_no="+pin);
                           System.out.println("successfully added now your current balanace is " +balance);
                       break;
                       
                       case 3:
                            System.out.println("How much mount did you want to take");
                           take_amount=sc.nextInt();
                           if(take_amount>balance){
                               System.out.println("Your balance is insufficient");
                           }
                           else{
                           balance=balance-take_amount;
                           int sub=stm.executeUpdate("update atm set balance=" +balance+"where acc_no="+pin);
                           System.out.println("successfully added now your current balanace is " +balance);
                           }
                       break;
                       
                       case 4:
                           System.out.println("THANKS FOR COMING");
                           System.out.println("your current balance is:" +balance);
                           System.out.println("Amount added" +amount);
                           System.out.println("amount taken" +take_amount);
 
                   }
                   if(choice==5){
                       break;
                   }
 
                }
            }
            else{
                System.out.println("WRONG PIN NUMBER");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    private static class ResultSet {

        public ResultSet() {
        }
    }
    
}
