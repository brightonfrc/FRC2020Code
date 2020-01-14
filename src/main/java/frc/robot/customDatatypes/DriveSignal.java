package frc.robot.customDatatypes;

import frc.robot.RobotConstantsMap;

// analogue for team 254
// stores percentage speed for drivetrain

public class DriveSignal{
    private double leftPercentage;
    private double rightPercentage;

    public static final DriveSignal NEUTRAL = new DriveSignal(0.0, 0.0);

    public DriveSignal(double _leftPercentage, double _rightPercentage){
        leftPercentage = _leftPercentage;
        rightPercentage = _rightPercentage;
    };

    public double getLeftPercentage(){
        return leftPercentage;
    }

    public double getRightPercentage(){
        return rightPercentage;
    }






    public static DriveSignal inverseKinematicsWithThreshold(Twist2d desiredMovement){
        // if turn less than a threshold, go forward
        if(Math.abs(desiredMovement.dtheta) < RobotConstantsMap.inverseKinematicsTurnEpsilon){
            return new DriveSignal(desiredMovement.dx, desiredMovement.dx);
        }

        return inverseKinematics(desiredMovement);
    }

    public static DriveSignal inverseKinematics(Twist2d desiredMovement){
        // the difference in the speed of the wheels
        // scrub factor might be how much the track slips sideways against the force exerienced during the turn
        double delta_v = RobotConstantsMap.driveWheelTrackWidth * desiredMovement.dtheta / (2 * RobotConstantsMap.trackScrubFactor);
        return new DriveSignal(desiredMovement.dx - delta_v, desiredMovement.dx + delta_v);
    }
}