/******************************************************************************
 *  
 *  Purpose : Determine Singleton Design Pattern and it is SerializationDemo
 *            Class and Using Serialization and Store Object.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.singletonpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationDemo 
{
 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
 {
	 UsingSerializationSingleton instanceOne = UsingSerializationSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.txt"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.txt"));
        UsingSerializationSingleton instanceTwo = (UsingSerializationSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        
    }

}