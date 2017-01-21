package org.usfirst.frc.team4456.subsystems;

//import org.usfirst.frc.team4456.subsystems.*;
//import org.usfirst.frc.team4456.commands.*;
import org.usfirst.frc.team4456.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {
	
	//public final CANTalon leftDriveTalon = RobotMap.leftDriveTalon;
	//public final CANTalon rightDriveTalon = RobotMap.rightDriveTalon;
	//public final RobotDrive robotDrive = RobotMap.robotDrive;
	
	// TEMPORARY
	public final CANTalon leftDriveTalon = new CANTalon(3);
	public final CANTalon rightDriveTalon = new CANTalon(4);
	public final RobotDrive robotDrive = new RobotDrive(leftDriveTalon, rightDriveTalon);
	// /TEMPORARY
	
	protected void initDefaultCommand() {
		// set default command here, last year was teleop command
	}
	
	public void drive(Joystick joystick) {
		
		robotDrive.setSafetyEnabled(false);
		robotDrive.tankDrive(joystick.getRawAxis(1), joystick.getRawAxis(5));
		
	}
	
}
