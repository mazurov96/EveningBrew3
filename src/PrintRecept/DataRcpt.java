/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintRecept;

/**
 *
 * @author Nikita
 */
public class DataRcpt {
    private String name;
    private String recept;
    private String author;
    private String ingr;
    private String time;
    
    public void getName(String a){
        name=a;
    }
    public void getRecept(String a){
        recept=a;
    }
    public void getAuthor(String a){
        author=a;
    }
    public void getIngr(String a){
         ingr=a;
    }
    public void getTime(String a){
         time=a;
    }
    
    public String putName(){
        return name;
    }
    public String putRecept(){
        return recept;
    }
     public String putAuthor(){
        return author;
    }
     public String putIngr(){
        return ingr;
    }
      public String putTime(){
        return time;
    }
    
}
