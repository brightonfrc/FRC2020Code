/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  TalonSRX motorLeft1 = new TalonSRX(RobotMap.MOTOR_LEFT_1_ID);
  TalonSRX motorLeft2 = new TalonSRX(RobotMap.MOTOR_LEFT_2_ID);
  TalonSRX motorRight1 = new TalonSRX(RobotMap.MOTOR_RIGHT_1_ID);
  TalonSRX motorRight2 = new TalonSRX(RobotMap.MOTOR_RIGHT_2_ID);
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    System.out.println("Hey");
  }


}
