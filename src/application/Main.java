package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(8,8);

        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);

        while(true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();

            System.out.print("SOURCE: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();

            System.out.print("TARGET: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

        }
    }
}