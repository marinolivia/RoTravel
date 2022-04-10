package com.ro.travel.RoTravel.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("destinatii_calatorie")
public class Destinatie {
    private String Localitate;
    private int ProprietatiDisponibile;
    private String image;

    public Destinatie(){}

    public Destinatie( String Localitate,int ProprietatiDisponibile, String image)
    {
        this.Localitate = Localitate;
        this.image = image;
        this.ProprietatiDisponibile =ProprietatiDisponibile;
    }
    public String getLocatie()
    {
        return this.Localitate;
    }
    public String getImage()
    {
        return this.image;
    }
    public int getProprietatiDisponibile()
    {
        return this.ProprietatiDisponibile;
    }

    public void setLocatie(String Localitate)
    {
        this.Localitate = Localitate;
    }
    public void setImage(String image)
    {
        this.image = image;
    }
    public void setProprietatiDisponibile(int ProprietatiDisponibile)
    {
        this.ProprietatiDisponibile =ProprietatiDisponibile;
    }
    @Override
    public String toString()
    {
        System.out.println("DEBUG TO STRING");
        return String.format("Destinatie[locatie=%s, proprietatiDisponibile=%s, imagine=%s]",Localitate, ProprietatiDisponibile, image);
    }
}
