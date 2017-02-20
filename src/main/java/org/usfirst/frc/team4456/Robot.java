package org.usfirst.frc.team4456;

import org.usfirst.frc.team4456.subsystems.*;
import org.usfirst.frc.team4456.commands.homeDeflector;
import org.usfirst.frc.team4456.commands.autoLeft;
import org.usfirst.frc.team4456.commands.autoMiddle;
import org.usfirst.frc.team4456.commands.autoRight;

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
	
	Command homeDeflector;
	Command autonomousCommand;
	
	public void robotInit() {
		
		CameraServer.getInstance().startAutomaticCapture();
		
		RobotMap.init();
		
		// init test SmartDashboard fields here
		SmartDashboard.putNumber("Intake Speed", 1);
		SmartDashboard.putNumber("Winch Speed", .5);
		SmartDashboard.putNumber("Shooter Voltage", 5.4);
		SmartDashboard.putNumber("Agitator Voltage", 2.7);
		SmartDashboard.putNumber("Deflector PID", 0.3);
		SmartDashboard.putNumber("Autonomous forward distance", 100);
		
		// construct subsystems here (except Drive)
		agitator = new Agitator();
		deflector = new Deflector();
		intake = new Intake();
		lidar = new Lidar();
		shooter = new Shooter();
		winch = new Winch();
		
		controls = new Controls();
		
		homeDeflector = new homeDeflector();
		
		// autonomous choosing stuff here
		autonomousCommand = new autoMiddle();
		
	}
	public void robotPeriodic() {
		lidar.update(); // add update() to getDistance()?
		SmartDashboard.putNumber("LiDAR Distance", lidar.getDistance());
		SmartDashboard.putBoolean("Deflector Switch", RobotMap.deflectorSwitch.get());
		SmartDashboard.putNumber("Deflector Encoder", RobotMap.deflectorTalon.getPosition());
		SmartDashboard.putNumber("leftDriveTalon1", RobotMap.leftDriveTalon1.getPosition());
		SmartDashboard.putNumber("rightDriveTalon1", RobotMap.rightDriveTalon1.getPosition());
		SmartDashboard.putNumber("Actual Shooter RPM", RobotMap.shooterTalon.getSpeed());
		SmartDashboard.putNumber("Navx yaw", RobotMap.navx.getYaw());
		
		// call custom enabled methods
		if (!enabledInitialized && isEnabled()) { enabledInit(); }
		if (isEnabled()) { enabledPeriodic(); }
	}
	
	// custom methods called by robotPeriodic()
	void enabledInit() {
		//homeDeflector.start();
		
		enabledInitialized = true;
	}
	void enabledPeriodic() { Scheduler.getInstance().run(); }
	
	public void disabledInit() {
		enabledInitialized = false;
		
		homeDeflector.cancel();
		autonomousCommand.cancel();
	}
	public void disabledPeriodic() {}
	
	public void autonomousInit() {
		//RobotMap.leftDriveTalon1.setPosition(0);
		//RobotMap.rightDriveTalon1.setPosition(0);
		drive = null;
		autonomousCommand.start();
	}
	public void autonomousPeriodic() {}
	
	public void teleopInit() {
		autonomousCommand.cancel();
		drive = new Drive();
	}
	public void teleopPeriodic() {}
	
	public void testInit() {}
	public void testPeriodic() {}
	
}

// "deplooy" -Andrew Rose, 2017, trying to type "deploy"
// pronounced "de-ploo-ee"
