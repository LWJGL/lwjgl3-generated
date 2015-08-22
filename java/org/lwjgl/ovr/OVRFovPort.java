/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Field Of View (FOV) in tangent of the angle units. As an example, for a standard 90 degree vertical FOV, we would have:
 * <pre><code style="font-family: monospace">
 * { UpTan = tan(90 degrees / 2), DownTan = tan(90 degrees / 2) }</code></pre>.
 */
public final class OVRFovPort implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		UPTAN,
		DOWNTAN,
		LEFTTAN,
		RIGHTTAN;

	static {
		IntBuffer offsets = memAllocInt(4);

		SIZEOF = offsets(memAddress(offsets));

		UPTAN = offsets.get(0);
		DOWNTAN = offsets.get(1);
		LEFTTAN = offsets.get(2);
		RIGHTTAN = offsets.get(3);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRFovPort() {
		this(malloc());
	}

	public OVRFovPort(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public OVRFovPort setUpTan(float UpTan) { UpTan(struct, UpTan); return this; }
	public OVRFovPort setDownTan(float DownTan) { DownTan(struct, DownTan); return this; }
	public OVRFovPort setLeftTan(float LeftTan) { LeftTan(struct, LeftTan); return this; }
	public OVRFovPort setRightTan(float RightTan) { RightTan(struct, RightTan); return this; }

	public float getUpTan() { return UpTan(struct); }
	public float getDownTan() { return DownTan(struct); }
	public float getLeftTan() { return LeftTan(struct); }
	public float getRightTan() { return RightTan(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		float UpTan,
		float DownTan,
		float LeftTan,
		float RightTan
	) {
		ByteBuffer ovrfovport = malloc();

		UpTan(ovrfovport, UpTan);
		DownTan(ovrfovport, DownTan);
		LeftTan(ovrfovport, LeftTan);
		RightTan(ovrfovport, RightTan);

		return ovrfovport;
	}

	public static void UpTan(ByteBuffer ovrfovport, float UpTan) { ovrfovport.putFloat(ovrfovport.position() + UPTAN, UpTan); }
	public static void DownTan(ByteBuffer ovrfovport, float DownTan) { ovrfovport.putFloat(ovrfovport.position() + DOWNTAN, DownTan); }
	public static void LeftTan(ByteBuffer ovrfovport, float LeftTan) { ovrfovport.putFloat(ovrfovport.position() + LEFTTAN, LeftTan); }
	public static void RightTan(ByteBuffer ovrfovport, float RightTan) { ovrfovport.putFloat(ovrfovport.position() + RIGHTTAN, RightTan); }

	public static float UpTan(ByteBuffer ovrfovport) { return ovrfovport.getFloat(ovrfovport.position() + UPTAN); }
	public static float DownTan(ByteBuffer ovrfovport) { return ovrfovport.getFloat(ovrfovport.position() + DOWNTAN); }
	public static float LeftTan(ByteBuffer ovrfovport) { return ovrfovport.getFloat(ovrfovport.position() + LEFTTAN); }
	public static float RightTan(ByteBuffer ovrfovport) { return ovrfovport.getFloat(ovrfovport.position() + RIGHTTAN); }

}