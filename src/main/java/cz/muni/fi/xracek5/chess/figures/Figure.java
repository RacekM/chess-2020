package cz.muni.fi.xracek5.chess.figures;

import cz.muni.fi.xracek5.chess.Place;

import java.util.List;

public abstract class Figure {
        private String color;
        private boolean isKilled;

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public boolean isKilled() {
                return isKilled;
        }

        public void setKilled(boolean killed) {
                isKilled = killed;
        }

        public abstract List<Object> getValidMoves(Place[][] board, int x, int y);

}
