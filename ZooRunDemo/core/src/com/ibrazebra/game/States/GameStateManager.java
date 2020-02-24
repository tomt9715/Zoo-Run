package com.ibrazebra.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateManager {

    //in here we will have a stack of game states that only renders the game state at the top
    private Stack<State> states;

    //constructor
    public GameStateManager(){
        states = new Stack<State>();
    }

    public void push(State state){
        states.push(state);
    }

    public void pop(){
        states.pop();
    }

    //instance to pop and push a new state
    public void set(State state){
        states.pop();
        states.push(state);
    }

    //to update our top object of our stack (takes in our change in time between two renders)
    public void update(float dt){
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
