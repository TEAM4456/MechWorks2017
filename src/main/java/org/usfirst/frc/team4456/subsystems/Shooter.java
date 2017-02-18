package org.usfirst.frc.team4456.subsystems;

import org.usfirst.frc.team4456.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends Subsystem {
	
	protected void initDefaultCommand() { /* set default command here */ }
	
	public static void startShooter() { RobotMap.shooterTalon.set(SmartDashboard.getNumber("Shooter RPM", 0.01)); }
	
	public static void stopShooter() { RobotMap.shooterTalon.set(0); }
	
}