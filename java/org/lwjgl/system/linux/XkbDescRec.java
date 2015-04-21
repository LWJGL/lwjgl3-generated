/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Describes an Xkb keyboard. */
public final class XkbDescRec implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		DPY,
		DEVICE_SPEC,
		MIN_KEY_CODE,
		MAX_KEY_CODE,
		NAMES;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(5);

		SIZEOF = offsets(memAddress(offsets));

		DPY = offsets.get(0);
		DEVICE_SPEC = offsets.get(1);
		MIN_KEY_CODE = offsets.get(2);
		MAX_KEY_CODE = offsets.get(3);
		NAMES = offsets.get(4);
	}

	private final ByteBuffer struct;

	public XkbDescRec() {
		this(malloc());
	}

	public XkbDescRec(ByteBuffer struct) {
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

	public void setDpy(long dpy) { dpy(struct, dpy); }
	public void setDeviceSpec(int device_spec) { device_spec(struct, device_spec); }
	public void setMinKeyCode(int min_key_code) { min_key_code(struct, min_key_code); }
	public void setMaxKeyCode(int max_key_code) { max_key_code(struct, max_key_code); }
	public void setNames(long names) { names(struct, names); }
	public void setNames(ByteBuffer names) { names(struct, names); }

	public long getDpy() { return dpy(struct); }
	public int getDeviceSpec() { return device_spec(struct); }
	public int getMinKeyCode() { return min_key_code(struct); }
	public int getMaxKeyCode() { return max_key_code(struct); }
	public long getNames() { return names(struct); }
	public ByteBuffer getNamesBuffer() { return namesBuffer(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long dpy,
		int device_spec,
		int min_key_code,
		int max_key_code,
		ByteBuffer names
	) {
		ByteBuffer xkbdescrec = malloc();

		dpy(xkbdescrec, dpy);
		device_spec(xkbdescrec, device_spec);
		min_key_code(xkbdescrec, min_key_code);
		max_key_code(xkbdescrec, max_key_code);
		names(xkbdescrec, names);

		return xkbdescrec;
	}

	public static void dpy(ByteBuffer xkbdescrec, long dpy) { PointerBuffer.put(xkbdescrec, xkbdescrec.position() + DPY, dpy); }
	public static void device_spec(ByteBuffer xkbdescrec, int device_spec) { xkbdescrec.putShort(xkbdescrec.position() + DEVICE_SPEC, (short)device_spec); }
	public static void min_key_code(ByteBuffer xkbdescrec, int min_key_code) { xkbdescrec.put(xkbdescrec.position() + MIN_KEY_CODE, (byte)min_key_code); }
	public static void max_key_code(ByteBuffer xkbdescrec, int max_key_code) { xkbdescrec.put(xkbdescrec.position() + MAX_KEY_CODE, (byte)max_key_code); }
	public static void names(ByteBuffer xkbdescrec, long names) { PointerBuffer.put(xkbdescrec, xkbdescrec.position() + NAMES, names); }
	public static void names(ByteBuffer xkbdescrec, ByteBuffer names) { names(xkbdescrec, memAddressSafe(names)); }

	public static long dpy(ByteBuffer xkbdescrec) { return PointerBuffer.get(xkbdescrec, xkbdescrec.position() + DPY); }
	public static int device_spec(ByteBuffer xkbdescrec) { return xkbdescrec.getShort(xkbdescrec.position() + DEVICE_SPEC) & 0xFFFF; }
	public static int min_key_code(ByteBuffer xkbdescrec) { return xkbdescrec.get(xkbdescrec.position() + MIN_KEY_CODE) & 0xFF; }
	public static int max_key_code(ByteBuffer xkbdescrec) { return xkbdescrec.get(xkbdescrec.position() + MAX_KEY_CODE) & 0xFF; }
	public static long names(ByteBuffer xkbdescrec) { return PointerBuffer.get(xkbdescrec, xkbdescrec.position() + NAMES); }
	public static ByteBuffer namesBuffer(ByteBuffer xkbdescrec) { return memByteBuffer(names(xkbdescrec), XkbNamesRec.SIZEOF); }

}