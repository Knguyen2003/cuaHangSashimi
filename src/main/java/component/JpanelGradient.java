/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class JpanelGradient extends JPanel{
    private Color colorEnd = new Color(51,255,204);
    private Color colorStart  = new Color(51,51,255);
    public Color getColorStart() {
        return colorStart;
    }

    public void setColorStart(Color colorStart) {
        this.colorStart = colorStart;
    }

    public Color getColorEnd() {
        return colorEnd;
    }

    public void setColorEnd(Color colorEnd) {
        this.colorEnd = colorEnd;
    }
    
    public JpanelGradient() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(0, 0, colorStart, getWidth(), getHeight(), colorEnd);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }

   


}
