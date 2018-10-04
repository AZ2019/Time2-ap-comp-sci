
/**
 * Write a description of class TimeTest2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimeTest2
{
    public static void main (String[] args)
    {
        Time2 t1 = new Time2 (11, 0);     // 11:00 AM
        Time2 t2 = new Time2 (8, 54, 42); // 8:54:42 AM
        Time2 t3 = new Time2 (27000);     // 7:30 AM
        
        System.out.println ("Created three times: \n" +
            t1 + "\n" +
            t2 + "\n" +
            t3);
        System.out.print ("Enter a time: Hour = ");
        int hour = keyboard.nextInt();
        System.out.print ("Enter a time: Minute = ");
        int minute = keyboard.nextInt();
        System.out.print ("Enter a time: Second = ");
        int second = keyboard.nextInt();
 
  }
    }

