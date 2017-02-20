package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.Robot;
import org.usfirst.frc.team4456.RobotMap;
import org.usfirst.frc.team4456.subsystems.DriveAngle;
import org.usfirst.frc.team4456.subsystems.DriveDistance;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Command;

public class autoRotate extends Command {
	
	DriveAngle angleDrive = new DriveAngle();
	
	double setDegree;
	
	public autoRotate(double setDegree) { this.setDegree = setDegree; }
	
	protected void initialize() {
		RobotMap.navx.zeroYaw();
		angleDrive.enable();
		angleDrive.setSetpoint(setDegree);
	}
	
	protected boolean isFinished() { return angleDrive.onTarget(); }
	
	protected void execute() {}
	
	protected void end() { angleDrive.disable(); }
	
	protected void interrupted() { end(); }
	
}
