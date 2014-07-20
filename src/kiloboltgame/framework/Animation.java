package kiloboltgame.framework;

import java.util.ArrayList;

public class Animation {
	private ArrayList frames;
	private int currentFrame;
	private long animTime;
	private long totalDuration;
	
	public Animation() {
		frames = new ArrayList();
		totalDuration = 0;
		
		synchronized (this) {
			animTime = 0;
			currentFrame = 0;
		}
	}

}
