/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author user
 */
public class Voting{
 private int type;
 private String question;
 ArrayList<Person> voters = new ArrayList<Person>();
 HashMap<String, HashSet<Vote>> pols = new HashMap<String, HashSet<Vote>>();
 HashSet<Vote> vote = new HashSet<Vote>();
 
 public Voting(int type, String question){
     this.type = type;
     this.question = question;
 }
 
 public String getQuestion(){
     
     return question; 
 }
 
 public void creatPoll(String poll){
       pols.put(poll, vote);
 }
 
 public void vote(Person person, ArrayList<String> pol){
     pols.put(person.toString(), vote);
     
 }
 
 public ArrayList<Person> getvoters(){
     return voters;
 }
 
 public void printvoters(){
     
     for(int i=0 ; i<= voters.size() ; i++){
         System.out.println(voters.get(i).toString());
     }
 }
 
 public HashMap<String, HashSet<Vote>> getpolls(){
     return pols;
     
 }
}
