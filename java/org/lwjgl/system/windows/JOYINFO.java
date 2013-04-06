/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains information about the joystick position and button state. */
public final class JOYINFO {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		XPOS,
		YPOS,
		ZPOS,
		BUTTONS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		XPOS = offsets.get(0);
		YPOS = offsets.get(1);
		ZPOS = offsets.get(2);
		BUTTONS = offsets.get(3);
	}

	private JOYINFO() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int xPos,
		int yPos,
		int zPos,
		int buttons
	) {
		ByteBuffer joyinfo = malloc();

		xPosSet(joyinfo, xPos);
		yPosSet(joyinfo, yPos);
		zPosSet(joyinfo, zPos);
		buttonsSet(joyinfo, buttons);

		return joyinfo;
	}

	public static void xPosSet(ByteBuffer joyinfo, int xPos) { joyinfo.putInt(joyinfo.position() + XPOS, xPos); }
	public static void yPosSet(ByteBuffer joyinfo, int yPos) { joyinfo.putInt(joyinfo.position() + YPOS, yPos); }
	public static void zPosSet(ByteBuffer joyinfo, int zPos) { joyinfo.putInt(joyinfo.position() + ZPOS, zPos); }
	public static void buttonsSet(ByteBuffer joyinfo, int buttons) { joyinfo.putInt(joyinfo.position() + BUTTONS, buttons); }

	public static int xPosGet(ByteBuffer joyinfo) { return joyinfo.getInt(joyinfo.position() + XPOS); }
	public static int yPosGet(ByteBuffer joyinfo) { return joyinfo.getInt(joyinfo.position() + YPOS); }
	public static int zPosGet(ByteBuffer joyinfo) { return joyinfo.getInt(joyinfo.position() + ZPOS); }
	public static int buttonsGet(ByteBuffer joyinfo) { return joyinfo.getInt(joyinfo.position() + BUTTONS); }

}