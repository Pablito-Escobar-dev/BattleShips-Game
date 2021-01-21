package game.players;

import game.ships.*;
import game.board.*;

import java.util.ArrayList;

public class humanPlayer implements Player {
    private String name;
    private int points;

    private ArrayList<Carrier> carriers = new ArrayList<>();
    private ArrayList<Battleship> battleships = new ArrayList<>();
    private ArrayList<Destroyer> destroyers = new ArrayList<>();
    private ArrayList<SuperPatrol> superPatrols = new ArrayList<>();
    private ArrayList<PatrolBoat> patrolBoats = new ArrayList<>();


    /**
     * @param name of the player
     * @ensures the Player starts with 0 points
     */
    public humanPlayer(String name) {
        this.name = name;
        this.points = 0;
    }

    /**
     * Getter for the name of the player
     *
     * @returns the name of the player
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Getter for the points of the player
     *
     * @returns the points of the player
     */
    @Override
    public int getPoints() {
        return points;
    }

    /**
     * Adds points of a type of ship to the points of the player
     *
     * @param s ship which was destroyed
     */
    @Override
    public void addPoints(Ship s) {

    }

    /**
     * Lets the player shot to his intended place
     *
     * @returns whether his shot was possible and completed successful
     */
    @Override
    public void fire() {

    }
}
