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

/** Defines properties shared by all ovrLayer structs, such as {@link OVRLayerEyeFov}. */
public final class OVRLayerHeader extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		FLAGS;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		FLAGS = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRLayerHeader(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRLayerHeader} instance at the specified memory address. */
	public OVRLayerHeader(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRLayerHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerHeader(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getType() { return ngetType(address()); }
	public int getFlags() { return ngetFlags(address()); }

	public OVRLayerHeader setType(int Type) { nsetType(address(), Type); return this; }
	public OVRLayerHeader setFlags(int Flags) { nsetFlags(address(), Flags); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerHeader set(
		int Type,
		int Flags
	) {
		setType(Type);
		setFlags(Flags);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRLayerHeader nset(long struct) {
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
	public OVRLayerHeader set(OVRLayerHeader src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRLayerHeader set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerHeader} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerHeader malloc() {
		return new OVRLayerHeader(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerHeader} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerHeader calloc() {
		return new OVRLayerHeader(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerHeader} instance allocated with {@link BufferUtils}. */
	public static OVRLayerHeader create() {
		return new OVRLayerHeader(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetType(long struct) { return memGetInt(struct + TYPE); }
	public static int getType(ByteBuffer struct) { return ngetType(memAddress(struct)); }
	public static int ngetFlags(long struct) { return memGetInt(struct + FLAGS); }
	public static int getFlags(ByteBuffer struct) { return ngetFlags(memAddress(struct)); }

	public static void nsetType(long struct, int Type) { memPutInt(struct + TYPE, Type); }
	public static void setType(ByteBuffer struct, int Type) { nsetType(memAddress(struct), Type); }
	public static void nsetFlags(long struct, int Flags) { memPutInt(struct + FLAGS, Flags); }
	public static void setFlags(ByteBuffer struct, int Flags) { nsetFlags(memAddress(struct), Flags); }

	// -----------------------------------

	/** An array of {@link OVRLayerHeader} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerHeader, Buffer> {

		/**
		 * Creates a new {@link OVRLayerHeader.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerHeader#SIZEOF}, and its mark will be undefined.
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
		protected OVRLayerHeader newInstance(long address) {
			return new OVRLayerHeader(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}