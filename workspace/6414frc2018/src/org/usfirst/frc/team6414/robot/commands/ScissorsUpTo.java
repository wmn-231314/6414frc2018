package org.usfirst.frc.team6414.robot.commands;

import org.usfirst.frc.team6414.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ScissorsUpTo extends Command {

	private long duration;
	private long starttime ; 
	private long endtime;
	private long currenttime;
	
    public ScissorsUpTo(int TimeInMs) {
    	requires(Robot.scissors);
    	duration = TimeInMs;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	starttime = System.currentTimeMillis();
    	endtime = starttime + duration ;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.scissors.scissorsup();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	currenttime = System.currentTimeMillis();
    	return currenttime >= endtime;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.scissors.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
