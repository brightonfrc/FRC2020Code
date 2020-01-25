/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Mat;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class computerVision extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // constants:

  final static int WIDTH = 0;
  final static int HEIGHT = 1;

  // outer port target dimensions (cm)
  //  3ft 3 1/4 in by 1 ft. 5 in
  final static double[] outerPortTargetDims = {99.695, 43.18};

  // loading bay target dimensions
  // 7 in by 11 in
  // 11 in from the ground
  final static double[] loadingBayTargetDims = {17.78, 27.94};

  /***************** UTIL COMMANDS **********************/ 
  // TODO: remove these commands before deployment

public void displayImage(Image img2) {
    ImageIcon icon=new ImageIcon(img2);
    JFrame frame=new JFrame();
    frame.setLayout(new FlowLayout());
    frame.setSize(img2.getWidth(null)+50, img2.getHeight(null)+50);
    JLabel lbl=new JLabel();
    lbl.setIcon(icon);
    frame.add(lbl);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
