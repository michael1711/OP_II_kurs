## Опис програми
Ця програма призначена для демонстрації
моїх можливостей у конструюванні програм
з циклами.

## Як запустити
Для того, щоб скористатися цією дивовижною програмою:
1. Встановіть `JDK 17.X.XX`, завантажити його можна тут: *https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html*
2. Завантажте `репозиторій з проектом` (лабораторні роботи)
3. У командному рядку введіть наступні команди:

`javac -d out -cp src src/LR(X)/Main.java` - для компіляції

`jar cfe VSI_LABU.jar LR(X).Main -C out .` - для побудови .jar файлу

`java -jar LR(X).jar` - для запуску готового .jar файлу

де `X` - номер лабораторної роботи, писати без дужок
## Простий варіант запуску
Запустити zapuskLR(X).bat який виконає всі команди за вас, де Х - номер лабораторної роботи (без дужок)

## Як користуватися
Програма працює наступним чином:
1. При запуску програма виводить задане
речення 50 разів за допомогою циклу for
та while.

2. Наступним кроком програма
виводить лічильник годин і хвилин
знову ж таки циклом for та whilе
рахує до 2:59 у такому форматі:
2h 34min

3. Далі програма виводить лічильник
годин, хвилин та секунд до 2:59:59
у такому форматі: 2h 51min 32sec
це реалізовано циклом for.

4. Після цього програма просить
користувача ввести діапазон пошуку
значень функції, яку вона обчислить
одразу після цього, далі виведе
результати.
5. Після результату програма видасть
повідомлення у якому діапазоні
виконується пошук та кількість
значень. **УВАГА!** діапазон пошуку можна
вводити як від меншого до більшого
так і навпаки, результат незмінний.

```
   ,---.           _ __                     ,-----,--,    ,-----.--.
 .--.'  \       .-`.' ,`.                   | '-  -\==\  /` ` - /==/
 \==\-/\ \     /==/, -   \  ,--.--------.   \,--, '/==/  `-'-. -|==|
 /==/-|_\ |   |==| _ .=. | /==/,  -   , -\     /  /==/       | `|==|
 \==\,   - \  |==| , '=',| \==\.-.  - ,-./    / -/==/        | -|==|
 /==/ -   ,|  |==|-  '..'   `--`--------`    / -/==/         | `|==|
/==/-  /\ - \ |==|,  |                      / `\==\_,--,   .-','|==|
\==\ _.\=\.-' /==/ - |                     /` -   ,/==/   /     \==\
 `--`         `--`---'                     `------`--`    `-----`---`
```