package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

public class toggleShooter extends Command {
	
	boolean running;
	
	protected void initialize() {
		running = false;
	}
	
	protected boolean isFinished() {
		return isTimedOut();
	}
	
	public synchronized void start() {
		running = true;
		Shooter.startShooter();
	}
	
	public synchronized void cancel() {
		end();
	}
	
	protected void end() {
		Shooter.stopShooter();
		running = false;
	}
	
	protected void interrupted() {
		end();
	}
	
	public synchronized boolean isRunning() {
		return running;
	}
	
}
