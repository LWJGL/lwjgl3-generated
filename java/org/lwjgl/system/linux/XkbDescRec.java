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

	private XkbDescRec() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long dpy,
		int device_spec,
		int min_key_code,
		int max_key_code,
		long names
	) {
		ByteBuffer xkbdescrec = malloc();

		dpySet(xkbdescrec, dpy);
		device_specSet(xkbdescrec, device_spec);
		min_key_codeSet(xkbdescrec, min_key_code);
		max_key_codeSet(xkbdescrec, max_key_code);
		namesSet(xkbdescrec, names);

		return xkbdescrec;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		long dpy,
		int device_spec,
		int min_key_code,
		int max_key_code,
		ByteBuffer names
	) {
		ByteBuffer xkbdescrec = malloc();

		dpySet(xkbdescrec, dpy);
		device_specSet(xkbdescrec, device_spec);
		min_key_codeSet(xkbdescrec, min_key_code);
		max_key_codeSet(xkbdescrec, max_key_code);
		namesSet(xkbdescrec, names);

		return xkbdescrec;
	}

	public static void dpySet(ByteBuffer xkbdescrec, long dpy) { PointerBuffer.put(xkbdescrec, xkbdescrec.position() + DPY, dpy); }
	public static void device_specSet(ByteBuffer xkbdescrec, int device_spec) { xkbdescrec.putShort(xkbdescrec.position() + DEVICE_SPEC, (short)device_spec); }
	public static void min_key_codeSet(ByteBuffer xkbdescrec, int min_key_code) { xkbdescrec.put(xkbdescrec.position() + MIN_KEY_CODE, (byte)min_key_code); }
	public static void max_key_codeSet(ByteBuffer xkbdescrec, int max_key_code) { xkbdescrec.put(xkbdescrec.position() + MAX_KEY_CODE, (byte)max_key_code); }
	public static void namesSet(ByteBuffer xkbdescrec, long names) { PointerBuffer.put(xkbdescrec, xkbdescrec.position() + NAMES, names); }
	public static void namesSet(ByteBuffer xkbdescrec, ByteBuffer names) { namesSet(xkbdescrec, memAddress(names)); }

	public static long dpyGet(ByteBuffer xkbdescrec) { return PointerBuffer.get(xkbdescrec, xkbdescrec.position() + DPY); }
	public static int device_specGet(ByteBuffer xkbdescrec) { return xkbdescrec.getShort(xkbdescrec.position() + DEVICE_SPEC) & 0xFFFF; }
	public static int min_key_codeGet(ByteBuffer xkbdescrec) { return xkbdescrec.get(xkbdescrec.position() + MIN_KEY_CODE) & 0xFF; }
	public static int max_key_codeGet(ByteBuffer xkbdescrec) { return xkbdescrec.get(xkbdescrec.position() + MAX_KEY_CODE) & 0xFF; }
	public static long namesGet(ByteBuffer xkbdescrec) { return PointerBuffer.get(xkbdescrec, xkbdescrec.position() + NAMES); }
	public static ByteBuffer namesGetb(ByteBuffer xkbdescrec) { return memByteBuffer(namesGet(xkbdescrec), XkbNamesRec.SIZEOF); }

}