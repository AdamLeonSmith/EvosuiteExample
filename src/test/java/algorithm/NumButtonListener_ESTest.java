/*
 * This file was automatically generated by EvoSuite
 * Tue Sep 22 12:44:06 GMT 2020
 */

package algorithm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import algorithm.NumButtonListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.plaf.synth.SynthCheckBoxUI;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.StyledEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NumButtonListener_ESTest extends NumButtonListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea();
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 0, "C");
      // Undeclared exception!
      try { 
        numButtonListener0.actionPerformed(actionEvent0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumButtonListener numButtonListener0 = new NumButtonListener((JTextArea) null, (JTextArea) null);
      Dimension dimension0 = new Dimension();
      Box.Filler box_Filler0 = new Box.Filler(dimension0, dimension0, dimension0);
      ActionEvent actionEvent0 = new ActionEvent(box_Filler0, 1, (String) null, 0, 0);
      // Undeclared exception!
      try { 
        numButtonListener0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("algorithm.NumButtonListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea(".");
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      SynthCheckBoxUI synthCheckBoxUI0 = new SynthCheckBoxUI();
      ActionEvent actionEvent0 = new ActionEvent(synthCheckBoxUI0, 0, ".", 0);
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals(0, actionEvent0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea(")");
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      Integer integer0 = new Integer((-439));
      ActionEvent actionEvent0 = new ActionEvent(integer0, (-439), ")");
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea(".");
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      ActionEvent actionEvent0 = new ActionEvent(".", 1080, "(", 1080, 1080);
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals(1080L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea();
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      ActionEvent actionEvent0 = new ActionEvent("AC", 0, "AC", 0);
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals("AC", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StyledEditorKit styledEditorKit0 = new StyledEditorKit();
      Document document0 = styledEditorKit0.createDefaultDocument();
      JTextArea jTextArea0 = new JTextArea(document0);
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      ActionEvent actionEvent0 = new ActionEvent(jTextArea0, 0, "9", 0);
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals(0, actionEvent0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea("8");
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      ActionEvent actionEvent0 = new ActionEvent(jTextArea0, (-8323604), "8", (-8323604));
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals("8", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea(".");
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      ActionEvent actionEvent0 = new ActionEvent(".", (-783), "7", 4472);
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals("7", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea("S>)m5,U,eS!-");
      SynthCheckBoxUI synthCheckBoxUI0 = new SynthCheckBoxUI();
      ActionEvent actionEvent0 = new ActionEvent(synthCheckBoxUI0, (-1), "6", (-1), (-1));
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals((-1), actionEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea("lvkKnp$4u|&{", 326, 326);
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      ActionEvent actionEvent0 = new ActionEvent("lvkKnp$4u|&{", 326, "5");
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals(326, actionEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 7, "4", 7);
      JTextArea jTextArea0 = new JTextArea();
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea("lvkKnp$4u|&{", 326, 326);
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      ActionEvent actionEvent0 = new ActionEvent(numButtonListener0, 326, "3");
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea();
      SynthCheckBoxUI synthCheckBoxUI0 = new SynthCheckBoxUI();
      ActionEvent actionEvent0 = new ActionEvent(synthCheckBoxUI0, (-3379), "2", (-3379));
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 0, "1", 0);
      JTextArea jTextArea0 = new JTextArea("1", 0, 0);
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals("1", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea("Invalid Input", 3433, 3433);
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      ActionEvent actionEvent0 = new ActionEvent(jTextArea0, 3433, "Invalid Input");
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      JTextArea jTextArea0 = new JTextArea(defaultStyledDocument0);
      NumButtonListener numButtonListener0 = new NumButtonListener(jTextArea0, jTextArea0);
      SynthCheckBoxUI synthCheckBoxUI0 = new SynthCheckBoxUI();
      ActionEvent actionEvent0 = new ActionEvent(synthCheckBoxUI0, 2147479424, "0");
      numButtonListener0.actionPerformed(actionEvent0);
      assertEquals(0, actionEvent0.getModifiers());
  }
}
