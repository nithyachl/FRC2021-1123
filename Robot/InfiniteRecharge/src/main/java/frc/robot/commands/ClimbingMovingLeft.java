package frc.robot.commands;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

import java.util.logging.Logger;

public class ClimbingMovingLeft extends CommandBase {
  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })

  private final Logger logger = Logger.getLogger(this.getClass().getName());
  int time = 0;

  public ClimbingMovingLeft() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.getInstance().driveSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.getInstance().driveSubsystem.driveCartesian(5, 0, 0, 0.1);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.getInstance().driveSubsystem.driveCartesian(0, 0, 0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}