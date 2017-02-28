package org.usfirst.frc.team4456.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoLeftBlue extends CommandGroup {
	
	public autoLeftBlue() {
		
		addSequential(new autoDistance(500));
		addSequential(new autoRotate(15));
		addSequential(new autoDistance(4600));
		
	}
	
}
