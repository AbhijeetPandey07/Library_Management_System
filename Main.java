import java.util.Scanner;

 class Library1
{
    public static void main(String[] args)
    {
          char r;
        do {
               System.out.println("Library Management System ");
               System.out.println("Press 1 : Add Book");
               System.out.println("Press 2 :Issue Book ");
               System.out.println("Press 3 :Return book ");
               System.out.println("Press 4 :Print full Issue Detail ");
               System.out.println("Press 5 :Exit");
               Scanner obj4 = new Scanner(System.in);
               System.out.println("Enter The Number : ");
               int a = obj4.nextInt();
               switch (a) {
                   case 1 :
                       Library aa = new Library();
                       aa.add();

                   case 2 :
                       Library bb = new Library();
                       bb.iss();

                   case 3 :
                       Library cc = new Library();
                       cc.ret();

                   case 4 :
                       Library dd = new Library();
                       dd.detail();

                   case 5 :
                       Library ee = new Library();
                       ee.exit();

                   default :
                       System.out.println("Invalid Number");
               }
                     System.out.println("You want to re execute y/n ");
                     r = obj4.next().charAt(0);
               while (r == 'y' || r == 'Y') ;
                     if (r == 'n' || r == 'N') ;
                     {
                             Library z = new Library();
                             z.exit();
                     }

           }while ( r  == 'y' || r == 'Y' ) ;
    }
}
class Library {
    static int booked; static String str2; static int date; static int Total;  static int date2;
    void add() {
        System.out.println("Enter ther book name , price , Book number ");
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        float flt = obj.nextInt();
        int dnt = obj.nextInt();
        System.out.println("Your detail is  " + str + flt + dnt);
    }

    void iss()
    {
        System.out.println("Issue Book Name , Book Id , Issue date ,Total  number of Books,Return Date");
        Scanner obj2 = new Scanner(System.in);
        String str2 = obj2.nextLine();
        int date = obj2.nextInt();
        int booked = obj2.nextInt();
        int Total = obj2.nextInt();
        int date2 = obj2.nextInt();

    }
    int getid()
    {
        return booked;
    }

    void ret ()
    {
        System.out.println("Return Book Name ,Book Id ");
        Scanner obj3=new Scanner(System.in);
        String str3 = obj3.nextLine();
        int bookid2 = obj3.nextInt();
        if (booked== bookid2)
        {
            System.out.println(" Full Detail" );
            System.out.println(" Issue Book Name "+ Library.str2 );
            System.out.println(" Book id "+Library.booked );
            System.out.println(" Issue Date "+Library.date );
            System.out.println(" Total Number Of Books "+Library.Total );
            System.out.println(" Return Date "+Library.date2 );
        }
        else {
            System.out.println(" wrong book id ");
        }

    }
    void detail()
    {
        System.out.println(" Issue Book Name "+ Library.str2 );
        System.out.println(" Book id "+Library.booked );
        System.out.println(" Issue Date "+Library.date );
        System.out.println(" Total Number Of Books "+Library.Total );
        System.out.println(" Return Date "+Library.date2 );
    }
    void exit()
    {
        System.exit(0);
    }
}