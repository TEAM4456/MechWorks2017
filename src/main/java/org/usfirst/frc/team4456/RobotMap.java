package org.usfirst.frc.team4456;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SerialPort;

public class RobotMap {
	
	public static CANTalon leftDriveTalon1;
	public static CANTalon leftDriveTalon2; // <-- slave to leftDriveTalon1
	public static CANTalon rightDriveTalon1;
	public static CANTalon rightDriveTalon2; // <-- slave to rightDriveTalon2
	public static CANTalon shooterTalon;
	public static CANTalon winchTalon;
	public static CANTalon deflectorTalon;
	public static CANTalon intakeTalon;
	public static CANTalon agitatorTalon;
	public static SerialPort lidarSerial;
	public static DigitalInput deflectorSwitch;
	
	public static void init() {
		
		leftDriveTalon1 = new CANTalon(6);
		leftDriveTalon2 = new CANTalon(4);
		leftDriveTalon2.changeControlMode(CANTalon.TalonControlMode.Follower);
		leftDriveTalon2.set(leftDriveTalon1.getDeviceID());
		
		rightDriveTalon1 = new CANTalon(1);
		rightDriveTalon2 = new CANTalon(2);
		rightDriveTalon2.changeControlMode(CANTalon.TalonControlMode.Follower);
		rightDriveTalon2.set(rightDriveTalon1.getDeviceID());
		
		shooterTalon = new CANTalon(5);
		shooterTalon.changeControlMode(CANTalon.TalonControlMode.Voltage);
		shooterTalon.setVoltageCompensationRampRate(24.0); // 50 ms to 12V
		
		winchTalon = new CANTalon(8);
		
		deflectorTalon = new CANTalon(7);
		deflectorTalon.changeControlMode(CANTalon.TalonControlMode.Position);
		deflectorTalon.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		
		intakeTalon = new CANTalon(3);
		intakeTalon.setInverted(true);
		
		agitatorTalon = new CANTalon(9);
		agitatorTalon.changeControlMode(CANTalon.TalonControlMode.Voltage);
		agitatorTalon.setVoltageCompensationRampRate(24.0); // 50 ms to 12V
		
		lidarSerial = new SerialPort(9600, SerialPort.Port.kUSB);
		
		deflectorSwitch = new DigitalInput(0);
		
	}
	
}
