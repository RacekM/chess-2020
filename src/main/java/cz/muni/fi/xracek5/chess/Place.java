package cz.muni.fi.xracek5.chess;

import cz.muni.fi.xracek5.chess.figures.Figure;

public class Place {
        private Figure figure;
        private int x;
        private int y;

        public Place(Figure figure, int x, int y) {
                this.figure = figure;
                this.x = x;
                this.y = y;
        }

        public Figure getFigure() {
                return figure;
        }

        public void setFigure(Figure figure) {
                this.figure = figure;
        }

        public int getX() {
                return x;
        }

        public void setX(int x) {
                this.x = x;
        }

        public int getY() {
                return y;
        }

        public void setY(int y) {
                this.y = y;
        }
}
