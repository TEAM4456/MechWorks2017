package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class autoLeft extends Command {
	
	public autoLeft() { /* requires(...) */ }
	
	protected void initialize() {}
	
	protected boolean isFinished() { return isTimedOut(); }
	
	protected void execute() {}
	
	protected void end() {}
	
	protected void interrupted() { end(); }
	
}