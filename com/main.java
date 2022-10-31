package com;

import com.interfaces.Figure;

public class main {

    public static void main(String [] args){


        int k = 10;
        Randomizer random = new Randomizer();

        figuryFabrica fabric = new figuryFabrica();
        for(int i = 0; i<k; i++){
            Figure figure = fabric.getInstance(random.random());
            System.out.println(figure.pokajiFiguru());

        }



    }

}
