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
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct stbi_io_callbacks {
 *     stbi_io_callbacks.read read;
 *     stbi_io_callbacks.skip skip;
 *     stbi_io_callbacks.eof eof;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>read</td><td>fill {@code data} with {@code size} bytes. Return number of bytes actually read.</td></tr>
 * <tr><td>skip</td><td>skip the next {@code n} bytes, or {@code unget} the last -n bytes if negative</td></tr>
 * <tr><td>eof</td><td>returns nonzero if we are at end of file/data</td></tr>
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
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		READ = layout.offsetof(0);
		SKIP = layout.offsetof(1);
		EOF = layout.offsetof(2);
	}

	STBIIOCallbacks(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link STBIIOCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBIIOCallbacks(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the function address at the {@code read} field. */
	public long read() { return nread(address()); }
	/** Returns the {@code STBIReadCallback} instance at the {@code read} field. */
	public STBIReadCallback readClosure() { return nreadClosure(address()); }
	/** Returns the function address at the {@code skip} field. */
	public long skip() { return nskip(address()); }
	/** Returns the {@code STBISkipCallback} instance at the {@code skip} field. */
	public STBISkipCallback skipClosure() { return nskipClosure(address()); }
	/** Returns the function address at the {@code eof} field. */
	public long eof() { return neof(address()); }
	/** Returns the {@code STBIEOFCallback} instance at the {@code eof} field. */
	public STBIEOFCallback eofClosure() { return neofClosure(address()); }

	/** Sets the specified function address to the {@code read} field. */
	public STBIIOCallbacks read(long value) { nread(address(), value); return this; }
	/** Sets the address of the specified {@link STBIReadCallback} to the {@code read} field. */
	public STBIIOCallbacks read(STBIReadCallback value) { return read(addressSafe(value)); }
	/** Sets the specified function address to the {@code skip} field. */
	public STBIIOCallbacks skip(long value) { nskip(address(), value); return this; }
	/** Sets the address of the specified {@link STBISkipCallback} to the {@code skip} field. */
	public STBIIOCallbacks skip(STBISkipCallback value) { return skip(addressSafe(value)); }
	/** Sets the specified function address to the {@code eof} field. */
	public STBIIOCallbacks eof(long value) { neof(address(), value); return this; }
	/** Sets the address of the specified {@link STBIEOFCallback} to the {@code eof} field. */
	public STBIIOCallbacks eof(STBIEOFCallback value) { return eof(addressSafe(value)); }

	/** Initializes this struct with the specified values. */
	public STBIIOCallbacks set(
		STBIReadCallback read,
		STBISkipCallback skip,
		STBIEOFCallback eof
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

	// -----------------------------------

	/** Returns a new {@link STBIIOCallbacks} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBIIOCallbacks malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBIIOCallbacks} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBIIOCallbacks calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBIIOCallbacks} instance allocated with {@link BufferUtils}. */
	public static STBIIOCallbacks create() {
		return new STBIIOCallbacks(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link STBIIOCallbacks} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static STBIIOCallbacks create(long address) {
		return address == NULL ? null : new STBIIOCallbacks(address, null);
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link STBIIOCallbacks.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #read}. */
	public static long nread(long struct) { return memGetAddress(struct + STBIIOCallbacks.READ); }
	/** Unsafe version of {@link #readClosure}. */
	public static STBIReadCallback nreadClosure(long struct) { return org.lwjgl.system.libffi.Closure.create(nread(struct)); }
	/** Unsafe version of {@link #skip}. */
	public static long nskip(long struct) { return memGetAddress(struct + STBIIOCallbacks.SKIP); }
	/** Unsafe version of {@link #skipClosure}. */
	public static STBISkipCallback nskipClosure(long struct) { return org.lwjgl.system.libffi.Closure.create(nskip(struct)); }
	/** Unsafe version of {@link #eof}. */
	public static long neof(long struct) { return memGetAddress(struct + STBIIOCallbacks.EOF); }
	/** Unsafe version of {@link #eofClosure}. */
	public static STBIEOFCallback neofClosure(long struct) { return org.lwjgl.system.libffi.Closure.create(neof(struct)); }

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
		protected STBIIOCallbacks newInstance(long address) {
			return new STBIIOCallbacks(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the function address at the {@code read} field. */
		public long read() { return STBIIOCallbacks.nread(address()); }
		/** Returns the {@code STBIReadCallback} instance at the {@code read} field. */
		public STBIReadCallback readClosure() { return STBIIOCallbacks.nreadClosure(address()); }
		/** Returns the function address at the {@code skip} field. */
		public long skip() { return STBIIOCallbacks.nskip(address()); }
		/** Returns the {@code STBISkipCallback} instance at the {@code skip} field. */
		public STBISkipCallback skipClosure() { return STBIIOCallbacks.nskipClosure(address()); }
		/** Returns the function address at the {@code eof} field. */
		public long eof() { return STBIIOCallbacks.neof(address()); }
		/** Returns the {@code STBIEOFCallback} instance at the {@code eof} field. */
		public STBIEOFCallback eofClosure() { return STBIIOCallbacks.neofClosure(address()); }

		/** Sets the specified function address to the {@code read} field. */
		public STBIIOCallbacks.Buffer read(long value) { STBIIOCallbacks.nread(address(), value); return this; }
		/** Sets the address of the specified {@link STBIReadCallback} to the {@code read} field. */
		public STBIIOCallbacks.Buffer read(STBIReadCallback value) { return read(addressSafe(value)); }
		/** Sets the specified function address to the {@code skip} field. */
		public STBIIOCallbacks.Buffer skip(long value) { STBIIOCallbacks.nskip(address(), value); return this; }
		/** Sets the address of the specified {@link STBISkipCallback} to the {@code skip} field. */
		public STBIIOCallbacks.Buffer skip(STBISkipCallback value) { return skip(addressSafe(value)); }
		/** Sets the specified function address to the {@code eof} field. */
		public STBIIOCallbacks.Buffer eof(long value) { STBIIOCallbacks.neof(address(), value); return this; }
		/** Sets the address of the specified {@link STBIEOFCallback} to the {@code eof} field. */
		public STBIIOCallbacks.Buffer eof(STBIEOFCallback value) { return eof(addressSafe(value)); }

	}

}