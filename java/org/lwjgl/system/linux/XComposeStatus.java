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

/** Compose sequence status structure, used in calling {@link Xutil#XLookupString}. */
public final class XComposeStatus implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		COMPOSE_PTR,
		CHARS_MATCHED;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		COMPOSE_PTR = offsets.get(0);
		CHARS_MATCHED = offsets.get(1);
	}

	private final ByteBuffer struct;

	public XComposeStatus() {
		this(malloc());
	}

	public XComposeStatus(ByteBuffer struct) {
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

	public void setComposePtr(long compose_ptr) { compose_ptr(struct, compose_ptr); }
	public void setComposePtr(ByteBuffer compose_ptr) { compose_ptr(struct, compose_ptr); }
	public void setCharsMatched(int chars_matched) { chars_matched(struct, chars_matched); }

	public long getComposePtr() { return compose_ptr(struct); }
	public ByteBuffer getComposePtr(int byteLen) { return compose_ptr(struct, byteLen); }
	public int getCharsMatched() { return chars_matched(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer compose_ptr,
		int chars_matched
	) {
		ByteBuffer xcomposestatus = malloc();

		compose_ptr(xcomposestatus, compose_ptr);
		chars_matched(xcomposestatus, chars_matched);

		return xcomposestatus;
	}

	public static void compose_ptr(ByteBuffer xcomposestatus, long compose_ptr) { PointerBuffer.put(xcomposestatus, xcomposestatus.position() + COMPOSE_PTR, compose_ptr); }
	public static void compose_ptr(ByteBuffer xcomposestatus, ByteBuffer compose_ptr) { compose_ptr(xcomposestatus, memAddressSafe(compose_ptr)); }
	public static void chars_matched(ByteBuffer xcomposestatus, int chars_matched) { xcomposestatus.putInt(xcomposestatus.position() + CHARS_MATCHED, chars_matched); }

	public static long compose_ptr(ByteBuffer xcomposestatus) { return PointerBuffer.get(xcomposestatus, xcomposestatus.position() + COMPOSE_PTR); }
	public static ByteBuffer compose_ptr(ByteBuffer xcomposestatus, int byteLen) { return memByteBuffer(compose_ptr(xcomposestatus), byteLen); }
	public static int chars_matched(ByteBuffer xcomposestatus) { return xcomposestatus.getInt(xcomposestatus.position() + CHARS_MATCHED); }

}