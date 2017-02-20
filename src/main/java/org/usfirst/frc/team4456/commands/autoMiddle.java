package org.usfirst.frc.team4456.commands;



import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoMiddle extends CommandGroup {
	
	public autoMiddle() {
		
		addSequential(new autoDistance(2000));
		
	}
	
}
