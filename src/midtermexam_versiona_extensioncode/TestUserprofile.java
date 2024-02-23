/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author Laundry
 */
public class TestUserprofile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("To make a new user, please enter the desired username:");
        String userName = scan.nextLine();
        System.out.println("Now please enter your favorite actor:");
        String userActor = scan.nextLine();
        UserProfile newUser = new UserProfile(userName,userActor);
    }
    
}
