package com.leo.recyclerview;

public class Donnee {
    private String principal;
    private String auxiliaire;
    private int image;

    Donnee(String text1, String text2, int image){
        principal = text1;
        auxiliaire = text2;
        this.image = image;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getAuxiliaire() {
        return auxiliaire;
    }

    public int getImage() { return image; }


}
