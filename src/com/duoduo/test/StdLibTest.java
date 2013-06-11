package com.duoduo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

public class StdLibTest {

	@Before
	public void setUp() throws Exception {
	}


	//@Test
	public void testStdDrawLine(){
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
	
	@Test
	public void testStdDrawRectangle(){
		int N = 50;
		double[] a = new double[N];
		for(int i = 0; i < N; i++){
			a[i] = StdRandom.random();
		}
		for(int i = 0; i < N; i++){
			double x = 1.0 * i / N;
			double y = a[i] / 2.0;
			double rw = 0.5/N;
			double rh = a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
			
		}
	}

}
