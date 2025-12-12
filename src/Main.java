public class Main {
    public static void main(String[] args) {

        // 1. Объявляем переменные для входных данных
        int currentBalance = 300; // Начальный счет клиента
        int topUpAmount = 1350;   // Сумма пополнения

        // 2. Объявляем параметры программы
        int bonusThreshold = 1000;    // Порог для начисления бонуса
        int rublesForOneBonus = 100; // За каждые 100 рублей начисляется 1 бонус

        int bonusAmount = 0; // Инициализируем бонус нулем

        // 3. Условный оператор: Проверяем, превысила ли сумма пополнения порог
        if (topUpAmount > bonusThreshold) {
            // Если превысила: рассчитываем бонус.
            // Используем целочисленное деление для "каждых полных 100 рублей".
            bonusAmount = topUpAmount / rublesForOneBonus;
        }

        // 4. Рассчитываем итоговый счет
        int finalBalance = currentBalance + topUpAmount + bonusAmount;

        // 5. Выводим результат
        System.out.println("Начальный счет: " + currentBalance + " руб.");
        System.out.println("Сумма пополнения: " + topUpAmount + " руб.");
        System.out.println("Начислено бонусных рублей: " + bonusAmount + " руб.");
        System.out.println("Итоговый счет: " + finalBalance + " руб.");
    }
}