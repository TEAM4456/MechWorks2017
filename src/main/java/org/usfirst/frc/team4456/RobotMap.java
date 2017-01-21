package org.usfirst.frc.team4456;

import com.ctre.CANTalon;
//import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {
	
	public static CANTalon leftDriveTalon1;
	public static CANTalon leftDriveTalon2; // <-- slave to leftDriveTalon1
	public static CANTalon rightDriveTalon1;
	public static CANTalon rightDriveTalon2; // <-- slave to rightDriveTalon2
	public static CANTalon loaderTalon;
	public static CANTalon shooterTalon;
	public static CANTalon winchTalon;
	public static CANTalon deflectorTalon;
	public static CANTalon intakeTalon;

	public static void init() {
		
		leftDriveTalon1 = new CANTalon(3);
		//leftDriveTalon2 = new CANTalon(5);
		//leftDriveTalon2.changeControlMode(CANTalon.TalonControlMode.Follower);
		//leftDriveTalon2.set(leftDriveTalon1.getDeviceID());
		//// If the slave drive has to be run the opposite direction from the master, uncomment this:
		//leftDriveTalon2.reverseOutput(true);

		//LiveWindow.addActuator("Drive", "leftDrive", leftDriveTalon1);
		
		rightDriveTalon1 = new CANTalon(4);
		//rightDriveTalon2 = new CANTalon(6);
		//rightDriveTalon2.changeControlMode(CANTalon.TalonControlMode.Follower);
		//rightDriveTalon2.set(rightDriveTalon1.getDeviceID());
		//// If the slave drive has to be run the opposite direction from the master, uncomment this:
        //rightDriveTalon2.reverseOutput(true);

		//LiveWindow.addActuator("Drive", "rightDrive", rightDriveTalon1);
		
	}
	
}
