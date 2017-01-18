package org.usfirst.frc.team4456;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {
	
	OI oi;
	
	// Subsystem declarations here
	
	public void robotInit() {
		
		// RobotMap.init();
		
		// construct subsystems here
		
		oi = new OI(this);
		
		// autonomous choosing stuff here
		
	}
	public void robotPeriodic() { Scheduler.getInstance().run(); } // this call was made in each mode's Periodic() last
																   // year, and robotPeriodic() was not implemented
	
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
