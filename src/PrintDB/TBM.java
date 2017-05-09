/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintDB;

/**
 *
 * @author Nikita
 */
public class TBM {
    public String id;
    public String  Name;
    public String  Fortress;
    public String Color;
    public String Vessel;
    public String Address;
    public String Price;
    
    public void getId(String a){
        id=a;
    }
    public void getName(String a){
        Name=a;
    }
    public void getFortress(String a){
        Fortress=a;
    }
    public void getColor(String a){
        Color=a;
    }
    public void getVessel(String a){
        Vessel=a;
    }
    public void getAddress(String a){
        Address=a;
    }
    public void getPrice(String a){
        Price=a;
    }
    public String putId(){
        return id;
    }
    public String putName(){
        return Name;
    }
    public String putFortress(){
        return Fortress;
    }
    public String putColor(){
        return Color;
    }
    public String putVessel(){
        return Vessel;
    }
    public String putAddress(){
        return Address;
    }
    public String putPrice(){
        return Price;
    }
    
    
}
