package JDK.Sem1;

import JDK.Sem1.GameWindow;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
������ 1:
�� ������ ��� ������� �����, ���������� ���� ������ � ������
���� � ������������� ������ ���� �������� �������������, ������������ �������� ����.
�������� �� ����� �����������-����� � ����� �������� � �������� ���
������������ ������� ��������� ���������� � �������� �������:
JLabel � ���������� ��������� ����� �����,
��������������� � ButtonGroup ������������� JRadioButton � ��������� ������� �������� ������
���������� � �������� ������ ��������,
JLabel � ���������� ��������� ������� �����,
JLabel � ���������� �������������� ������ ����:�,
JSlider �� ���������� 3..10,
JLabel � ���������� ��������� ����� ��� �������,
JLabel � ���������� �������������� �����:�,
JSlider �� ���������� 3..10.

������ 2:
�������� ����������� ���������������,
� ������, ��� ����������� �������� ��������
� ��������������� ������� ������ ���������� �������
�������� ���������. ��� ����� ���������� ��������
� �������� ��������� ��������� (��� ��� ���� �������
��� �������� ������).
 */

public class SettingWindow extends JFrame {
    private static final int WIDTH = 230;
    private static final int HEIGHT = 350;
    String currentWinValue  = "������������� �����: ";
    String currentFieldValue  = "������������� ������ ����: ";
    JRadioButton human;
    JRadioButton ai;
    ButtonGroup buttonGroup;
    JLabel choiceHA;
    JPanel mainPanel;
    JButton btnStart;
    JLabel fieldSize;
    JLabel currentFieldSize;
    JSlider sliderFieldSize;
    JLabel winSize;
    JLabel currentWinSize;
    JSlider sliderWinSize;
    final int minSize = 3;

    SettingWindow(GameWindow gameWindow){
        ai = new JRadioButton("������� VS ��������");
        human = new JRadioButton("����� VS ��������");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(ai);
        buttonGroup.add(human);
        btnStart = new JButton("Start new game");
        mainPanel = new JPanel(new GridLayout(9,1));
        choiceHA = new JLabel("�������� ����� ����");
        fieldSize = new JLabel("�������� ������� ����");
        currentFieldSize = new JLabel(currentFieldValue + minSize);
        sliderFieldSize = new JSlider(minSize,10,minSize);
        currentWinSize = new JLabel(currentWinValue + minSize               );
        winSize = new JLabel("�������� ����� ��� ������: ");
        sliderWinSize = new JSlider(minSize,10,minSize);
        mainPanel.add(choiceHA);

        setLocationRelativeTo(gameWindow);
        setSize(WIDTH, HEIGHT);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                gameWindow.startNewGame();
            }
        });
        sliderWinSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                currentWinSize.setText(currentWinValue + sliderWinSize.getValue());
            }
        });

        sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                currentFieldSize.setText(currentFieldValue + sliderFieldSize.getValue());
            }
        });

        mainPanel.add(ai);
        ai.setSelected(true);
        mainPanel.add(human);
        mainPanel.add(fieldSize);
        mainPanel.add(currentFieldSize);
        mainPanel.add(sliderFieldSize);
        mainPanel.add(winSize);
        mainPanel.add(currentWinSize);
        mainPanel.add(sliderWinSize);
        add(mainPanel);
        add(btnStart, BorderLayout.SOUTH);
    }
}
