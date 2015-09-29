/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Quad used for drawing a baked character, returned by {@link STBTruetype#stbtt_GetBakedQuad}. */
public final class STBTTAlignedQuad extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X0,
		Y0,
		S0,
		T0,
		X1,
		Y1,
		S1,
		T1;

	static {
		IntBuffer offsets = memAllocInt(8);

		SIZEOF = offsets(memAddress(offsets));

		X0 = offsets.get(0);
		Y0 = offsets.get(1);
		S0 = offsets.get(2);
		T0 = offsets.get(3);
		X1 = offsets.get(4);
		Y1 = offsets.get(5);
		S1 = offsets.get(6);
		T1 = offsets.get(7);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	STBTTAlignedQuad(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBTTAlignedQuad} instance at the specified memory address. */
	public STBTTAlignedQuad(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBTTAlignedQuad} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBTTAlignedQuad(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public float getX0() { return ngetX0(address()); }
	public float getY0() { return ngetY0(address()); }
	public float getS0() { return ngetS0(address()); }
	public float getT0() { return ngetT0(address()); }
	public float getX1() { return ngetX1(address()); }
	public float getY1() { return ngetY1(address()); }
	public float getS1() { return ngetS1(address()); }
	public float getT1() { return ngetT1(address()); }

	// -----------------------------------

	/** Returns a new {@link STBTTAlignedQuad} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBTTAlignedQuad malloc() {
		return new STBTTAlignedQuad(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBTTAlignedQuad} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBTTAlignedQuad calloc() {
		return new STBTTAlignedQuad(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBTTAlignedQuad} instance allocated with {@link BufferUtils}. */
	public static STBTTAlignedQuad create() {
		return new STBTTAlignedQuad(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTAlignedQuad.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTAlignedQuad.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTAlignedQuad.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static float ngetX0(long struct) { return memGetFloat(struct + X0); }
	public static float getX0(ByteBuffer struct) { return ngetX0(memAddress(struct)); }
	public static float ngetY0(long struct) { return memGetFloat(struct + Y0); }
	public static float getY0(ByteBuffer struct) { return ngetY0(memAddress(struct)); }
	public static float ngetS0(long struct) { return memGetFloat(struct + S0); }
	public static float getS0(ByteBuffer struct) { return ngetS0(memAddress(struct)); }
	public static float ngetT0(long struct) { return memGetFloat(struct + T0); }
	public static float getT0(ByteBuffer struct) { return ngetT0(memAddress(struct)); }
	public static float ngetX1(long struct) { return memGetFloat(struct + X1); }
	public static float getX1(ByteBuffer struct) { return ngetX1(memAddress(struct)); }
	public static float ngetY1(long struct) { return memGetFloat(struct + Y1); }
	public static float getY1(ByteBuffer struct) { return ngetY1(memAddress(struct)); }
	public static float ngetS1(long struct) { return memGetFloat(struct + S1); }
	public static float getS1(ByteBuffer struct) { return ngetS1(memAddress(struct)); }
	public static float ngetT1(long struct) { return memGetFloat(struct + T1); }
	public static float getT1(ByteBuffer struct) { return ngetT1(memAddress(struct)); }

	// -----------------------------------

	/** An array of {@link STBTTAlignedQuad} structs. */
	public static final class Buffer extends StructBuffer<STBTTAlignedQuad, Buffer> {

		/**
		 * Creates a new {@link STBTTAlignedQuad.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBTTAlignedQuad#SIZEOF}, and its mark will be undefined.
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
		protected STBTTAlignedQuad newInstance(long address) {
			return new STBTTAlignedQuad(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}