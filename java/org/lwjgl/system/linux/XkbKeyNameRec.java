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
public final class XkbKeyNameRec implements Pointer {

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

	private final ByteBuffer struct;

	public XkbKeyNameRec() {
		this(malloc());
	}

	public XkbKeyNameRec(ByteBuffer struct) {
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

	public void setName(ByteBuffer name) { nameSet(struct, name); }
	public void setName(CharSequence name) { name(struct, name); }

	public void getName(ByteBuffer name) { nameGet(struct, name); }
	public String getNameString() { return nameString(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer name
	) {
		ByteBuffer xkbkeynamerec = malloc();

		nameSet(xkbkeynamerec, name);

		return xkbkeynamerec;
	}

	/** Alternative virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		CharSequence name
	) {
		ByteBuffer xkbkeynamerec = malloc();

		name(xkbkeynamerec, name);

		return xkbkeynamerec;
	}

	public static void nameSet(ByteBuffer xkbkeynamerec, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(name);
			checkBufferGT(name, 4 * 1);
		}
		memCopy(memAddress(name), memAddress(xkbkeynamerec) + NAME, name.remaining());
	}
	public static void name(ByteBuffer xkbkeynamerec, CharSequence name) { memEncodeASCII(name, false, xkbkeynamerec, NAME); }

	public static void nameGet(ByteBuffer xkbkeynamerec, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(name, 4 * 1);
		memCopy(memAddress(xkbkeynamerec) + NAME, memAddress(name), name.remaining());
	}
	public static String nameString(ByteBuffer xkbkeynamerec) { return memDecodeASCII(xkbkeynamerec, 4, NAME); }

}