package cz.muni.fi.xracek5.chess;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                Game game = new Game("player1", "player2");
                while (!game.isOver()) {
                        game.printActualState();
                        //INPUT from user fromX,fromY -> toX, toY
                        while (game.move(0, 0, 1, 1)) {
                                //INPUT from user fromX,fromY -> toX, toY
                        }
                }

                System.out.println("dasdasd");


        }

}
