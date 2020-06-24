/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 *  If salary is less than or equal to 3000,calculate a new salary with bonus.
 @author srinivsi
 */
public class Payroll 
{

   public double salary;
   public double bonus = 0.10;
   public String emp;
 
     /**constructor that takes the salary and employee name
      * 
      */
   public Payroll(double sal,String givenUser)
        {
            salary=calcSalary(sal);
            emp=givenUser;           
        }
     
   public double calcSalary(double sal){
      
       double finalSalary;
       if (sal <= 3000){
         finalSalary = sal + (sal*bonus);
       }
       else 
           finalSalary = sal;
 
     return finalSalary;   
    }
}
