package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.RobotMap;
import org.usfirst.frc.team4456.subsystems.DriveDistance;

import edu.wpi.first.wpilibj.command.Command;

public class autoDistance extends Command {
	
	DriveDistance leftDistanceDrive = new DriveDistance();
	DriveDistance rightDistanceDrive = new DriveDistance();
	
	double setDistance;
	
	public autoDistance(double setDistance) { this.setDistance = setDistance; }
	
	protected void initialize() {
		leftDistanceDrive.DriveTalon = RobotMap.leftDriveTalon1;
		rightDistanceDrive.DriveTalon = RobotMap.rightDriveTalon1;
		
		leftDistanceDrive.setSetpoint(RobotMap.leftDriveTalon1.getPosition() - setDistance);
		rightDistanceDrive.setSetpoint(RobotMap.rightDriveTalon1.getPosition() + setDistance);
		
		leftDistanceDrive.enable();
		rightDistanceDrive.enable();
	}
	
	protected boolean isFinished() {
		return leftDistanceDrive.onTarget() && rightDistanceDrive.onTarget();
	}
	
	protected void execute() {
		
	}
	
	protected void end() {
		leftDistanceDrive.disable();
		rightDistanceDrive.disable();
	}
	
	protected void interrupted() { end(); }
	
}
