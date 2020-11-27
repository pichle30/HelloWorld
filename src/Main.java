public class Main {
    public static void main(String[] args) {
        String[] months = {"Jan",
                "Feb",
                "Mar",
                "Apr",
                "Mai",
                "Jun",
                "Jul",
                "Aug",
                "Sep",
                "Okt",
                "Nov",
                "Dez",
        };
        printMonths(months);
    }

    public static void printMonths(String[] months) {
        for(int i = 0; i < months.length; i++) {
            System.out.println(months[i] + "[" +(i+1)+"]");
        }
    }
}
