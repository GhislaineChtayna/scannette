/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanette.classesMetier;

/**
 *
 * @author Moi
 */
public class TestScannette {
    public static void ListerLesClients(Magasin magasin) 
    {
        System.out.println("Liste des clients du magasin : " +magasin.toString());
        for (Client client : magasin.getLesClients() )
        {
            System.out.println(client.toString());
        }
        System.out.println("");
    }
    
    public static void ListerLesArticles(Magasin magasin)
    {
        System.out.println("Liste des articles du magasin : " +magasin.toString());
        for (Article article : magasin.getLesArticles() )
        {
            System.out.println(article.toString());
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Magasin magasin = new Magasin("Carrefour");
        
        Client client1 = new Client("Macron", "Brigitte" ,"root");
        Client client2 = new Client("Prince", "Prince" ,"blue");
        
        magasin.AddClient(client1);
        magasin.AddClient(client2);
        
        Article article1 = new Article(10, "Costume", 15f) ;
        Article article2 = new Article(11, "Guitare", 27f);
        magasin.AddArticle(article1);
        magasin.AddArticle(article2);
        
        ListerLesClients(magasin);
        ListerLesArticles(magasin);
        
        magasin.RemoveArticle(article1);
        magasin.RemoveClient(client2);
        
        ListerLesClients(magasin);
        ListerLesArticles(magasin);
    }
}
