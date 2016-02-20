/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Contains information about a libffi call interface.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct ffi_cif {
 *     ffi_abi abi;
 *     unsigned nargs;
 *     ffi_type ** arg_types;
 *     ffi_type * rtype;
 *     unsigned bytes;
 *     unsigned flags;
 * }</code></pre>
 */
public class FFICIF extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		ABI,
		NARGS,
		ARG_TYPES,
		RTYPE,
		BYTES,
		FLAGS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		ABI = layout.offsetof(0);
		NARGS = layout.offsetof(1);
		ARG_TYPES = layout.offsetof(2);
		RTYPE = layout.offsetof(3);
		BYTES = layout.offsetof(4);
		FLAGS = layout.offsetof(5);
	}

	FFICIF(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link FFICIF} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public FFICIF(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code abi} field. */
	public int abi() { return nabi(address()); }
	/** Returns the value of the {@code nargs} field. */
	public int nargs() { return nnargs(address()); }
	/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code arg_types} field. */
	public PointerBuffer arg_types() { return narg_types(address()); }
	/** Returns a {@link FFIType} view of the struct pointed to by the {@code rtype} field. */
	public FFIType rtype() { return nrtype(address()); }
	/** Returns the value of the {@code bytes} field. */
	public int bytes() { return nbytes(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }

	// -----------------------------------

	/** Returns a new {@link FFICIF} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static FFICIF malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link FFICIF} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static FFICIF calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link FFICIF} instance allocated with {@link BufferUtils}. */
	public static FFICIF create() {
		return new FFICIF(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link FFICIF} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static FFICIF create(long address) {
		return address == NULL ? null : new FFICIF(address, null);
	}

	/**
	 * Returns a new {@link FFICIF.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link FFICIF.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link FFICIF.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link FFICIF.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #abi}. */
	public static int nabi(long struct) { return memGetInt(struct + FFICIF.ABI); }
	/** Unsafe version of {@link #nargs}. */
	public static int nnargs(long struct) { return memGetInt(struct + FFICIF.NARGS); }
	/** Unsafe version of {@link #arg_types() arg_types}. */
	public static PointerBuffer narg_types(long struct) { return memPointerBuffer(memGetAddress(struct + FFICIF.ARG_TYPES), nnargs(struct)); }
	/** Unsafe version of {@link #rtype}. */
	public static FFIType nrtype(long struct) { return FFIType.create(memGetAddress(struct + FFICIF.RTYPE)); }
	/** Unsafe version of {@link #bytes}. */
	public static int nbytes(long struct) { return memGetInt(struct + FFICIF.BYTES); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + FFICIF.FLAGS); }

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
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected FFICIF newInstance(long address) {
			return new FFICIF(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code abi} field. */
		public int abi() { return FFICIF.nabi(address()); }
		/** Returns the value of the {@code nargs} field. */
		public int nargs() { return FFICIF.nnargs(address()); }
		/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code arg_types} field. */
		public PointerBuffer arg_types() { return FFICIF.narg_types(address()); }
		/** Returns a {@link FFIType} view of the struct pointed to by the {@code rtype} field. */
		public FFIType rtype() { return FFICIF.nrtype(address()); }
		/** Returns the value of the {@code bytes} field. */
		public int bytes() { return FFICIF.nbytes(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return FFICIF.nflags(address()); }

	}

}