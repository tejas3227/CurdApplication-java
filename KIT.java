import java.util.*;

class KIT{
    private int prn;
    private String s_name;
    private int r_no;

    private String city;

    private int year;

    private String div;

    KIT(int prn, String s_name, int r_no, String city, int year, String div){
        this.prn = prn;
        this.s_name = s_name;
        this.r_no = r_no;
        this.city = city;
        this.year = year;
        this.div = div;
    }

    public int getPrn(){
        return prn;
    }
    public int getRno(){
        return r_no;
    }
    public String getSname(){
        return s_name;
    }
    public String getCity(){
        return city;
    }
    public int getYear(){
        return year;
    }
    public String getDiv(){
        return div;
    }

    public String toString(){
        return prn+" "+s_name+" "+r_no+" "+city+" "+year+" "+div;
    }
}

class CRUDDemo{
    public static void main(String[] args) {

        List<KIT> c = new ArrayList<KIT>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("6.EXIT");
            System.out.print("Enter Your Choice : ");
            ch = s.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter PRN : ");
                    int PRN = s.nextInt();
                    System.out.print("Enter Student Name : ");
                    String S_NAME = s1.nextLine();
                    System.out.print("Enter Roll Number : ");
                    int R_NO = s.nextInt();
                    System.out.print("Enter your City : ");
                    String CITY = s1.nextLine();
                    System.out.print("Enter Your Year You Are Studying Now : ");
                    int YEAR = s.nextInt();
                    System.out.print("Enter Your Division : ");
                    String DIV = s1.nextLine();

                    c.add(new KIT(PRN,S_NAME,R_NO,CITY,YEAR,DIV));
                    System.out.println("--------------------------------------------");
                    System.out.println("Record is Inserted Successfully...!");
                    System.out.println("--------------------------------------------");
                    break;


                case 2:
                    System.out.println("----------------------------");
                    Iterator<KIT> i = c.iterator();
                    while(i.hasNext()){
                        KIT e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("----------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.print("Enter PRN to Search :");
                    int prn = s.nextInt();
                    System.out.println("----------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                        KIT e = i.next();
                        if(e.getPrn() == prn)  {
                            System.out.println(e);
                            found = true;
                        }
                    }

                    if(!found){
                        System.out.println("Record Not Found");
                    }
                    System.out.println("----------------------------");
                    break;

                case 4:
                    found = false;
                    System.out.print("Enter PRN to Delete :");
                    prn = s.nextInt();
                    i = c.iterator();
                    while(i.hasNext()){
                        KIT e = i.next();
                        if(e.getPrn() == prn)  {
                            i.remove();
                            found = true;
                        }
                    }

                    if(!found){
                        System.out.println("Record Not Found");
                    }else{
                        System.out.println("--------------------------------------------");
                        System.out.println("Record is Deleted Successfully...!");
                        System.out.println("--------------------------------------------");
                    }

                    break;
                case 5:
                    found = false;
                    System.out.print("Enter PRN to Update :");
                    prn = s.nextInt();

                    ListIterator<KIT>li = c.listIterator();
                    while(li.hasNext()){
                        KIT e = li.next();
                        if(e.getPrn() == prn)  {
                            System.out.print("Enter new Name : ");
                            S_NAME = s1.nextLine();

                            System.out.print("Enter new Roll Number : ");
                            R_NO = s.nextInt();

                            System.out.print("Enter new City : ");
                            CITY = s1.nextLine();;

                            System.out.print("Enter new Year : ");
                            YEAR = s.nextInt();

                            System.out.print("Enter new Division : ");
                            DIV = s1.nextLine();

                            li.set(new KIT(prn,S_NAME,R_NO,CITY,YEAR,DIV));
                            found = true;
                        }
                    }

                    if(!found){
                        System.out.println("Record Not Found");
                    }else{
                        System.out.println("--------------------------------------------");
                        System.out.println("Record is Updated Successfully...!");
                        System.out.println("--------------------------------------------");
                    }


                    break;

                case 6:
                    found = false;
                    System.out.println("--------------------------------------------");
                    System.out.print("Program Finished Successfully........\n");
                    System.out.println("--------------------------------------------");
                    System.exit(0);



            }
        }while(ch!=0);
    }
}