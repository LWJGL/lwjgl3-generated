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

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int xPos,
		int yPos,
		int zPos,
		int buttons
	) {
		ByteBuffer joyinfo = malloc();

		xPos(joyinfo, xPos);
		yPos(joyinfo, yPos);
		zPos(joyinfo, zPos);
		buttons(joyinfo, buttons);

		return joyinfo;
	}

	public static void xPos(ByteBuffer joyinfo, int xPos) { joyinfo.putInt(joyinfo.position() + XPOS, xPos); }
	public static void yPos(ByteBuffer joyinfo, int yPos) { joyinfo.putInt(joyinfo.position() + YPOS, yPos); }
	public static void zPos(ByteBuffer joyinfo, int zPos) { joyinfo.putInt(joyinfo.position() + ZPOS, zPos); }
	public static void buttons(ByteBuffer joyinfo, int buttons) { joyinfo.putInt(joyinfo.position() + BUTTONS, buttons); }

	public static int xPos(ByteBuffer joyinfo) { return joyinfo.getInt(joyinfo.position() + XPOS); }
	public static int yPos(ByteBuffer joyinfo) { return joyinfo.getInt(joyinfo.position() + YPOS); }
	public static int zPos(ByteBuffer joyinfo) { return joyinfo.getInt(joyinfo.position() + ZPOS); }
	public static int buttons(ByteBuffer joyinfo) { return joyinfo.getInt(joyinfo.position() + BUTTONS); }

}