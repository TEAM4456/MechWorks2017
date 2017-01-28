package org.usfirst.frc.team4456.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4456.subsystems.Intake;
import org.usfirst.frc.team4456.RobotMap;

public class toggleIntake extends Command {
	
	public toggleIntake() {
		
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		
		if (RobotMap.intakeTalon.get() < 0.00001) {
			
			Intake.startIntake();
			
		} else {
			
			Intake.stopIntake();
			
		}
		
	}
	
	protected boolean isFinished() {
		return isTimedOut();
	}
	
	protected void end() {
		
	}
	
	protected void interrupted() {
		end();
	}
	
}
