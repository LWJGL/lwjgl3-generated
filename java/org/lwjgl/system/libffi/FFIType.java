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

/** Contains information about a libffi type. */
public final class FFIType implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SIZE,
		ALIGNMENT,
		TYPE,
		ELEMENTS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		SIZE = offsets.get(0);
		ALIGNMENT = offsets.get(1);
		TYPE = offsets.get(2);
		ELEMENTS = offsets.get(3);
	}

	private final ByteBuffer struct;

	public FFIType() {
		this(malloc());
	}

	public FFIType(ByteBuffer struct) {
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

	public void setSize(long size) { size(struct, size); }
	public void setAlignment(int alignment) { alignment(struct, alignment); }
	public void setType(int type) { type(struct, type); }
	public void setElements(long elements) { elements(struct, elements); }
	public void setElements(ByteBuffer elements) { elements(struct, elements); }

	public long getSize() { return size(struct); }
	public int getAlignment() { return alignment(struct); }
	public int getType() { return type(struct); }
	public long getElements() { return elements(struct); }
	public ByteBuffer getElements(int byteLen) { return elements(struct, byteLen); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long size,
		int alignment,
		int type,
		ByteBuffer elements
	) {
		ByteBuffer ffi_type = malloc();

		size(ffi_type, size);
		alignment(ffi_type, alignment);
		type(ffi_type, type);
		elements(ffi_type, elements);

		return ffi_type;
	}

	public static void size(ByteBuffer ffi_type, long size) { PointerBuffer.put(ffi_type, ffi_type.position() + SIZE, size); }
	public static void alignment(ByteBuffer ffi_type, int alignment) { ffi_type.putShort(ffi_type.position() + ALIGNMENT, (short)alignment); }
	public static void type(ByteBuffer ffi_type, int type) { ffi_type.putShort(ffi_type.position() + TYPE, (short)type); }
	public static void elements(ByteBuffer ffi_type, long elements) { PointerBuffer.put(ffi_type, ffi_type.position() + ELEMENTS, elements); }
	public static void elements(ByteBuffer ffi_type, ByteBuffer elements) { elements(ffi_type, memAddressSafe(elements)); }

	public static long size(ByteBuffer ffi_type) { return PointerBuffer.get(ffi_type, ffi_type.position() + SIZE); }
	public static int alignment(ByteBuffer ffi_type) { return ffi_type.getShort(ffi_type.position() + ALIGNMENT) & 0xFFFF; }
	public static int type(ByteBuffer ffi_type) { return ffi_type.getShort(ffi_type.position() + TYPE) & 0xFFFF; }
	public static long elements(ByteBuffer ffi_type) { return PointerBuffer.get(ffi_type, ffi_type.position() + ELEMENTS); }
	public static ByteBuffer elements(ByteBuffer ffi_type, int byteLen) { return memByteBuffer(elements(ffi_type), byteLen); }

}