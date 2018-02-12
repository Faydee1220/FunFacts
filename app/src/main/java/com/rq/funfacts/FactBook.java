package com.rq.funfacts;

import java.util.Random;

/**
 * Created by Faydee on 2018/2/12.
 */

public class FactBook {
    private String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };


    public String getFact() {
        // Randomly select a fact
        Random randomGenerator = new Random();
        // nextInt 的 bound 為 3 時，可產生 0,1,2 中的隨機數字
        int randomNumber = randomGenerator.nextInt(facts.length);

        return facts[randomNumber];
    }
}
