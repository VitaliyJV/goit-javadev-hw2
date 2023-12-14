package org.example;

public class SumCalculator {
    public int sum(int n) {
        if(n<=0){
            throw new IllegalArgumentException();
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result+=i;
        }
        return result;
    }

    public static void main(String[] args) {
        SumCalculator s1 = new SumCalculator();
        System.out.println(s1.sum(3));
    }

}

/*
Документацію можна почитати ось тут - https://github.com/features/actions

Один з варіантів використання Github Actions - це коли у гілку main відкривається Pull Request, то автоматично
запускаються Unit тести для цієї гілки.

Технічно, це реалізується наступним чином:

ми визначаємо тригер на який необхідно реагувати (у нашому випадку - це відкриття Pull Request у гілку main)
ми пишемо дію яку необхідно виконати (якщо у нас, наприклад, gradle проєкт - то це запуск команди ./gradlew test)
Офіційний tutorial по запуску тестів для Java за допомогою Github Workflow -
https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-gradle

Завдання №1 - налаштуй запуск юніт-тестів для будь-якого проєкту
Візьми будь-який проєкт, де є юніт-тести (якщо такого проєкту немає - то створи новий проєкт, де створи один будь-який юніт-тест).

Налаштуй для цього проєкту Github Action, який при Pull Request в гілку main запускатиме прогон юніт-тестів. Відкрий
один PR в гілку main, і переконайсь, що Github Action запустивсь.

Результат ДЗ - посилання на Github репозиторій з налаштованим Github Action.
 */
