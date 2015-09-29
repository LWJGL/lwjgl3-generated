/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains information about a libffi type. */
public final class FFIType extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SIZE,
		ALIGNMENT,
		TYPE,
		ELEMENTS;

	static {
		IntBuffer offsets = memAllocInt(4);

		SIZEOF = offsets(memAddress(offsets));

		SIZE = offsets.get(0);
		ALIGNMENT = offsets.get(1);
		TYPE = offsets.get(2);
		ELEMENTS = offsets.get(3);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	FFIType(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link FFIType} instance at the specified memory address. */
	public FFIType(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link FFIType} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public FFIType(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public long getSize() { return ngetSize(address()); }
	public int getAlignment() { return ngetAlignment(address()); }
	public int getType() { return ngetType(address()); }
	public ByteBuffer getElements(int byteLen) { return ngetElements(address(), byteLen); }

	public FFIType setSize(long size) { nsetSize(address(), size); return this; }
	public FFIType setAlignment(int alignment) { nsetAlignment(address(), alignment); return this; }
	public FFIType setType(int type) { nsetType(address(), type); return this; }
	public FFIType setElements(ByteBuffer elements) { nsetElements(address(), elements); return this; }

	/** Initializes this struct with the specified values. */
	public FFIType set(
		long size,
		int alignment,
		int type,
		ByteBuffer elements
	) {
		setSize(size);
		setAlignment(alignment);
		setType(type);
		setElements(elements);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public FFIType nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public FFIType set(FFIType src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public FFIType set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link FFIType} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static FFIType malloc() {
		return new FFIType(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link FFIType} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static FFIType calloc() {
		return new FFIType(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link FFIType} instance allocated with {@link BufferUtils}. */
	public static FFIType create() {
		return new FFIType(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link FFIType.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link FFIType.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link FFIType.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static long ngetSize(long struct) { return memGetAddress(struct + SIZE); }
	public static long getSize(ByteBuffer struct) { return ngetSize(memAddress(struct)); }
	public static int ngetAlignment(long struct) { return memGetShort(struct + ALIGNMENT) & 0xFFFF; }
	public static int getAlignment(ByteBuffer struct) { return ngetAlignment(memAddress(struct)); }
	public static int ngetType(long struct) { return memGetShort(struct + TYPE) & 0xFFFF; }
	public static int getType(ByteBuffer struct) { return ngetType(memAddress(struct)); }
	public static long ngetElements(long struct) { return memGetAddress(struct + ELEMENTS); }
	public static ByteBuffer ngetElements(long struct, int byteLen) { return memByteBuffer(ngetElements(struct), byteLen); }
	public static ByteBuffer getElements(ByteBuffer struct, int byteLen) { return ngetElements(memAddress(struct), byteLen); }

	public static void nsetSize(long struct, long size) { memPutAddress(struct + SIZE, size); }
	public static void setSize(ByteBuffer struct, long size) { nsetSize(memAddress(struct), size); }
	public static void nsetAlignment(long struct, int alignment) { memPutShort(struct + ALIGNMENT, (short)alignment); }
	public static void setAlignment(ByteBuffer struct, int alignment) { nsetAlignment(memAddress(struct), alignment); }
	public static void nsetType(long struct, int type) { memPutShort(struct + TYPE, (short)type); }
	public static void setType(ByteBuffer struct, int type) { nsetType(memAddress(struct), type); }
	public static void nsetElements(long struct, long elements) { memPutAddress(struct + ELEMENTS, elements); }
	public static void nsetElements(long struct, ByteBuffer elements) { nsetElements(struct, memAddressSafe(elements)); }
	public static void setElements(ByteBuffer struct, ByteBuffer elements) { nsetElements(memAddress(struct), elements); }

	// -----------------------------------

	/** An array of {@link FFIType} structs. */
	public static final class Buffer extends StructBuffer<FFIType, Buffer> {

		/**
		 * Creates a new {@link FFIType.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link FFIType#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected FFIType newInstance(long address) {
			return new FFIType(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}