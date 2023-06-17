import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TruthOrDareGame extends JFrame {
    private JLabel messageLabel;
    private JButton truthButton;
    private JButton dareButton;

    public TruthOrDareGame() {
        setTitle("Truth or Dare Game");
        setSize(300, 200);
        setLocationRelativeTo(null);

        messageLabel = new JLabel("Choose Truth or Dare");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        truthButton = new JButton("Truth");
        truthButton.addActionListener(new ButtonListener());

        dareButton = new JButton("Dare");
        dareButton.addActionListener(new ButtonListener());

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(messageLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(truthButton);
        buttonPanel.add(dareButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == truthButton) {
                showTruth();
            } else if (event.getSource() == dareButton) {
                showDare();
            }
        }
    }

    private void showTruth() {
        String[] truths = {
                "Apa rahasia yang kamu sembunyikan?",
                "Siapa orang yang diam-diam kamu sukai?",
                "Siapa orang terakhir yang kamu kepoin di media sosial?",
                "Siapa orang yang paling sering kamu chat?",
                "Siapa mantan terindahmu?",
                "Apa aib yang kamu sembunyikan dari kami?",
                "Apa film favoritmu sepanjang masa?",
                "Apa hal paling konyol yang pernah kamu lakukan di depan umum?",
                "Apa hal teraneh yang pernah kamu coba lakukan di tengah malam?"
        };

        int randomIndex = (int) (Math.random() * truths.length);
        String truth = truths[randomIndex];

        JOptionPane.showMessageDialog(null, truth, "Truth", JOptionPane.PLAIN_MESSAGE);

//        System.exit(0);
    }

    private void showDare() {
        String[] dares = {
                "Push up 10 kali",
                "Buatlah joks absurd",
                "Telpon pacar",
                "Menarilah",
                "Buat story IG pargoy",
                "Nyanyikan sebuah lagu",
                "Cobalah tarian TikTok pertama yang muncul di FYP-mu.",
                "Hubungi orang ke 6 di tanda pesawat"
        };

        int randomIndex = (int) (Math.random() * dares.length);
        String dare = dares[randomIndex];

        JOptionPane.showMessageDialog(null, dare, "Dare", JOptionPane.PLAIN_MESSAGE);

//        System.exit(0);
    }


}