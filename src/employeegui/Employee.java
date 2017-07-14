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
public class Employee {
    
    
    private String id,name,dob;
    Employee(String eid,String ename,String edob ){
        id=eid;
        name =ename;
        dob=edob;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;

    }
    public String getDob(){
        return dob;
    }
}
