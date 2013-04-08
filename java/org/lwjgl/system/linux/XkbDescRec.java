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
public final class XkbDescRec {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		DISPLAY,
		DEVICE_SPEC,
		MIN_KEY_CODE,
		MAX_KEY_CODE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		DISPLAY = offsets.get(0);
		DEVICE_SPEC = offsets.get(1);
		MIN_KEY_CODE = offsets.get(2);
		MAX_KEY_CODE = offsets.get(3);
	}

	private XkbDescRec() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long display,
		int device_spec,
		int min_key_code,
		int max_key_code
	) {
		ByteBuffer xkbdescrec = malloc();

		displaySet(xkbdescrec, display);
		device_specSet(xkbdescrec, device_spec);
		min_key_codeSet(xkbdescrec, min_key_code);
		max_key_codeSet(xkbdescrec, max_key_code);

		return xkbdescrec;
	}

	public static void displaySet(ByteBuffer xkbdescrec, long display) { PointerBuffer.put(xkbdescrec, xkbdescrec.position() + DISPLAY, display); }
	public static void device_specSet(ByteBuffer xkbdescrec, int device_spec) { xkbdescrec.putShort(xkbdescrec.position() + DEVICE_SPEC, (short)device_spec); }
	public static void min_key_codeSet(ByteBuffer xkbdescrec, int min_key_code) { xkbdescrec.put(xkbdescrec.position() + MIN_KEY_CODE, (byte)min_key_code); }
	public static void max_key_codeSet(ByteBuffer xkbdescrec, int max_key_code) { xkbdescrec.put(xkbdescrec.position() + MAX_KEY_CODE, (byte)max_key_code); }

	public static long displayGet(ByteBuffer xkbdescrec) { return PointerBuffer.get(xkbdescrec, xkbdescrec.position() + DISPLAY); }
	public static int device_specGet(ByteBuffer xkbdescrec) { return xkbdescrec.getShort(xkbdescrec.position() + DEVICE_SPEC); }
	public static int min_key_codeGet(ByteBuffer xkbdescrec) { return xkbdescrec.get(xkbdescrec.position() + MIN_KEY_CODE); }
	public static int max_key_codeGet(ByteBuffer xkbdescrec) { return xkbdescrec.get(xkbdescrec.position() + MAX_KEY_CODE); }

}