package org.usfirst.frc.team4456.subsystems;


//import org.usfirst.frc.team4456.subsystems.*;
//import org.usfirst.frc.team4456.commands.*;

import org.usfirst.frc.team4456.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {
	
	public final CANTalon leftDriveTalon1 = RobotMap.leftDriveTalon1;
	public final CANTalon rightDriveTalon1 = RobotMap.rightDriveTalon1;
	//public final RobotDrive robotDrive = RobotMap.robotDrive;
	
	// TEMPORARY
	public final RobotDrive robotDrive = new RobotDrive(leftDriveTalon1, rightDriveTalon1);
	// /TEMPORARY
	
	protected void initDefaultCommand() {
		// set default command here, last year was teleop command
	}
	
	public void drive(Joystick joystick) {
		
		//robotDrive.setSafetyEnabled(false);
		//robotDrive.tankDrive(joystick.getRawAxis(1), joystick.getRawAxis(5));
		//robotDrive.arcadeDrive(joystick);
		betterArcadeDrive(joystick);
		
	}
	
	public void betterArcadeDrive(Joystick joystick) {
		
		// Maybe redo later with PID?
		
		double xValue = joystick.getRawAxis(0);
		double yValue = joystick.getRawAxis(1);
		
		//robotDrive.setSafetyEnabled(false);
		robotDrive.tankDrive(yValue - xValue, yValue + xValue);
		
	}
	
}
