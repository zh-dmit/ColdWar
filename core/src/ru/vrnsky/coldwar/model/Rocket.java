package ru.vrnsky.coldwar.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * This class describes a rocket in game.
 * Created by Egor on 25.01.2016.
 */
public class Rocket {

    private Texture texture;
    private Rectangle rect;
    private int posX;
    private int posY;

    /*
     * It is a constructor of a class Rocket
     * @param: Texture tx - texture of rocket
     * @param: int posX - it is a position of rocket on X axis
     * @param: int posY - it is a position of rocket on Y axis
     */
    public Rocket(Texture tx,int posX, int posY)
    {
        this.texture = tx;
        this.posX = posX;
        
        this.rect = new Rectangle(posX,posY, texture.getWidth(),texture.getHeight());
    }

    /*
     * Rocket a fall
     * it is increment pos
     * rewrite in future
     */
    public void fly()
    {
        this.posY+=1.5f;
    }

    /*
     * This a draw method for rocket
     * It is draw rocket on this screen
     * Rocket have Texture texture and position as posX, posY
     */
    public void draw(SpriteBatch batch)
    {
        batch.draw(texture, posX, posY);
    }

}
