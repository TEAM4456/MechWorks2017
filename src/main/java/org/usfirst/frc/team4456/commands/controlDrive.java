package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class controlDrive extends Command {
	
	protected void initialize() {
		
	}
	
	protected boolean isFinished() { return false; /* never stop */ }
	
	protected void execute() { Robot.drive.betterArcadeDrive(Robot.controls.joystick); }
	
	protected void end() { /* nah */ }
	
	protected void interrupted() { end(); }
	
}
