package org.usfirst.frc.team4456;

import org.usfirst.frc.team4456.subsystems.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

import edu.wpi.first.wpilibj.CameraServer;

public class Robot extends IterativeRobot {
	
	OI oi;
	
	// Subsystem declarations here
	static Deflector deflector;
	static Drive drive;
	static Intake intake;
	static Loader loader;
	static Shooter shooter;
	static Winch winch;
	
	
	public void robotInit() {
		
		CameraServer.getInstance().startAutomaticCapture();
		
		RobotMap.init();
		
		// construct subsystems here
		deflector = new Deflector();
		drive = new Drive();
		intake = new Intake();
		loader = new Loader();
		shooter = new Shooter();
		winch = new Winch();
		
		oi = new OI();
		
		// autonomous choosing stuff here
		
	}
	public void robotPeriodic() {
		Scheduler.getInstance().run();
		drive.betterArcadeDrive(oi.joystick); // TEMPORARY
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

// "deplooy" -Andrew Rose, 2017, trying to type "deploy"
// pronounced "de-ploo-ee"
