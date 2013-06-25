package com.duoduo.algs4.Fundamentals;

import java.awt.Color;
import java.util.Arrays;

import com.duoduo.std.DrawArray;

import edu.princeton.cs.introcs.Draw;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class BinarySearch {

	// precondition: array a[] is sorted
	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			// Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	public static double X_DOWN = 0.5;
	public static double Y_DOWN = 200;

	public static Draw DrawArray(int[] a, int loc, Draw draw) {
		return DrawArray(a, X_DOWN, Y_DOWN, loc, draw);
	}

	public static Draw DrawArray(int[] a, double X_DOWN, double Y_DOWN,
			int loc, Draw draw) {
		int N = a.length;

		double x = 1.0 * loc / N;
		double y = a[loc] / Y_DOWN;
		double rw = X_DOWN / N;
		double rh = a[loc] / Y_DOWN;
		draw.setPenColor(Color.RED);
		draw.filledRectangle(x, y, rw, rh);
		draw.setPenColor();
		return draw;
	}

	public static void main(String[] args) {

		int[] whitelist = In.readInts(args[0]);
		int[] guestlist = In.readInts(args[1]);

		Arrays.sort(whitelist);
		Draw draw1 = DrawArray.DrawArray(whitelist, X_DOWN, Y_DOWN,"白名单");
		Draw draw2 = DrawArray.DrawArray(guestlist, X_DOWN, Y_DOWN,"黑名单");
		int local;
		int key;
		int N = guestlist.length;
		for (int i = 0; i < N; i++) {
			key = guestlist[i];
			local = rank(key, whitelist);
			if (local == -1) {
				StdOut.println(key);
				//guest中下标为i的元素不在白名单中
				DrawArray(guestlist, i, draw2);
			} else {
				DrawArray(whitelist, local, draw1);

			}
		}

	}
}