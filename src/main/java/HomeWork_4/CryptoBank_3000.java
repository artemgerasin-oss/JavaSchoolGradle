package HomeWork_4;


    public class CryptoBank_3000 {

        public static void main(String[] args) {
            int flaky = 0, bug = 0, critical = 0, pass = 0;

            // Анализ 100 тестов
            for (int i = 1; i <= 100; i++) {
                String status;

                if (i % 3 == 0 && i % 5 == 0) {
                    status = "Critical!";
                    critical++;
                } else if (i % 3 == 0) {
                    status = "Flaky";
                    flaky++;
                } else if (i % 5 == 0) {
                    status = "Bug";
                    bug++;
                } else {
                    status = "Pass";
                    pass++;
                }

                System.out.println("Тест #" + i + ": " + status);
            }

            // Сводка
            System.out.println("\n=== СВОДКА СМЕНЫ ===");
            System.out.println("Pass:     " + pass);
            System.out.println("Flaky:    " + flaky);
            System.out.println("Bug:      " + bug);
            System.out.println("Critical: " + critical);
            System.out.println("Всего:    " + (pass + flaky + bug + critical));
        }
    }

