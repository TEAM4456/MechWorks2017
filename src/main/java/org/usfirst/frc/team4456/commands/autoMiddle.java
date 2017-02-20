package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.Robot;
import org.usfirst.frc.team4456.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Command;

public class autoMiddle extends Command {
	
	boolean finished;
	
	public autoMiddle() { requires(Robot.drive); }
	
	protected void initialize() { finished = false; }
	
	protected boolean isFinished() { return finished; }
	
	protected void execute() {
		
		/*
		double forward_move_distance = SmartDashboard.getNumber("Autonomous forward distance", 0.01);
		
		Robot.drive.setSpeed(0.1, 0.1);
		
		//if (RobotMap.leftDriveTalon1.getPosition() >= forward_move_distance) { finished = true; }
		*/
		
		/*
		if (RobotMap.leftDriveTalon1.getPosition() <= forward_move_distance && RobotMap.rightDriveTalon1.getPosition() <= forward_move_distance) {
			Robot.drive.setSpeed(0.2, 0.2);
			System.out.println("set speed to 0.2, 0.2");
		} else {
			Robot.drive.setSpeed(0, 0);
			System.out.println("set speed to 0, 0");
			finished = true;
		}
		*/
		
		
		RobotMap.rightDriveTalon1.changeControlMode(CANTalon.TalonControlMode.Position);
		RobotMap.rightDriveTalon1.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		RobotMap.rightDriveTalon1.set(RobotMap.rightDriveTalon1.get());
		RobotMap.rightDriveTalon1.setPosition(0);
		RobotMap.rightDriveTalon1.setPID(0.2, 0, 0);
		
		RobotMap.leftDriveTalon1.changeControlMode(CANTalon.TalonControlMode.Position);
		RobotMap.leftDriveTalon1.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		RobotMap.leftDriveTalon1.set(RobotMap.leftDriveTalon1.get());
		RobotMap.leftDriveTalon1.setPosition(0);
		RobotMap.leftDriveTalon1.setPID(0.2, 0, 0);
		
		// do autonomous move forward:
		double forward_move_distance = SmartDashboard.getNumber("Autonomous forward distance", 0.01);
		RobotMap.rightDriveTalon1.set(forward_move_distance);
		RobotMap.leftDriveTalon1.set(-forward_move_distance);
		
		if (RobotMap.leftDriveTalon1.getPosition() >= forward_move_distance &&
				RobotMap.rightDriveTalon1.getPosition() >= forward_move_distance) { finished = true; }
		
	}
	
	protected void end() {
		// set drive motors back to PercentVBus for teleop driving
		RobotMap.rightDriveTalon1.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		RobotMap.leftDriveTalon1.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		System.out.println("autonomous end() called!");
	}
	
	protected void interrupted() { end(); }
	
}
