package org.usfirst.frc.team4456.commands.auto;

import org.usfirst.frc.team4456.Robot;
import org.usfirst.frc.team4456.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

public class TurnVBusTimed extends Command {
	
	double speed;
	double time;
	
	final Timer timer = new Timer();
	
	public TurnVBusTimed(double speed, double time) {
		requires(Robot.drive);
		this.speed = speed;
		this.time = time;
	}
	
	protected void initialize() {
		timer.reset();
		timer.start();
	}
	
	protected boolean isFinished() { return timer.hasPeriodPassed(time); }
	
	protected void execute() {
		RobotMap.leftDriveTalon1.set(speed);
		RobotMap.rightDriveTalon1.set(speed);
	}
	
	protected void end() {
		RobotMap.leftDriveTalon1.set(0);
		RobotMap.leftDriveTalon1.set(0);
	}
	
	protected void interrupted() { end(); }
	
}
