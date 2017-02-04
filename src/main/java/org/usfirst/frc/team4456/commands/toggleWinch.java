package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.subsystems.Winch;

import edu.wpi.first.wpilibj.command.Command;

public class toggleWinch extends Command {
	
	boolean running;
	
	protected void initialize() {
		running = false;
	}
	
	protected boolean isFinished() {
		return isTimedOut();
	}
	
	public synchronized void start() {
		running = true;
		Winch.startWinch();
	}
	
	public synchronized void cancel() {
		end();
	}
	
	protected void end() {
		Winch.stopWinch();
		running = false;
	}
	
	protected void interrupted() {
		end();
	}
	
	public synchronized boolean isRunning() {
		return running;
	}
	
}
