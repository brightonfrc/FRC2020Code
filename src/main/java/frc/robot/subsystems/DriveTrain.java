/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private Talon motorLeft0 = new Talon(RobotMap.MOTOR_LEFT_0_ID);
  private Talon motorLeft1 = new Talon(RobotMap.MOTOR_LEFT_1_ID);
  private Talon motorLeft2 = new Talon(RobotMap.MOTOR_LEFT_2_ID);
  private Talon motorRight0 = new Talon(RobotMap.MOTOR_RIGHT_0_ID);
  private Talon motorRight1 = new Talon(RobotMap.MOTOR_RIGHT_1_ID);
  private Talon motorRight2 = new Talon(RobotMap.MOTOR_RIGHT_2_ID);
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    System.out.println("Hey");
  }


}
