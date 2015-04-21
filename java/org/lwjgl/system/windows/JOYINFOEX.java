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

/** Contains extended information about the joystick position, point-of-view position, and button state. */
public final class JOYINFOEX implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SIZE,
		FLAGS,
		XPOS,
		YPOS,
		ZPOS,
		RPOS,
		UPOS,
		VPOS,
		BUTTONS,
		BUTTONNUMBER,
		POV,
		RESERVED1,
		RESERVED2;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(13);

		SIZEOF = offsets(memAddress(offsets));

		SIZE = offsets.get(0);
		FLAGS = offsets.get(1);
		XPOS = offsets.get(2);
		YPOS = offsets.get(3);
		ZPOS = offsets.get(4);
		RPOS = offsets.get(5);
		UPOS = offsets.get(6);
		VPOS = offsets.get(7);
		BUTTONS = offsets.get(8);
		BUTTONNUMBER = offsets.get(9);
		POV = offsets.get(10);
		RESERVED1 = offsets.get(11);
		RESERVED2 = offsets.get(12);
	}

	private final ByteBuffer struct;

	public JOYINFOEX() {
		this(malloc());
	}

	public JOYINFOEX(ByteBuffer struct) {
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

	public void setSize(int size) { size(struct, size); }
	public void setFlags(int flags) { flags(struct, flags); }
	public void setXPos(int xPos) { xPos(struct, xPos); }
	public void setYPos(int yPos) { yPos(struct, yPos); }
	public void setZPos(int zPos) { zPos(struct, zPos); }
	public void setRPos(int rPos) { rPos(struct, rPos); }
	public void setUPos(int uPos) { uPos(struct, uPos); }
	public void setVPos(int vPos) { vPos(struct, vPos); }
	public void setButtons(int buttons) { buttons(struct, buttons); }
	public void setButtonNumber(int buttonNumber) { buttonNumber(struct, buttonNumber); }
	public void setPOV(int pov) { POV(struct, pov); }
	public void setReserved1(int reserved1) { reserved1(struct, reserved1); }
	public void setReserved2(int reserved2) { reserved2(struct, reserved2); }

	public int getSize() { return size(struct); }
	public int getFlags() { return flags(struct); }
	public int getXPos() { return xPos(struct); }
	public int getYPos() { return yPos(struct); }
	public int getZPos() { return zPos(struct); }
	public int getRPos() { return rPos(struct); }
	public int getUPos() { return uPos(struct); }
	public int getVPos() { return vPos(struct); }
	public int getButtons() { return buttons(struct); }
	public int getButtonNumber() { return buttonNumber(struct); }
	public int getPOV() { return POV(struct); }
	public int getReserved1() { return reserved1(struct); }
	public int getReserved2() { return reserved2(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int size,
		int flags,
		int xPos,
		int yPos,
		int zPos,
		int rPos,
		int uPos,
		int vPos,
		int buttons,
		int buttonNumber,
		int POV,
		int reserved1,
		int reserved2
	) {
		ByteBuffer joyinfoex = malloc();

		size(joyinfoex, size);
		flags(joyinfoex, flags);
		xPos(joyinfoex, xPos);
		yPos(joyinfoex, yPos);
		zPos(joyinfoex, zPos);
		rPos(joyinfoex, rPos);
		uPos(joyinfoex, uPos);
		vPos(joyinfoex, vPos);
		buttons(joyinfoex, buttons);
		buttonNumber(joyinfoex, buttonNumber);
		POV(joyinfoex, POV);
		reserved1(joyinfoex, reserved1);
		reserved2(joyinfoex, reserved2);

		return joyinfoex;
	}

	public static void size(ByteBuffer joyinfoex, int size) { joyinfoex.putInt(joyinfoex.position() + SIZE, size); }
	public static void flags(ByteBuffer joyinfoex, int flags) { joyinfoex.putInt(joyinfoex.position() + FLAGS, flags); }
	public static void xPos(ByteBuffer joyinfoex, int xPos) { joyinfoex.putInt(joyinfoex.position() + XPOS, xPos); }
	public static void yPos(ByteBuffer joyinfoex, int yPos) { joyinfoex.putInt(joyinfoex.position() + YPOS, yPos); }
	public static void zPos(ByteBuffer joyinfoex, int zPos) { joyinfoex.putInt(joyinfoex.position() + ZPOS, zPos); }
	public static void rPos(ByteBuffer joyinfoex, int rPos) { joyinfoex.putInt(joyinfoex.position() + RPOS, rPos); }
	public static void uPos(ByteBuffer joyinfoex, int uPos) { joyinfoex.putInt(joyinfoex.position() + UPOS, uPos); }
	public static void vPos(ByteBuffer joyinfoex, int vPos) { joyinfoex.putInt(joyinfoex.position() + VPOS, vPos); }
	public static void buttons(ByteBuffer joyinfoex, int buttons) { joyinfoex.putInt(joyinfoex.position() + BUTTONS, buttons); }
	public static void buttonNumber(ByteBuffer joyinfoex, int buttonNumber) { joyinfoex.putInt(joyinfoex.position() + BUTTONNUMBER, buttonNumber); }
	public static void POV(ByteBuffer joyinfoex, int pov) { joyinfoex.putInt(joyinfoex.position() + POV, pov); }
	public static void reserved1(ByteBuffer joyinfoex, int reserved1) { joyinfoex.putInt(joyinfoex.position() + RESERVED1, reserved1); }
	public static void reserved2(ByteBuffer joyinfoex, int reserved2) { joyinfoex.putInt(joyinfoex.position() + RESERVED2, reserved2); }

	public static int size(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + SIZE); }
	public static int flags(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + FLAGS); }
	public static int xPos(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + XPOS); }
	public static int yPos(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + YPOS); }
	public static int zPos(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + ZPOS); }
	public static int rPos(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + RPOS); }
	public static int uPos(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + UPOS); }
	public static int vPos(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + VPOS); }
	public static int buttons(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + BUTTONS); }
	public static int buttonNumber(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + BUTTONNUMBER); }
	public static int POV(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + POV); }
	public static int reserved1(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + RESERVED1); }
	public static int reserved2(ByteBuffer joyinfoex) { return joyinfoex.getInt(joyinfoex.position() + RESERVED2); }

}