import java.io.*;
public class library
{
    public static void main()throws IOException
    {
      InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
       int a,n,cn;
       long ph;
       String an,y="yes",b,adrs;
        System.out.println("*******WELCOME TO BOOK-FORT MINI-BOOKSTORE INFO AND UPDATES CENTER*********");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("         ");
        System.out.println("WHAT INFORMATION AND SERVICE WOULD YOU LIKE TO ACCESS?");
        System.out.println("#1.HAVE A LOOK AT RECENTLY STOCKED BOOKS ");
        System.out.println("#2.HAVE A LOOK AT POPULARLY PURCHASED limited BOOKS STOCK   ");
        System.out.println("ENTER YOUR CHOICE NUMBER(1/2)");
        a=Integer.parseInt(in.readLine());
        if(a==1)
        {
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          System.out.println("SR.NO NAME OF BOOK                   AUTHOR                 TYPE                       PRICE[Rs.]");
          System.out.println("1.    THE PRINCESS DIARIES SERIES   MEG CABOT              LIGHT-PLOTTED FICTION         250");
          System.out.println("2.    WEBSTER GRAMMAR GUIDE         WEBSTER PUBLICATIONS   EDUCATION AND REFERENCE       250");
          System.out.println("3.    ROBINSON CRUSOE               DANIEL DEFOE           FICTION                       250");
          System.out.println("4.    THE TALE OF TWO CITIES        CHARLES DICKSON        TRAGIC-FICTION                340");
          System.out.println("5.    AND THE MOUNTAINS ECHOED      KHALED HOSSEINI        MORAL-FICTION                 270");
          System.out.println("6.    DREAM SOUL                    ROBERT MOSS            MORAL-FICTION                 175");
          System.out.println("7.    PINK OR BLACK                 TISHAA                 LIGHT-PLOTTED FICTION         250");
          System.out.println("8.    MY DREAM FOR THE NATION       RABINDRANATH TAGORE    PATRIOTIC                     175"); 
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" ");
            System.out.println("*NOTE:ABOVE STOCKED BOOKS ARE IN DEMAND AND POPULAR,GRAB THEM BEFORE THEIR SOLD OUT,HURRY!!!");
            System.out.println(" ");
            System.out.println("WOULD YOU LIKE TO PURCHASE ANY BOOK FROM THE ABOVE LIST?");
            an=in.readLine();
            if(an.equalsIgnoreCase(y))
            {
                System.out.println("ENTER YOUR CHOICE NUMBER");
                n=Integer.parseInt(in.readLine());
                if((n>0&&n<=8))
                {
                    System.out.println("ENTER YOUR NAME");
                    b=in.readLine();
                    System.out.println("ENTER YOUR CONTACT NUMBER");
                    ph=Long.parseLong(in.readLine());
                    System.out.println("ENTER YOUR ADDRESS");
                    adrs=in.readLine();
                    System.out.println("\f");
                    System.out.println("YOUR ORDER IS CONFIRMED");
                    System.out.println("**>>>>YOUR BOOK WILL BE DELIVERED AT YOUR RESIDENCE WITHIN 72 HOURS MAX<<<**");
                    System.out.println(">>FOR ANY QUERIES AND ISSUES__ CONTACT :289334535/9834564309;<<");
                    System.out.println("*******THANK YOU FOR VISITING*****");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
                
                System.out.println("YOUR CHOICE IS INVALID");
            
            }
            else
            {
                System.out.println("NO PROBLEM :)");
            System.out.println("YOU CAN ALSO VISIT THE BOOK-FORT MINI-BOOKSTORE AT YOUR_WORLD MINI-MALL FOR A BOOK PURCHASE");
            System.out.println(">>LOCATION:2ND FLOOR;OPPOSITE GRANDVIEW CLASSIC CINEMAS<<");
            System.out.println("    ");
            System.out.println("**********THANK YOU FOR VISITING**********");
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
      }
        if(a==2)
        {
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("SR.NO NAME OF BOOK                      AUTHOR                 TYPE                       PRICE[Rs.]");
            System.out.println("1.    STORY OF MY LIFE                  SACHIN TENDULKAR      AUTOBIOGRAPHY               250");
            System.out.println("2.    MY SECRET CRICKET TIPS            SUNIL GAVASKAR        SPORTS                      250");
            System.out.println("3.    MYSTERY OF THE BERMUDA TRIANGLE   TONY STARK            SCI-FI                      250");
            System.out.println("4.    THE FAULT IN OUR STARS            JOHN GREEN            TRAGIC-FICTION              340");
            System.out.println("5.    THE SCARLET PIMPERNAL             RUSKIN BOND          MORAL-FICTION                270");
            System.out.println("6.    DREAM SOUL                        ROBERT MOSS          MORAL-FICTION                175");
            System.out.println("7.    PINK OR BLACK                     TISHAA               LIGHT-PLOTTED FICTION        250");
            System.out.println("8.    DIARY OF ANNE FRANK               ANNE FRANK           AUTOBIOGRAPHY                175"); 
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("    ");
            System.out.println("**note:above listed stock of books in demand and limited,buy soon before they vanish!!!");
            System.out.println(" ");
            System.out.println("WOULD YOU LIKE TO PURCHASE ANY BOOK FROM THE ABOVE LIST?");
            an=in.readLine();
            if(an.equals(y))
            {
                System.out.println("ENTER YOUR CHOICE NUMBER");
                n=Integer.parseInt(in.readLine());
                if((n>0&&n<=8))
                {
                    System.out.println("ENTER YOUR NAME");
                    b=in.readLine();
                    System.out.println("ENTER YOUR CONTACT NUMBER");
                    ph=Long.parseLong(in.readLine());
                    System.out.println("ENTER YOUR ADDRESS");
                    adrs=in.readLine();
                    System.out.println("\f");
                    System.out.println("YOUR ORDER IS CONFIRMED");
                    System.out.println("**>>>>YOUR BOOK WILL BE DELIVERED AT YOUR RESIDENCE WITHIN 72 HOURS MAX<<<**");
                    System.out.println(">>FOR ANY QUERIES AND ISSUES__ CONTACT :289334535/9834564309;<<");
                    System.out.println("*******THANK YOU FOR VISITING*****");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
                
                System.out.println("YOUR CHOICE IS INVALID");
            }
            
            }
            else
            {
                System.out.println("NO problem :)");
            System.out.println("YOU CAN ALSO VISIT THE BOOK-FORT MINI-BOOKSTORE AT YOUR_WORLD MINI-MALL FOR A BOOK PURCHASE");
            System.out.println(">>LOCATION:2ND FLOOR;OPPOSITE GRANDVIEW CLASSIC CINEMAS<<");
            System.out.println("    ");
            System.out.println("**********THANK YOU FOR VISITING**********");
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
       if(a>2)
        System.out.println("invalid choice");
    }
    else
    {
        System.out.println("*********YOUR CHOICE IS INVALID**********");
    }
}
}

            
            
            
            
            
            
        