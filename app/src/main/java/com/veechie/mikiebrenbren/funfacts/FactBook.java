package com.veechie.mikiebrenbren.funfacts;

import java.util.Random;

/**
 * Created by michaelbrennan on 1/4/15.
 */
public class FactBook {

   public String[] mfacts = {"I like turtles", "The honey badger is considered the most ferocious animal in Africa", "Leonardo de Vinci, Einstein, and the" +
            " creator of this app are all left handed", "A Rubix cube can be solved in 25 moves no matter where the colors are at any particular time",
            "Ants stretch when they wake up", "Ostriches run faster than horses","Olympic gold metals are actually mostly made of silver"};
    public Random mRandomGenerator;
    public static int randomNum;

   public String getFact(){

       String fact = mfacts[getRandomNumber()];

       return fact;
   }

    public int getRandomNumber(){

        //randomly select a fact,
        mRandomGenerator = new Random();
        //update the label with our dynamic fact
        randomNum = mRandomGenerator.nextInt(mfacts.length);//random number between 0 and 2

        return randomNum;
    }
}
