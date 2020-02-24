package com.ibrazebra.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ibrazebra.game.States.GameStateManager;
import com.ibrazebra.game.States.MenuState;

public class ZooRunDemo extends ApplicationAdapter {
	//make global variables for the width and height of our screen
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;

	public static final String TITLE = "Zoo Run";
	private GameStateManager gsm;
	// you should only have 1 in the game they are very heavy files, just pass to different states
	private SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		gsm = new GameStateManager();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsm.push(new MenuState(gsm));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
