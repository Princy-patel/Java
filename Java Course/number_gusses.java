package com.company;
import java.util.Random;

public class number_gusses {
    class Game{
        public int number;
        public int noOfGusses;

        public int getNoOfGusses() {
            return noOfGusses;
        }

        public void setNoOfGusses(int noOfGusses) {
            this.noOfGusses = noOfGusses;
        }

        void Game(){
            Random rand = new Random();
            this.number = rand.nextInt(100);
        }
        void takeUserInput(){

        }
//        boolean isCorrectNumber(){
//
//        }
    }
}
