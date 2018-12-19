package pl.sda.tic_tac_toe;

import java.util.Scanner;

public class GameXODemo {
    public static void main(String[] args) {
        GameXO game = new GameXO();

        Scanner sc = new Scanner(System.in);

        String player = "Player 1";
        game.printGame(game.getGame());


        int playerMoveValue = 1;
        while (!game.ifWin(game.getGame())) {

            System.out.println(player + " What is Your move? index x, index y");
            int x = sc.nextInt();
            int y = sc.nextInt();
            game.move(game.getGame(), x, y, playerMoveValue);

            if (playerMoveValue == 1) {
                playerMoveValue = 4;
                player = "Player 2";

            } else {
                playerMoveValue = 1;
                player = "Player 1";
            }
            game.printGame(game.getGame());

        }
    }
}
