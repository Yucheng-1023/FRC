
package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Joystick;



import com.ctre.phoenix.motorcontrol.*;



public class Robot extends TimedRobot {
  public TalonSRX RihgtbackMotor = new TalonSRX(0);
  public VictorSPX RightfrontMotor = new VictorSPX(0);
  public VictorSPX LeftfrontMotor = new VictorSPX (7);
  public TalonSRX LeftbackMotor = new TalonSRX(9);
  public Joystick Test = new Joystick(0);
  
  



  

 
  @Override
  public void robotInit() {  

  }
    


   
  @Override
  public void robotPeriodic() {
   
  }

  
  @Override
  public void autonomousInit() {
    
  }

  
  @Override
  public void autonomousPeriodic() {
    
  }

  
  @Override
  public void teleopInit() {
  }

 
  @Override
  public void teleopPeriodic() {
    if(Test.getRawButton(2)){
    LeftfrontMotor.set(ControlMode.PercentOutput,-0.5);
    RightfrontMotor.set(ControlMode.PercentOutput,0.5);
    LeftbackMotor.set(ControlMode.PercentOutput,-0.5);
    RihgtbackMotor.set(ControlMode.PercentOutput,0.5);
  }
else{LeftfrontMotor.set(ControlMode.PercentOutput,0);
  RightfrontMotor.set(ControlMode.PercentOutput,0);
  LeftbackMotor.set(ControlMode.PercentOutput,0);
  RihgtbackMotor.set(ControlMode.PercentOutput,0);
}
}



    


  
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  
  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }
}
