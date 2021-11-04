package com.company;

public class Basketball extends Mannschaftssport  {

    private double zeit=55;

    /**
     *Calculate time for basketball
     * @param
     * @return zeit
     */
    @Override
    public double kalkuliereZeit(){
        return zeit;
    }
}