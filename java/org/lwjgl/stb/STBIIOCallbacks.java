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

/**
 * Image IO callbacks, used by {@link STBImage#stbi_load_from_callbacks}.
 * 
 * <h3>stbi_io_callbacks members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>read</td><td class="nw">stbi_io_callbacks.read</td><td>fill {@code data} with {@code size} bytes. Return number of bytes actually read.</td></tr>
 * <tr><td>skip</td><td class="nw">stbi_io_callbacks.skip</td><td>skip the next {@code n} bytes, or {@code unget} the last -n bytes if negative</td></tr>
 * <tr><td>eof</td><td class="nw">stbi_io_callbacks.eof</td><td>returns nonzero if we are at end of file/data</td></tr>
 * </table>
 */
public class STBIIOCallbacks extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		READ,
		SKIP,
		EOF;

	static {
		Layout layout = __struct(
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		READ = layout.offsetof(0);
		SKIP = layout.offsetof(1);
		EOF = layout.offsetof(2);
	}

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

	/** Returns the {@code STBIReadCallback} instance at the {@code read} field. */
	public STBIReadCallback read() { return nread(address()); }
	/** Returns the {@code STBISkipCallback} instance at the {@code skip} field. */
	public STBISkipCallback skip() { return nskip(address()); }
	/** Returns the {@code STBIEOFCallback} instance at the {@code eof} field. */
	public STBIEOFCallback eof() { return neof(address()); }

	/** Sets the specified value to the {@code read} field. */
	public STBIIOCallbacks read(long value) { nread(address(), value); return this; }
	/** Sets the specified value to the {@code skip} field. */
	public STBIIOCallbacks skip(long value) { nskip(address(), value); return this; }
	/** Sets the specified value to the {@code eof} field. */
	public STBIIOCallbacks eof(long value) { neof(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public STBIIOCallbacks set(
		long read,
		long skip,
		long eof
	) {
		read(read);
		skip(skip);
		eof(eof);

		return this;
	}

	/** Unsafe version of {@link #set(STBIIOCallbacks) set}. */
	public STBIIOCallbacks nset(long struct) {
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
	public STBIIOCallbacks set(STBIIOCallbacks src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(STBIIOCallbacks) set}. */
	public STBIIOCallbacks set(ByteBuffer struct) {
		if ( CHECKS )
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

	/**
	 * Create a {@link STBIIOCallbacks.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #read}. */
	public static STBIReadCallback nread(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + STBIIOCallbacks.READ)); }
	/** Unsafe version of {@link #skip}. */
	public static STBISkipCallback nskip(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + STBIIOCallbacks.SKIP)); }
	/** Unsafe version of {@link #eof}. */
	public static STBIEOFCallback neof(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + STBIIOCallbacks.EOF)); }

	/** Unsafe version of {@link #read(long) read}. */
	public static void nread(long struct, long value) { memPutAddress(struct + STBIIOCallbacks.READ, value); }
	/** Unsafe version of {@link #skip(long) skip}. */
	public static void nskip(long struct, long value) { memPutAddress(struct + STBIIOCallbacks.SKIP, value); }
	/** Unsafe version of {@link #eof(long) eof}. */
	public static void neof(long struct, long value) { memPutAddress(struct + STBIIOCallbacks.EOF, value); }

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

		/** Returns the {@code STBIReadCallback} instance at the {@code read} field. */
		public STBIReadCallback read() { return nread(address()); }
		/** Returns the {@code STBISkipCallback} instance at the {@code skip} field. */
		public STBISkipCallback skip() { return nskip(address()); }
		/** Returns the {@code STBIEOFCallback} instance at the {@code eof} field. */
		public STBIEOFCallback eof() { return neof(address()); }

		/** Sets the specified value to the {@code read} field. */
		public STBIIOCallbacks.Buffer read(long value) { nread(address(), value); return this; }
		/** Sets the specified value to the {@code skip} field. */
		public STBIIOCallbacks.Buffer skip(long value) { nskip(address(), value); return this; }
		/** Sets the specified value to the {@code eof} field. */
		public STBIIOCallbacks.Buffer eof(long value) { neof(address(), value); return this; }

	}

}