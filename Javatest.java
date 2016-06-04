import java.io.Console;
import javax.swing.JOptionPane;

class Javatest {
    public Javatest() {
        String start = "You are using Java version ";
        String version = System.getProperty("java.version");
        String end = "";
        if (version.startsWith("1.8") || version.startsWith("1.7")) {
            end = " which is good enough for me!";
        } else {
            end = " which is too old :(";
        }
        JOptionPane jp = new JOptionPane();
        jp.showMessageDialog(null, start + version + end);
    }

    public static void main(String[] args) {
        Javatest jt = new Javatest();
    }
}

        

