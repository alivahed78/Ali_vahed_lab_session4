/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author user
 */
public class Vote {
    
    private Person person;
    private String date;
    
    public Vote(Person person, String date){
        this.person = person;
        this.date = date;
    }
    
    public Person getPerson(){
        return person;
        
    }
    
    public String getDate(){
        return date;
        
    }
    
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
          return false;  
        }
        Vote vote = (Vote) obj;

  return person == Vote.this.person && (date.equals(Vote.this.date));
        
        
    }
    
    public int hashCode(){
        return 1;
        
    }
}

