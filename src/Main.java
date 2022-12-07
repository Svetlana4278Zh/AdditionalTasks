public class Main {
    public static void main(String[] args) {
        //Урок 2. Задача 6
        System.out.println("Урок 2. Задача 6");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a*(b+(c-d*e));
        result *= -1;
        System.out.println(result);

        //Урок 2. Задача 7
        System.out.println("\nУрок 2. Задача 7");
        a = 5;
        b = 7;
        a += b;
        b = a- b;
        a -= b;
        System.out.println("a = "+a+"; b = "+b);

        //Урок 2. Задача 8
        System.out.println("\nУрок 2. Задача 8");
        a = 768;
        b = (a%100)/10;
        System.out.println("b = "+b);

        //Урок 3. Задача 6
        System.out.println("\nУрок 3. Задача 6");
        int age = 19;
        int ageLimit23 = 23;
        int salary = 58_000;
        int salaryLimit50 = 50_000;
        int salaryLimit80 = 80_000;
        int creditLimit = 0;
        if (age >= ageLimit23) {
            creditLimit = 3 * salary;
        } else {
            creditLimit = 2 * salary;
        }
        if (salary >= salaryLimit80) {
            creditLimit *= 1.5;
        } else if (salary >= salaryLimit50) {
            creditLimit *= 1.2;
        }
        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом "+ creditLimit+" рублей");

        //Урок 3. Задача 7
        System.out.println("\nУрок 3. Задача 7");
        age = 25;
        salary = 60_000;
        double basePercent = 0.1; // % годовых, выраженный в десятичной дроби
        double percent = basePercent;
        int creditTerm = 12; //месяцев
        double maxMonthlyPayment = (double)salary/2;
        double wantedSum = 330_000;
        int ageLimit30 = 30;
        if (age < ageLimit23) {
            percent += 0.01;
        } else if (age < ageLimit30) {
            percent += 0.005;
        }
        if (salary > salaryLimit80) {
            percent -= 0.007;
        }
        double percentInMonth = percent/12;
        double monthlyPayment = wantedSum*(percentInMonth/(1-Math.pow((1+percentInMonth), ((-1)*creditTerm))));
        System.out.printf("Максимальный платеж при ЗП %d равен %.2f рублей. Платеж по кредиту %.2f рублей. ",salary, maxMonthlyPayment, monthlyPayment);
        if (monthlyPayment >= maxMonthlyPayment) {
            System.out.printf("Отказано.\n");
        } else {
            System.out.printf("Одобрено.\n");
        }
    }
}