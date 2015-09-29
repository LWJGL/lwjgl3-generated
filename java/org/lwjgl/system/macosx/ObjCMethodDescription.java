/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Defines a method. */
public final class ObjCMethodDescription extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		NAME,
		TYPES;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		NAME = offsets.get(0);
		TYPES = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	ObjCMethodDescription(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link ObjCMethodDescription} instance at the specified memory address. */
	public ObjCMethodDescription(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link ObjCMethodDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public ObjCMethodDescription(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public long getName() { return ngetName(address()); }
	public ByteBuffer getTypesBuffer() { return ngetTypesBuffer(address()); }
	public String getTypesString() { return ngetTypesString(address()); }

	// -----------------------------------

	/** Returns a new {@link ObjCMethodDescription} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static ObjCMethodDescription malloc() {
		return new ObjCMethodDescription(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link ObjCMethodDescription} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static ObjCMethodDescription calloc() {
		return new ObjCMethodDescription(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link ObjCMethodDescription} instance allocated with {@link BufferUtils}. */
	public static ObjCMethodDescription create() {
		return new ObjCMethodDescription(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static long ngetName(long struct) { return memGetAddress(struct + NAME); }
	public static long getName(ByteBuffer struct) { return ngetName(memAddress(struct)); }
	public static long ngetTypes(long struct) { return memGetAddress(struct + TYPES); }
	public static ByteBuffer ngetTypesBuffer(long struct) { return memByteBufferNT1(ngetTypes(struct)); }
	public static ByteBuffer getTypesBuffer(ByteBuffer struct) { return ngetTypesBuffer(memAddress(struct)); }
	public static String ngetTypesString(long struct) { return memDecodeUTF8(ngetTypes(struct)); }
	public static String getTypesString(ByteBuffer struct) { return ngetTypesString(memAddress(struct)); }

	// -----------------------------------

	/** An array of {@link ObjCMethodDescription} structs. */
	public static final class Buffer extends StructBuffer<ObjCMethodDescription, Buffer> {

		/**
		 * Creates a new {@link ObjCMethodDescription.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link ObjCMethodDescription#SIZEOF}, and its mark will be undefined.
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
		protected ObjCMethodDescription newInstance(long address) {
			return new ObjCMethodDescription(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}