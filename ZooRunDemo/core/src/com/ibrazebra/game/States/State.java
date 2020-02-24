package com.ibrazebra.game.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {
    //each state needs a camera to located position in the world
    protected OrthographicCamera cam;
    //mouse or pointer (vector3 is a x,y,z coordinate)
    protected Vector3 mouse;
    // way to pause the running game state
    protected GameStateManager gsm;

    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();

    }

    protected abstract void handleInput();
    //takes in delta time (difference between one frame rendered and the next frame rendered
    public abstract void update(float dt);
    //SpriteBatch container for everything that needs to be rendered (all textures and etc)
    public abstract void render(SpriteBatch sb);

}
