package com.duoduo.std;

import java.util.Arrays;

import org.junit.Test;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

public class StdLibTest {

	
	public static void StdDrawLine(){
		int N = 100;
		StdDraw.setXscale(0,N);
		StdDraw.setYscale(0,N*N);
		StdDraw.setPenRadius(.01);
		for(int i = 0; i < N; i++){
			StdDraw.point(i, i);
			StdDraw.point(i, i*i);
			StdDraw.point(i, i*Math.log(i) );
		}
	}
	
	public static void StdDrawRectangle(double[] a){
		int N = a.length;
		for(int i = 0; i < N; i++){
			double x = 1.0 * i / N;
			double y = a[i] / 2.0;
			double rw = 0.5/N;
			double rh = a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
			
		}
	}
	
	public static void DrawRandomRectangle(){
		int N = 50;
		double[] a = new double[N];
		for(int i = 0; i < N; i++){
			a[i] = StdRandom.random();
		}
		StdDrawRectangle(a);
	}
	public static void DrawSortedRectangle(){
		int N = 50;
		double[] a = new double[N];
		for(int i = 0; i < N; i++){
			a[i] = StdRandom.random();
		}
		Arrays.sort(a);
		StdDrawRectangle(a);
	}

	public static void main(String[] args) {
		StdDrawLine();
//		DrawRandomRectangle();
//		DrawSortedRectangle();
	}

}
