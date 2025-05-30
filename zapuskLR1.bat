@echo off
chcp 65001 > nul
echo Компiляцiя Java-коду...
if not exist out mkdir out
javac -encoding UTF-8 -d out -cp src src/LR1/Main.java
if %ERRORLEVEL% neq 0 (
    echo Помилка компіляції!
    pause
    exit /b
)
echo Створення JAR-файлу...
jar cfe LR1.jar LR1.Main -C out .
if %ERRORLEVEL% neq 0 (
    echo Помилка створення JAR!
    pause
    exit /b
)
echo Запуск програми...
java -Dfile.encoding=UTF-8 -jar LR1.jar
pause