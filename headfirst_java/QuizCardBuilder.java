import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCardBuilder {
   private JTextArea question;
   private JTextArea answer;
   private ArrayList<QuizCard> cardList;
   private JFrame frame;

   public static void main(String[] args) {
      QuizCardBuilder builder = new QuizCardBuilder();
      builder.go();
   }

   public void go() {
      frame = new JFrame("Quiz Card Builder");
      JPanel mainPanel = new JPanel();
      Font bigFont = new Font("sanserif", Font.BOLD, 24);
      question = new JTextArea(6, 20);
      question.setLineWrap(true);
      question.setWrapStyleWord(true);
      question.setFont(bigFont);

      JScrollPanel qScroller = new JScrollPanel(question);
      qScroller.setVerticalBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      qScroller.setHorizontalBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

      answer = JTextArea(6,20);
      answer.setLineWrap(true);
      answer.setWrapStyleWorld(true);
      answer.setFont(bigFont);

      JScrollPane aScroller = new JScrollPane(answer);
      aScroller.setVerticalBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      aScroller.setHorizontalBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

      JButton nextButton = new JButton("Next Card");

      cardList = new ArrayList<QuizCard>();

      JLabel qLabel = new JLabel("Question");
      JLabel aLabel = new JLabel("Answer:");

      mainPanel.add(qLabel);
      mainPanel.add(qScroller);
      mainPanel.add(aLabel);
      mainPanel.add(aScroller);
      mainPanel.add(nextButton);
      nextButton.addActionListener(new NextCardListener());
      JMenuBar menuBar = new JMenuBar();
      JMenu fileMenu = new JMenu("File");
      JMenuItem newMenuItem = new JMenuItem("New");
      JMenuItem saveMenuItem = new JMenuItem("Save");
      newMenuItem.addActionListener(new newMenuListener());

      saveMenuItem.addActionListener(new SaveMenuListener());
      fileMenu.add(newMenuItem);
      fileMenu.add(saveMenuItem);
      menuBar.add(fileMenu);
      frame.setJMenuBar(menuBar);
      frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
      frame.setSize(500, 500);
      frame.setVisible(true);
   }

   public class NextCardListener impmlements ActionListener {
      public void actionPerformed(ActionEvent ev) {

         QuizCard card = new QuizCard(question.getText(), answer.getText());
         cardList.add(card);
         clearCard();
      }
   }

   public class SaveMenuListener implements ActionListener {
      public void actionPerformed(ActionEvent ev) {
         QuizCard card = new QuizCard(question.getText(), answer.getText());
         cardList.add(card);

         JFileChooser fileSave = new JFileChooser();
         fileSave.showSaveDialog(frame);
         saveFile(fileSave.getSelectedFile());
      }
   }

   public class newMenuListener implements ActionListener {
      public void actionPerformed(ActionEvent ev) {
         cardList.clear();
         clearCard();
      }
   }

   private void clearCard() {
      question.setText("");
      answer.setText("");
      question.requestFocus();
   }

   private void saveFile(File file) {
      try {
         BufferedWriter writer = new BufferedWriter(new FileWriter(file));

         for(QuizCard card:cardList) {
            writer.write(card.getQuestion() + "/");
            writer.write(card.getAnswer() + "\n");
         }
         writer.close();
      } catch(IOException ex) {
         System.out.println("couldn't write the cardList out");
         ex.printStackTrace();
      }
   }
}