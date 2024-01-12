package JavaPrograms100;

// Program to display the name of the week day as per the entered number
class WeekDayName {

    public void work(int num) {

        switch (num) {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Tuesday");
                break;
            case 4:
                System.out.println("The day is Wednesday");
                break;
            case 5:
                System.out.println("The day is Thursday");
                break;
            case 6:
                System.out.println("The day is Friday");
                break;
            case 7:
                System.out.println("The day is Saturday");
                break;
            default:
                System.out.println("Sorry, this day of the week does not exist");
        }
    }
}
