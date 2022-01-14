import java.io.*;
public class spa
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int c,a,num,day,t,cn;
        String name;
        long ph;      
        System.out.println("**************WELCOME TO CLOUD9 DIVINE BLISS MINI-SPA***************");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("WOULD YOU LIKE TO SNEAK A PEAK AT THE SERVICES WE OFFER?");
        System.out.println(">>>ENTER '1' TO PROCEED AND '2' TO QUIT<<<");
        c=Integer.parseInt(in.readLine());
        if(c==1)
        {
            System.out.println(" ");
            System.out.println(" SR.NO   SERVICE                PRICE[RS.]");
            System.out.println(" 1.        THAI MASSAGE         500        ");
            System.out.println(" 2.        HYDRO MASSGAGE       500        ");
            System.out.println(" 3.        MANICURE             300        ");
            System.out.println(" 4.        PEDICURE             300        ");
            System.out.println(" 5.        AROMATHERAPTHY       400        ");
            System.out.println(" 6.        BAMBOO MASSAGE       600        ");
            System.out.println(" 7.        BODY WRAPS           500        ");
            System.out.println(" 8.        FACIAL               450        ");
            System.out.println(" 9.        REFLEXOLOGY          999        ");
            System.out.println(" 10        HOT STONE MASSAGE    1200       ");
            System.out.println(" 11.        SWEDDISH MASSAGE    1200       ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" ");
            System.out.println("WOULD YOU LIKE TO TAKE AN APPOINTMENT?");
            System.out.println(">>>>ENTER '1' TO PROCEED AND '2' TO QUIT<<<<<<");
            a=Integer.parseInt(in.readLine());
            if(a==1)
            {
                System.out.println("ENTER YOUR CHOICE NUMBER");
                num=Integer.parseInt(in.readLine());
                 if(num>11)
                {
                    
                System.out.println("invalid choice");
                }
               
                if(num<=11)
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
        else
        {
            System.out.println("***invalid choice***");
        }
            }
            else
            {
                System.out.println("****invalid choice***");
            }
        }
        else
        {
            System.out.println("**invalid choice**");
        }
    }
}
    
            else if(a==2)
            {
                System.out.println("****NO PROBLEM,COME NEXT TIME***");
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     System.out.println("WHAT WOULD YOU LIKE TO DO NOW?");
                       System.out.println("#1.RETURN TO HOME PAGE");
                      System.out.println("#2.QUIT");
                     System.out.println("ENTER YOUR CHOICE NUMBER(1/2)");
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
                {
                    System.out.println("**invalid choice**");
                }
         }
        else
        {
            System.out.println("***invalid choice***");
        }
    }
        else if(c==2)
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
                {
                    System.out.println("**invalid choice**");
                }
            }
            else
        {
            System.out.println("**invalid choice**");            
        }
    }
}

        
        
        
        