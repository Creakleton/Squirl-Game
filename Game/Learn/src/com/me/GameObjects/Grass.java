package com.me.GameObjects;

public class Grass extends Scrollable {
	
	public Grass(float x, float y, int width, int height, float scrollSpeed) {
        super(x, y, width, height, scrollSpeed);

    }
	
	public void restart(float x, float scrollSpeed)
	{
		posistion.x = x;
		velocity.x = scrollSpeed;
	}

}
