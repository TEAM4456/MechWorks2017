package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.RobotMap;
import org.usfirst.frc.team4456.subsystems.DriveAngle;
import org.usfirst.frc.team4456.subsystems.DriveDistance;

import edu.wpi.first.wpilibj.command.Command;

public class autoDistance extends Command {
	
	DriveDistance distanceDrive = new DriveDistance();
	
	double setDistance;
	
	public autoDistance(double setDistance) { this.setDistance = setDistance; }
	
	protected void initialize() {
		distanceDrive.DriveTalon1 = RobotMap.leftDriveTalon1;
		distanceDrive.DriveTalon2 = RobotMap.rightDriveTalon1;
		
		distanceDrive.setSetpointRelative(setDistance);
		
		distanceDrive.enable();
	}
	
	protected boolean isFinished() {
		return distanceDrive.onTarget();
	}
	
	protected void execute() {
		
	}
	
	protected void end() {
		distanceDrive.disable();
	}
	
	protected void interrupted() { end(); }
	
}
