package main;

import framework.ui.Frame;
import framework.ui.GraphicsHandler;

public class Game implements Runnable {
	private Frame frame;
	private GraphicsHandler graphics;
	private Thread gameThread;
	
	private boolean isRunning;
	
	public Game(Frame frame) {
		this.frame = frame;
		this.graphics = frame.getGraphicsHandler();
		gameThread = new Thread(this);
	}
	
	public void start() {
		if(isRunning) return;
		gameThread.start();
	}

	@Override
	public void run () {
		double ticksPerSecond = 60;
		int tick = 0;
		long startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		if(!isRunning) return;
		isRunning = false;
		try {
			gameThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
