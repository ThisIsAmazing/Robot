package frc.robot.commands;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;
public class IntakeBalls extends CommandBase {

    public IntakeBalls(){
        addRequirements(RobotContainer.intake);
        addRequirements(RobotContainer.index);
    }
    @Override
    public void initialize() {

    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      RobotContainer.intake.intake();
      RobotContainer.index.pushUp();
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      RobotContainer.intake.stop();
      RobotContainer.index.stop();
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }

}
