import java.util.Date;
//https://foivos.zakkak.net/tutorials/working-with-randoms-native-images/
//native-image --initialize-at-build-time=Main
//native-image --initialize-at-build-time=Main --no-fallback Main
//native-image --initialize-at-run-time=Main Main
//native-image --initialize-at-build-time=Main Main -H:+ReportExceptionStackTraces
public class Main
{
//  static Random random = new Random();
static {
  System.out.println("Hello from the static initializer!");
}

   static final Date TIME = new Date();
  public static void main(String[] args)
  {
    System.out.println("Hello world " + TIME.getTime() + " !");

    System.out.println("Hello world " + new Date().getTime() + " !");


//    System.out.println("Hello world " + MainSubstitutions.random.nextInt(100) + " !");
//    System.out.println("Hello world " + new Random().nextInt(100) + " !");
  }
}
//for ((i=0; i<=10; i++)); do
//    java Main
//    done

//for ((i=0; i<=10; i++)); do
//    ./Main;
//  done