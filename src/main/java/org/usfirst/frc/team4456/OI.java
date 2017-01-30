package org.usfirst.frc.team4456;

//import org.usfirst.frc.team4456.Robot;
import org.usfirst.frc.team4456.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	// last year all fields were public, maybe change to public if necessary
	
	/* UNCOMMENT IF LOCAL VARIABLES DO NOT WORK
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
	*/
	
	public Joystick joystick;
	
	public OI() {
		
		joystick = new Joystick(0);
		
		/*
		FOR BUTTON CONFIGURATION:
			EXAMPLE SYNTAX: exampleButton.toggleWhenActive(new exampleCommand());
							exampleButton.whileHeld(new exampleCommand());
							exampleButton.whileActive(new exampleCommand());
							exampleButton.whenInactive(new exampleCommand());
							etc...
		 */
		
		JoystickButton aButton = new JoystickButton(joystick, 1);
		aButton.toggleWhenPressed(new toggleIntake());
		JoystickButton bButton = new JoystickButton(joystick, 2);
		bButton.toggleWhenPressed(new toggleWinch());
		JoystickButton xButton = new JoystickButton(joystick, 3);
		//xButton command configuration here
		JoystickButton yButton = new JoystickButton(joystick, 4);
		//yButton command configuration here
		JoystickButton leftBumper = new JoystickButton(joystick, 5);
		//leftBumper command configuration here
		JoystickButton rightBumper = new JoystickButton(joystick, 6);
		//rightBumper command configuration here
		JoystickButton backButton = new JoystickButton(joystick, 7);
		//selectButton command configuration here
		JoystickButton startButton = new JoystickButton(joystick, 8);
		//startButton command configuration here
		JoystickButton leftStick = new JoystickButton(joystick, 9);
		//leftStick command configuration here
		JoystickButton rightStick = new JoystickButton(joystick, 10);
		//rightStick command configuration here
		
	}
	
}
