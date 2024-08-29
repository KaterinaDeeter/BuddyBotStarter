package frc.robot.subsystems;

import frc.robot.Constants.DriveConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase; 
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;


public class Drive extends SubsystemBase {
    //Creates motors to be used, see RobotContainer for CANID
    //This is a variable, much like int or string, but this is an object. It belongs to the class of CANSparkMax and is an object
    //of that class and can access and use the methods that it has. 
    private final CANSparkMax m_Motor = new CANSparkMax(DriveConstants.kMotorCANID, MotorType.kBrushed);

    //This method sets the motor to half speed, will be used in the command class "RunMotor"
    public void setMotorSpeed()
    {
        m_Motor.set(.5);
    }

    public void stopMotorSpeed()
    {
        m_Motor.set(0); //sets speed to 0, effectively stopping it
    }
}
