interface Vehicles
{
    void Start( );
    void Stop( );
}
class Car implements Vehicles
{
    public void Start ( )
    {
        System.out.println("Car is Starting --->");
    }
    public void Stop( )
    {
        System.out.println("Car is Stopping --->");
    }
}
class Bike implements Vehicles
{
    public void Start ( )
    {
        System.out.println("Bike is Starting --->");
    }
    public void Stop( )
    {
        System.out.println("Bike is Stopping --->");
    }
}
public class Vehicle
{
    public static void main (String[ ] args)
    {
        Vehicles Car = new Car ( );
        Vehicles Bike = new Bike ( );
        Car.Start ( );
        Car.Stop ( );
        Bike.Start ( );
        Bike.Stop ( );
    }
}