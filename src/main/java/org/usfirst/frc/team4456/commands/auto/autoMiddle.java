package org.usfirst.frc.team4456.commands.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoMiddle extends CommandGroup {
	
	public autoMiddle() {
		
		addSequential(new DriveVBusTimed(0.5, 1));
		
	}
	
}
