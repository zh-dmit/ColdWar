package ru.vrnsky.coldwar.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * This class describes a World. It is world which our player gone
 * At this place we loaded all resources
 * Created by Egor on 25.01.2016.
 */
public class World {

    private City city;
    private Rocket rocket;

    String textureUrl = "badlogic.jpg";

    /*
     * This is a constructor of world class
     * In this constructor we initialize all
     * component of our world
     */
    public void World()
    {
        city = new City("Moscow",new Texture(textureUrl),0,10);
        //TODO:initialize all of components
    }

    /*
     * This is a draw method
     * Draw texture
     */
    public void draw(SpriteBatch sprite)
    {
        city.draw(sprite);
    }

}
