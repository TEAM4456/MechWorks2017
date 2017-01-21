package org.usfirst.frc.team4456;

import org.usfirst.frc.team4456.subsystems.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {
	
	OI oi;
	
	// Subsystem declarations here
	static Drive drive;
	
	public void robotInit() {
		
		// RobotMap.init();
		
		// construct subsystems here
		drive = new Drive();
		
		oi = new OI(this);
		
		// autonomous choosing stuff here
		
	}
	public void robotPeriodic() {
		Scheduler.getInstance().run();
		drive.drive(oi.joystick);
	} // the getInstance().run() call was made in each mode's Periodic() last year, and robotPeriodic() was not implemented
	
	public void disabledInit() {}
	public void disabledPeriodic() {}
	
	public void autonomousInit() {}
	public void autonomousPeriodic() {}
	
	public void teleopInit() {}
	public void teleopPeriodic() {}
	
	public void testInit() {
		// NOTE: teleopInit() is called when going into test mode, so anything in testInit() is extra to teleopInit()
		// at least I think so...
	}
	public void testPeriodic() { /* last year had LiveWindow.run() here */ }
	
}
