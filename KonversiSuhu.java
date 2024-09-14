import javax.swing.JOptionPane;

public class KonversiSuhu {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Masukkan suhu dalam Celsius:");

        if (input != null) {
            try {
                double celsius = Double.parseDouble(input);

                double fahrenheit = (celsius * 9/5) + 32;

                JOptionPane.showMessageDialog(null, 
                    "Suhu dalam Fahrenheit adalah: " + fahrenheit + "°F",
                    "Hasil Konversi",
                    JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, 
                    "Input tidak valid. Harap masukkan angka yang benar.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, 
                "Operasi dibatalkan.",
                "Info",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
