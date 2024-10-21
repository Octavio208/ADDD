package pt.uma.tpsi.arqd.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.tpsi.arqd.game.Animator;

public class Player {

    private int posX, posY;

    private Animator animator;


    public Player(SpriteBatch batch, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        animator = new Animator(batch, "ship.png", 5, 2);

    }

    public void create(){
        animator.create();
    }

    public void render(){

    }
}
