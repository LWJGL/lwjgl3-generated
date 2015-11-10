/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A 2D size with integer components. */
public class OVRSizei extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		W,
		H;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		W = offsets.get(0);
		H = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRSizei(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRSizei} instance at the specified memory address. */
	public OVRSizei(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRSizei} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRSizei(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getW() { return ngetW(address()); }
	public int getH() { return ngetH(address()); }

	public OVRSizei setW(int w) { nsetW(address(), w); return this; }
	public OVRSizei setH(int h) { nsetH(address(), h); return this; }

	/** Initializes this struct with the specified values. */
	public OVRSizei set(
		int w,
		int h
	) {
		setW(w);
		setH(h);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRSizei nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public OVRSizei set(OVRSizei src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRSizei set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRSizei} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRSizei malloc() {
		return new OVRSizei(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRSizei} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRSizei calloc() {
		return new OVRSizei(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRSizei} instance allocated with {@link BufferUtils}. */
	public static OVRSizei create() {
		return new OVRSizei(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRSizei.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static int ngetW(long struct) { return memGetInt(struct + W); }
	public static int getW(ByteBuffer struct) { return ngetW(memAddress(struct)); }
	public static int ngetH(long struct) { return memGetInt(struct + H); }
	public static int getH(ByteBuffer struct) { return ngetH(memAddress(struct)); }

	public static void nsetW(long struct, int w) { memPutInt(struct + W, w); }
	public static void setW(ByteBuffer struct, int w) { nsetW(memAddress(struct), w); }
	public static void nsetH(long struct, int h) { memPutInt(struct + H, h); }
	public static void setH(ByteBuffer struct, int h) { nsetH(memAddress(struct), h); }

	// -----------------------------------

	/** An array of {@link OVRSizei} structs. */
	public static final class Buffer extends StructBuffer<OVRSizei, Buffer> {

		/**
		 * Creates a new {@link OVRSizei.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRSizei#SIZEOF}, and its mark will be undefined.
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
		protected OVRSizei newInstance(long address) {
			return new OVRSizei(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getW() { return ngetW(address()); }
		public int getH() { return ngetH(address()); }

		public OVRSizei.Buffer setW(int w) { nsetW(address(), w); return this; }
		public OVRSizei.Buffer setH(int h) { nsetH(address(), h); return this; }

	}

}