package org.usfirst.frc.team4456.commands.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoRight extends CommandGroup {
	
	public autoRight() {
		
		addSequential(new DriveVBusTimed(0.5, 0.7));
		addSequential(new TurnVBusTimed(-0.3, 0.5));
		addSequential(new DriveVBusTimed(0.5, 0.7));
		
	}
	
}
