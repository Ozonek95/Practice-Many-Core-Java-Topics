package pl.sda.tic_tac_toe;

public class GameXO {

    private int[][] game = new int[3][3];
    private int numberOfMoves = 0;

    public int[][] getGame() {
        return game;
    }

    public void setNumberOfMoves(int numberOfMoves) {
        this.numberOfMoves = numberOfMoves;
    }

    void move(int[][] game, int index1, int index2, int value) {
        {
            game[index1][index2] = value;
            setNumberOfMoves(numberOfMoves++);
        }


    }

    public boolean ifWin(int[][] game) {
        //horizontal win
        int sum1 = game[0][0] + game[0][1] + game[0][2];
        int sum2 = game[1][0] + game[1][1] + game[1][2];
        int sum3 = game[2][0] + game[2][1] + game[2][2];
        //vertical win
        int sum4 = game[0][0] + game[1][0] + game[2][0];
        int sum5 = game[0][1] + game[1][1] + game[2][1];
        int sum6 = game[0][2] + game[1][2] + game[2][2];
        //diagonal 7 and 8
        int sum7 = game[0][0] + game[1][1] + game[2][2];
        int sum8 = game[0][2] + game[1][1] + game[2][0];
        if (sum1 == 3 || sum2 == 3 || sum3 == 3 || sum4 == 3 || sum5 == 3 || sum6 == 3 || sum7 == 3 || sum8 == 3) {
            System.out.println("Player 1 WIN!");
            return true;
        } else if (sum1 == 12 || sum2 == 12 || sum3 == 12 || sum4 == 12 || sum5 == 12 || sum6 == 12 || sum7 == 12 || sum8 == 12) {
            System.out.println("Player 2 WIN!");
            return true;
        } else if(numberOfMoves==9){
            System.out.println("DRAW");
            return true;

        }

        else return false;

    }
    public void printGame(int[][]game){
        System.out.print(game[0][0]+" , "+game[0][1]+" , "+game[0][2]);
        System.out.println();
        System.out.print(game[1][0]+" , "+game[1][1]+" , "+game[1][2]);
        System.out.println();
        System.out.print(game[2][0]+" , "+game[2][1]+" , "+game[2][2]);
        System.out.println();

    }


}
