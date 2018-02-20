package org.usfirst.frc.team6414.robot.subsystems;

import org.usfirst.frc.team6414.robot.RobotMap;
import org.usfirst.frc.team6414.robot.commands.TakeStop;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	
	public WPI_TalonSRX intaker;
	
	public Intake(){
		intaker = new WPI_TalonSRX(RobotMap.INTAKE_MOTOR);
	}
	
	public void takein(){
		intaker.set(0.7);
	}
	
	public void takeout(){
		intaker.set(-0.5);
	}
	
	public void stop(){
		intaker.set(0);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new TakeStop());
    }
}

