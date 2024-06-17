package mainpackage;

import java.util.ArrayList;

public class StatistiqueVoiture implements Statistique {

    private ArrayList<Voiture> voitures = new ArrayList<Voiture>();
    final static double TAUX_REDUCTION = 5.0 / 100;
    final static int GROUPE_REDUC = 5;

    @Override
    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }

    @Override
    public double prix() throws ArithmeticException {
        double prix_remise = 0;
        double prix_initial = 0;
        double remise_max = 20000;


        try {
            if (!voitures.isEmpty()) {
                int nb_grp = voitures.size() / GROUPE_REDUC;

                for (int i = 0; i < voitures.size(); i++) {
                    prix_remise = prix_remise + (voitures.get(i).getPrix() * (TAUX_REDUCTION * nb_grp));
                    prix_initial = prix_initial + (voitures.get(i).getPrix());
                }
            }

        } catch (Exception e) {
            System.out.println("Il n'y a pas de voitures !");
        }

        if (prix_initial - prix_remise < 20000) {
            return prix_remise;
        }

        if (prix_initial - prix_remise > 20000) {
            return prix_initial-remise_max;
        }

        return prix_remise;
    }
}