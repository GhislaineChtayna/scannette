/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanette.classesMetier;

import java.util.ArrayList;

/**
 *
 * @author Moi
 */
public class Scannette {
    private Client leClient;
    private ArrayList<Article> lePanier = new ArrayList<Article> ();
    
    public Scannette() {
    }

    /**
     * @return the leClient
     */
    public Client getLeClient() {
        return leClient;
    }

    /**
     * @param leClient the leClient to set
     */
    public void setLeClient(Client leClient) {
        this.leClient = leClient;
    }

    /**
     * @return the lePanier
     */
    public ArrayList<Article> getLePanier() {
        return lePanier;
    }

    /**
     * @param lePanier the lePanier to set
     */
    public void setLePanier(ArrayList<Article> lePanier) {
        this.lePanier = lePanier;
    }
    
    public void AddPanier(Article article)
    {
        this.lePanier.add(article);
    }
    
    public void RemovePanier(Article article)
    {
        this.lePanier.remove(article);
    }
    
    public void RemovePanier(int numeroArticle)
    {
        Article articleToRemove = null;
        for (Article article : lePanier)
        {
            if (article.getNumero() == numeroArticle)
            {
                articleToRemove = article;
            }
        }
        
        if (articleToRemove != null)
            lePanier.remove(articleToRemove);
    }
    
    public float calculerMontantTotal()
    {
        float result = 0f;
        
        for (Article article : lePanier)
        {
            result += article.getPrixVente();
        }
        
        return result;
    }
    
    public int getNbArticles()
    {
        int result = lePanier.size();
        return result;
    }
}
