/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author samit
 */
public class Lead extends Customer{

    

    @Override
    public String Validate() {
        
        String messege = "Validated";
        
        if(name.length() == 0){
         messege ="Name is required!";
         return messege;
        }
        
        else if(phone.length() == 0){
        messege ="Phone number is required!";
        return messege;
        }
     return messege;
    }
    
}
