package com.duoduo.std;

import java.util.Arrays;

import org.junit.Test;

import edu.princeton.cs.introcs.Draw;
import edu.princeton.cs.introcs.StdRandom;

public class DrawArray {

	
	public static Draw DrawLine(){
		int N = 100;
		Draw draw = new Draw("画线");
		draw.setXscale(0,N);
		draw.setYscale(0,N*N);
		draw.setPenRadius(.01);
		for(int i = 0; i < N; i++){
			draw.point(i, i);
			draw.point(i, i*i);
			draw.point(i, i*Math.log(i) );
		}
		return draw;
	}
	public static Draw DrawArray(int[] a,String name){
		double[] b = Util.copy(a);
		return DrawArray(b,name);
	}
	public static Draw DrawArray(double[] a,String name){
		Draw draw = new Draw(name);
		return DrawArray(a,0.5,2.0,draw);
	}
	public static Draw DrawArray(int[] a,double X_DOWN,double Y_DOWN,String name){
		Draw draw = new Draw(name);
		return DrawArray(a,X_DOWN,Y_DOWN,draw);
	}
	public static Draw DrawArray(int[] a,double X_DOWN,double Y_DOWN,Draw draw){
		double[] b = Util.copy(a);
		return DrawArray(b,X_DOWN,Y_DOWN,draw);
	}
	public static Draw DrawArray(double[] a,double X_DOWN,double Y_DOWN,String name){
		Draw draw = new Draw(name);
		return DrawArray(a,X_DOWN,Y_DOWN,draw);
	}
	public static Draw DrawArray(double[] a,double X_DOWN,double Y_DOWN,Draw draw){
		//建议Y_DOWN为最大数值的两倍
		int N = a.length;
		for(int i = 0; i < N; i++){
			double x = 1.0 * i / N;
			double y = a[i] / Y_DOWN;
			double rw = X_DOWN/N;
			double rh = a[i] / Y_DOWN;
			draw.filledRectangle(x, y, rw, rh);
			
		}
		return draw;
	}
	
	public static Draw DrawRandomArray(){
		int N = 50;
		double[] a = new double[N];
		for(int i = 0; i < N; i++){
			a[i] = StdRandom.random();
		}
		return DrawArray(a,"随机数组");
	}
	public static Draw DrawSortedArray(){
		int N = 50;
		double[] a = new double[N];
		for(int i = 0; i < N; i++){
			a[i] = StdRandom.random();
		}
		Arrays.sort(a);
		return DrawArray(a,"排序数组");
	}
	public static Draw DrawSortedArray2(){
		int N = 50;
		int[] a = new int[N];
		for(int i = 0; i < N; i++){
			a[i] = i;
		}
		Arrays.sort(a);
		
		return DrawArray(a,0.5,N*2,"设定高度的排序数组");
	}

	public static void main(String[] args) {
		DrawLine();
		DrawRandomArray();
		DrawSortedArray();
		DrawSortedArray2();
	}

}
