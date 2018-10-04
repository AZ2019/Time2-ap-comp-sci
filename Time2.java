public class Time2
{
    double Time;
    int Hours;
    int Mins;
    int Secs;
    int totalSeconds;
    
    
    //private instance variables
    private int hour;
    private int minute; 
    private int second;
    private int totalSec;
    /**
     * Constructors for the class Time2
     */
    public Time2 (int h, int m, int s)
        {
            hour = h;
            minute= m;
            second= s;
        }
        
    public Time2 (int h, int m)
    {
          hour = h;
          minute = m;
        }
        
    public Time2 (int theTotalSeconds)
    {
          totalSec = theTotalSeconds;
        }
    //-----------Accessor methods----------
    public int getHours()
    {
        return hour;
    }
    
    public int getMins()
    {
        return minute;
    }
    
    public int getSecs()
    {
        return second;
    }
    
    public int getTotalSecs()
    {
        return hour * 3600 + minute * 60 + second;
    }
    //---------Other Methods---------
    public String toString ()
    {
        if (minute < 10 && second < 10)
        {
            String ans = hour + ":0" + minute + ":0" + second;
            return ans;
       }
       if (second < 10)
        {
            String ans = hour + ":" + minute + ":0" + second;
            return ans;
       }
        if (minute < 10)
        {
        String ans = hour + ":0" + minute + " :" + second;
        return ans;
       }   
       else
       {String ans = hour + ":" + minute + ":" + second;
        return ans;
       }      
    }

    public static boolean isValidTime (int hour, int minute, int second)
    {
         if (hour < 24 && hour >= 0 && minute < 60 && minute >= 0 && second < 60 && second >= 0)
         {
             return true;
            }
         else 
         {
             return false;
            }
        }
        
    public static boolean isValidTime (int hour, int minute)
    {
        if (hour < 24 && hour >= 0 && minute < 60 && minute >= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int compareTo(Time2 other)
    {
        return (this.getTotalSecs() - other.getTotalSecs());
    }
    
    private String write2digits (int n) 
    {
        if (n < 10) 
        {
            return "0" + n;
        }
        else 
        {
            return "" + n;
        }
    }

}  