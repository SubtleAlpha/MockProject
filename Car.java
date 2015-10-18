public class Car
{
   private IEngine engine;
   private IComputer computer;
   
   public Car(IEngine engine, IComputer computer)
   {
      this.engine = engine;
      this.computer = computer;
   }
   public boolean start()
   {
      computer.start();
      engine.start();
   }
   public boolean stop()
   {
      computer.stop();
      engine.stop();
   }
}
