package org.usfirst.frc.team4456;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class RobotMap {
	
	CANTalon leftDriveTalon1;
	CANTalon leftDriveTalon2; // <-- slave to leftDriveTalon1
	CANTalon rightDriveTalon1;
	CANTalon rightDriveTalon2; // <-- slave to rightDriveTalon2
	CANTalon loaderTalon;
	CANTalon shooterTalon;
	CANTalon winchTalon;
	CANTalon deflectorTalon;
	CANTalon intakeTalon;
	
	public RobotMap() {
		
		leftDriveTalon1 = new CANTalon(3);
        LiveWindow.addActuator("Drive", "leftDrive", leftDriveTalon1);

        rightDriveTalon1 = new CANTalon(4);
        LiveWindow.addActuator("Drive", "rightDrive", rightDriveTalon1);


    }
	
}
