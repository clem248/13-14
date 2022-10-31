package com;

import com.classes.*;
import com.interfaces.Figure;

public class figuryFabrica {
    public Figure getInstance(int type) {
               switch (type){
                   case 1 : return new fourToFour();
                   case 2 : return new fourToOne();
                   case 3 : return new threeAndOne();
                   case 4 : return new threeAndTwo();
                   case 5 : return new allTheOtherOnes();
               }
               return new fourToFour();
           }



}
