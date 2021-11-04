package com.company;

import java.util.ArrayList;
import java.util.List;

public class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sports = new ArrayList<>();

    /**
     * constructor
     * @param vorName
     * @param nachName
     * @param sports
     */
    public Benutzer(String vorName, String nachName, List<Sport> sports) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sports = sports;
    }


    /**
     * Getter Vorname
     * @return
     */
    public String getVorName() {
        return vorName;
    }

    /**
     * Setter Vorname
     * @param vorName
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    /**
     * Getter Nachname
     * @return
     */
    public String getNachName() {
        return nachName;
    }

    /**
     * Setter Nachname
     * @param nachName
     */
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    /**
     *Getter list of sports
     * @return
     */
    public List<Sport> getSports() {
        return sports;
    }

    /**
     * Setter list of sports
     * @param sports
     */
    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    /**
     *Calculate time for sports
     * @param
     * @return zeit
     */
    public double kalkuliereZeit(){
        double zeit=0;
        for(int i=0;i<= sports.size()-1;i++){
            zeit =  zeit + sports.get(i).kalkuliereZeit();
        }
        return zeit;
    }

    /**
     *Calculate time for a specific sport type
     * @param typ
     * @return zeit
     */
    public double kalkuliereZeit(Sport typ){
        double zeit=0;
        for(int i=0;i<= sports.size()-1;i++){
            if(sports.get(i).getClass()==typ.getClass())
                zeit =  zeit + sports.get(i).kalkuliereZeit();
        }
        return zeit;
    }

    /**
     * Calculate average time for a sport
     * @return zeit
     */
    public double kalkuliereDurschnittszeit(){
        double zeit;
        zeit = kalkuliereZeit()/sports.size();
        return zeit;
    }


}
