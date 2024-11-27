package Task_1;

import java.util.Scanner;

public class TicTacToeGame {
	private static char[][] board;
	private static char currentPlayer;
	private static boolean gameEnded;
	private static int totalMoves;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
			startGame();
			System.out.println("Do you want to play again (yes/no): ");
		} while (scanner.nextLine().equalsIgnoreCase("yes"));
		scanner.close();
	}

	private static void startGame() {
		board = new char[3][3];
		currentPlayer = 'X';
		gameEnded = false;
		totalMoves = 0;

		while (!gameEnded) {
			displayBoard();

			int row, col;
			do {
				System.out.println("Player " + currentPlayer + ", enter your move (row[1-3] col[1-3]): ");
				Scanner scanner = new Scanner(System.in);
				row = scanner.nextInt() - 1;
				col = scanner.nextInt() - 1;
			} while (!isValidMove(row, col));

			board[row][col] = currentPlayer;
			totalMoves++;

			if (checkWin(row, col)) {
				displayBoard();
				System.out.println("Player " + currentPlayer + " wins!");
				gameEnded = true;
			} else if (totalMoves == 9) {
				displayBoard();
				System.out.println("It's a draw!");
				gameEnded = true;
			} else {
				currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
			}

		}

	}

	private static void displayBoard() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	private static boolean isValidMove(int row, int col) {
		if (row < 0 || row >= 3 || col < 0 || col >= 3) {
			System.out.println("Invalid move. Row and column must be between 1 and 3.");
			return false;
		}
		if (board[row][col] != '\0') {
			System.out.println("Invalid move. Cell already occupied.");
			return false;
		}
		return true;
	}

	private static boolean checkWin(int row, int col) {

		if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
			return true;
		}

		if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
			return true;
		}

		if ((row == col && board[0][0] == board[1][1] && board[1][1] == board[2][2])
				|| (row + col == 2 && board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
			return true;
		}
		return false;
	}
}