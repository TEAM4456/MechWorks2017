package org.usfirst.frc.team4456;

import com.ctre.CANTalon;
import org.usfirst.frc.team4456.subsystems.*;
import org.usfirst.frc.team4456.commands.homeDeflector;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CameraServer;

public class Robot extends IterativeRobot {
	
	public static Controls controls;
	
	// Subsystem declarations here
	public static Agitator agitator;
	public static Deflector deflector;
	public static Drive drive;
	public static Intake intake;
	public static Lidar lidar;
	public static Shooter shooter;
	public static Winch winch;
	
	boolean enabledInitialized = false;
	
	public void robotInit() {
		
		CameraServer.getInstance().startAutomaticCapture();
		
		RobotMap.init();
		
		// init test SmartDashboard fields here
		SmartDashboard.putNumber("Intake Speed", 1);
		SmartDashboard.putNumber("Winch Speed", .5);
		SmartDashboard.putNumber("Shooter Voltage", 5.4);
		SmartDashboard.putNumber("Agitator Voltage", 2.7);
		SmartDashboard.putNumber("Deflector PID", 10);

		SmartDashboard.putNumber("Autonomous forward distance", 100);
		
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
		lidar.update(); // add update() to getDistance()?
		SmartDashboard.putNumber("LiDAR Distance", lidar.getDistance());
		SmartDashboard.putBoolean("Deflector Switch", RobotMap.deflectorSwitch.get());
		SmartDashboard.putNumber("Deflector Encoder", RobotMap.deflectorTalon.getPosition());
		
		// call custom enabled methods
		if (!enabledInitialized && isEnabled()) { enabledInit(); }
		if (isEnabled()) { enabledPeriodic(); }
	}
	
	// custom methods called by robotPeriodic()
	void enabledInit() {
		Command homeDeflector = new homeDeflector();
		homeDeflector.start();
		
		enabledInitialized = true;
	}
	void enabledPeriodic() { Scheduler.getInstance().run(); }
	
	public void disabledInit() { enabledInitialized = false; }
	public void disabledPeriodic() {}
	
	public void autonomousInit() {
		RobotMap.rightDriveTalon1.setControlMode(CANTalon.TalonControlMode.Position);
		RobotMap.rightDriveTalon1.set(RobotMap.rightDriveTalon1.get());
		RobotMap.rightDriveTalon1.setPosition(0);
		RobotMap.rightDriveTalon1.setPID(0.7, 0, 0);

		RobotMap.leftDriveTalon1.setControlMode(CANTalon.TalonControlMode.Position);
		RobotMap.leftDriveTalon1.set(RobotMap.leftDriveTalon1.get());
		RobotMap.leftDriveTalon1.setPosition(0);
		RobotMap.leftDriveTalon1.setPID(0.7, 0, 0);

		// do autonomous move forward:
		double forward_move_distance = SmartDashboard.getDouble("Autonomous forward distance");
		RobotMap.rightDriveTalon1.set(forward_move_distance);
		RobotMap.leftDriveTalon1.set(forward_move_distance);

	}
	public void autonomousPeriodic() {}
	
	public void teleopInit() {
		RobotMap.rightDriveTalon1.setControlMode(CANTalon.TalonControlMode.PercentVbus);
		RobotMap.leftDriveTalon1.setControlMode(CANTalon.TalonControlMode.PercentVbus);
	}
	public void teleopPeriodic() {
		//Scheduler.getInstance().run();
		//drive.betterArcadeDrive(controls.joystick);
	}
	
	public void testInit() {
		// NOTE: teleopInit() is called when going into test mode, so anything in testInit() is extra to teleopInit()
		// at least I think so...
	}
	public void testPeriodic() { /* last year had LiveWindow.run() here */ }
	
}

// "deplooy" -Andrew Rose, 2017, trying to type "deploy"
// pronounced "de-ploo-ee"
