import java.io.*;
public class miniquiz
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String a,y="yes";
        int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,cn;
        int t;t=0;
        System.out.println("\f");
        System.out.println(">>>>HEY GAMER , READY FOR A MINI-GK QUIZ?<<<<");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">>>>>>QUIZ GUIDE<<<<<");
        System.out.println("#1.NO.OF QUESTIONS---15");
        System.out.println("#2.MIXED VARIETIES OF QUESTION,WITH NO DISTINCT CATEGORY");
        System.out.println("#3.CHOOSING ONE OUT OF 4 OPTIONS IS COMPULSORY(AREH TRY TOH MAAR BOSS!)");
        System.out.println("#4.THINK HARD BCOS.......  ;)");
        System.out.println("#5.AT THE END OF THE QUIZ YOU WILL GET TO KNOW WHERE YOU STAND IN YOUR GENERAL KNOWLEDGE");
        System.out.println(" ");
        System.out.println(">>>>READY?(yes/no)<<<");
        a=in.readLine();
        if(a.equalsIgnoreCase(y))
        {
            System.out.println("\f");//clears screen for next window
            System.out.println("Question 1:WHICH IS THE BIGGEST PLANET IN THE SOLAR SYSTEM?");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:MARS");
            System.out.println("2:JUPITER");
            System.out.println("3:EARTH");
            System.out.println("4.PLUTO");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a1=Integer.parseInt(in.readLine());
            if(a1==2)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 2:WHO INVENTED THE TELEPHONE?");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:PASCAL");
            System.out.println("2:NEWTON");
            System.out.println("3:EINSTEIN");
            System.out.println("4.ALEXANDER GRAHAM BELL");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a2=Integer.parseInt(in.readLine());
            if(a2==4)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 3:WHICH IS THE PIGMENT THAT GIVES GREEN COLUR IN PLANTS?");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:CHLOROPHYLL");
            System.out.println("2:GREENOPHYLL");
            System.out.println("3:IODOPSIN");
            System.out.println("4.LEUCOPLAST");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a3=Integer.parseInt(in.readLine());
            if(a3==1)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 4:THE STUDY OF HUMAN HEART AND ITS DISEASES");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:PSYCHOLOGY");
            System.out.println("2:HEARTOLOGY");
            System.out.println("3:CARDIOLOGY");
            System.out.println("4.NEUROLOGY");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a4=Integer.parseInt(in.readLine());
            if(a4==3)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 5:NAME THE INDIAN BOXER ON WHOM A MOVIE BIOPIC WAS RECENTLY RELEASED[2014]");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:SACHIN TENDULKAR");
            System.out.println("2:YUVRAJ SINGH");
            System.out.println("3:MARY KOM");
            System.out.println("4.SANIA MIRZA");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a5=Integer.parseInt(in.readLine());
            if(a5==3)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 6:WHICH CRICKET TEAM IS ALSO CALLED THE PROTEAS");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:SOUTH AFRICA");
            System.out.println("2:INDIA");
            System.out.println("3:SRI LANKA");
            System.out.println("4.WEST INDIES");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a6=Integer.parseInt(in.readLine());
            if(a6==1)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 7:PIZZA IS THE TRADITIONAL STAPLE FOOD OF WHICH COOUNTRY");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:ITALY");
            System.out.println("2:AMERICA");
            System.out.println("3:BRAZIL");
            System.out.println("4.PAKISTAN");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a7=Integer.parseInt(in.readLine());
            if(a7==1)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 8:THE PLACE ON EARTH OF MAXIMUM CONCENTRATION OF VOLCANOES");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:LAKSHADWEEP ISLANDS");
            System.out.println("2:GULF OF KHAMBHAT");
            System.out.println("3:PACIFIC RING OF FIREY");
            System.out.println("4.NONE OF THE ABOVE");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a8=Integer.parseInt(in.readLine());
            if(a8==3)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 9:FOR WHICH OF THESE CATEGORIES IS THE NOBLE PRIZE 'NOT' GIVEN");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:MATHEMATICS");
            System.out.println("2:PHYSICS");
            System.out.println("3:CHEMISRTY");
            System.out.println("4.LITERATURE");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a9=Integer.parseInt(in.readLine());
            if(a9==1)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 10:WHICH IS THE NATIONAL GAME OF ENGLAND");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:BADMINTON");
            System.out.println("2:CRICKET");
            System.out.println("3:FOOTBALL");
            System.out.println("4.ICE HOCKEY");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a10=Integer.parseInt(in.readLine());
            if(a10==2)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 11:A MOVIE RELEASED IN 2014 ADAPTED FROM THE BOOK OF AN INDIAN WRITER");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:MARY KOM");
            System.out.println("2:FINDING FANNY");
            System.out.println("3:RAJA NATWARLAL");
            System.out.println("4:2 STATES");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a11=Integer.parseInt(in.readLine());
            if(a11==4)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 12:WHICH CELL OF THE HUMAN BODY CANNOT BE REPLACED");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:SKIN CELLS");
            System.out.println("2:BONE CELLS");
            System.out.println("3:BLOOD CELLS");
            System.out.println("4.BRAIN CELLS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a12=Integer.parseInt(in.readLine());
            if(a12==4)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 13: WHICH OF THE FOLLOWING IS THE CORRECT ABBREVIATION FOR 'B.C.G' VACCINE ");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:BABY CHILD GUIDE");
            System.out.println("2:BUILD CALORIE GUIDE");
            System.out.println("3:BIG COLD GERMS");
            System.out.println("4.BACILLUS CALMETTE GUERIN");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a13=Integer.parseInt(in.readLine());
            if(a13==4)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 14:WHICH IS THE WORLDS DEEPEST TRENCH?");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:DEEPDARK TRENCH");
            System.out.println("2:MARIANA TRENCH");
            System.out.println("3:ANDAMAN TRENCH");
            System.out.println("4.SWORD TRENCH");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a14=Integer.parseInt(in.readLine());
            if(a14==2)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            System.out.println(" ");
            System.out.println("Question 15:WHO IS THE AUTHOR OF THE INDIAN NOVEL FIVE POINT SOMEONE");
            System.out.println("YOUR OPTIONS ARE: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1:RANI MUKHERJEE");
            System.out.println("2:BIPIN CHANDRA PAL");
            System.out.println("3:CHETAN BHAGHAT");
            System.out.println("4.NARENDRA MODI");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("ENTER YOUR ANSWER NUMBER");
            a15=Integer.parseInt(in.readLine());
            if(a15==3)
            {
                t=t+1;
                System.out.println("correct answer");
            }
            else
            System.out.println("incorrect answer");
            
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("************######RESULT TIME!!!#####*********************");
            System.out.println("YOUR STAND IN GENERAL KNOWLEDGE");
            System.out.println("NO.OF CORRECT ANSWERS: "+t);
            if((t>0)&&(t<=5))
            System.out.println("LEVEL:LOW ;REMARK:NEED TO IMPROVE DUDE :P");
            if((t>5)&&(t<=10))
            System.out.println("LEVEL:SATISFACTORY ;REMARK:GOOD");
            if((t>10)&&(t<=15))
            System.out.println("LEVEL:BRILLIANT ;REMARK:WELL DONE");
            System.out.println(" ");
            System.out.println("*************************************************************");
            System.out.println("HOPE YOU ENJOYED,THANK YOU FOR PLAYING..... ;)");
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
        System.out.println("no problem,next time :)");
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
}

            
            
        
            
            
            
            
        
        
        
        
        
        