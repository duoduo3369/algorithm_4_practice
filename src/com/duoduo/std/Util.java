package com.duoduo.std;

public class Util {

	public Util() {
		// TODO Auto-generated constructor stub
	}
	public static double[] copy(int a[]){
		int N = a.length;
		double[] b = new double[N];
		for(int i = 0; i < N; i++){
			b[i] = a[i];
		}
		return b;
	}

}
