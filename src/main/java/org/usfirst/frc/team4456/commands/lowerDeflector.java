package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.subsystems.Deflector;

import edu.wpi.first.wpilibj.command.Command;

public class lowerDeflector extends Command {
	
	protected void initialize() {
		
	}
	
	protected boolean isFinished() { return isTimedOut(); }
	
	protected void execute() {
		Deflector.lowerDeflector();
	}
	
	protected void end() {
		Deflector.stopDeflector();
	}
	
	protected void interrupted() { end(); }
	
}
