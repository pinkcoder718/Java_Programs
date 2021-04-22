package sem3;

enum DayofWeek{ MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
    int val;
    DayofWeek(int val){
       this.val=val; 
    }
    boolean isWorkday() {
        if (val<6){
            return true;
        }
        else {
            return false;
        }
    }
}
public class DoW{
    public static void main(String[] args) {
        DayofWeek Day= DayofWeek.SUNDAY;
        System.out.println(" verfication of sunday(isWorkDay())");  
        System.out.println(Day.SUNDAY.isWorkday());

             System.out.println(" verfication of Wednesday(isWorkDay())");  
                     System.out.println(DayofWeek.WEDNESDAY.isWorkday());
                    
    }
}