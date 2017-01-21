package org.usfirst.frc.team4456;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

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
        LiveWindow.addActuator("Drive", "leftDrive", leftDriveTalon1);

        rightDriveTalon1 = new CANTalon(4);
        LiveWindow.addActuator("Drive", "rightDrive", rightDriveTalon1);


    }
	
}
