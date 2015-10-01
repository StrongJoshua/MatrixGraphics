
package main;

import framework.math.Vector3;

public class Camera {
	private Vector3 pos;

	public Camera () {
		pos = new Vector3();
	}

	public Vector3 getPos () {
		return pos;
	}
}
