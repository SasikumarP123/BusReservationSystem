package June;

class Busbook 
{

	 private String Name;
	    private int Age;
	    private String From;
	    private String To;
	    private int Seatno;
	    private int BusNo;	   
	    public String Status;
	   

		Busbook() 
		{
			this.BusNo=BusNo;
	        this.From=From;
	        this.To=To;
	        this.Name=Name;
	        this.Age=Age;
	       
	        			
		}


		public String getStatus()
	    {
	        return Status;
	    }

	    public void setStatus(String status) 
	    {
	        Status = status;
	    }

	    public int getSeatno()
	    {
	        return Seatno;
	    }

	    public void setSeatno(int seatno) 
	    {
	    	this.Seatno = seatno;
	    }
	    
	    public String getName() 
	    {
	        return Name;
	    }

	    public void setName(String Name) 
	    {
	        this.Name = Name;
	    }

	    public int getAge() 
	    {
	        return Age;
	    }

	    public void setAge(int Age)
	    {
	        this.Age = Age;
	    }

	    public String getFrom() 
	    {
	        return From;
	    }

	    public void setFrom(String From) 
	    {
	        this.From = From;
	    }

	    public String getTo() 
	    {
	        return To;
	    }

	    public void setTo(String To) 
	    {
	        this.To = To;
	    }

	    public int getBusNo() 
	    {
	        return BusNo;
	    }

	    public void setBusNo(int BusNo) 
	    {
	        this.BusNo = BusNo;
	    }
	}


