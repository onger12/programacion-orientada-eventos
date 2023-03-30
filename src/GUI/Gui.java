package GUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {

  // CONSTANTS
  private int WIDTH, HEIGHT, INITIAL_SCREEN_POS_X, INITIAL_SCREEN_POS_Y; // window constants
  private int HEADER_WIDTH, HEADER_HEIGHT, INITIAL_HEADER_POS_X, INITIAL_HEADER_POS_Y; // header cosntants
  private int FORM_WIDTH, FORM_HEIGHT, INITIAL_FORM_POS_X, INITIAL_FORM_POS_Y; // form cosntants
  private Color INITIAL_BG_COLOR; // window colors
  private Color INITIAL_FORM_COLOR; // form colors
  private Color HEADER_INITIAL_BG_COLOR;


  // variables
  JLabel jlTitulo, jlImg, jlTextImg, jlFormTitle;
  JButton bjText;
  JPanel jpHeader, jpForm;

  public Gui() {
    super("Este es el título de la ventana");
    initConstants();
    initWindowConfig();    
    createGUI();

    setVisible(true);
  }

  public void createGUI() {
    initHeader();
    initMainForm();

    // ImageIcon icon = new ImageIcon(getClass().getResource("../assets/cat_bg_2.png"));
    // jlImg = new JLabel(icon);
    // jlImg.setBounds((800 - 170) / 2, 70, 170, 170);
    // add(jlImg);

    // ImageIcon iconText = new ImageIcon(getClass().getResource("../assets/cat_bg.png"));
    // jlTextImg = new JLabel("this cat is a very wonderfully", iconText, JLabel.CENTER);
    // jlTextImg.setHorizontalTextPosition(JLabel.CENTER);
    // jlTextImg.setVerticalTextPosition(JLabel.BOTTOM);
    // jlTextImg.setBounds((800 - 300) / 2, 370, 300, 300);
    // add(jlTextImg);

    // bjText = new JButton("Ver mensaje");
    // bjText.setBounds((800 - 300) / 2, 690, 300, 50);
    // bjText.setBackground(Color.orange);
    // bjText.setForeground(Color.BLACK);
    // bjText.setFont(new Font("Fira Code", Font.PLAIN, 14));
    // bjText.setMnemonic('V');
    // bjText.setCursor(new Cursor(Cursor.HAND_CURSOR));
    // bjText.addActionListener(new ActionListener() {
    //   @Override
    //   public void actionPerformed(ActionEvent e) {
    //     onCLickBtn();
    //   }
    // });

    // add(bjText);
  }

  private void initHeader() {
    jpHeader = new JPanel();
    jpHeader.setBounds(INITIAL_HEADER_POS_X,INITIAL_HEADER_POS_Y,HEADER_WIDTH,HEADER_HEIGHT);
    jpHeader.setBackground(HEADER_INITIAL_BG_COLOR);
    
    jlTitulo = new JLabel("Universidad del valle - Sede buga");
    jlTitulo.setBounds(INITIAL_HEADER_POS_X, INITIAL_HEADER_POS_Y, HEADER_WIDTH, HEADER_HEIGHT);
    // jlTitulo.setOpaque(true);
    jlTitulo.setForeground(Color.BLACK);
    jlTitulo.setFont(new Font("Fira Code", Font.ITALIC | Font.BOLD, 24));
    jlTitulo.setHorizontalAlignment(JLabel.CENTER);
    jpHeader.add(jlTitulo);

    add(jpHeader);
  }

  private void initMainForm() {
    jpForm = new JPanel();
    jpForm.setBounds(INITIAL_FORM_POS_X, INITIAL_FORM_POS_Y, FORM_WIDTH, FORM_HEIGHT);
    jpForm.setBackground(INITIAL_FORM_COLOR);

    jlFormTitle = new JLabel('');
    add(jpForm);
  }

  public void initWindowConfig () {
    setSize(WIDTH, HEIGHT);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    getContentPane().setBackground(INITIAL_BG_COLOR);
    // setAlwaysOnTop(true);
    setLayout(null);
    Image icon = new ImageIcon(getClass().getResource("../assets/cat_bg.png")).getImage();
    setIconImage(icon);
  }

  public void initConstants () {
    // WINDOW
    WIDTH = 800;
    HEIGHT = 800;
    INITIAL_SCREEN_POS_X = 0;
    INITIAL_SCREEN_POS_Y = 0;
    INITIAL_BG_COLOR = Color.ORANGE;

    // HEADER
    HEADER_HEIGHT = 50;
    HEADER_WIDTH = WIDTH;
    INITIAL_HEADER_POS_X = INITIAL_SCREEN_POS_X;
    INITIAL_HEADER_POS_Y = INITIAL_SCREEN_POS_Y;
    HEADER_INITIAL_BG_COLOR = Color.RED;

    // FORM
    FORM_WIDTH = 400;
    FORM_HEIGHT = 600;
    INITIAL_FORM_POS_X = (WIDTH - FORM_WIDTH) / 2;
    INITIAL_FORM_POS_Y = HEADER_HEIGHT + 50;
    INITIAL_FORM_COLOR = Color.darkGray;
  }

  public void onCLickBtn() {
    JOptionPane.showMessageDialog(this, "Click on button", "Message", JOptionPane.INFORMATION_MESSAGE);
  }
}
