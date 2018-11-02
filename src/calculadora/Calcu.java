/*

* To change this license header, choose License Headers in Project Properties.

* To change this template file, choose Tools | Templates

* and open the template in the editor.

*/

package calculadora;

 

import java.awt.Color;

import javax.swing.*;

import java.awt.event.*;

 

public class Calcu extends JFrame implements ActionListener {

 

    String operacion = "";

 

    double num1;

    double num2;

    double total;

    private JTextField textfield1;

    private JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton_cero, boton_suma, boton_igual, boton_resta, boton_division, boton_multiplica, boton_punto, botonCE, botonRaíz;

 

    public Calcu() {

        this.getContentPane().setBackground(Color.orange);

        setLayout(null);

        textfield1 = new JTextField();

        textfield1.setBounds(60, 10, 200, 30);

        add(textfield1);

        boton1 = new JButton("1");

        boton1.setBounds(10, 80, 50, 30);

        add(boton1);

        boton1.addActionListener(this);

        boton2 = new JButton("2");

        boton2.setBounds(80, 80, 50, 30);

        add(boton2);

        boton2.addActionListener(this);

        boton3 = new JButton("3");

        boton3.setBounds(150, 80, 50, 30);

        add(boton3);

        boton3.addActionListener(this);

        boton4 = new JButton("4");

        boton4.setBounds(10, 150, 50, 30);

        add(boton4);

        boton4.addActionListener(this);

        boton5 = new JButton("5");

        boton5.setBounds(80, 150, 50, 30);

        add(boton5);

        boton5.addActionListener(this);

        boton6 = new JButton("6");

        boton6.setBounds(150, 150, 50, 30);

        add(boton6);

        boton6.addActionListener(this);

        boton7 = new JButton("7");

        boton7.setBounds(10, 220, 50, 30);

        add(boton7);

        boton7.addActionListener(this);

        boton8 = new JButton("8");

        boton8.setBounds(80, 220, 50, 30);

        add(boton8);

        boton8.addActionListener(this);

        boton9 = new JButton("9");

        boton9.setBounds(150, 220, 50, 30);

        add(boton9);

        boton9.addActionListener(this);

        boton_cero = new JButton("0");

        boton_cero.setBounds(80, 290, 50, 30);

        add(boton_cero);

        boton_cero.addActionListener(this);

        boton_suma = new JButton("+");

        boton_suma.setBounds(220, 80, 50, 30);

        add(boton_suma);

        boton_suma.addActionListener(this);

        boton_igual = new JButton("=");

        boton_igual.setBounds(220, 290, 50, 30);

        add(boton_igual);

        boton_igual.addActionListener(this);

        boton_resta = new JButton("-");

        boton_resta.setBounds(220, 150, 50, 30);

        add(boton_resta);

        boton_resta.addActionListener(this);

        boton_division = new JButton("/");

        boton_division.setBounds(290, 80, 50, 30);

        add(boton_division);

        boton_division.addActionListener(this);

        boton_multiplica = new JButton("x");

        boton_multiplica.setBounds(290, 150, 50, 30);

        add(boton_multiplica);

        boton_multiplica.addActionListener(this);

        boton_punto = new JButton(".");

        boton_punto.setBounds(150, 290, 50, 30);

        add(boton_punto);

        boton_punto.addActionListener(this);

        botonCE = new JButton("CE");

        botonCE.setBounds(220, 220, 50, 30);

        add(botonCE);

        botonCE.addActionListener(this);

        botonRaíz = new JButton("√");

        botonRaíz.setBounds(290, 220, 50, 30);

        add(botonRaíz);

        botonRaíz.addActionListener(this);

    }

 

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonCE) {

            textfield1.setText("");

            num1 = num2 = 0;

            operacion = "";

        }

        if (e.getSource() == botonRaíz) {

            num1 = (Double.parseDouble((textfield1.getText())));

            double total;

            total = Math.sqrt(num1);

            // textfield1.setText(Double.toString(total));

            if (total % 1 == 0) {

                long entero = (long) total;

                textfield1.setText(String.valueOf((entero)));

            } else {

                textfield1.setText(String.valueOf((total)));

            }

        }

        if (e.getSource() == boton1) {

 

            textfield1.setText(textfield1.getText() + "1");

 

        }

 

        if (e.getSource() == boton2) {

            textfield1.setText(textfield1.getText() + "2");

 

        }

        if (e.getSource() == boton3) {

            textfield1.setText(textfield1.getText() + "3");

 

        }

        if (e.getSource() == boton4) {

            textfield1.setText(textfield1.getText() + "4");

 

        }

        if (e.getSource() == boton5) {

            textfield1.setText(textfield1.getText() + "5");

        }

        if (e.getSource() == boton6) {

 

            textfield1.setText(textfield1.getText() + "6");

 

        }

       if (e.getSource() == boton7) {

 

            textfield1.setText(textfield1.getText() + "7");

        }

        if (e.getSource() == boton8) {

            textfield1.setText(textfield1.getText() + "8");

        }

        if (e.getSource() == boton9) {

            textfield1.setText(textfield1.getText() + "9");

        }

        if (e.getSource() == boton_cero) {

            textfield1.setText(textfield1.getText() + "0");

        }

        if (e.getSource() == boton_punto) {

            textfield1.setText(textfield1.getText() + ".");

        }

        if (e.getSource() == boton_suma) {

 

            num1 = (Double.parseDouble((textfield1.getText())));

            operacion = "suma";

            textfield1.setText("");

 

        }

        if (e.getSource() == boton_resta) {

 

            num1 = (Double.parseDouble((textfield1.getText())));

            operacion = "resta";

            textfield1.setText("");

        }

        if (e.getSource() == boton_division) {

 

            num1 = (Double.parseDouble((textfield1.getText())));

            operacion = "división";

            textfield1.setText("");

        }

        if (e.getSource() == boton_multiplica) {

 

            num1 = (Double.parseDouble((textfield1.getText())));

            operacion = "multiplicación";

            textfield1.setText("");

        }

        if (e.getSource() == boton_igual) {

 

            num2 = (Double.parseDouble((textfield1.getText())));

            switch (operacion) {

                case "suma":

                    total = num1 + num2;

 

                    textfield1.setText(Double.toString((total)));

                    break;

                case "resta":

                    total = num1 - num2;

                    textfield1.setText(Double.toString((total)));

                    break;

                case "división":

                   

                    total = num1 / num2;

                    textfield1.setText(Double.toString((total)));

                    break;

                case "multiplicación":

                    total = num1 * num2;

                    textfield1.setText(Double.toString((total)));

                    break;

                default:

                    break;

 

            }

            if (total % 1 == 0) {

                long entero = (long) total;

                textfield1.setText(String.valueOf((entero)));

            } else {

                textfield1.setText(String.valueOf((total)));

            }

        }

    }

 

    public static void main(String[] ar) {

        Calcu form = new Calcu();

        form.setBounds(0, 0, 400, 400);

        form.setVisible(true);

 

    }

 

}