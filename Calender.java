package JavaPrograms100;

//Description: Its a simple program which calculates the day of the week for any given date & month of the year 2002. 

class dateone {
    public void compute(int opt, int date, int day) {

        char b;

        switch (opt) {
            case 1:
                if (date <= 31) {
                    day = (8 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information january has only 31 days.\n");
                break;

            case 2:
                if (date <= 28) {
                    day = (11 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information february has only 28 days.\n");
                break;

            case 3:
                if (date <= 31) {
                    day = (11 + date) % 7;
                } else
                    System.out.println("For u'r kind information march has only 31 days.\n");
                break;

            case 4:
                if (date <= 30) {
                    day = (7 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information april has only 30 days.\n");
                break;

            case 5:
                if (date <= 31) {
                    day = (9 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information may has only 31 days.\n");
                break;

            case 6:
                if (date <= 30) {
                    day = (12 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information june has only 30 days.\n");
                break;

            case 7:
                if (date <= 31) {
                    day = (7 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information july has only 31 days.\n");
                break;

            case 8:
                if (date <= 31) {
                    day = (10 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information august has only 31 days.\n");
                break;

            case 9:
                if (date <= 30) {
                    day = (6 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information september has only 30 days.\n");
                break;

            case 10:
                if (date <= 31) {
                    day = (8 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information october has only 31 days.\n");
                break;

            case 11:
                if (date <= 30) {
                    day = (11 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information november has only 30 days.\n");
                break;

            case 12:
                if (date <= 31) {
                    day = (6 + date) % 7;
                } else
                    System.out.println("\nFor u'r kind information december has only 31 days.\n");
                break;
        }

        if (day == 0) {
            System.out.println("\nIts SUNDAY.\n");
        }

        if (day == 1) {
            System.out.println("\nIts MONDAY.\n");
        }

        if (day == 2) {
            System.out.println("\nIts TUESDAY.\n");
        }

        if (day == 3) {
            System.out.println("\nIts WEDNESDAY.\n");
        }

        if (day == 4) {
            System.out.println("\nIts THURSDAY.\n");
        }

        if (day == 5) {
            System.out.println("\nIts FRIDAY.\n");
        }

        if (day == 6) {
            System.out.println("\nIts SATURDAY.\n");
        }

    }
}
