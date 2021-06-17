package com.ivan.polovyi.facadepattern.email;

public class StationaryFactory {

	public static Stationary createStationary() {
		return new HalloweenStationary();
	}
}
