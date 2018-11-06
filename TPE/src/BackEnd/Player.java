package BackEnd;

 class Player {
    private int cantDisc = 2;
    private int colour;
    boolean human;

    Player(int colour){
        this.colour = colour;
    }

    protected Disc getDisc(int row, int col) {
        cantDisc++;
        return new Disc(colour, row, col);
    }
}
