package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class raiseDeflector extends Command {
	
	/*
	THIS COMMAND IS PROBABLY TEMPORARY
	PLANNED FUNCTIONALITY IS SWAPPING BETWEEN 2 SPECIFIC PID POSITIONS FOR HIGH GOAL/LOW GOAL
	*/
	
	public raiseDeflector() { requires(Robot.deflector); }
	
	protected void initialize() {}
	
	protected boolean isFinished() { return isTimedOut(); }
	
	protected void execute() { Robot.deflector.raiseDeflector(); }
	
	protected void end() { Robot.deflector.stopDeflector(); }
	
	protected void interrupted() { end(); }
	
}
