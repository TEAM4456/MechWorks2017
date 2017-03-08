package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.Robot;
import org.usfirst.frc.team4456.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class autoDistance_VBus extends Command {
	
	boolean finished;
	double setPoint;
	double startPoint;
	
	public autoDistance_VBus(double setPoint) {
		requires(Robot.drive);
		finished = false;
		this.setPoint = setPoint;
		startPoint = RobotMap.leftDriveTalon1.getPosition();
	}
	
	protected void initialize() { Robot.drive.robotDrive.tankDrive(0.3, 0.3); }
	
	protected boolean isFinished() { return finished; }
	
	protected void execute() {
		if (RobotMap.leftDriveTalon1.getPosition() >= startPoint + setPoint) {
			Robot.drive.robotDrive.tankDrive(0.0, 0.0);
			finished = true;
		}
	}
	
	protected void end() { Robot.drive.robotDrive.tankDrive(0, 0); }
	
	protected void interrupted() { end(); }
}
