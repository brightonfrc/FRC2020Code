package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;



public class Climber extends Subsystem {
    TalonSRX motorLeft1 = new TalonSRX(RobotMap.MOTOR_LEFT_1_ID);
    TalonSRX motorLeft2 = new TalonSRX(RobotMap.MOTOR_LEFT_2_ID);
    TalonSRX motorRight1 = new TalonSRX(RobotMap.MOTOR_RIGHT_1_ID);
    TalonSRX motorRight2 = new TalonSRX(RobotMap.MOTOR_RIGHT_2_ID);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
