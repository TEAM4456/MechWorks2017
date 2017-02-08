package org.usfirst.frc.team4456;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4456.subsystems.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

import edu.wpi.first.wpilibj.CameraServer;

public class Robot extends IterativeRobot {
	
	public static Controls controls;
	
	// Subsystem declarations here
	static Deflector deflector;
	public static Drive drive;
	static Intake intake;
	static Loader loader;
	static Shooter shooter;
	static Winch winch;
	
	public void robotInit() {
		
		CameraServer.getInstance().startAutomaticCapture();
		
		RobotMap.init();
		
		// init test SmartDashboard fields here
		SmartDashboard.putNumber("Intake Speed", 1);
		SmartDashboard.putNumber("Winch Speed", .5);
		SmartDashboard.putNumber("Shooter Speed", .45);
		SmartDashboard.putNumber("Agitator Speed", .6);
		SmartDashboard.putNumber("Deflector PID", 10);
		
		// construct subsystems here
		deflector = new Deflector();
		drive = new Drive();
		intake = new Intake();
		loader = new Loader();
		shooter = new Shooter();
		winch = new Winch();
		
		controls = new Controls();
		
		// autonomous choosing stuff here
		
	}
	public void robotPeriodic() {
		Scheduler.getInstance().run();
		// drive.betterArcadeDrive(controls.joystick);
		// add more calls for axis-controlled systems here
	}
	
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
