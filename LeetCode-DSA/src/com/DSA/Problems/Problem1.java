package com.DSA.Problems;

import java.time.chrono.HijrahChronology;
import java.util.HashMap;
import java.util.HashSet;

/*
 * @Contrubuter-Prashant Nawale
 * 
 * @Problem Statement-
 *    Two Sum Given an input of array and target sum.Return index of the two element that sum
 *    equal to target element.
 *    Assume that input have exactly one solution and give answer in any order of pair
 *  
 */


public class Problem1 {
	
	private static class Pair{
		public int first=0,second=0;
	}
	
	private static Pair getIndexOfTargetSum(int[] arr, int target) {
		Pair pair = new Problem1.Pair();
		/* Brute force approach 
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]+arr[j]==target) {
					pair.first=i;
					pair.second=j;
				}
		}
		*/


		// Map Solution
		/*
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(target-arr[i])) {
				pair.first=map.get(target-arr[i]);
				pair.second=i;
			}
			else {
				map.put(arr[i], i);
			}
		}
		*/
		
		// Array Solution
		int []targetArray=new int[target+1];
		for(int i=0;i<arr.length;i++) {
			if(targetArray[target-arr[i]]!=0) {
				pair.first=i;
				pair.second=targetArray[target-arr[i]];
			}
			else {
				targetArray[arr[i]]=i;
			}
		}
		
		return pair;
	}
	
	
	
	public static void main(String [] args) {
		int []arr= {1,4,6,7,8,10};
		int target=15;
		
		Pair pair =getIndexOfTargetSum(arr,target);
		
		System.out.println("Index as:"+pair.first+" "+pair.second);
		
	}

	
}

