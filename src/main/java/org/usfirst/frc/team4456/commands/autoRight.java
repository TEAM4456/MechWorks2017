package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.Robot;
import org.usfirst.frc.team4456.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Command;

public class autoRight extends Command {
	
	boolean finished;
	
	public autoRight() { requires(Robot.drive); }
	
	protected void initialize() { finished = false; }
	
	protected boolean isFinished() { return finished; }
	
	protected void execute() {
		
		/* code here */
		
		finished = true;
	}
	
	protected void end() {
		// set drive motors back to PercentVBus for teleop driving
		RobotMap.rightDriveTalon1.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		RobotMap.leftDriveTalon1.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
	}
	
	protected void interrupted() { end(); }
	
}
