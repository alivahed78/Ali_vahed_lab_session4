/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class VotingSystem {
   ArrayList<Voting> votingList; 
   Voting v = null;
    public VotingSystem() {
        this.votingList = new ArrayList<Voting>();
    }
    
    public void creatVoting(String question , int type){
        Voting.class.getFields();
       
        votingList.add(v);
        
    }
    
    public void getVotinglist(){
        for(int i=0 ; i <= votingList.size() ; i++){
        votingList.get(i);
        }
    }
    
    public void getVoting(){
        this.votingList = votingList;
    }
    
    public void vote(int type,Person person, ArrayList<String> choice ){
        votingList.add(type, v);
        v.vote(person, choice);
        v.voters.add(person);
        votingList.add(v);
    }
    
    public void getresult(int res){
        this.getresult(res);
    }
    
    
}

