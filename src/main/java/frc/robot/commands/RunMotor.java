package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drive;

public class RunMotor extends Command{
    private Drive m_drive; 


    public RunMotor(Drive drive)
    {
    m_drive = drive; 
    addRequirements(m_drive);
    }

    //This is run once the command is first called on (or when the button is pushed)
    @Override
    public void initialize()
    {
        System.out.println("Motor Running");
        m_drive.setMotorSpeed(); //This is here because once the robot starts, the speed is set and will stay set until end is called
    }

    @Override
    public void execute()
    {}

    @Override
    public void end(boolean interrupted)
    {
        m_drive.stopMotorSpeed(); //Speed is set back to 0 when the button is no longer pushed
    }

}