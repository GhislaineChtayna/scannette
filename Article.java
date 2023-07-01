/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanette.classesMetier;

/**
 *
 * @author Moi
 */
public class Article {
    
    
    
    private int numero;
    private String designation;
    private float prixVente;
    
    private Article()
    {
        numero = 0;
        designation = "";
        prixVente = 0f;
    }
    
    public Article(int numero, String designation,float prixVente)
    {
        this.numero = numero;
        this.designation = designation;
        this.prixVente = prixVente;
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public void setNumero(int value)
    {
        numero = value;
    }
    
    public String getDesignation()
    {
        return designation;
    }
    
    public void setDesignation(String value)
    {
        designation = value;
    }
    
    public float getPrixVente()
    {
        return prixVente;
    }
    
    public void setPrixVente(float value)
    {
        prixVente = value;
    }
    
    public boolean equals(Article other)
    {
        if (other.numero == this.numero &&
            other.designation.equals(this.designation) && 
            other.prixVente == this.prixVente)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String getCaracteristics()
    {
        return "numero : " + numero + ",designation : " + designation + ",prix de vente : " + prixVente; 
    }

    @Override
    public String toString() {
        return "Article{" + "numero=" + numero + ", designation=" + designation + ", prixVente=" + prixVente + '}';
    }
    
    
}
