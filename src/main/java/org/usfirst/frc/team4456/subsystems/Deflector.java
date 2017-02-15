package org.usfirst.frc.team4456.subsystems;

import org.usfirst.frc.team4456.RobotMap;
import org.usfirst.frc.team4456.commands.homeDeflector;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Deflector extends Subsystem {
	
	protected void initDefaultCommand() { /*setDefaultCommand(new homeDeflector());*/ }
	
	public static void raiseDeflector() {
		RobotMap.deflectorTalon.set(RobotMap.deflectorTalon.get() +
											SmartDashboard.getNumber("Deflector PID", 0.01));
	}
	
	public static void lowerDeflector() {
		RobotMap.deflectorTalon.set(RobotMap.deflectorTalon.get() -
											SmartDashboard.getNumber("Deflector PID", 0.01));
	}
	
	public static void stopDeflector() { RobotMap.deflectorTalon.set(RobotMap.deflectorTalon.get()); }
	
}