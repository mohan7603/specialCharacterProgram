import java.util.Scanner;

// Without java.time.
public class calendar1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month : ");
        int month = sc.nextInt();
        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        String[] months = {"January","February","March","April","May", "June",
                "July","August","September","October","November","December"};

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(month < 1 || month > 12 ||year < 1){
            System.out.println("Invalid Input");
            return;
        }

        // check Leap year
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            daysInMonth[1] = 29;
        }

        // find total days before the given month

        int totalDays  = 0;

        for(int y=1;y<year;y++){

            if(y % 400 == 0 ||(year % 4 == 0 && year % 100 != 0 )) {
                totalDays += 366;
            }
            else{
                totalDays += 365;
            }

        }
        for (int m =0;m<month-1;m++){
            totalDays += daysInMonth[m];
        }
        // 1 January, year 1 was Monday

        int startDay = (totalDays + 1) % 7;
        System.out.println("\n   "+months[month -1]+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for(int i =0;i < startDay;i++){
            System.out.print("   ");
        }
        for(int day =1;day<=daysInMonth[month-1];day++){
            System.out.printf("%3d ",day);
            if((day + startDay) % 7 == 0){
                System.out.println();
            }
        }
    }
}