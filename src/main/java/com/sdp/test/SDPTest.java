package com.sdp.test;

import com.sdp.beans.DataComputation;
import com.sdp.beans.OperationAdd;
import com.sdp.beans.OperationSubstract;

public class SDPTest {
	public static void main(String[] args) {
		DataComputation dc = new DataComputation(new OperationAdd());
		System.out.println("10 + 5 = " + dc.executeStrategy(10, 5));
		DataComputation dc1 = new DataComputation(new OperationSubstract());
		System.out.println("10 - 5 = " + dc1.executeStrategy(10, 5));
	}

}
