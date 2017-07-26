/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg17.pkg17;
import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
/**
 *
 * @author Patrick Matthew Chan
 */
public class Main extends GraphicsProgram{
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;
    private double getXCenter(GObject g){
        return (getWidth() - g.getWidth())/2;
    }
    private double getYCenter(GObject g){
        return (getHeight() - g.getHeight())/2;
    }
    private double aaa(int bricks,GObject g){
        return (getWidth() - bricks*g.getWidth())/2;
    }
    public void run(){
        int BRICK_WIDTH=30;
        int BRICK_HEIGHT=12;
        int BRICKS_IN_BASE=14;
        //GRect a = new GRect(BRICK_WIDTH,BRICK_HEIGHT);
        //add(a,getXCenter(a),getHeight()-BRICK_HEIGHT);
        //add(a,getXCenter(a)-100,getHeight()-BRICK_HEIGHT);
        for(int j=BRICKS_IN_BASE;j!=0;j--){
            for(int i=1;i!=j+1;i++){
                GRect a = new GRect(BRICK_WIDTH,BRICK_HEIGHT);
                add(a,aaa(j,a)+((i-1)*BRICK_WIDTH),getHeight()-(BRICK_HEIGHT*(BRICKS_IN_BASE-j+1)));
            }
        }
        
    }
    public static void main(String[] args) {
        new Main().start(args);
    }   
}
