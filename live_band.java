import java.io.*;
public class live_band
{
    public static void main()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,i,c;
String name,e;
long n1;
String a[]=new String[6];
System.out.println("****************WELCOME TO FANZ SPOT OF 'BOOMTOWNZ $PICE CATZ' LIVE BAND**************");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println(" ");
System.out.println("WHAT WOULD YOU LIKE TO DO?");
System.out.println("#1.KNOW MORE ABOUT THE $PICE CATZ....");
System.out.println("#2.SUGGEST SONGS OF YOUR CHOICE FOR NEXT PERFORMANCE ON THE FANZWISH LIST...");
System.out.println("#3.VOTE/SUGGEST SONGS FROM THE TOP10 FANZWISH LIST..");
System.out.println("#4.GIVE YOUR NAME FOR 'WHO'Z DAT LUCKY FAN CONTEST");
System.out.println(">>>>>>>>>>ENTER YOUR CHOICE NUMBER<<<<<<<<<<<<<<");
n=Integer.parseInt(in.readLine());
switch(n)
{
    case 1:
    System.out.println("********INTRODUCTION OF BAND MEMBERS**********");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("#1:LAURENCE D'SILVA");
    System.out.println("LEAD SINGER AND BAND LEADER");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("#2.RICKY COOK");
    System.out.println("ACCOMPANYING SINGER");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("#3.ARIANNA GRANDE");
    System.out.println(" BAND GUITARIST");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("#4.KARAN POONIWALA");
    System.out.println("BAND PIANIST");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("#5.RUBEN JOEL");
    System.out.println("BAND PERCUSSIONIST/DRUMMER ");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("       ");
    System.out.println("###################INFORMATION###################");
    System.out.println("VISIT LIKE & KNOW MORE ABOUT US ON OUR BAND WEBSITE www.Boomtown$pice_catzFanspot.com");
    System.out.println("COME FOR OUR BAND PERFORMANCES EVERY SUNDAY AT McKinley mall 3RD FLOOR ,MINI-THEATER OPPOSITE SNACKBAR");
    System.out.println("TOP10 POPULAR SONGS FROM OUR FAN LIST AND LUCKY INDIVIDUAL FANS SONGS ARE CHOSEN MEVERY ALTERNATE SUNDAY");
    System.out.println("YOU CAN ALSO EMAIL US ON info@spicecatz.com");
    System.out.println("*****************!!!DEAR FANS!!!****************");
    System.out.println("HAPPY TO ANNOUNCE THAT WE HAVE ALSO LAUNCED OUR TOALLY FREE FAN APP ON PLAYSTORE!!!");
    System.out.println("DOWNLOAD IT SOON AND STAY UPDATED WITH OUR PERFORMANCE AND CONTESTS INFO");
    System.out.println("DONT MISS THE CHANCE......STAY IN TOUCH");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("          ");
    System.out.println("********************THANK YOU FOR VISITING,HAVE A GREAT DAY!!!**********************");
    int cn;
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
System.out.println("*************HELLO DEAR FAN****************");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println(">>>>>>FEEL OPEN TO SUGGEST SONGS THAT YOU WOULD LIKE US TO PERFORM ON  FANZSUNDAY<<<<<<<");
System.out.println("ENTER 6 FOOT-TAPPING SONGS OF YOUR CHOICE.");
System.out.println("THE NAME OF EACH SONG SHOULD BE ACCOMPANIED WITH THE NAME OF ITS SINGER TO MAKE IT ELIGIBLE FOR SELECTION>>>>");
for(i=0;i<6;i++)
{
a[i]=in.readLine();
}
System.out.println("SUGGESTIONS SUCCESSFULLY RECORDED");
System.out.println("************THANK YOU FOR YOUR SUGGESTIONS;DO VISIT AGAIN!***************");
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
case 3:
System.out.println("\f");
System.out.println(">>>>>>>>*********HELLO DEAR FAN!!!***********<<<<<<<<");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("FOLLOWING ARE THE SONGZ CURRENTLY TOPPING THE FANZ WISH LIST");
System.out.println("      ");
System.out.println("***************>>>FANZWISH LIST<<<***************************");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("SR.NO.     SONG NAME             ARTIST              GENRE  ");
System.out.println("1          SHAKE IT OFF          TAYLOR SWIFT        POP    ");
System.out.println("2          ANACONDA              NICKY MINAJ         RAP    ");
System.out.println("3          WORK HARD PLAY HARD   AKON                POP    ");
System.out.println("4          ONE WAY OR ANOTHER    1 DIRECTION         COUNTRY ROCK");
System.out.println("5          COME AND GET IT       SELENA GOMEZ        REGGAE");
System.out.println("6          PROBLEM               ARIANE GRANDE       POP   ");
System.out.println("7          HAPPY                 PHARELLE WILLIAMS   SWINGNJAZZ");
System.out.println("8          IM A FREAK            ENRIQUE             POP");
System.out.println("9          BEST DAY OF MY LIFE   AMERICAN AUTHORS    COUNTRY");
System.out.println("10.        WHISTLE               FLORIDA             POP");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("VOTE FOR YOUR FAVOURITE SONG FROM THE FANZ WISHLIST BY ENTERING YOUR CHOICE NUMBER");
c=Integer.parseInt(in.readLine());
if((c>0)&&(c<11))
{
    System.out.println("ENTER YOUR NAME");
    name=in.readLine();
    System.out.println("ENTER YOUR CONTACT NUMBER");
    n1=Long.parseLong(in.readLine());
    System.out.println("    ");
    
    System.out.println("*******YOUR VOTE IS SUCCESSFULLY REGISTERED********");
    System.out.println(" ");
    System.out.println(">>>>>>>>>>>>THANK YOU FOR VISITING<<<<<<<<<<<<<<<");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println(" DONT MISS OUR PERFORMANCE ON FANZSUNDAY!!!");

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
System.out.println("INVALID CHOICE ");
break;
case 4:
System.out.println("\f");
System.out.println("*************>>>>HELLO DEAR FAN<<<<********************");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("  ");
System.out.println(">>>>>>>>>>WELCOME TO WHOZ DAT LUCKY FAN CONTEST<<<<<<<<<<<");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("####THE CONTEST----");
System.out.println("#1.ENTER YOUR CONTACT DETAILS AS ASKED BELOW AND REGISTER FOR THE CONTEST....");
System.out.println("#2.THE NAME OF THE LUCKY FAN WILL BE ANNOUNCED ON FANZ SUNDAY");
System.out.println("#3.IF YOU ARE THE RANDOM LUCKY FAN YOU CAN GET A CHANCE TO:");
System.out.println("=>VISIT OUR STUDIO,GET A CHANCE TO CLICK PHOTOS WITH US,WIN POSTERS AND AUTOGRAPHS");
System.out.println("=>WIN BUMPER PRIZES AND SURPRISES");
System.out.println("=>WIN DISCOUNT VOUCHERS AND OFFERS");
System.out.println("=>PERFORM WITH US");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("ENTER DETAILS AS ASKED BELOW-----");
System.out.println("ENTER YOUR NAME");
name=in.readLine();
System.out.println("ENTER YOUR CONTACT NUMBER");
n1=Long.parseLong(in.readLine());
System.out.println("ENTER YOUR EMAIL ID");
e=in.readLine();
System.out.println("  ");
System.out.println("*********REGISTRATION SUCCESSFULL!!!**************");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("***********THANK YOU FOR VISITING*****************");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

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
        default:
        System.out.println("********invalid choice*********");
}
}

}









   
    
    
