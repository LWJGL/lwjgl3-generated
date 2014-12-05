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
public final class JOYINFO implements Pointer {

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

	private final ByteBuffer struct;

	public JOYINFO() {
		this(malloc());
	}

	public JOYINFO(ByteBuffer struct) {
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

	public void setXPos(int xPos) { xPos(struct, xPos); }
	public void setYPos(int yPos) { yPos(struct, yPos); }
	public void setZPos(int zPos) { zPos(struct, zPos); }
	public void setButtons(int buttons) { buttons(struct, buttons); }

	public int getXPos() { return xPos(struct); }
	public int getYPos() { return yPos(struct); }
	public int getZPos() { return zPos(struct); }
	public int getButtons() { return buttons(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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