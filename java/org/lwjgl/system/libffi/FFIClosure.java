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
 * The libffi closure structure.
 * 
 * <h3>ffi_closure members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>cif</td><td class="nw">ffi_cif *</td><td></td></tr>
 * <tr><td>fun</td><td class="nw">void</td><td></td></tr>
 * <tr><td>user_data</td><td class="nw">void</td><td></td></tr>
 * </table>
 */
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

	/** Returns a {@link FFICIF} view of the struct pointed to by the {@code cif} field. */
	public FFICIF cif() { return ncifStruct(address()); }
	/** Returns the value of the {@code fun} field. */
	public long fun() { return nfun(address()); }
	/** Returns the value of the {@code user_data} field. */
	public long user_data() { return nuser_data(address()); }

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

	/**
	 * Create a {@link FFIClosure.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #cif}. */
	public static FFICIF ncifStruct(long struct) { return new FFICIF(memGetAddress(struct + FFIClosure.CIF)); }
	/** Unsafe version of {@link #fun}. */
	public static long nfun(long struct) { return memGetAddress(struct + FFIClosure.FUN); }
	/** Unsafe version of {@link #user_data}. */
	public static long nuser_data(long struct) { return memGetAddress(struct + FFIClosure.USER_DATA); }

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

		/** Returns a {@link FFICIF} view of the struct pointed to by the {@code cif} field. */
		public FFICIF cif() { return ncifStruct(address()); }
		/** Returns the value of the {@code fun} field. */
		public long fun() { return nfun(address()); }
		/** Returns the value of the {@code user_data} field. */
		public long user_data() { return nuser_data(address()); }

	}

}