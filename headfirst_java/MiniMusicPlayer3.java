import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer3 {

   static JFrame f = new JFrame("Music");
   static DrawPanelA drawPanel;

   public static void main(String args[]) {
      MiniMusicPlayer3 mini = new MiniMusicPlayer3();
      mini.go();
   }

   public void setUpGui() {
      drawPanel = new DrawPanelA();
      f.setContentPane(drawPanel);
   }
}