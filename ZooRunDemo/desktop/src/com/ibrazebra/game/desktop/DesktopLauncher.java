package com.ibrazebra.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ibrazebra.game.ZooRunDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//this was made to change the size & Title of our window
		config.width = ZooRunDemo.WIDTH;
		config.height = ZooRunDemo.HEIGHT;
		config.title = ZooRunDemo.TITLE;
		new LwjglApplication(new ZooRunDemo(), config);
	}
}
