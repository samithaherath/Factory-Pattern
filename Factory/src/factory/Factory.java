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
public class Factory {

    
       

    static Customer Create(String type) {
         
        if ("regular".equals(type)){
        
            return new Regular();
        }
        else{
        return new Lead();
        }
       
    }

  
    }

   

