/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

/**
 *
 * @author Magnon
 */
public class Aluno {
    //---------------------Atributes--------------------
    private String name;
    private int rate;
    private String contact;
    
    //--------------------Constructor------------------

    public Aluno(String name, int rate, String contact) {
        this.name = name;
        this.rate = rate;
        this.contact = contact;
    }
    //-------------------Methods-----------------------
        //------------Gets and Sets--------------

    //-----------Name------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //----------Rate-----------
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    //----------Contact-----------
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
        //-----------------------------------
    
}
