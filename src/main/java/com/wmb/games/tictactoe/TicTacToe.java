package com.wmb.games.tictactoe;

/**
 * Created by rob on 3/31/15.
 */
public class TicTacToe {

    private static final int DEFAULT_SIZE = 3;
    private Players[][] boardArray;
    private int maxPlays;
    private int playCount;
    private int size;

    public TicTacToe() {
        this(DEFAULT_SIZE);
    }

    public TicTacToe(int size) {
        boardArray = new Players[size][size];
        this.maxPlays=size*size;
        this.size=size;
    }

    private void makeMove(Players player, int x, int y) throws OccupiedException, MoveOutOfBoundsException {

        if(x>this.size-1){
            throw new MoveOutOfBoundsException("X is out of bounds: "+x);
        }

        if(y>this.size-1){
            throw new MoveOutOfBoundsException("Y is out of bounds: "+y);
        }

        Players currentValue = boardArray[x][y];
        if(currentValue!=Players.NO_PLAYER){
            throw new OccupiedException();
        }
        playCount++;
        boardArray[x][y]=player;
    }



    private boolean noMoreMoves(){
        return this.maxPlays==this.playCount;
    }

    public void makeMoveO(int x,int y) throws OccupiedException, MoveOutOfBoundsException {
        makeMove(Players.PLAYER_O,x,y);
    }


    public void makeMoveX(int x,int y) throws OccupiedException, MoveOutOfBoundsException {
        makeMove(Players.PLAYER_X,x,y);
    }


    public GameStates isThereAWinner(){
        return GameStates.GAME_ON;
    }



}
