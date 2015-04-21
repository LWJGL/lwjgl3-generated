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

/** Used by ovrhmd_GetHSWDisplayState to report the current display state. */
public final class OVRHSWDisplayState implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		DISPLAYED,
		STARTTIME,
		DISMISSIBLETIME;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		DISPLAYED = offsets.get(0);
		STARTTIME = offsets.get(1);
		DISMISSIBLETIME = offsets.get(2);
	}

	private final ByteBuffer struct;

	public OVRHSWDisplayState() {
		this(malloc());
	}

	public OVRHSWDisplayState(ByteBuffer struct) {
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

	public void setDisplayed(boolean Displayed) { Displayed(struct, Displayed); }
	public void setStartTime(double StartTime) { StartTime(struct, StartTime); }
	public void setDismissibleTime(double DismissibleTime) { DismissibleTime(struct, DismissibleTime); }

	public boolean getDisplayed() { return Displayed(struct); }
	public double getStartTime() { return StartTime(struct); }
	public double getDismissibleTime() { return DismissibleTime(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		boolean Displayed,
		double StartTime,
		double DismissibleTime
	) {
		ByteBuffer ovrhswdisplaystate = malloc();

		Displayed(ovrhswdisplaystate, Displayed);
		StartTime(ovrhswdisplaystate, StartTime);
		DismissibleTime(ovrhswdisplaystate, DismissibleTime);

		return ovrhswdisplaystate;
	}

	public static void Displayed(ByteBuffer ovrhswdisplaystate, boolean Displayed) { ovrhswdisplaystate.put(ovrhswdisplaystate.position() + DISPLAYED, Displayed ? (byte)1 : (byte)0); }
	public static void StartTime(ByteBuffer ovrhswdisplaystate, double StartTime) { ovrhswdisplaystate.putDouble(ovrhswdisplaystate.position() + STARTTIME, StartTime); }
	public static void DismissibleTime(ByteBuffer ovrhswdisplaystate, double DismissibleTime) { ovrhswdisplaystate.putDouble(ovrhswdisplaystate.position() + DISMISSIBLETIME, DismissibleTime); }

	public static boolean Displayed(ByteBuffer ovrhswdisplaystate) { return ovrhswdisplaystate.get(ovrhswdisplaystate.position() + DISPLAYED) != 0; }
	public static double StartTime(ByteBuffer ovrhswdisplaystate) { return ovrhswdisplaystate.getDouble(ovrhswdisplaystate.position() + STARTTIME); }
	public static double DismissibleTime(ByteBuffer ovrhswdisplaystate) { return ovrhswdisplaystate.getDouble(ovrhswdisplaystate.position() + DISMISSIBLETIME); }

}