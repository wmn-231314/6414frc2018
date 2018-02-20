package org.usfirst.frc.team6414.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6414.robot.RobotMap;
import org.usfirst.frc.team6414.robot.commands.DriveByJoystick;
import org.usfirst.frc.team6414.robot.commands.ScissorsDown;
import org.usfirst.frc.team6414.robot.commands.ScissorsUp;
import org.usfirst.frc.team6414.robot.commands.ScissorsUpTo;
import org.usfirst.frc.team6414.robot.commands.TakeIn;
import org.usfirst.frc.team6414.robot.commands.TakeOut;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick joystick1 = new Joystick(RobotMap.JOYSTICK_PORT);
	
	//Joystick joystick2 = new Joystick(RobotMap.JOYSTICK_PORTB);
	Button button1 = new JoystickButton(joystick1,1);
	Button button2 = new JoystickButton(joystick1,2);
	Button button3 = new JoystickButton(joystick1,3);
	Button button4 = new JoystickButton(joystick1,4);
	Button button5 = new JoystickButton(joystick1,5);
	Button button6 = new JoystickButton(joystick1,6);
	Button button7 = new JoystickButton(joystick1,7);
	Button button8 = new JoystickButton(joystick1,8);
	
	public OI(){
		button1.whileHeld(new ScissorsUp());
		button2.whileHeld(new ScissorsDown());
		button3.whileHeld(new TakeIn());
		button4.whileHeld(new TakeOut());
		button5.whenPressed(new ScissorsUpTo(3000));
		
		//buttonA1.whenPressed(new DriveByJoystick());
		//buttonA2.whenPressed(new DriveB());

	}
	
	
	public double getX(){
		return joystick1.getX();
	}
	public double getY(){
		return joystick1.getY();
	}
	public double getZ(){
		return joystick1.getZ();
	}
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
