import java.io.*;
public class salon
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a,cn,b,day,t;
        long ph;
        String g,m="male",f="female",name;
        System.out.println("\f");
        
        System.out.println("************WELCOME TO CUTZ AND CURLZ SALON***********");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("GET YOU HAIR CHOPPED IN STYLE FOR PRICES RANGING ONLY FROM Rs.150-Rs.250");
        System.out.println("                                                      ");
        System.out.println(">>>WOULD YOU LIKE TO HAVE A LOOK AT THE LIST OF SIZZLING HAIRSTYLES WE OFFER?(1/2)<<<");
        System.out.println("enter '1' to proceed '2' to abort");
        a=Integer.parseInt(in.readLine());
        if(a==1)
        {
            System.out.println(">>>ENTER YOUR GENDER(male/female)<<<");
            g=in.readLine();
            if(g.equals(m))
            {
                 System.out.println("NAME OF HAIRSTYLE              PRICE[Rs.]");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("BOWL CUT                       150");
                System.out.println("CREW CUT                       200");
                System.out.println("TAPERED NAPE                   150");
                System.out.println("REGULAR TRIM                   150");
                System.out.println("HIGH AND TIGHT RACON CUT       250");
                System.out.println("BOX CUT                        230");
                System.out.println("MILITIARY CUT                  230");
                System.out.println("MOHAWK                         230");
                System.out.println("UNDER CUT                      230");
                System.out.println("                                      ");
                System.out.println(">>>WOULD YOU LIKE TO TAKE AN APPOINTMENT?<<<");
                System.out.println("**ENTER '1' TO PROCEED AND '2' TO QUIT**");
                b=Integer.parseInt(in.readLine());
                if(b==1)
                {
                    System.out.println("***************CURRENTLY AVAILABLE DAYS********************");
                    System.out.println("#1.WEDNESDAY");
                    System.out.println("#2.THURSDAY");
                    System.out.println("#3.FRIDAY");
                    System.out.println("#4.SATURDAY");
                    System.out.println("#5.SUNDAY");
                    System.out.println(">>>>>>>>ENTER YOUR CHOICE NUMBER<<<<<<<<");
                    day=Integer.parseInt(in.readLine());
                    if((day>0)&&(day<=5))
                     {
                      System.out.println("***************CURRENTLY AVAILABLE TIMINGS********************");
                    System.out.println("#1. 11:00AM-11:40AM");
                    System.out.println("#2. 12:00-12:40AM");
                    System.out.println("#3. 4:00PM-5:PM");
                    System.out.println("#4. 5:00PM-6:00PM");
                    System.out.println(">>>>>>>>>ENTER YOUR CHOICE NUMBER<<<<<<<<<");
                    t=Integer.parseInt(in.readLine());
                    if((t>0)&&(t<=4))
                    {
                        System.out.println("***ENTER YOUR NAME****");
                        name=in.readLine();
                        System.out.println("*****ENTER YOUR CONTACT NUMBER******");
                        ph=Long.parseLong(in.readLine());
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("*********APPOINTEMNT CONFIRMED********");
                        System.out.println("******THANK YOU FOR VISITING****");
                        System.out.println(" ");
                          System.out.println("WHAT WOULD YOU LIKE TO DO NOW?");
                       System.out.println("#1.RETURN TO HOME PAGE");
                      System.out.println("#2.QUIT");
                     System.out.println("ENTER YOUR CHOICE NUMBER(1/2)");;
                     cn=Integer.parseInt(in.readLine());
                       if(cn==1)
                       {
                     McKinley_mall ob=new McKinley_mall();
                    ob.main();
                    }
                    else if(cn==2)
        {
            Exit ob11=new Exit();
            ob11.ty();
        }                 
        }
                    else
                    {
                        System.out.println("**invalid choice**");
                    }
                       
                        }
                        else
                        {
                            System.out.println("***invalid choice****");
                        }
                    
                }
                 else if(b==2)
                 {
                      System.out.println("****NO PROBLEM,COME NEXT TIME***");
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     System.out.println("WHAT WOULD YOU LIKE TO DO NOW?");
                       System.out.println("#1.RETURN TO HOME PAGE");
                      System.out.println("#2.QUIT");
                     System.out.println("ENTER YOUR CHOICE NUMBER(1/2)");;
                     cn=Integer.parseInt(in.readLine());
              if(cn==1)
                    {
                 McKinley_mall ob=new McKinley_mall();
                    ob.main();
                    }
                    else if(cn==2)
        {
            Exit ob11=new Exit();
            ob11.ty();
        }
                    
                }
                else
                {
                    System.out.println("**invalid choice**");
                }
                
                
                
            }
            else if(g.equals(f))
            {
                 
                System.out.println("                                      ");
                System.out.println(">>>WOULD YOU LIKE TO TAKE AN APPOINTMENT?<<<");
                 System.out.println("NAME OF HAIRSTYLE              PRICE[Rs.]");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("LAYERS                         200");
                System.out.println("TAPERING CUT                   150");
                System.out.println("FRINGE AND LAYERS COMBO        250");
                System.out.println("SIDE FLICKS                    150");
                System.out.println("BOB CUT                        175");
                System.out.println("MUSHROOM CUT                   200");
                System.out.println("REGULAR TRIM                   150");                             
                System.out.println("BANGS                          175");
                System.out.println("CROP CUT                       150");
                System.out.println("HIME CUT AND STEP CUT COMBO    250");
                System.out.println("PIXIE  CUT                     230");
                System.out.println("SHAGGY BOB CUT                 230");
                System.out.println("                                        ");
                System.out.println("**ENTER '1' TO PROCEED AND '2' TO QUIT**");
                b=Integer.parseInt(in.readLine());
                if(b==1)
                {
                    System.out.println("***************CURRENTLY AVAILABLE DAYS********************");
                    System.out.println("#1.WEDNESDAY");
                    System.out.println("#2.THURSDAY");
                    System.out.println("#3.FRIDAY");
                    System.out.println("#4.SATURDAY");
                    System.out.println("#5.SUNDAY");
                    System.out.println(">>>>>>>>ENTER YOUR CHOICE NUMBER<<<<<<<<");
                    day=Integer.parseInt(in.readLine());
                    if((day>0)&&(day<=5))
                     {
                      System.out.println("***************CURRENTLY AVAILABLE TIMINGS********************");
                    System.out.println("#1. 11:00AM-11:40AM");
                    System.out.println("#2. 12:00-12:40AM");
                    System.out.println("#3. 4:00PM-5:PM");
                    System.out.println("#4. 5:00PM-6:00PM");
                    System.out.println(">>>>>>>>>ENTER YOUR CHOICE NUMBER<<<<<<<<<");
                    t=Integer.parseInt(in.readLine());
                    if((t>0)&&(t<=4))
                    {
                        System.out.println("***ENTER YOUR NAME****");
                        name=in.readLine();
                        System.out.println("*****ENTER YOUR CONTACT NUMBER******");
                        ph=Long.parseLong(in.readLine());
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("*********APPOINTEMNT CONFIRMED********");
                        System.out.println("******THANK YOU FOR VISITING****");
                        System.out.println(" ");
                          System.out.println("WHAT WOULD YOU LIKE TO DO NOW?");
                       System.out.println("#1.RETURN TO HOME PAGE");
                      System.out.println("#2.QUIT");
                     System.out.println("ENTER YOUR CHOICE NUMBER(1/2)");;
                     cn=Integer.parseInt(in.readLine());
              if(cn==1)
                    {
McKinley_mall ob=new McKinley_mall();
                    ob.main();
                    }
                    else if(cn==2)
        {
            Exit ob11=new Exit();
            ob11.ty();
        }
       }
                    else
                    {
                        System.out.println("**invalid choice**");
                    }
                       
                        }
                        else
                        {
                            System.out.println("***invalid choice****");
                        }
                    
                }
                 else if(b==2)
                 {
                      System.out.println("****NO PROBLEM,COME NEXT TIME***");
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     System.out.println("WHAT WOULD YOU LIKE TO DO NOW?");
                       System.out.println("#1.RETURN TO HOME PAGE");
                      System.out.println("#2.QUIT");
                     System.out.println("ENTER YOUR CHOICE NUMBER(1/2)");;
                     cn=Integer.parseInt(in.readLine());
              if(cn==1)
                    {
             McKinley_mall ob=new McKinley_mall();
                    ob.main();
                    }
                    else if(cn==2)
        {
            Exit ob11=new Exit();
            ob11.ty();
        }
                    
                }
                else
                {
                    System.out.println("**invalid choice**");
                }
                }
            else
            {
                System.out.println("****invalid choice****");
            }
          }
        else if(a==2)
        {
            System.out.println("****NO PROBLEM,COME NEXT TIME***");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 System.out.println("WHAT WOULD YOU LIKE TO DO NOW?");
              System.out.println("#1.RETURN TO HOME PAGE");
              System.out.println("#2.QUIT");
              System.out.println("ENTER YOUR CHOICE NUMBER(1/2)");;
              cn=Integer.parseInt(in.readLine());
              if(cn==1)
                    {
                  McKinley_mall ob=new McKinley_mall();
                    ob.main();
                    }
                    else if(cn==2)
        {
            Exit ob11=new Exit();
            ob11.ty();
        }
    
        else
        System.out.println("Invalid Choice");
    }           
        
        else        
            System.out.println("****INVALID CHOICE*****");
        
    }
}
        