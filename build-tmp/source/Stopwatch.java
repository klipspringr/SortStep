
public class Stopwatch {
  private long start;
  private long stop;
  public void start()
    /* begins keeping track of time */
  {
    //your code here
    start = System.nanoTime();
  }
  public void stop()
    /* stops keeping track of time */
  {
    //your code here
    stop = System.nanoTime();
  }
  public long elapsedTime()
    /* uses System.out to display the elapsed time in seconds */
  {
    // Replace the following line with your code
    long temp = stop - start;
    return temp;
  }
  public void reset()
    /* resets the elapsed time to 0 */
  {
    //your code here
    start = 0;
    stop = 0;
  }
}

