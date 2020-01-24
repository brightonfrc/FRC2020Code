/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TankDrive extends Command {
  public TankDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() { 
    // THIS IS FOR THE TANK DRIVE, WHERE EACH SIDE (OF WHEELS) IS CONTROLLED BY EACH JOYSTICK'S Y
    double leftStickY = Robot.m_oi.GetDriverRawAxis(/*/ USE DRIVER STATION TO GET THE INT FOR LEFT_STICK_Y (USE ROBOT MAP)/*/);
    double rightStickY = Robot.m_oi.GetDriverRawAxis(/*/ USE DRIVER STATION TO GET THE INT FOR RIGHT_STICK_Y (USE ROBOT MAP)/*/);
    Robot.driveTrain.setLeftMotors(leftStickY);
    Robot.driveTrain.setRightMotors(rightStickY);
    // We may want to adjust the scaling of these (e.g. make it exponential, or times by 0.5) - remember to put these constants in the robot map
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  // Just-in-case scenario:
  @Override
  protected void end() {
    Robot.driveTrain.setLeftMotors(0);
    Robot.driveTrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
