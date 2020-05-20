package cz.muni.fi.xracek5.chess;

public class Game {
        private Place[][] board = new Place[8][8];
        private String whitePlayer;
        private String blackPlayer;
        private String actualPlayer;


        public Game(String whitePlayer, String blackPlayer) {
                this.whitePlayer = whitePlayer;
                this.blackPlayer = blackPlayer;
                actualPlayer = "white";
        }

        public void printActualState(){
                System.out.println("ACTUAL STATE");
        }

}
