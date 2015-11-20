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
 * <h3>ffi_cif members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>abi</td><td class="nw">ffi_abi</td><td></td></tr>
 * <tr><td>nargs</td><td class="nw">unsigned</td><td></td></tr>
 * <tr><td>arg_types</td><td class="nw">ffi_type *</td><td></td></tr>
 * <tr><td>rtype</td><td class="nw">ffi_type *</td><td></td></tr>
 * <tr><td>bytes</td><td class="nw">unsigned</td><td></td></tr>
 * <tr><td>flags</td><td class="nw">unsigned</td><td></td></tr>
 * </table>
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
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
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

	/** Returns the value of the {@code abi} field. */
	public int abi() { return nabi(address()); }
	/** Returns the value of the {@code nargs} field. */
	public int nargs() { return nnargs(address()); }
	/**
	 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code arg_types} field.
	 *
	 * @param capacity the number of elements in the returned {@link PointerBuffer}
	 */
	public PointerBuffer arg_types(int capacity) { return narg_types(address(), capacity); }
	/** Returns a {@link FFIType} view of the struct pointed to by the {@code rtype} field. */
	public FFIType rtype() { return nrtypeStruct(address()); }
	/** Returns the value of the {@code bytes} field. */
	public int bytes() { return nbytes(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }

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

	/**
	 * Create a {@link FFICIF.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #abi}. */
	public static int nabi(long struct) { return memGetInt(struct + FFICIF.ABI); }
	/** Unsafe version of {@link #nargs}. */
	public static int nnargs(long struct) { return memGetInt(struct + FFICIF.NARGS); }
	/** Unsafe version of {@link #arg_types(int) arg_types}. */
	public static PointerBuffer narg_types(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + FFICIF.ARG_TYPES), capacity); }
	/** Unsafe version of {@link #rtype}. */
	public static FFIType nrtypeStruct(long struct) { return new FFIType(memGetAddress(struct + FFICIF.RTYPE)); }
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

		/** Returns the value of the {@code abi} field. */
		public int abi() { return nabi(address()); }
		/** Returns the value of the {@code nargs} field. */
		public int nargs() { return nnargs(address()); }
		/**
		 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code arg_types} field.
		 *
		 * @param capacity the number of elements in the returned {@link PointerBuffer}
		 */
		public PointerBuffer arg_types(int capacity) { return narg_types(address(), capacity); }
		/** Returns a {@link FFIType} view of the struct pointed to by the {@code rtype} field. */
		public FFIType rtype() { return nrtypeStruct(address()); }
		/** Returns the value of the {@code bytes} field. */
		public int bytes() { return nbytes(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return nflags(address()); }

	}

}