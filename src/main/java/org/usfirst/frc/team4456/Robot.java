package org.usfirst.frc.team4456;

import org.usfirst.frc.team4456.subsystems.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CameraServer;

public class Robot extends IterativeRobot {
	
	public static Controls controls;
	
	// Subsystem declarations here
	public static Agitator agitator;
	public static Deflector deflector;
	private static Drive drive;
	public static Intake intake;
	private Lidar lidar;
	public static Shooter shooter;
	public static Winch winch;
	
	public void robotInit() {
		
		CameraServer.getInstance().startAutomaticCapture();
		
		RobotMap.init();
		
		// init test SmartDashboard fields here
		SmartDashboard.putNumber("Intake Speed", 1);
		SmartDashboard.putNumber("Winch Speed", .5);
		SmartDashboard.putNumber("Shooter Voltage", 5.4);
		SmartDashboard.putNumber("Agitator Voltage", 2.7);
		SmartDashboard.putNumber("Deflector PID", 10);
		
		// construct subsystems here
		agitator = new Agitator();
		deflector = new Deflector();
		drive = new Drive();
		intake = new Intake();
		lidar = new Lidar();
		shooter = new Shooter();
		winch = new Winch();
		
		controls = new Controls();
		
		// autonomous choosing stuff here
		
	}
	public void robotPeriodic() {
		//Scheduler.getInstance().run(); // moved to teleopPeriodic()
		//drive.betterArcadeDrive(controls.joystick); // moved to teleopPeriodic()
		lidar.update(); // add update() to getDistance()?
		SmartDashboard.putNumber("LiDAR Distance", lidar.getDistance());
	}
	
	public void disabledInit() {}
	public void disabledPeriodic() {}
	
	public void autonomousInit() {}
	public void autonomousPeriodic() { Scheduler.getInstance().run(); }
	
	public void teleopInit() {}
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		drive.betterArcadeDrive(controls.joystick);
	}
	
	public void testInit() {
		// NOTE: teleopInit() is called when going into test mode, so anything in testInit() is extra to teleopInit()
		// at least I think so...
	}
	public void testPeriodic() { /* last year had LiveWindow.run() here */ }
	
}

// "deplooy" -Andrew Rose, 2017, trying to type "deploy"
// pronounced "de-ploo-ee"
