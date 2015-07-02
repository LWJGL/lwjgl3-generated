/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** An opaque structure which holds all the context needed from {@link STBTruetype#stbtt_PackBegin} to {@link STBTruetype#stbtt_PackEnd}. */
public final class STBTTPackContext implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	static {
		SIZEOF = offsets();
	}

	private final ByteBuffer struct;

	public STBTTPackContext() {
		this(malloc());
	}

	public STBTTPackContext(ByteBuffer struct) {
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

	// -----------------------------------

	private static native int offsets();

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

}