package org.usfirst.frc.team4456.subsystems;

import org.usfirst.frc.team4456.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Intake extends Subsystem {
	
	protected void initDefaultCommand() { /* set default command here */ }
	
	public static void startIntake() { RobotMap.intakeTalon.set(SmartDashboard.getNumber("Intake Speed", 0.01)); }
	
	public static void stopIntake() { RobotMap.intakeTalon.set(0); }
	
}