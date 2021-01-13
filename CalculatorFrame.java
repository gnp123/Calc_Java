package com.company;

import com.company.CalcPanel;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
    CalculatorFrame(){
        int w=310, h=300;
        setTitle("Calculator");
        setBounds(100,100,w,h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        CalcPanel panel=new CalcPanel(w,h);
        add(panel);
        setResizable(false);
        setVisible(true);
    }
}
