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
public class Magasin {
    private String Nom;
    
    private ArrayList<Client> lesClients = new ArrayList<Client>();
    private ArrayList<Article> lesArticles = new ArrayList<Article>();

    public Magasin(String Nom) {
        this.Nom = Nom;
        
        LoadArticles();
        LoadClients();
    }
    
    /**
     * @return the Nom
     */
    public String getNom() {
        return Nom;
    }

    /**
     * @param Nom the Nom to set
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public ArrayList<Client> getLesClients() {
        return lesClients;
    }

    public ArrayList<Article> getLesArticles() {
        return lesArticles;
    }

    public void AddClient(Client newClient)
    {
        lesClients.add(newClient);
    }
    
    public void RemoveClient(Client client)
    {
        lesClients.remove(client);
    }
    
    public void LoadClients()
    {
        AddClient(new Client("Lenovo","Etienne", "toto"));
        AddClient(new Client("Barclay","Eddy", "roiuzer"));
        AddClient(new Client("Fillon","Guy", "toto"));
    }
    
    
    public void LoadArticles()
    {
        AddArticle(new Article(1, "CocaCola" ,1.5f));
        AddArticle(new Article(2, "Chocolatine" ,1.2f));
        AddArticle(new Article(3, "Croissanr" ,0.8f));
        AddArticle(new Article(4, "Sandwitch au thon" ,3.2f));
        AddArticle(new Article(5, "Chips" ,1.7f));
    }
    
    public void AddArticle(Article newArticle)
    {
        lesArticles.add(newArticle);
    }
    
    public void RemoveArticle(Article article)
    {
        lesArticles.remove(article);
    }

    public Article RechercherArticle(int numeroArticle)
    {
        Article result = null;
        
        for (Article article : lesArticles)
        {
            if (article.getNumero() == numeroArticle)
            {
                result = article;
                break;
            }
        }
        
        return result;
    }
    
    @Override
    public String toString() {
        return "Magasin{" + "Nom=" + Nom + ", lesClients=" + lesClients + ", lesArticles=" + lesArticles + '}';
    }
    
    
}
