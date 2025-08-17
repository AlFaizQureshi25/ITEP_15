// Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.
class Flight{
    private String flight;

    public Flight(String flight){
        this.flight=flight;
    }

    public void setFlight(String flight){
        this.flight=flight;
    }

    public String getFlight(){
        return this.flight;
    }

}
class Hotel{
    private String hotel;

    public void Hotel(String hotel){
        this.hotel=hotel;
    }

    public void setHotel(String hotel){
        this.hotel=hotel;
    }

    public String getHotel(){
        return this.hotel;
    }

}
class Reservation{
    public void bookHotel(){

    }
    public void bookFlight(){

    }
    public void cancelFlight(){

    }
    public void cancelHotel(){

    }

}
class Test{
    public static void main(String args[]){
        Flight f1=new Flight("rakesh");
        Hotel h1=new Hotel("gurukripa");


    }

}