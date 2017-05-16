/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintMagazine;

/**
 *
 * @author Nikita
 */
public class DataBD {
    private String name;
    private String address;
    private String type;
    private String workTime;
    
     public void getName(String a){
        name=a;
    }
     public void getAddress(String a){
        address=a;
    }
     public void getType(String a){
        type=a;
    }
     public void getWorkTime(String a){
        workTime=a;
    }
    public String putName(){
        return name;
    }
     public String putAddress(){
        return address;
    }
      public String putType(){
        return type;
    }
       public String putWorkTime(){
        return workTime;
    }
    
}
