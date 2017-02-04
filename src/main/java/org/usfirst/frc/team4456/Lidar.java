package org.usfirst.frc.team4456;

public class Lidar
{
	private String arduinoBuffer = "";
	private int arduinoBufferLength = 50;
	
	public Lidar(Robot robot)
	{
		//arduinoBuffer = robot.serialUSB.readString();
	}
	
	public double getDistance()
	{
		return format(arduinoBuffer);
	}
	
	public void update(Robot robot)
	{
		try
		{
			updateArduinoBuffer(RobotMap.lidarSerial.readString());
		}
		catch(Exception ex)
		{
			System.out.println("ERROR!: LIDAR READ_STRING\n" + ex);
		}
		//System.out.println(arduinoBuffer);
	}
	
	private double format(String string)
    {
    	String[] stringArray = string.split("\n");
    	double[] doubleArray = new double[stringArray.length];
    	for(int i = 0; i < stringArray.length; i++)
    	{
    		try 
    		{
        		doubleArray[i] = Double.parseDouble(stringArray[i]);
    		}
    		catch(Exception e)
    		{
    			doubleArray[i] = 1.0;
    		}
    	}
    	if(doubleArray.length < 2)
    	{
    		return 0;
    	}
    	return doubleArray[doubleArray.length-2];
    }
	
	private void updateArduinoBuffer(String newString)
    {
    	String tempString = arduinoBuffer + newString;
    	int len = Math.min(tempString.length(), arduinoBufferLength);
    	arduinoBuffer = tempString.substring(tempString.length() - len);
    }
}
