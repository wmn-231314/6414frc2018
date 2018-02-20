package org.usfirst.frc.team6414.robot.subsystems;

import org.usfirst.frc.team6414.robot.RobotMap;
import org.usfirst.frc.team6414.robot.commands.ScissorsStop;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Scissors extends Subsystem {
	
	public WPI_TalonSRX scissorsmotor;
	
	public Scissors(){
		scissorsmotor = new WPI_TalonSRX(RobotMap.SCISSORS_MOTOR);
	}
	
	public void scissorsup(){
		scissorsmotor.set(1.0);
	}
	
	public void scissorsdown(){
		scissorsmotor.set(-1.0);
	}
	
	public void stop(){
		scissorsmotor.set(0);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ScissorsStop());
    }
}

