/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asset;

import java.io.Serializable;
import java.util.ArrayList;
import label.AttachedLabel;
import rule.ApplyRule;

/**
 *
 * @author bagher
 */
public class Asset implements Serializable{
    
    private final ArrayList<AttachedLabel> attachedLabels;
    
    public final static String[] assetProperties = {
                                    "انسان بودن",
                                    "مرکب بودن",
                                    "مکان‌مند بودن",
                                    "فیزیکی بودن",
                                    "بیمه داشتن",
                                    "سند داشتن",
                                    "نام",
                                    "شناسه‌ی یکتا",
                                    "زیردارایی‌ها",
                                    "انسان",
                                    "مکان",
                                    "وضعیت سند",    
                                    "توضیح بیمه",    
                                    "توضیح سند",
                                    "ویژگی‌های فیزیکی",
    };
    
    private boolean isHuman;        //1
    private boolean isComposite;    //2
    private boolean isPlace;        //3
    private boolean isPhysical;     //4
    private boolean hasBime;        //5
    private boolean hasDoc;         //6
    private String name;            //7
    private String UID;             //8
    private ArrayList<Asset> subAssets = new ArrayList<>();    //9
    private Human human;            //10
    private Place place;            //11
    private int docMode;            //12
    private String bimeComment;     //13
    private String docComment;      //14
    private String physicalProperties;//15
    
    private ArrayList<ApplyRule> rules = new ArrayList<>();

    public ArrayList<ApplyRule> getRules() {
        return rules;
    }

    public void setRules(ArrayList<ApplyRule> rules) {
        this.rules = rules;
    }

    public void setDocMode(int docMode) {
        this.docMode = docMode;
    }

    public int getDocMode() {
        return docMode;
    }

    public boolean isHasBime() {
        return hasBime;
    }

    public boolean isHasDoc() {
        return hasDoc;
    }

    public void setHasBime(boolean hasBime) {
        this.hasBime = hasBime;
    }

    public void setHasDoc(boolean hasDoc) {
        this.hasDoc = hasDoc;
    }
    
    public String getBimeComment() {
        return bimeComment;
    }

    public void setBimeComment(String bimeComment) {
        this.bimeComment = bimeComment;
    }

    public void setDocComment(String docComment) {
        this.docComment = docComment;
    }

    public void setPhysicalProperties(String physicalProperties) {
        this.physicalProperties = physicalProperties;
    }

    public String getDocComment() {
        return docComment;
    }

    public String getPhysicalProperties() {
        return physicalProperties;
    }
    
    
    
    public Human getHuman() {
        return human;
    }

    public Place getPlace() {
        return place;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
    

    public Asset() {
        attachedLabels = new ArrayList<>();
    }

    public AttachedLabel[] getAttachedLabels() {
        return attachedLabels.toArray(new AttachedLabel[0]);
    }

    public void attachLable(AttachedLabel attachedLabel) {
        attachedLabels.add(attachedLabel);
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public ArrayList<Asset> getSubAssets() {
        return subAssets;
    }

    public void setSubAssets(ArrayList<Asset> subAssets) {
        this.subAssets = subAssets;
    }

    public boolean isIsHuman() {
        return isHuman;
    }

    public void setIsHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    public boolean isIsComposite() {
        return isComposite;
    }

    public void setIsComposite(boolean isComposite) {
        this.isComposite = isComposite;
    }

    public boolean isIsPlace() {
        return isPlace;
    }

    public void setIsPlace(boolean isPlace) {
        this.isPlace = isPlace;
    }

    public boolean isIsPhysical() {
        return isPhysical;
    }

    public void setIsPhysical(boolean isPhysical) {
        this.isPhysical = isPhysical;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static String getPropertyComment(int i){
        switch (i){
            case 0:{
                return assetProperties[0];
            }
            case 1:{
                return assetProperties[1];
            }
            case 2:{
                return assetProperties[2];
            }
            case 3:{
                return assetProperties[3];
            }
            case 4:{
                return assetProperties[4];
            }
            case 5:{
                return assetProperties[5];
            }
            case 6:{
                return assetProperties[6];
            }
            case 7:{
                return assetProperties[7];
            }
            case 8:{
                return assetProperties[8];
            }
            case 9:{
                return assetProperties[9];
            }
            case 10:{
                return assetProperties[10];
            }
            case 11:{
                return assetProperties[11];
            }
            case 12:{
                return assetProperties[12];
            }
            case 13:{
                return assetProperties[13];
            }
            case 14:{
                return assetProperties[14];
            }
        }
        return "ویژگی نامعلوم";
    }
    
    public void removeApplyRule(ApplyRule apr ){
        this.rules.remove(apr);
    }

    @Override
    public boolean equals(Object obj) {
        return ((Asset)obj).getUID().equals(this.getUID());
    }
    
}
