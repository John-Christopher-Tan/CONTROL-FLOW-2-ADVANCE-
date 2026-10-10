/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control.flow.pkg2.advance;


public class CONTROLFLOW2ADVANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 5;

        for (int row = 1; row <= size; row++) {

            if (row == 2) {
                continue;
            }

            for (int col = 1; col <= row; col++) {
                if (col == 4) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
}
