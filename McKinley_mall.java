import java.io.*;
public class McKinley_mall
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a,b,n,c,g;
        String s;
        System.out.println("*****WELCOME TO McKINLEY MALL SERVICES******");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                                   ");
        System.out.println(">>>>>WHAT SERVICE WOULD YOU LIKE TO ACCESS?<<<");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1.STAY TUNED WITH SHOPPING STORES UPDATES");
        System.out.println("2.GRANDVIEW CINEMAS MOVIE TICKET BOOKING AND SNACKBAR ORDERING");
        System.out.println("3.BEAUTY SERVICES");
        System.out.println("4.MINI-GAMING POINT ");
        System.out.println("5.SNEAK A PEAK AT THE MINI-BOOKSTORE UPDATES");
        System.out.println("6.REGISTER FOR THE TALENT SHOW ");
        System.out.println("7.LIVE BAND 'BOOMTOWN SPICE-CATS ' PERFORMANCE UPDATES AND INFO");
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                 ");
        System.out.println("*****ENTER YOUR CHOICE NUMBER*******");     
        
        n=Integer.parseInt(in.readLine());
        switch(n)
        {
            case 1:
            shoppingstoreupdates ob=new shoppingstoreupdates();
            ob.main();
            break;
            case 2:
            movieandsnackbar ob1=new movieandsnackbar();
            ob1.main();
            ob1.cancel();       
            break;
            case 3:
            System.out.println("WHICH OF OUR BEAUTY SERVICES WOULD YOU LIKE TO HAVE ACCESS TO?");
            System.out.println("1.CUTZ AND CURLZ SALON ");
            System.out.println("2.CLOUD9 DIVINE BLISS MINI-SPA");
            System.out.println(">>ENTER YOUR CHOICE NUMBER(1/2)<<");
            c=Integer.parseInt(in.readLine());
            if(c==1)
            {
            salon ob2=new salon();
            ob2.main();
        }
            if(c==2)
            {
            spa ob3=new spa();
            ob3.main();
        }
        
        break;
        case 4:
        System.out.println("************WELCOME TO McKinley_mall MINI-GAMING POINT***********");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        System.out.println("WHICH GAME WOULD YOU LIKE TO PLAY?");
        System.out.println("1#HANGMAN ");
        System.out.println("2#GENRAL KNOWLEDGE MINI-QUIZ");
        System.out.println("ENTER YOUR CHOICE NUMBER(1/2)");
        g=Integer.parseInt(in.readLine());
        if(g==1)
        {
            Hangman ob4=new Hangman();
            ob4.clearScreen();
            ob4.Hang1();
            ob4.Hang2();
            ob4.Hang3();
            ob4.Hang4();
            ob4.Hang5();
            ob4.Hang6();
            ob4.Hang7();
            ob4.Sports();
            ob4.Movies();
            ob4.Computers();
            ob4.Food();
            ob4.Countries();
            ob4.main();
        }
        if(g==2)
         {
             miniquiz ob5=new miniquiz();
             ob5.main();
            }
            break;
            case 5:
            library ob6=new library();
            ob6.main();
            break;
            case 6:
            talenttheater ob7=new talenttheater();
            ob7.main();
            break;
            case 7:
            live_band ob8=new live_band();
            ob8.main();
            break;
            default:
            System.out.println("invalid choice");         
     }
}
}

            
            
            
            
            
            
            
           
            