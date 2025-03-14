package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {

    private List<Requête> listRequetes;

    public System_hospitalier(List<Requête> listRequetes) {
        super();
        this.listRequetes = listRequetes;
    }

    public System_hospitalier() {
        super();
        listRequetes = new ArrayList<>();
    }

    public List<Requête> getListRequetes() {
        return listRequetes;
    }

    public void setListRequetes(List<Requête> listRequetes) {
        this.listRequetes = listRequetes;
    }

    public void recevoirRequete(Requête requete) {
        listRequetes.add(requete);
        String analyse =  analyserRequete(requete);
        String comparaisonDonnees = comparerDonnes();
        System.out.println(analyse);
        System.out.println(comparaisonDonnees);
    }

    /**
     * Analyse la requête du patient en extrayant les informations pertinentes.
     * @param requête Requête à analyser
     * @return Message indiquant l'état de l'analyse
     */
    private String analyserRequete(Requête requête) {
        // Ici, on peut ajouter une logique pour analyser la requête du patient
        return "Requête analysée : validation des symptômes et historique patient effectuée.";
    }

    /**
     * Compare les données du patient avec celles des cas précédents pour déterminer un diagnostic.
     * @return Message indiquant le résultat de la comparaison
     */
    private String comparerDonnes() {
        // Simulation de la comparaison avec une base de données
        return "Cluster trouvé : similarité avec des cas précédents détectée.";
    }
}