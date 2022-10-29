package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {
  private CANSparkMax motor;
  public Climber() {
    motor = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
  }
  public void moveUp(){
    motor.set(0.8);
  }

  public void moveDown(){
    motor.set(-0.8);
  }

  public void stop(){
    motor.set(0);
  }
}
