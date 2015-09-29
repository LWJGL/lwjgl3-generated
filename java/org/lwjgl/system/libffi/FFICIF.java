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

/** Contains information about a libffi call interface. */
public final class FFICIF extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ABI,
		NARGS,
		ARG_TYPES,
		RTYPE,
		BYTES,
		FLAGS;

	static {
		IntBuffer offsets = memAllocInt(6);

		SIZEOF = offsets(memAddress(offsets));

		ABI = offsets.get(0);
		NARGS = offsets.get(1);
		ARG_TYPES = offsets.get(2);
		RTYPE = offsets.get(3);
		BYTES = offsets.get(4);
		FLAGS = offsets.get(5);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	FFICIF(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link FFICIF} instance at the specified memory address. */
	public FFICIF(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link FFICIF} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public FFICIF(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getAbi() { return ngetAbi(address()); }
	public int getNargs() { return ngetNargs(address()); }
	public ByteBuffer getArgTypes(int byteLen) { return ngetArgTypes(address(), byteLen); }
	public long getRtype() { return ngetRtype(address()); }
	public int getBytes() { return ngetBytes(address()); }
	public int getFlags() { return ngetFlags(address()); }

	public FFICIF setAbi(int abi) { nsetAbi(address(), abi); return this; }
	public FFICIF setNargs(int nargs) { nsetNargs(address(), nargs); return this; }
	public FFICIF setArgTypes(ByteBuffer arg_types) { nsetArgTypes(address(), arg_types); return this; }
	public FFICIF setRtype(long rtype) { nsetRtype(address(), rtype); return this; }
	public FFICIF setBytes(int bytes) { nsetBytes(address(), bytes); return this; }
	public FFICIF setFlags(int flags) { nsetFlags(address(), flags); return this; }

	/** Initializes this struct with the specified values. */
	public FFICIF set(
		int abi,
		int nargs,
		ByteBuffer arg_types,
		long rtype,
		int bytes,
		int flags
	) {
		setAbi(abi);
		setNargs(nargs);
		setArgTypes(arg_types);
		setRtype(rtype);
		setBytes(bytes);
		setFlags(flags);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public FFICIF nset(long struct) {
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
	public FFICIF set(FFICIF src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public FFICIF set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link FFICIF} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static FFICIF malloc() {
		return new FFICIF(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link FFICIF} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static FFICIF calloc() {
		return new FFICIF(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link FFICIF} instance allocated with {@link BufferUtils}. */
	public static FFICIF create() {
		return new FFICIF(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link FFICIF.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link FFICIF.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link FFICIF.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetAbi(long struct) { return memGetInt(struct + ABI); }
	public static int getAbi(ByteBuffer struct) { return ngetAbi(memAddress(struct)); }
	public static int ngetNargs(long struct) { return memGetInt(struct + NARGS); }
	public static int getNargs(ByteBuffer struct) { return ngetNargs(memAddress(struct)); }
	public static long ngetArgTypes(long struct) { return memGetAddress(struct + ARG_TYPES); }
	public static ByteBuffer ngetArgTypes(long struct, int byteLen) { return memByteBuffer(ngetArgTypes(struct), byteLen); }
	public static ByteBuffer getArgTypes(ByteBuffer struct, int byteLen) { return ngetArgTypes(memAddress(struct), byteLen); }
	public static long ngetRtype(long struct) { return memGetAddress(struct + RTYPE); }
	public static long getRtype(ByteBuffer struct) { return ngetRtype(memAddress(struct)); }
	public static int ngetBytes(long struct) { return memGetInt(struct + BYTES); }
	public static int getBytes(ByteBuffer struct) { return ngetBytes(memAddress(struct)); }
	public static int ngetFlags(long struct) { return memGetInt(struct + FLAGS); }
	public static int getFlags(ByteBuffer struct) { return ngetFlags(memAddress(struct)); }

	public static void nsetAbi(long struct, int abi) { memPutInt(struct + ABI, abi); }
	public static void setAbi(ByteBuffer struct, int abi) { nsetAbi(memAddress(struct), abi); }
	public static void nsetNargs(long struct, int nargs) { memPutInt(struct + NARGS, nargs); }
	public static void setNargs(ByteBuffer struct, int nargs) { nsetNargs(memAddress(struct), nargs); }
	public static void nsetArgTypes(long struct, long arg_types) { memPutAddress(struct + ARG_TYPES, arg_types); }
	public static void nsetArgTypes(long struct, ByteBuffer arg_types) { nsetArgTypes(struct, memAddressSafe(arg_types)); }
	public static void setArgTypes(ByteBuffer struct, ByteBuffer arg_types) { nsetArgTypes(memAddress(struct), arg_types); }
	public static void nsetRtype(long struct, long rtype) { memPutAddress(struct + RTYPE, rtype); }
	public static void setRtype(ByteBuffer struct, long rtype) { nsetRtype(memAddress(struct), rtype); }
	public static void nsetBytes(long struct, int bytes) { memPutInt(struct + BYTES, bytes); }
	public static void setBytes(ByteBuffer struct, int bytes) { nsetBytes(memAddress(struct), bytes); }
	public static void nsetFlags(long struct, int flags) { memPutInt(struct + FLAGS, flags); }
	public static void setFlags(ByteBuffer struct, int flags) { nsetFlags(memAddress(struct), flags); }

	// -----------------------------------

	/** An array of {@link FFICIF} structs. */
	public static final class Buffer extends StructBuffer<FFICIF, Buffer> {

		/**
		 * Creates a new {@link FFICIF.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link FFICIF#SIZEOF}, and its mark will be undefined.
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
		protected FFICIF newInstance(long address) {
			return new FFICIF(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}