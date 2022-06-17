package June;

import java.util.ArrayList;
import java.util.Scanner;


public class BusReservationSystem extends Busdetails
{
				
	
	 	int c=1;
		ArrayList<Busbook> book=new ArrayList<Busbook>();		
		Scanner s = new Scanner(System.in); 
		
		public void book() 
		{
			int ch;
			
					System.out.println("----Welcome to Bus Reservation System---- \n");
						System.out.println("Enter Your Choice: ");
						System.out.println("1.Booking Ticket");
						System.out.println("2.Display");
						System.out.println("3.Search");
						System.out.println("4.Cancel Ticket");
						System.out.println("5.Seat Availability");
			
				do {				
						ch=s.nextInt();	
						
					switch(ch)
					{			   
						
						case 1:		
		
							Busbook b=new Busbook();
							
												
							System.out.println("Enter Passengers Details :\n");
							System.out.println("Bus Number :");
			                   b.setBusNo(s.nextInt());
			                   System.out.println("Name :");
			                   b.setName(s.next());
			                   System.out.println("Age :");
			                   b.setAge(s.nextInt());
			                   System.out.println("Travel From:");
			                   b.setFrom(s.next());
			                   System.out.println("Travel To:");
			                   b.setTo(s.next()); 
							
							
			                   System.out.println("...Booking status....\n");
			                   			                   
			                   boolean Booked = SeatAvailabilty(b.getBusNo());
			                   
			                   if (Booked)
			                   {
			                       b.setStatus("Confirmed");
			                       b.setSeatno(c++);
			                       System.out.println("Your Seat no is :  "+b.getSeatno());							
					                  
			                       System.out.println("Your Booking confirmed....");
			                       System.out.println("Happy Journy..."); 
			                       
			                   } 
			                   
			                   else 
			                   {
			                       b.setStatus("Cancelled");
			                       System.out.println("Your Booking not confirmed....");
			                       
			                   }
			                  
			                 			                  
			                  book.add(b);
			                  
			                  break;
			                  
						case 2:
							
	                	  System.out.println("Ticket Details....");
	                      
	                      int Seatno;
	                      System.out.println("Enter The Seat no...");
	                      Seatno=s.nextInt();	 
	                      
	                     for(Busbook p:book)
	                      {
	                          if(Seatno==p.getSeatno())
	                          {
	                        	  System.out.println("Bus No: "+p.getBusNo());
	                              System.out.println("Passenger Name: "+p.getName());
	                              System.out.println("Passenger Age: "+p.getAge());
	                              System.out.println("Travelling from: "+p.getFrom());
	                              System.out.println("Travelling To: "+p.getTo());
	                              System.out.println("Seat No: "+p.getSeatno());
	                              System.out.println("Booking Status: "+p.getStatus());
	                              
	                          }
	                          		                      
		                      else if(Seatno!=p.getSeatno()) 
		                      {
		                      
		                          System.out.print("Result not found \n");
		                      }
		                      
	                          System.out.println();
		                   } 
	                     
	                     break; 
	                     
		                   
						case 3:
							
		            	 System.out.println("3.Search Ticket\n");
							boolean bus=false;
							System.out.println("Enter  Seat no to search:\n");
							Seatno=s.nextInt();
							for(Busbook p:book)
	                          {
	                              if(Seatno==p.getSeatno())
	                              {
	                            	  System.out.println("Bus No: "+p.getBusNo());
	                                  System.out.println("Passenger Name: "+p.getName());
	                                  System.out.println("Passenger Age: "+p.getAge());			                                  
	                                  System.out.println("Travelling from: "+p.getFrom());
	                                  System.out.println("Travelling To: "+p.getTo());
	                                  System.out.println("Seat No: "+p.getSeatno());
	                                  System.out.println("Booking Status: "+p.getStatus());
	                              }
	                          
			                      else if(Seatno!=p.getSeatno())
			                      {
			                          System.out.print("Ticket not found.. \n");
			                      }
	                              
	                              System.out.println();
	                              
	                          }
							
							break;
							
							case 4:
			            	 System.out.println("4.Cancel Ticket\n");
			            	 System.out.println("Enter Seat no to cancel");
			            	 
			            	 Seatno = s.nextInt();
	                           for (Busbook p : book)
	                           {
	                               if (Seatno == p.getSeatno())
	                               {
	                                   p.setStatus("Cancelled");
	                                   
	                                   for (Mainbus s : list) 
	                                   {
	                                       if (p.getBusNo() == s.getBusNo())
	                                       {
	                                           s.setSeatcount(s.getSeatcount() + 1);
	                                           --c;
	                                           
	                                           System.out.println("Ticket Cancel Successfully ");
	                                       } 
	                                       
	     	                               

	                                   }
	                               }
	                               else if(Seatno!= p.getSeatno())
    	 		                      {
    	 		                      
    	 		                          System.out.print("This Seat no not found...\n\n ");
    	 		                      }
	                             
	                               
	                           }
	                           
	                           
	                           
			            	 break;
			            	 
							case 5: 
								
        	 
								System.out.println("Total Seat Availability....\n");		        	
				             			             
						         for(Mainbus a : list)
						             {
						                 System.out.println("Available seats: "+a.getSeatcount()+"Bus No"+a.getBusNo());
						             }
		             
						             break;
										
						}
										
									System.out.println("Enter the choice ");
				
					} while(ch!=0);
		
		                  	   
				
		}
		
		
		
		
		
		
		
		
		
		
		
		public boolean SeatAvailabilty(int busNo) 
  	    {
  	    	
  	    	int flag=0;	    	
  			
  				
					for (Mainbus a : list)
  					{
  					    if(busNo==a.getBusNo())
  					    {
  					        if(a.getSeatcount()>0)
  					        {
  					            a.setSeatcount(a.getSeatcount()-1);
  					            flag=1;

  					        }
  					    }

  					}return flag==1?true:false;
    	
  	    	}


	
	public static void main(String[] args)
	{
		BusReservationSystem bs=new BusReservationSystem();
		bs.setBuses();
		bs.book();
		
		
	}

	
		
}

	
	
		
				
	
				
				
						
				
				
				
			






	



	
	

