package org.usfirst.frc.team4456.subsystems;

import org.usfirst.frc.team4456.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Agitator extends Subsystem {
	
	protected void initDefaultCommand() { /* set default command here */ }
	
	public static void startAgitator() { RobotMap.agitatorTalon.set(SmartDashboard.getNumber("Agitator Speed", 0.01)); }
	
	public static void stopAgitator() { RobotMap.agitatorTalon.set(0); }
	
}
