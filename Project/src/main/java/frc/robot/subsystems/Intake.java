package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class Intake extends SubsystemBase {
    private CANSparkMax motor;

    public Intake(){
        motor = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
    }
    public void intake(){
        motor.set(1);
    
    }
    public void eject(){
        motor.set(-1);
    }
    public void stop(){
        motor.set(0);
    }


    
}
