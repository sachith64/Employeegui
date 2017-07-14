/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeegui;

/**
 *
 * @author sachith
 */
public class Services {
    
    //Employee[] earray = new Employee[10];
        Database d = new Database();    
    Services()
    {
        new Database();
    }
            
    
    public String registration(Employee e)
    {
        String message=d.registration(e);
        
        return message;
    }
    public String search(String id)
    {

        String msg = d.search(id);
        return msg;
        
    }
    public int totalEmployees()
    {
      int t = d.totalEmployees();
        return t; 
    }
    public Employee[] listofEmployees()
    {
       Employee[] msg = d.listofEmployees();
       return msg;
    }
    public int arraySize()
    {
        return d.arraySize();
    }
}
