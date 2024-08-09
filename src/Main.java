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
        byte humanAge = 1;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge +
                    ", то ему нужно ходить в детский сад.\n");
        } else if (humanAge >= 7 && humanAge <= 17) {
                System.out.println("Если возраст человека равен " + humanAge +
                        ", то ему нужно ходить в школу.\n");
        } else if (humanAge >= 18 && humanAge <= 24) {
                System.out.println("Если возраст человека равен " + humanAge +
                        ", то ему нужно ходить в университет.\n");
        } else if (humanAge > 24) {
                System.out.println("Если возраст человека равен " + humanAge +
                        ", то ему нужно ходить на работу.\n");
        } else {
            System.out.println("Вы ввели некорректные данные.\n");
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
        byte ticketNumber = 52; //искомое значение//
        byte totalSeatsOnTheTrain = 102;
        byte seats = 60;
        if (ticketNumber <= seats) {
            byte numberSeats = (byte) (seats - ticketNumber);
            System.out.println("Есть сидячее место. Всего осталось мест "  + numberSeats + ".\n");
        } else if (ticketNumber > seats && ticketNumber <= totalSeatsOnTheTrain) {
            byte number = (byte) (ticketNumber - seats);
            System.out.println("Есть стоячие места. Всего осталось мест " + number +  ".\n");
        } else if (ticketNumber > totalSeatsOnTheTrain) {
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
        } else {
            System.out.println("Наибольшее число " + three + ".\n");
        }


    }
}