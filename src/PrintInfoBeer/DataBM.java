/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintInfoBeer;

/**
 *
 * @author Nikita
 */
public class DataBM {
    private String id;
    private String name;
    private String fortress;
    private String color;
    private String vessel;
    private String specification;
    private String address;
    private String price;
    
    public void getId(String a){
        id=a;
    }
    public void getName(String a){
        name=a;
    }
    public void getFortress(String a){
        fortress=a;
    }
    public void getColor(String a){
        color=a;
    }
    public void getVessel(String a){
        vessel=a;
    }
    public void getSpecification(String a){
        specification=a;
    }
   
    public void getAddress(String a){
        address=a;
    }
    public void getPrice(String a){
        price=a;
    }
    
    
    public String putId(){
        return id;
    }
    public String putName(){
        return name;
    }
    public String putFortress(){
        return fortress;
    }
    public String putColor(){
        return color;
    }
    public String putVessel(){
        return vessel;
    }
    public String putSpecification(){
        return specification;
    }
    public String putAddress(){
        return address;
    }
    public String putPrice(){
        return price;
    }
    
    
}
