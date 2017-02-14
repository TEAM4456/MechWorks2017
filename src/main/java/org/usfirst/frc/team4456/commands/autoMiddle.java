package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Command;

public class autoMiddle extends Command {
	
	CANTalon leftDriveTalon1 = RobotMap.leftDriveTalon1;
	CANTalon rightDriveTalon1 = RobotMap.rightDriveTalon1;
	
	public autoMiddle() { /* requires(...) */ }
	
	protected void initialize() {
		
		leftDriveTalon1.changeControlMode(CANTalon.TalonControlMode.Position);
		leftDriveTalon1.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		leftDriveTalon1.setPosition(0);
		
		rightDriveTalon1.changeControlMode(CANTalon.TalonControlMode.Position);
		rightDriveTalon1.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		rightDriveTalon1.setPosition(0);
		
		leftDriveTalon1.set(leftDriveTalon1.getPosition() + 2500);
		rightDriveTalon1.set(rightDriveTalon1.getPosition() + 2500);
		
	}
	
	protected boolean isFinished() { return isTimedOut(); }
	
	protected void execute() {}
	
	protected void end() {}
	
	protected void interrupted() { end(); }
	
}
