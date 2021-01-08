package com.company;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        launchApp();
    }

    /**
     * Function launchApp :
     * - On affiche l'interface de jeux
     * - On choisis les noms des joueurs
     * - On lance la partie avec le nombre de joueurs donné
     */
    public static void launchApp() {
        HashMap<String, Integer> score = new HashMap<String, Integer>();
        Files.read(score);
        int nbPlayer = Menu.displayInterface(score); // On affiche l'interface du jeux
        String[] name = Menu.choiceName(nbPlayer);
        boolean nameWinner = Game.play(nbPlayer, name, score); // On lance la partie avec le nombre de joueur donnée
        launchApp();
    }

}
