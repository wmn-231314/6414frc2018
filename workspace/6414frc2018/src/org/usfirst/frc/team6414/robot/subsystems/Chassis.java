package org.usfirst.frc.team6414.robot.subsystems;

import org.usfirst.frc.team6414.robot.Robot;
import org.usfirst.frc.team6414.robot.RobotMap;
import org.usfirst.frc.team6414.robot.commands.DriveByJoystick;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/**
 *
 */
public class Chassis extends Subsystem {
	public WPI_TalonSRX frontleftmotor;
	public WPI_TalonSRX backleftmotor;
	
	public WPI_TalonSRX frontrightmotor;
	public WPI_TalonSRX backrightmotor;
	
	MecanumDrive mecanumdrive;

	
	public Chassis(){
		frontleftmotor = new WPI_TalonSRX(RobotMap.DRIVE_FRONT_LEFT);
		backleftmotor = new WPI_TalonSRX(RobotMap.DRIVE_BACK_LEFT);
		frontrightmotor = new WPI_TalonSRX(RobotMap.DRIVE_FRONT_RIGHT);
		backrightmotor = new WPI_TalonSRX(RobotMap.DRIVE_BACK_RIGHT);
		frontleftmotor.enableCurrentLimit(true);
		
		mecanumdrive = new MecanumDrive(frontleftmotor,backleftmotor,frontrightmotor,backrightmotor);

		mecanumdrive.setExpiration(0.5);
		mecanumdrive.setMaxOutput(1.0);
		
	}
	
	
	
	public void drivebyjoystick(){
		mecanumdrive.driveCartesian(Robot.oi.getX()*0.5, Robot.oi.getY()*0.5, Robot.oi.getZ()*0.5);
	}
//     Put methods for controlling this subsystem
//     here. Call these from Commands.
	public void stop(){
		mecanumdrive.stopMotor();
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
       setDefaultCommand(new DriveByJoystick());
    }

	
}

