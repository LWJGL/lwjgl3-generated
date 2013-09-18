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

/** Xkb key name record. */
public final class XkbKeyNameRec {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		NAME;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(1);

		SIZEOF = offsets(memAddress(offsets));

		NAME = offsets.get(0);
	}

	private XkbKeyNameRec() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long name,
		int nameBytes
	) {
		ByteBuffer xkbkeynamerec = malloc();

		nameSet(xkbkeynamerec, name, nameBytes);

		return xkbkeynamerec;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		ByteBuffer name
	) {
		ByteBuffer xkbkeynamerec = malloc();

		nameSet(xkbkeynamerec, name);

		return xkbkeynamerec;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		CharSequence name
	) {
		ByteBuffer xkbkeynamerec = malloc();

		nameSet(xkbkeynamerec, name);

		return xkbkeynamerec;
	}

	public static void nameSet(ByteBuffer xkbkeynamerec, long name, int bytes) { memCopy(name, memAddress(xkbkeynamerec) + NAME, bytes); }
	public static void nameSet(ByteBuffer xkbkeynamerec, ByteBuffer name) {
		checkNT1(name);
		checkBufferGT(name, 4 * 1);
		nameSet(xkbkeynamerec, memAddress(name), name.remaining());
	}
	public static void nameSet(ByteBuffer xkbkeynamerec, CharSequence name) { ByteBuffer buffer = memEncodeASCII(name, false); nameSet(xkbkeynamerec, memAddress(buffer), buffer.capacity()); }

	public static void nameGet(ByteBuffer xkbkeynamerec, long name, int bytes) {
		memCopy(memAddress(xkbkeynamerec) + NAME, name, bytes);
	}
	public static void nameGet(ByteBuffer xkbkeynamerec, ByteBuffer name) {
		checkBufferGT(name, 4 * 1);
		nameGet(xkbkeynamerec, memAddress(name), name.remaining());
	}
	public static String nameGets(ByteBuffer xkbkeynamerec) { return memDecodeASCII(xkbkeynamerec, 4, NAME); }

}