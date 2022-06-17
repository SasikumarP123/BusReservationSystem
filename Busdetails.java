package June;
import java.util.ArrayList;

class Mainbus
{
	private int BusNo;
    private int Seatcount; 

    

	 Mainbus (int BusNo, int Seatcount) 
	{

		 this.BusNo=BusNo;          
         this.Seatcount=Seatcount;
     
	}	

	public int getBusNo()
    {
        return BusNo;
    }

    public void setBusNo(int BusNo) 
    {
        this.BusNo = BusNo;
    }
  
    public int getSeatcount() 
    {
        return Seatcount;
    }

    public void setSeatcount(int Seatcount) 
    {
        this.Seatcount = Seatcount;
    }

}



 public class Busdetails implements Buses 
	{
	 
	 ArrayList <Mainbus> list =new ArrayList <Mainbus>();
	 
		@Override
		public void setBuses() 
		{
			 Mainbus bs= new Mainbus(1,30);
			    list.add(bs);
			
			
		}  
	   

		
	}




	


