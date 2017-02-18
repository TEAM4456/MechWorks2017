package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.Robot;
import org.usfirst.frc.team4456.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Command;

public class autoMiddle extends Command {
	
	CANTalon leftDriveTalon1 = RobotMap.leftDriveTalon1;
	CANTalon rightDriveTalon1 = RobotMap.rightDriveTalon1;
	
	boolean finished;
	
	public autoMiddle() { requires(Robot.drive); }
	
	protected void initialize() { finished = false; }
	
	protected boolean isFinished() { return finished; }
	
	protected void execute() {
		RobotMap.rightDriveTalon1.changeControlMode(CANTalon.TalonControlMode.Position);
		RobotMap.rightDriveTalon1.set(RobotMap.rightDriveTalon1.get());
		RobotMap.rightDriveTalon1.setPosition(0);
		RobotMap.rightDriveTalon1.setPID(0.7, 0, 0);
		
		RobotMap.leftDriveTalon1.changeControlMode(CANTalon.TalonControlMode.Position);
		RobotMap.leftDriveTalon1.set(RobotMap.leftDriveTalon1.get());
		RobotMap.leftDriveTalon1.setPosition(0);
		RobotMap.leftDriveTalon1.setPID(0.7, 0, 0);
		
		// do autonomous move forward:
		double forward_move_distance = SmartDashboard.getDouble("Autonomous forward distance");
		RobotMap.rightDriveTalon1.set(forward_move_distance);
		RobotMap.leftDriveTalon1.set(forward_move_distance);
		
		finished = true;
	}
	
	protected void end() {
		// set drive motors back to PercentVBus for teleop driving
		RobotMap.rightDriveTalon1.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		RobotMap.leftDriveTalon1.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
	}
	
	protected void interrupted() { end(); }
	
}
