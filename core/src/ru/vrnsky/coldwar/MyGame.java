package ru.vrnsky.coldwar;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.vrnsky.coldwar.model.World;

public class MyGame extends ApplicationAdapter {
	private World world;
	private SpriteBatch sprite;
	
	@Override
	public void create () {
		world = new World();
		sprite = new SpriteBatch();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sprite.begin();
		world.draw(sprite);
		sprite.end();
	}
}
