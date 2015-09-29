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

/** Image IO callbacks, used by {@link STBImage#stbi_load_from_callbacks}. */
public final class STBIIOCallbacks extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		READ,
		SKIP,
		EOF;

	static {
		IntBuffer offsets = memAllocInt(3);

		SIZEOF = offsets(memAddress(offsets));

		READ = offsets.get(0);
		SKIP = offsets.get(1);
		EOF = offsets.get(2);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	STBIIOCallbacks(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBIIOCallbacks} instance at the specified memory address. */
	public STBIIOCallbacks(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBIIOCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBIIOCallbacks(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public long getRead() { return ngetRead(address()); }
	public long getSkip() { return ngetSkip(address()); }
	public long getEof() { return ngetEof(address()); }

	public STBIIOCallbacks setRead(long read) { nsetRead(address(), read); return this; }
	public STBIIOCallbacks setSkip(long skip) { nsetSkip(address(), skip); return this; }
	public STBIIOCallbacks setEof(long eof) { nsetEof(address(), eof); return this; }

	/** Initializes this struct with the specified values. */
	public STBIIOCallbacks set(
		long read,
		long skip,
		long eof
	) {
		setRead(read);
		setSkip(skip);
		setEof(eof);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public STBIIOCallbacks nset(long struct) {
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
	public STBIIOCallbacks set(STBIIOCallbacks src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public STBIIOCallbacks set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link STBIIOCallbacks} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBIIOCallbacks malloc() {
		return new STBIIOCallbacks(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBIIOCallbacks} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBIIOCallbacks calloc() {
		return new STBIIOCallbacks(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBIIOCallbacks} instance allocated with {@link BufferUtils}. */
	public static STBIIOCallbacks create() {
		return new STBIIOCallbacks(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static long ngetRead(long struct) { return memGetAddress(struct + READ); }
	public static long getRead(ByteBuffer struct) { return ngetRead(memAddress(struct)); }
	public static long ngetSkip(long struct) { return memGetAddress(struct + SKIP); }
	public static long getSkip(ByteBuffer struct) { return ngetSkip(memAddress(struct)); }
	public static long ngetEof(long struct) { return memGetAddress(struct + EOF); }
	public static long getEof(ByteBuffer struct) { return ngetEof(memAddress(struct)); }

	public static void nsetRead(long struct, long read) { memPutAddress(struct + READ, read); }
	public static void setRead(ByteBuffer struct, long read) { nsetRead(memAddress(struct), read); }
	public static void nsetSkip(long struct, long skip) { memPutAddress(struct + SKIP, skip); }
	public static void setSkip(ByteBuffer struct, long skip) { nsetSkip(memAddress(struct), skip); }
	public static void nsetEof(long struct, long eof) { memPutAddress(struct + EOF, eof); }
	public static void setEof(ByteBuffer struct, long eof) { nsetEof(memAddress(struct), eof); }

	// -----------------------------------

	/** An array of {@link STBIIOCallbacks} structs. */
	public static final class Buffer extends StructBuffer<STBIIOCallbacks, Buffer> {

		/**
		 * Creates a new {@link STBIIOCallbacks.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBIIOCallbacks#SIZEOF}, and its mark will be undefined.
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
		protected STBIIOCallbacks newInstance(long address) {
			return new STBIIOCallbacks(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public long getRead() { return ngetRead(address()); }
		public long getSkip() { return ngetSkip(address()); }
		public long getEof() { return ngetEof(address()); }

		public STBIIOCallbacks.Buffer setRead(long read) { nsetRead(address(), read); return this; }
		public STBIIOCallbacks.Buffer setSkip(long skip) { nsetSkip(address(), skip); return this; }
		public STBIIOCallbacks.Buffer setEof(long eof) { nsetEof(address(), eof); return this; }

	}

}