/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionIcad.vue;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kyorai
 */
public class MyTableModel extends DefaultTableModel {

    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
