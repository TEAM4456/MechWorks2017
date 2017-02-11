package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class toggleWinch extends Command {
	
	boolean running;
	
	protected void initialize() {
		requires(Robot.winch);
		running = false;
	}
	
	protected boolean isFinished() { return isTimedOut(); }
	
	public synchronized void start() {
		running = true;
		Robot.winch.startWinch();
	}
	
	public synchronized void cancel() { end(); }
	
	protected void end() {
		Robot.winch.stopWinch();
		running = false;
	}
	
	protected void interrupted() { end(); }
	
	public synchronized boolean isRunning() { return running; }
	
}
