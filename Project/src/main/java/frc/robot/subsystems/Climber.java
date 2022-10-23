package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax;

public class Climber extends SubsystemBase {
    private CANSparkMax motor;
    private RelativeEncoder encoder;
    


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
