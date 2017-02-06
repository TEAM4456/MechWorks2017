package org.usfirst.frc.team4456;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.SerialPort;

//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
	public static CANTalon agitatorTalon;
	public static SerialPort lidarSerial;
	
	public static void init() {
		
		leftDriveTalon1 = new CANTalon(6);
		leftDriveTalon2 = new CANTalon(4);
		leftDriveTalon2.changeControlMode(CANTalon.TalonControlMode.Follower);
		leftDriveTalon2.set(leftDriveTalon1.getDeviceID());
		//// If the slave drive has to be run the opposite direction from the master, uncomment this:
		//leftDriveTalon2.reverseOutput(true);
		
		//SmartDashboard.putData("leftDrive", leftDriveTalon1);
		
		rightDriveTalon1 = new CANTalon(1);
		rightDriveTalon2 = new CANTalon(2);
		rightDriveTalon2.changeControlMode(CANTalon.TalonControlMode.Follower);
		rightDriveTalon2.set(rightDriveTalon1.getDeviceID());
		//// If the slave drive has to be run the opposite direction from the master, uncomment this:
		//rightDriveTalon2.reverseOutput(true);
		
		//SmartDashboard.putData("rightDrive", rightDriveTalon1);
		
		// **loaderTalon maybe not needed**
		//loaderTalon = new CANTalon(1337); // PLACEHOLDER
		//loaderTalon.changeControlMode(CANTalon.TalonControlMode.Position);
		//loaderTalon.setFeedbackDevice(CANTalon.FeedbackDevice.AnalogEncoder);
		//loaderTalon.setPosition(0);
		
		//SmartDashboard.putData("loaderTalon", loaderTalon);
		
		shooterTalon = new CANTalon(5);
		//shooterTalon.changeControlMode(CANTalon.TalonControlMode.Position);
		//shooterTalon.setFeedbackDevice(CANTalon.FeedbackDevice.AnalogEncoder);
		//shooterTalon.setPosition(0);
		
		//SmartDashboard.putData("shooterTalon", shooterTalon);
		
		winchTalon = new CANTalon(8);
		//winchTalon.changeControlMode(CANTalon.TalonControlMode.Position);
		//winchTalon.setFeedbackDevice(CANTalon.FeedbackDevice.AnalogEncoder);
		//winchTalon.setPosition(0);
		
		//SmartDashboard.putData("winchTalon", winchTalon);
		
		deflectorTalon = new CANTalon(7); // Maybe?
		deflectorTalon.changeControlMode(CANTalon.TalonControlMode.Position);
		deflectorTalon.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		//deflectorTalon.setPosition(0);
		
		//SmartDashboard.putData("deflectorTalon", deflectorTalon);
		
		intakeTalon = new CANTalon(3);
		intakeTalon.setInverted(true);
		//intakeTalon.changeControlMode(CANTalon.TalonControlMode.Position);
		//intakeTalon.setFeedbackDevice(CANTalon.FeedbackDevice.AnalogEncoder);
		//intakeTalon.setPosition(0);
		
		//SmartDashboard.putData("intakeTalon", intakeTalon);
		
		agitatorTalon = new CANTalon(9);
		//agitatorTalon.changeControlMode(CANTalon.TalonControlMode.Position);
		//agitatorTalon.setFeedbackDevice(CANTalon.FeedbackDevice.AnalogEncoder);
		//agitatorTalon.setPosition(0);
		
		//SmartDashboard.putData("agitatorTalon", agitatorTalon);

		lidarSerial = new SerialPort(9600,SerialPort.Port.kUSB);
		
	}
	
}

