package org.usfirst.frc.team6414.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int JOYSTICK_PORT = 0;
	
	public static final int DRIVE_FRONT_LEFT = 2;
	public static final int DRIVE_BACK_LEFT = 1;
	
	public static final int DRIVE_FRONT_RIGHT = 4;
	public static final int DRIVE_BACK_RIGHT = 3;
	
	public static final int SCISSORS_MOTOR = 5;
	public static final int INTAKE_MOTOR = 6;

	
	
//	public static final int SOLENOID_FWD_CHANNEL = 5;
//	public static final int SOLENOID_BWD_CHANNEL = 4;	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
