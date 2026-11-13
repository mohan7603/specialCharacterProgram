import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class calendar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Month : ");
        int month = sc.nextInt();
        System.out.println("Enter year : ");
        int year = sc.nextInt();

        YearMonth ym = YearMonth.of(year,month);


        System.out.println("\n     "+ym.getMonth()+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int days = ym.lengthOfMonth();

        int startDay = LocalDate.of(year,month,1).getDayOfWeek().getValue() % 7;

        for(int i =0;i < startDay; i++){
            System.out.print("    ");
        }
        for (int day = 1; day <= days; day++){
            System.out.printf ("%3d ",day);
            if((day + startDay) % 7 == 0){
                System.out.println();
            }
        }
    }
}
