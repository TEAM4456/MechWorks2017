package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class toggleIntake extends Command {
	
	boolean running;
	
	protected void initialize() {
		requires(Robot.intake);
		//requires(Robot.agitator);
		running = false;
	}
	
	protected boolean isFinished() { return isTimedOut(); }
	
	public synchronized void start() {
		running = true;
		Robot.intake.startIntake();
		//Robot.agitator.startAgitator();
	}
	
	public synchronized void cancel() { end(); }
	
	protected void end() {
		Robot.intake.stopIntake();
		//Robot.agitator.stopAgitator();
		running = false;
	}
	
	protected void interrupted() { end(); }
	
	public synchronized boolean isRunning() { return running; }
	
}
