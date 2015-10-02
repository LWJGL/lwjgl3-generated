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

/** The libffi closure structure. */
public class FFIClosure extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		CIF,
		FUN,
		USER_DATA;

	static {
		IntBuffer offsets = memAllocInt(3);

		SIZEOF = offsets(memAddress(offsets));

		CIF = offsets.get(0);
		FUN = offsets.get(1);
		USER_DATA = offsets.get(2);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	FFIClosure(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link FFIClosure} instance at the specified memory address. */
	public FFIClosure(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link FFIClosure} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public FFIClosure(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public FFICIF getCif() { return ngetCifStruct(address()); }
	public long getFun() { return ngetFun(address()); }
	public long getUserData() { return ngetUserData(address()); }

	// -----------------------------------

	/** Returns a new {@link FFIClosure} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static FFIClosure malloc() {
		return new FFIClosure(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link FFIClosure} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static FFIClosure calloc() {
		return new FFIClosure(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link FFIClosure} instance allocated with {@link BufferUtils}. */
	public static FFIClosure create() {
		return new FFIClosure(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link FFIClosure.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link FFIClosure.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link FFIClosure.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static long ngetCif(long struct) { return memGetAddress(struct + CIF); }
	public static FFICIF ngetCifStruct(long struct) { return new FFICIF(ngetCif(struct)); }
	public static FFICIF getCif(ByteBuffer struct) { return ngetCifStruct(memAddress(struct)); }
	public static long ngetFun(long struct) { return memGetAddress(struct + FUN); }
	public static long getFun(ByteBuffer struct) { return ngetFun(memAddress(struct)); }
	public static long ngetUserData(long struct) { return memGetAddress(struct + USER_DATA); }
	public static long getUserData(ByteBuffer struct) { return ngetUserData(memAddress(struct)); }

	// -----------------------------------

	/** An array of {@link FFIClosure} structs. */
	public static final class Buffer extends StructBuffer<FFIClosure, Buffer> {

		/**
		 * Creates a new {@link FFIClosure.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link FFIClosure#SIZEOF}, and its mark will be undefined.
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
		protected FFIClosure newInstance(long address) {
			return new FFIClosure(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public FFICIF getCif() { return ngetCifStruct(address()); }
		public long getFun() { return ngetFun(address()); }
		public long getUserData() { return ngetUserData(address()); }

	}

}