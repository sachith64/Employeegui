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
public class Database {
   
        
    
    static Employee[] earray = new Employee[10];
    
    static int j=0,c=0;
    public String registration(Employee e)
    {
        //String msg=e.getId()+""+e.getName()+""+e.getDob()+"-------Register Succesfully!";
        earray[j] = new Employee(e.getId(),e.getName(),e.getDob());
        String msg=e.getId()+""+e.getName()+""+e.getDob()+"-------Register Succesfully!";
        //String msg = e.getId();
        j++;c++;
        

        return msg;
    }
    public String search(String id)
    {
        
        String msg="";
        oop:for(int i=0;i<c;i++)
             {
                 if(id.equals(earray[i].getId()))
                 {
                    
                    msg=earray[i].getId()+earray[i].getName()+earray[i].getDob();
                    break oop;
                 }
                 else 
                 {
                     msg="id not found";
                     
                 }
             }
        return msg;
    }
    public int totalEmployees()
    {
        return c;
    }
    public Employee[] listofEmployees()
    {
        
        return earray;
    }
    public int arraySize()
    {
        return c;
    }
}
