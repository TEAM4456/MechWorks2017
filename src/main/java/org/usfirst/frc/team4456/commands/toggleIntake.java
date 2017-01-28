package org.usfirst.frc.team4456.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4456.subsystems.Intake;

public class toggleIntake extends Command {
	
	boolean running;
	
	protected void initialize() {
		running = false;
	}
	
	protected boolean isFinished() {
		return isTimedOut();
	}
	
	public synchronized void start() {
		running = true;
		Intake.startIntake();
	}
	
	public synchronized void cancel() {
		end();
	}
	
	protected void end() {
		Intake.stopIntake();
		running = false;
	}
	
	protected void interrupted() {
		end();
	}
	
	public synchronized boolean isRunning() {
		return running;
	}
	
}
