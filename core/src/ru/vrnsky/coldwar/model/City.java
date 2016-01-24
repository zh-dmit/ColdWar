package ru.vrnsky.coldwar.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Egor on 25.01.2016.
 */
public class City {

    private String name;
    private double health;
    private Texture cityTexture;
    private Rectangle rect;
    private int posX, posY;

    public City(String name, Texture texture, int posX, int posY)
    {
        this.name = name;
        this.cityTexture = texture;
        this.posX = posX;
        this.posY = posY;
        this.rect = new Rectangle(posX, posY, texture.getWidth(), texture.getHeight());
    }

    public void draw(SpriteBatch sprite)
    {
        sprite.draw(cityTexture, posX, posY);
    }

}
