/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class Person {
    public String name;
    public String dob;
    public String pob;
    public char gender;
    public String email;
    public String phone;
    
    public Person(){};
    
    public Person(String name,String dob, String pob ,char gender, String email, String phone ){
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }
    public void setname(String name){
        this.name = name;
   }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getPob() {
        return pob;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Person[ten : "+name+",nsinh : "+dob+", namsinh: "+pob+",sex: "+gender+", email: "+email+", phone: "+phone+"]";
    }
}
