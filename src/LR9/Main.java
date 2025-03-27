package LR9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Створюємо вікно програми
        JFrame frame = new JFrame("Обчислення теплоти для нагріву води");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(null);

        // Поле для введення маси води
        JLabel massLabel = new JLabel("Маса води (г):");
        massLabel.setBounds(30, 30, 150, 30);
        frame.add(massLabel);
        JTextField massField = new JTextField();
        massField.setBounds(300, 30, 150, 30);
        frame.add(massField);

        // Поле для введення температури нагріву
        JLabel tempLabel = new JLabel("Температура нагріву (°C):");
        tempLabel.setBounds(30, 80, 150, 30);
        frame.add(tempLabel);
        JTextField tempField = new JTextField();
        tempField.setBounds(300, 80, 150, 30);
        frame.add(tempField);

        // Радіокнопка для вибору початкової температури
        JRadioButton zeroTempButton = new JRadioButton("Початкова температура = 0°C");
        zeroTempButton.setBounds(30, 130, 200, 30);
        frame.add(zeroTempButton);

        JRadioButton customTempButton = new JRadioButton("Ввести свою температуру");
        customTempButton.setBounds(30, 160, 200, 30);
        frame.add(customTempButton);

        // Групуємо радіокнопки
        ButtonGroup group = new ButtonGroup();
        group.add(zeroTempButton);
        group.add(customTempButton);

        // Поле для введення власної початкової температури
        JLabel customTempLabel = new JLabel("Введіть початкову температуру (°C):");
        customTempLabel.setBounds(30, 200, 200, 30);
        frame.add(customTempLabel);
        JTextField customTempField = new JTextField();
        customTempField.setBounds(300, 200, 150, 30);
        frame.add(customTempField);
        customTempLabel.setVisible(false);
        customTempField.setVisible(false);

        // Кнопка для обчислення
        JButton calculateButton = new JButton("Обчислити");
        calculateButton.setBounds(30, 240, 150, 30);
        frame.add(calculateButton);

        // Мітка для відображення результату
        JLabel resultLabel = new JLabel("Необхідна теплота: ");
        resultLabel.setBounds(300, 240, 200, 30);
        frame.add(resultLabel);

        // Дія при натисканні на кнопку "Обчислити"
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double маса = Double.parseDouble(massField.getText());
                    double температураНагріву = Double.parseDouble(tempField.getText());

                    double початковаТемпература = 0; // стандартна температура 0°C

                    if (customTempButton.isSelected()) {
                        початковаТемпература = Double.parseDouble(customTempField.getText());
                    }

                    // Обчислюємо кількість теплоти
                    double теплоту = обчисленняТеплоти.обчисленняТеплоти(маса, температураНагріву, початковаТемпература);
                    resultLabel.setText("Необхідна теплота: " + String.format("%.2f", теплоту) + " Дж");

                } catch (NumberFormatException ex) {
                    resultLabel.setText("Введіть правильні значення!");
                }
            }
        });

        // Дія при виборі "Ввести свою температуру"
        customTempButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customTempLabel.setVisible(true);
                customTempField.setVisible(true);
            }
        });

        // Дія при виборі "Початкова температура = 0°C"
        zeroTempButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customTempLabel.setVisible(false);
                customTempField.setVisible(false);
            }
        });

        // Відображаємо вікно
        frame.setVisible(true);
    }
}
