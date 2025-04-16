import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {

    // Main window for the intro screen
    JFrame frame = new JFrame("Flappy Bird");
    JButton playButton = new JButton("Play");
    JButton helpButton = new JButton("Help");
    JButton quitButton = new JButton("Quit");
    JLabel imageLabel = new JLabel();  // Displays an image below the buttons

    /**
     * Constructor for IntroGUI. Sets up the main window, configures buttons,
     * and displays an image. Each button is assigned an ActionListener.
     */
    public MainMenu() {
        // Frame settings
        frame.setSize(350, 460);
        frame.setLocationRelativeTo(null);  // Center the window on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Title label setup
        JLabel titleLabel = new JLabel("Flappy Bird V1", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Center panel for buttons and image
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Play button setup - launches the game
        playButton.setFont(new Font("Arial", Font.PLAIN, 18));
        playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();  // Closes the intro GUI
                //new MatchCards();  // Launch the main game


                    int boardWidth = 360;
                    int boardHeight = 640;

                    JFrame frame = new JFrame("Flappy Bird");
                    // frame.setVisible(true);
                    frame.setSize(boardWidth, boardHeight);
                    frame.setLocationRelativeTo(null);
                    frame.setResizable(false);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    FlappyBird flappyBird = new FlappyBird();
                    frame.add(flappyBird);
                    frame.pack();
                    flappyBird.requestFocus();
                    frame.setVisible(true);


                //new MatchCards2(10); // Test try with new matchcards
            }
        });

        // Help button setup - displays help dialog
        helpButton.setFont(new Font("Arial", Font.PLAIN, 18));
        helpButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showHelpDialog();  // Call method to show instructions
            }
        });

        // Quit button setup - confirms exit
        quitButton.setFont(new Font("Arial", Font.PLAIN, 18));
        quitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(frame, "Are you sure you want to quit the application?", "Quit Game", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0);  // Close the game
                }
            }
        });

        // Add buttons and spacing to center panel
        centerPanel.add(playButton);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Space between buttons
        centerPanel.add(helpButton);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Space between buttons
        centerPanel.add(quitButton);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));  // Space before image

        // Load and display the banner image below buttons
        Image bannerImg = new ImageIcon("src/img/banner1.png").getImage();
        Image gameImage = bannerImg.getScaledInstance(300, 250, Image.SCALE_SMOOTH);  // Resize as needed
        imageLabel.setIcon(new ImageIcon(gameImage));
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(imageLabel);

        // Add center panel to the frame and set visibility
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    /**
     * Displays a help dialog with instructions for the game.
     * Activated when the user clicks the "Help" button.
     */
    private void showHelpDialog() {
        // Help dialog window setup
        JFrame helpFrame = new JFrame("Help");
        helpFrame.setSize(870, 330);
        helpFrame.setLocationRelativeTo(null);  // Center
        helpFrame.setLayout(new BorderLayout());

        // Help title setup
        JLabel helpTitleLabel = new JLabel("Need some assistance?", JLabel.CENTER);
        helpTitleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        helpFrame.add(helpTitleLabel, BorderLayout.NORTH);

        // Help content text area with instructions
        JTextArea helpText = new JTextArea(
                "Instructions for Flappy Bird:" +
                        "\n1. To play this game, click the 'Play' button on the main menu." +
                        "\n2. The objective is to keep the bird in the air and avoid obstacles (pipes) by pressing the 'Spacebar' to make the bird jump." +
                        "\n3. The bird is affected by gravity, so it will fall unless you press the 'Spacebar' to jump." +
                        "\n4. Avoid colliding with the pipes. The game will end if the bird hits a pipe or falls to the ground." +
                        "\n5. The score is displayed at the top of the screen. It increases as the bird successfully passes through pipes." +
                        "\n6. When the game is over, you will be prompted with a screen showing your score." +
                        "\n7. To restart the game, press the 'Spacebar' after the game is over." +
                        "\n8. You can also quit the game from the main menu." +
                        "\n " +
                        "\nFor further assistance, please contact support@flappybirdgame.com." +
                        "\nThank you!"

        );
        helpText.setEditable(false);
        helpText.setFont(new Font("Arial", Font.PLAIN, 16));
        helpFrame.add(new JScrollPane(helpText), BorderLayout.CENTER);

        helpFrame.setVisible(true);
    }
}