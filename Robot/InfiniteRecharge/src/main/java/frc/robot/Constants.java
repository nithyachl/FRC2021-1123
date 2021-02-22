package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int kFrontLeftChannel = 11;
    public static final int kRearLeftChannel = 12;
    public static final int kFrontRightChannel = 13;
    public static final int kRearRightChannel = 14;
  
    // TODO: Verify these assignment values
    public static final int ShooterMotor1CanID = 18;
    public static final int ShooterMotor2CanID = 16;
    public static final int ShooterRamPCM = 1;
    public static final int ShooterRamForwardModule = 3; // Don't know which is which for 0:1
    public static final int ShooterRamReverseModule = 2;

    // TODO: Verify these assignment values
    public static final int IntakeMotorCanID = 19;
    public static final int IntakePistonPCM = 2;
    public static final int IntakePistonForwardModule = 2;
    public static final int IntakePistonReverseModule = 3;

    public static final int ClimberMotorLeftCanID = 17;
    public static final int ClimberMotorRightCanID = 15;
    public static final int ClimberPCM = 2;
    public static final int ClimberSolenoidForward = 1;
    public static final int ClimberSolenoidReverse = 0;

    public static final int kJoystickChannel = 0;
}
