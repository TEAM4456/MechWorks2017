package org.usfirst.frc.team4456.subsystems;

// imports here

import org.usfirst.frc.team4456.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Winch extends Subsystem {
	
	protected void initDefaultCommand() {
		// set default command here
	}
	
	public static void startWinch() {
		
		RobotMap.winchTalon.set(SmartDashboard.getNumber("Winch Speed", 0.01));
		
	}
	
	public static void stopWinch() {
		
		RobotMap.winchTalon.set(0);
		
	}
	
}