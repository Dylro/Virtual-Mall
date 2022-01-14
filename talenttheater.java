import java.io.*;
public class talenttheater
{
public static void main()throws IOException
{
    int n,a,c,tc,cn;
    Long ph;
    String ns,ns1,ts,n1,email,ninst,i;
    
    
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    System.out.println("\f");
    System.out.println("*********WELCOME TO PARADOX TALENT THEATER**************");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println(">>>IF YOU HAVE A TALENT THEN WHY HIDE IT?<<<");
    System.out.println("**USE THE CHANCE GIVEN TO YOU BY PARADOX TALENTTHEATER'S TALENT EXCLUSIVELY FOR KIDZ***");
    System.out.println("THE TALENT SHOW IS HELD ON THE 1ST SUNDAY OF EVERY MONTH FROM 4:PM-6:PM");
    System.out.println("FOR MORE INFO VISIT WEBSITE www.yourworldmini_mall.com");
    System.out.println("REGISTER FOR THE TALENT SHOW NOW");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("ENTER '1' TO PROCEED FURTHER AND '2' TO QUIT");
    n=Integer.parseInt(in.readLine());
    if(n==1)
    {
        System.out.println("ENTER YOUR CHILDS NAME AND SURNAME");
        n1=in.readLine();
        System.out.println("ENTER YOUR AGE");
        a=Integer.parseInt(in.readLine());
        if(a<=18)
        {
            System.out.println(">>>IS YOUR ACT SOLO OR A GROUP ACT?");
            System.out.println("#1.SOLO ACT");
            System.out.println("#2.GROUP ACT");
            System.out.println("ENTER YOUR CHOICE NUMBER(1/2)");
            c=Integer.parseInt(in.readLine());
            if(c==1)
            {
                System.out.println("*********ENTER THE CATEGORY OF YOUR ACT***********");
                System.out.println("#1.SINGING");
                System.out.println("#2.INSTRUMENT PLAYING");
                System.out.println("#3.DANCE");
                System.out.println("#4.RECITATION OF POEMS,STORIES,SHAIRIS OR JOKES");
                System.out.println("#5.OTHER");
                
                System.out.println(">>>ENTER CHOICE NUMBER<<<");
                tc=Integer.parseInt(in.readLine());
                
                if(tc==1)
                {
                    System.out.println("ENTER NAME OF SONG");
                    ns=in.readLine();
                    System.out.println("ENTER SINGERS NAME");
                    ns1=in.readLine();
                    System.out.println("ENTER SONG TYPE(INDIAN/WESTERN)");
                    ts=in.readLine();                    
                    System.out.println("ENTER EMAIL ID");
                    email=in.readLine();
                    System.out.println("ENTER CONTACT NUMBER");
                    ph=Long.parseLong(in.readLine());
                    System.out.println("\f");
                    System.out.println("**********THANK YOU FOR REGISTRATION**********");
                    System.out.println("A MAIL CONFIRMING YOUR REGISTRATION WILL BE SENT TO YOU ON YOUR EMAIL WITHIN 3HRS");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("FOR ANY QUERIES CONTACT-9833454542/9845335678; EMAIL-info@paradoxTheateres.com");
                    System.out.println("    ");
                    System.out.println("    ");                
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
                if(tc==2)
                {
                     System.out.println("ENTER NAME OF INSTRUMENT BEING PLAYED");
                     ninst=in.readLine();
                     System.out.println("ENTER NAME OF SONG");                     
                     ns=in.readLine();
                     System.out.println("ENTER SINGERS NAME");
                     ns1=in.readLine();
                     System.out.println("ENTER SONG TYPE(INDIAN/WESTERN)");
                     ts=in.readLine();                    
                     System.out.println("ENTER EMAIL ID");
                     email=in.readLine();
                     System.out.println("ENTER CONTACT NUMBER");
                     ph=Long.parseLong(in.readLine());
                     System.out.println("\f");
                     System.out.println("**********THANK YOU FOR REGISTRATION**********");
                     System.out.println("A MAIL CONFIRMING YOUR REGISTRATION WILL BE SENT TO YOU ON YOUR EMAIL WITHIN 3HRS");
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     System.out.println("FOR ANY QUERIES CONTACT-9833454542/9845335678; EMAIL-info@paradoxTheateres.com");
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
                if(tc==3)
                    {
                     System.out.println("ENTER NAME OF SONG");
                     ns=in.readLine();
                     System.out.println("ENTER SINGERS NAME/MOVIE NAME");
                    ns1=in.readLine();
                    System.out.println("ENTER DANCE STYLE(EG:CONTEMPORARY,FREESTYLE ETC:)");
                    ts=in.readLine();                    
                    System.out.println("ENTER EMAIL ID");
                    email=in.readLine();
                    System.out.println("ENTER CONTACT NUMBER");
                   ph=Long.parseLong(in.readLine());
                    System.out.println("\f");
                    System.out.println("**********THANK YOU FOR REGISTRATION**********");
              System.out.println("A MAIL CONFIRMING YOUR REGISTRATION WILL BE SENT TO YOU ON YOUR EMAIL WITHIN 3HRS");
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("FOR ANY QUERIES CONTACT-9833454542/9845335678; EMAIL-info@paradoxTheateres.com");
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
                if(tc==4)
                {
                     System.out.println("ENTER A SMALL INTRODUCTION OF YOUR ACT");
                     i=in.readLine();
                    System.out.println("ENTER EMAIL ID");
                    email=in.readLine();
                    System.out.println("ENTER CONTACT NUMBER");
                   ph=Long.parseLong(in.readLine());
                    System.out.println("\f");
                    System.out.println("**********THANK YOU FOR REGISTRATION**********");
               System.out.println("A MAIL CONFIRMING YOUR REGISTRATION WILL BE SENT TO YOU ON YOUR EMAIL WITHIN 3HRS");
               System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
               System.out.println("FOR ANY QUERIES CONTACT-9833454542/9845335678; EMAIL-info@paradoxTheateres.com");
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
                if(tc==5)
                {
                    System.out.println("ENTER A SMALL INTRODUCTION OF YOUR ACT");
                     i=in.readLine();
                    System.out.println("ENTER EMAIL ID");
                    email=in.readLine();
                    System.out.println("ENTER CONTACT NUMBER");
                   ph=Long.parseLong(in.readLine());
                    System.out.println("\f");
                    System.out.println("**********THANK YOU FOR REGISTRATION**********");
              System.out.println("A MAIL CONFIRMING YOUR REGISTRATION WILL BE SENT TO YOU ON YOUR EMAIL WITHIN 3HRS");
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                  System.out.println("FOR ANY QUERIES CONTACT-9833454542/9845335678; EMAIL-info@paradoxTheateres.com");
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
                if(tc>5)
                {
                    System.out.println("INVALID CHOICE");
                }
            }
        }
            if(c==2)
            {
                System.out.println("*********ENTER THE CATEGORY OF YOUR ACT***********");
                System.out.println("#1.SINGING");
                System.out.println("#2.INSTRUMENT PLAYING");
                System.out.println("#3.DANCE");
                System.out.println("#4.BAND");
                System.out.println("#5.OTHER");
                
                System.out.println("ENTER CHOICE NUMBER");
                tc=Integer.parseInt(in.readLine());
                if(tc==1)
                {
                    System.out.println("ENTER NAME OF SONG");
                    ns=in.readLine();
                    System.out.println("ENTER SINGERS NAME");
                    ns1=in.readLine();
                    System.out.println("ENTER SONG TYPE(INDIAN/WESTERN)");
                    ts=in.readLine();                    
                    System.out.println("ENTER EMAIL ID");
                    email=in.readLine();
                    System.out.println("ENTER CONTACT NUMBER");
                   ph=Long.parseLong(in.readLine());
                    System.out.println("\f");
                    System.out.println("**********THANK YOU FOR REGISTRATION**********");
               System.out.println("A MAIL CONFIRMING YOUR REGISTRATION WILL BE SENT TO YOU ON YOUR EMAIL WITHIN 3HRS");
               System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
               System.out.println("FOR ANY QUERIES CONTACT-9833454542/9845335678; EMAIL-info@paradoxTheateres.com");
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
                if(tc==2)
                {
                     System.out.println("ENTER NAME OF INSTRUMENT BEING PLAYED");
                    ninst=in.readLine();
                    System.out.println("ENTER NAME OF SONG");                     
                    ns=in.readLine();
                    System.out.println("ENTER SINGERS NAME");
                    ns1=in.readLine();
                    System.out.println("ENTER SONG TYPE(INDIAN/WESTERN)");
                    ts=in.readLine();                    
                    System.out.println("ENTER EMAIL ID");
                    email=in.readLine();
                    System.out.println("ENTER CONTACT NUMBER");
                    ph=Long.parseLong(in.readLine());
                    System.out.println("\f");
                    System.out.println("**********THANK YOU FOR REGISTRATION**********");
                System.out.println("A MAIL CONFIRMING YOUR REGISTRATION WILL BE SENT TO YOU ON YOUR EMAIL WITHIN 3HRS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("FOR ANY QUERIES CONTACT-9833454542/9845335678; EMAIL-info@paradoxTheateres.com");
                System.out.println("  ");
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
                if(tc==3)
                {
                     System.out.println("ENTER NAME OF SONG");
                    ns=in.readLine();
                    System.out.println("ENTER SINGERS NAME/MOVIE NAME");
                    ns1=in.readLine();
                    System.out.println("ENTER DANCE STYLE(EG:CONTEMPORARY,FREESTYLE ETC:)");
                    ts=in.readLine();                    
                    System.out.println("ENTER EMAIL ID");
                    email=in.readLine();
                    System.out.println("ENTER CONTACT NUMBER");
                    ph=Long.parseLong(in.readLine());
                    System.out.println("\f");
                    System.out.println("**********THANK YOU FOR REGISTRATION**********");
                System.out.println("A MAIL CONFIRMING YOUR REGISTRATION WILL BE SENT TO YOU ON YOUR EMAIL WITHIN 3HRS");
               System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("FOR ANY QUERIES CONTACT-9833454542/9845335678; EMAIL-info@paradoxTheateres.com");
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
                if(tc==4)
                {
                    System.out.println("ENTER NAME OF SONG");
                    ns=in.readLine();
                    System.out.println("ENTER SINGERS NAME/MOVIE NAME");
                    ns1=in.readLine();
                    System.out.println("ENTER EMAIL ID");
                    email=in.readLine();
                    System.out.println("ENTER CONTACT NUMBER");
                  ph=Long.parseLong(in.readLine());
                    System.out.println("\f");
                    System.out.println("**********THANK YOU FOR REGISTRATION**********");
                    System.out.println("A MAIL CONFIRMING YOUR REGISTRATION WILL BE SENT TO YOU ON YOUR EMAIL WITHIN 3HRS");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("FOR ANY QUERIES CONTACT-9833454542/9845335678; EMAIL-info@paradoxTheateres.com");
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
                if(tc==5)
                {
                    System.out.println("ENTER A SMALL INTRODUCTION OF YOUR ACT");
                     i=in.readLine();
                    System.out.println("ENTER EMAIL ID");
                    email=in.readLine();
                    System.out.println("ENTER CONTACT NUMBER");
                   ph=Long.parseLong(in.readLine());
                    System.out.println("\f");
                    System.out.println("**********THANK YOU FOR REGISTRATION**********");
                    System.out.println("A MAIL CONFIRMING YOUR REGISTRATION WILL BE SENT TO YOU ON YOUR EMAIL WITHIN 3HRS");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("FOR ANY QUERIES CONTACT-9833454542/9845335678; EMAIL-info@paradoxTheateres.com");
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
                if(tc>5)
                {
                    System.out.println("INVALID CHOICE");
                }
            }
            if(c>2)
            {
                System.out.println("invalid choice");
            }
        }
        if(a>18)
        {
            System.out.println("SORRY.YOU ARE INELIGIBLE FOR PARTICIPATION IN THE TALENT SHOW.");
           System.out.println("THIS TALENT SHOW IS A KIDS EXCLUSIVE PLATFORM");
           System.out.println(">>>P.S DONT BE DISAPPOINTED,YOU CAN STILL MAKE A WONDERFUL AUDIENCE FOR OUR LITTLE PERFORMERS:)");
           System.out.println("************THANK YOU FOR VISITING*********************");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  ");
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
            System.out.println("no problem,come next time");
        }
    }
    
   else if(n==2)
    {
          System.out.println("************THANK YOU FOR VISITING*********************");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  ");
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
        System.out.println("*invalid choice*");
    }
    

}
}


                
                    
                    
                    
                    
                    
                    
                    
                
                
        
        
        
        
        
    
