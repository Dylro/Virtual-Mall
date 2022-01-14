import java.io.*;
public class shoppingstoreupdates
{
    public static void main()throws IOException
    {
        int cn;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("***********McKINLEY MALL SHOPPING STORES************");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">>>>>>>>>>>###LIST OF SHOPPING STORES###<<<<<<<<<<<<<<<<");
        System.out.println("NAME OF STORE           |          CATEGORY OF SELLING ITEMS");
        System.out.println("FOREVER 21              |          MEN'S AND WOMEN'S APPARELL");
        System.out.println("MANGO                   |          FORMAL WEAR");
        System.out.println("JUICYJ                  |          FOOTWEAR");
        System.out.println("RANGMANCH               |          MEN'S AND WOMEN'S ETHNIC WEAR");
        System.out.println("KOHINOOR                |          JEWELLERY");
        System.out.println("RELIANCE TRENDZ         |          MEN'S AND WOMEN'S APPARELL");
        System.out.println("CROMA                   |          ELECTRONIC APPLIANCES");
        System.out.println("LG                      |          TELEVISIONS AND PHONES");
        System.out.println("TINY TOTS               |          TOYS ");
        System.out.println("ARCHIES                 |          GIFTS AND GREETING CARDS");
        System.out.println("ADDIDAS                 |          SPORTS GOODS");
        System.out.println("CATWALK                 |          FOOTWEAR");
        System.out.println("KANYAL JEWELLERY        |          JEWELLERY");        
         int ch;
        System.out.println(">>>>>>WHAT SHOPPING STORE UPDATES WOULD YOU LIKE TO ACCESS?<<<<<<<");
        System.out.println("1:LIST OF RECENTLY RESTOCKED STORES");
        System.out.println("2:LIST OF UPCOMING STORES TO BE RESTOCKED");
        System.out.println("3:LIST OF STORES OFFERING DISCOUNTS AND VOUCHERS");
        System.out.println(">>ENTER YOUR CHOICE NUMBER TO PROCEED FURTHER<<");
        ch=Integer.parseInt(in.readLine());
        switch(ch)
        {
            case 1:
            System.out.println("~~~~~~~~~LIST OF RESTOCKED STORES~~~~~~~~~~~~~");
            System.out.println(">>>LIST OF STORES<<<<");
            System.out.println("#TINY TOTS");
            System.out.println("#CATWALK ");
            System.out.println("#ADDIDAS ");
            System.out.println("#FOREVER 21");
            System.out.println("#KANYAL JEWELLERY");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  ");
            System.out.println("****************THANK YOU FOR VISITING*************");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
            break;
            case 2:
            System.out.println("~~~~~~~~~LIST OF UPCOMING STORES TO BE RESTOCKED WITHIN A WEEK~~~~~~~~~~~");
            System.out.println(">>>>>>>LIST OF STORES<<<<<<<<");
            System.out.println("# ARCHIES");
            System.out.println("# RAHUL ELECTRONICS");
            System.out.println("# KOHINOOR");
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
            break;
            case 3:
            System.out.println("~~~~~~~~LIST OF STORES OFFERING EXCLUSIVE DISCOUNTS AND VOUCHERS~~~~~~");
            System.out.println("*NOTE:OFFERS FOR LIMITED TIME PERIODS,HURRY AND GRAB THEM ALL!!! ;) ");
            System.out.println("NAME OF STORE               OFFER[VOUCHER/RANGE OF DISCOUNT ON SELECTIVE ITEMS]");
            System.out.println("FOREVER 21                  10-15% DISCOUNT");
            System.out.println("RANGMANCH                   SPEND UPTO Rs.2000 AND GET A RS.500 WORTH FREE THAI MASSAGE VOUCHER FREE!");
            System.out.println("CATWALK                     20% DISCOUNT");
            System.out.println("MANGO                       15-30% DISCOUNT");
            System.out.println("JUICYJ                      20-25% DISCOUNT");
            System.out.println("  ");
            System.out.println(">>>>>WHAT WOULD YOU LIKE TO DO NOW?<<<<");
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
            break;
            default:
            System.out.println("invalid choice....");
        }
    }
            
            
            
        
        
            }

        
               
        
        