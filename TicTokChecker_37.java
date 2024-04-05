package com.web.java;

public class TicTokChecker_37 {
	
    public static void main(String[] args) {
	        char[][] board = {
	            {'X', 'O', 'X'},
	            {'X', 'X', 'O'},
	            {'O', 'X', 'O'}
	        };
	        
	        char result = checkTicTacToe(board);
	        
	        if (result == 'X' || result == 'O') {
	            System.out.println("Player " + result + " wins!");
	        } else if (result == 'D') {
	            System.out.println("It's a draw!");
	        } else {
	            System.out.println("No winner yet.");
	        }
	    }

	    public static char checkTicTacToe(char[][] board) {
	        // Check rows
	        for (int i = 0; i < 3; i++) {
	            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
	                return board[i][0];
	            }
	        }

	        // Check columns
	        for (int j = 0; j < 3; j++) {
	            if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
	                return board[0][j];
	            }
	        }

	        // Check diagonals
	        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
	            (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
	            return board[1][1];
	        }

	        // Check for draw
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (board[i][j] != 'X' && board[i][j] != 'O') {
	                    return 'N'; // Game is not finished yet
	                }
	            }
	        }

	        return 'D'; // Draw
	    }
	}


