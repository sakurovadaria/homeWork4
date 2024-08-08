public class Main {
    public static void main(String[] args) {

        System.out.println("Задача номер 1");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен "
                    + age + ", то он совершеннолетний.\n");
        } else if (age < 18) {
            System.out.println("Если возраст человека равен"
                    + age + ", он не достиг совершеннолетия, нужно немного подождать.\n");
        }

        System.out.println("Задача номер 2");
        byte temperatureNow = 6;
        if (temperatureNow <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку.\n");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки.\n");
        }

        System.out.println("Задача номер 3");
        byte speed = 59;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.\n");
        } else if (speed > 60)
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.\n");

        System.out.println("Задача номер 4");
        byte humanAge = 22;
        boolean kindergarten = humanAge > 2 && humanAge < 6;
        if (kindergarten) {
            System.out.println("Если возраст человека равен " + humanAge +
                    ", то ему нужно ходить в детский сад.\n");
        } else {
            boolean school = humanAge >= 7 && humanAge <= 17;
            if (school) {
                System.out.println("Если возраст человека равен " + humanAge +
                        ", то ему нужно ходить в школу.\n");
            } else if (humanAge >= 18 && humanAge <= 24) {
                System.out.println("Если возраст человека равен " + humanAge +
                        ", то ему нужно ходить в университет.\n");
            } else if (humanAge > 24) {
                System.out.println("Если возраст человека равен " + humanAge +
                        ", то ему нужно ходить на работу.\n");
            }
        }

        System.out.println("Задача номер 5");
        byte childrenYears = 12;
        if (childrenYears <= 5) {
            System.out.println("Нельзя кататься на аттракционе.\n");
        } else if (childrenYears > 5 && childrenYears < 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении .\n");
        } else if (childrenYears >= 14) {
            System.out.println("Можно кататься на аттракционе.\n");
        }

        System.out.println("Задача номер 6");
        byte totalSeatsOnTheTrain = 102;
        byte seats = 60;
        byte standingPlaces = (byte) (totalSeatsOnTheTrain - seats);
        byte ticketNumber = 103; //искомое значение//
        if (ticketNumber <= seats) {
            System.out.println("Есть сидячее место.\n");
        } else if (ticketNumber > standingPlaces && ticketNumber <= 102) {
            System.out.println("Есть стоячее место.\n");
        } else if (ticketNumber > 102) {
            System.out.println("Вагон заполнен.\n");
        }

        System.out.println("Задача номер 7");
        int one = 5;
        int two = 6;
        int three = 9;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число " + one + ".\n");
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число " + two + ".\n");
        }else
            System.out.println("Наибольшее число " + three + ".\n");


    }
}