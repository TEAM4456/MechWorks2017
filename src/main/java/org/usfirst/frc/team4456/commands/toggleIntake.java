package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.subsystems.Intake;
import org.usfirst.frc.team4456.subsystems.Agitator;

import edu.wpi.first.wpilibj.command.Command;

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
		Agitator.startAgitator();
	}
	
	public synchronized void cancel() {
		end();
	}
	
	protected void end() {
		Intake.stopIntake();
		Agitator.stopAgitator();
		running = false;
	}
	
	protected void interrupted() {
		end();
	}
	
	public synchronized boolean isRunning() {
		return running;
	}
	
}
