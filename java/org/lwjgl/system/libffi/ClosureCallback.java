/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains information about a Java method callback. It is used as the {@code user_data} of a libffi closure. */
public final class ClosureCallback {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		OBJECT,
		METHOD;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		OBJECT = offsets.get(0);
		METHOD = offsets.get(1);
	}

	private ClosureCallback() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long object,
		long method
	) {
		ByteBuffer closurecallback = malloc();

		object(closurecallback, object);
		method(closurecallback, method);

		return closurecallback;
	}

	public static void object(ByteBuffer closurecallback, long object) { PointerBuffer.put(closurecallback, closurecallback.position() + OBJECT, object); }
	public static void method(ByteBuffer closurecallback, long method) { PointerBuffer.put(closurecallback, closurecallback.position() + METHOD, method); }

	public static long object(ByteBuffer closurecallback) { return PointerBuffer.get(closurecallback, closurecallback.position() + OBJECT); }
	public static long method(ByteBuffer closurecallback) { return PointerBuffer.get(closurecallback, closurecallback.position() + METHOD); }

}