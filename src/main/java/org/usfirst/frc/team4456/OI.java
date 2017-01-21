package org.usfirst.frc.team4456;

//import org.usfirst.frc.team4456.Robot;
//import org.usfirst.frc.team4456.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	// last year all fields were public, maybe change to public if necessary
	
	private JoystickButton aButton; // 1
	private JoystickButton bButton; // 2
	private JoystickButton xButton; // 3
	private JoystickButton yButton; // 4
	private JoystickButton leftBumper; // 5
	private JoystickButton rightBumper; // 6
	private JoystickButton backButton; // 7
	private JoystickButton startButton; // 8
	private JoystickButton leftStick; // 9
	private JoystickButton rightStick; // 10
	
	// AXIS CONTROLS NOT YET IMPLEMENTED
	
	private Joystick joystick;
	
	private Robot robot; // implemented last year, not used in OI (at least as far as I can tell)
	
	public OI(Robot robot) { // implemented last year, not used in OI (at least as far as I can tell)
		
		this.robot = robot; // implemented last year, not used in OI (at least as far as I can tell)
		
		joystick = new Joystick(0);
		
		/*
		FOR BUTTON CONFIGURATION:
			EXAMPLE SYNTAX: exampleButton.toggleWhenActive(new exampleCommand());
							exampleButton.whileHeld(new exampleCommand());
							exampleButton.whileActive(new exampleCommand());
							exampleButton.whenInactive(new exampleCommand());
							etc...
		 */
		
		aButton = new JoystickButton(joystick, 1);
		//aButton command configuration here
		bButton = new JoystickButton(joystick, 2);
		//bButton command configuration here
		xButton = new JoystickButton(joystick, 3);
		//xButton command configuration here
		yButton = new JoystickButton(joystick, 4);
		//yButton command configuration here
		leftBumper = new JoystickButton(joystick, 5);
		//leftBumper command configuration here
		rightBumper = new JoystickButton(joystick, 6);
		//rightBumper command configuration here
		backButton = new JoystickButton(joystick, 7);
		//selectButton command configuration here
		startButton = new JoystickButton(joystick, 8);
		//startButton command configuration here
		leftStick = new JoystickButton(joystick, 9);
		//leftStick command configuration here
		rightStick = new JoystickButton(joystick, 10);
		//rightStick command configuration here
		
		// AXIS CONTROLS NOT YET IMPLEMENTED
		
		// SmartDashboard buttons not yet implemented, maybe never implemented
		
	}
	
}
