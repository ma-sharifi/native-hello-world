import java.util.Date;

public class StaticTime
{
  static final Date TIME = new Date();

  public static void main(String[] args)
  {
    System.out.println("The static time is: "+TIME.getTime());
  }
}
