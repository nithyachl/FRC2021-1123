package frc.robot.commands;

import java.util.logging.Logger;
import frc.robot.subsystems.RGBSensorSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class RGBSensorCommand extends CommandBase {
    
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private RGBSensorSubsystem m_subsystem;

  public RGBSensorCommand(RGBSensorSubsystem subsystem){ 

    m_subsystem = new RGBSensorSubsystem();
    addRequirements(m_subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    logger.info("Init Color Sensors");
    m_subsystem.init();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}