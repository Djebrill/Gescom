package metier;

import dao.BdD;
import java.util.*;

public class Commande {

    /* propriétés privées */
    private int idCommande;
    private Date dateCommande;
    private List<Ligne> lesLignes;

    
    /* getters et setters */
    public int getIdCommande(){
        return idCommande;
    }

    public void setIdCommande(int idCommande){
        this.idCommande = idCommande;
    }

    public Date getDateCommande(){
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande){
        this.dateCommande = dateCommande;
    }

    public List<Ligne> getLesLignes(){
        return lesLignes;
    }

    public void setLesLignes(List<Ligne> ligneCommande){

        this.lesLignes = ligneCommande;
    }


    public Commande (int idCommande, Date dateCommande){
        /* Affectations */
        setIdCommande(idCommande);
        setDateCommande(dateCommande);


    }
    
    /**
     * Ajoute une ligne à une commande.
     * Si la liste des lignes n'est pas instanciée,
     * l'instancier
     * Si l'article n'est pas dans la liste des
     * lignes, créer la ligne et l'ajouter à la liste
     * @param unArticle
     * @param qteCde 
     */
    public void ajouterLigne(Article unArticle, int qteCde) {
        if (getLesLignes() == null) {
            setLesLignes(new ArrayList<Ligne>());
        }
        Ligne uneLigne = new Ligne(unArticle, qteCde);
        this.lesLignes.add(uneLigne);
    }

    /**
     * Supprime la ligne passée en paramètre
     * @param ligneASupprimer Ligne à supprimer
     */
    public void supprimerLigne(Ligne ligneASupprimer) {
        /* A compléter */
    }
    
    /**
     * Recherche la ligne contenant l'article ayant
     * l'id passé en paramètre. 
     * Utiliser la méthode equals() pour comparer deux objets.
     * @param idArticle identifiant de l'article à chercher
     * @param bdd objet Base de Données contenant la liste des articles
     */    
    public Ligne chercherLigne(int idArticle, BdD bdd) {
        /* A compléter */
        return /* A compléter */
    }

    /**
     * Calcule le montant total HT de la commande 
     * à partir du prix des articles présents dans
     * les lignes de commande
     * @return Montant total HT de la commande
     */
    public double valoriserCommande() {
        /* A compléter */
        return /* A compléter */
    }



    public void afficherCommande() {
        System.out.println("Commande ID : " + idCommande + ", Date : " + dateCommande);
        for (Ligne ligne : lesLignes) {
            System.out.println("  Article : " + ligne.getUnArticle().getDesignation() +
                    ", Quantité : " + ligne.getQteCommande() +
                    ", Prix Unitaire : " + ligne.getUnArticle().getPrix());
        }
        System.out.println("Total HT : " + valoriserCommande());
    }

//    public void afficherArticlesCommandes() {
//        // Utilisation d'une collection de type Set pour éviter les doublons
//        Set<Article> articlesCommandes = new HashSet<>();
//
//        for (Ligne ligne : lesLignes) {
//            Article article = ligne.getUnArticle();
//            // Si l'article n'est pas déjà dans le set, on l'ajoute et l'affiche
//            if (!articlesCommandes.contains(article)) {
//                articlesCommandes.add(article);
//                article.afficherArticle(); // Appelle une méthode pour afficher les détails de l'article
//            }
//        }
//    }


}
