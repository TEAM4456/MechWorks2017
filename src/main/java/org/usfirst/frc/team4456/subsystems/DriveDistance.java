package org.usfirst.frc.team4456.subsystems;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import org.usfirst.frc.team4456.RobotMap;


public class DriveDistance extends PIDSubsystem { // This system extends PIDSubsystem

	public CANTalon DriveTalon;
	// you will have to define the DriveTalon when instantiating this class,
	// e.g.
	// driveDistanceLeft = new DriveDistance();
	// driveDistanceLeft.DriveTalon = RobotMap.leftDriveTalon1;

	public DriveDistance() {
		super("DriveDistance", 0.1, 0.0, 0.0);// The constructor passes a name for the subsystem and the P, I and D constants that are sueed when computing the motor output
		setAbsoluteTolerance(0.1);
		getPIDController().setContinuous(false);
	}

	public void initDefaultCommand() {
	}

	protected double returnPIDInput() {
		return DriveTalon.getPosition(); // returns the sensor value that is providing the feedback for the system
	}

	protected void usePIDOutput(double output) {
		DriveTalon.pidWrite(output); // this is where the computed output value fromthe PIDController is applied to the motor
	}
}