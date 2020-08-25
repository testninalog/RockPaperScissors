package com.endava.day9;

import java.util.Random;

public class RollDice {
//    public Integer rollDice(){// ako ne zelimo da vracamo samo cele brojeve onda mozemo da izmenimo int za Double
//        Random random = new Random();
//        int number = random.nextInt(6) +1;
//        return number;
//    }
    public Double rollDice(){// ako ne zelimo da vracamo samo cele brojeve onda mozemo da izmenimo int za Double
        Random random = new Random();
        Double number = random.nextDouble()*5+1;
        return number;
    }
}
