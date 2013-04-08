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
public final class XComposeStatus {

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

	private XComposeStatus() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long compose_ptr,
		int chars_matched
	) {
		ByteBuffer xcomposestatus = malloc();

		compose_ptrSet(xcomposestatus, compose_ptr);
		chars_matchedSet(xcomposestatus, chars_matched);

		return xcomposestatus;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		ByteBuffer compose_ptr,
		int chars_matched
	) {
		ByteBuffer xcomposestatus = malloc();

		compose_ptrSet(xcomposestatus, compose_ptr);
		chars_matchedSet(xcomposestatus, chars_matched);

		return xcomposestatus;
	}

	public static void compose_ptrSet(ByteBuffer xcomposestatus, long compose_ptr) { PointerBuffer.put(xcomposestatus, xcomposestatus.position() + COMPOSE_PTR, compose_ptr); }
	public static void compose_ptrSet(ByteBuffer xcomposestatus, ByteBuffer compose_ptr) { compose_ptrSet(xcomposestatus, memAddress(compose_ptr)); }
	public static void chars_matchedSet(ByteBuffer xcomposestatus, int chars_matched) { xcomposestatus.putInt(xcomposestatus.position() + CHARS_MATCHED, chars_matched); }

	public static long compose_ptrGet(ByteBuffer xcomposestatus) { return PointerBuffer.get(xcomposestatus, xcomposestatus.position() + COMPOSE_PTR); }
	public static ByteBuffer compose_ptrGet(ByteBuffer xcomposestatus, int size) { long address = compose_ptrGet(xcomposestatus); return address == 0 ? null : memByteBuffer(address, size); }
	public static int chars_matchedGet(ByteBuffer xcomposestatus) { return xcomposestatus.getInt(xcomposestatus.position() + CHARS_MATCHED); }

}