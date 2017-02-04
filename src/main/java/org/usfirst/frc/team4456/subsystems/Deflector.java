package org.usfirst.frc.team4456.subsystems;

// imports here

import org.usfirst.frc.team4456.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Deflector extends Subsystem {
	
	protected void initDefaultCommand() {
		// set default command here
	}
	
	public static void raiseDeflector() {
		
		RobotMap.deflectorTalon.setPosition(RobotMap.deflectorTalon.getPosition() +
											SmartDashboard.getNumber("Deflector PID", 0.01));
		
	}
	
	public static void lowerDeflector() {
		
		RobotMap.deflectorTalon.setPosition(RobotMap.deflectorTalon.getPosition() -
											SmartDashboard.getNumber("Deflector PID", 0.01));
		
	}
	
	public static void stopDeflector() {
		
		RobotMap.deflectorTalon.setPosition(RobotMap.deflectorTalon.getPosition());
		
	}
	
}