/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asset;

/**
 *
 * @author bagher
 */
public class Human {
    String name;
    String familyName;
    int nationalCode;
    int personalCode;
    String comments;
    
    public void setName(String name) {
        this.name = name;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public String getComments() {
        return comments;
    }
    
}
