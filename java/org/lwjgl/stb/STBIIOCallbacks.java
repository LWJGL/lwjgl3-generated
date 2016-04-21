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
import static org.lwjgl.system.MemoryStack.*;

/**
 * Image IO callbacks, used by {@link STBImage#stbi_load_from_callbacks load_from_callbacks}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code read} &ndash; fill {@code data} with {@code size} bytes. Return number of bytes actually read.</li>
 * <li>{@code skip} &ndash; skip the next {@code n} bytes, or {@code unget} the last -n bytes if negative</li>
 * <li>{@code eof} &ndash; returns nonzero if we are at end of file/data</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct stbi_io_callbacks {
    stbi_io_callbacks.read read;
    stbi_io_callbacks.skip skip;
    stbi_io_callbacks.eof eof;
}</code></pre>
 */
public class STBIIOCallbacks extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

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

	/** Returns the {@code STBIReadCallback} instance at the {@code read} field. */
	public STBIReadCallback read() { return STBIReadCallback.create(nread(address())); }
	/** Returns the {@code STBISkipCallback} instance at the {@code skip} field. */
	public STBISkipCallback skip() { return STBISkipCallback.create(nskip(address())); }
	/** Returns the {@code STBIEOFCallback} instance at the {@code eof} field. */
	public STBIEOFCallback eof() { return STBIEOFCallback.create(neof(address())); }

	/** Sets the address of the specified {@link STBIReadCallbackI} to the {@code read} field. */
	public STBIIOCallbacks read(STBIReadCallbackI value) { nread(address(), addressSafe(value)); return this; }
	/** Sets the address of the specified {@link STBISkipCallbackI} to the {@code skip} field. */
	public STBIIOCallbacks skip(STBISkipCallbackI value) { nskip(address(), addressSafe(value)); return this; }
	/** Sets the address of the specified {@link STBIEOFCallbackI} to the {@code eof} field. */
	public STBIIOCallbacks eof(STBIEOFCallbackI value) { neof(address(), addressSafe(value)); return this; }

	/** Initializes this struct with the specified values. */
	public STBIIOCallbacks set(
		STBIReadCallbackI read,
		STBISkipCallbackI skip,
		STBIEOFCallbackI eof
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

	/** Returns a new {@link STBIIOCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static STBIIOCallbacks malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBIIOCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
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

	// -----------------------------------

	/** Returns a new {@link STBIIOCallbacks} instance allocated on the thread-local {@link MemoryStack}. */
	public static STBIIOCallbacks mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link STBIIOCallbacks} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static STBIIOCallbacks callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link STBIIOCallbacks} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static STBIIOCallbacks mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link STBIIOCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static STBIIOCallbacks callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #read}. */
	public static long nread(long struct) { return memGetAddress(struct + STBIIOCallbacks.READ); }
	/** Unsafe version of {@link #skip}. */
	public static long nskip(long struct) { return memGetAddress(struct + STBIIOCallbacks.SKIP); }
	/** Unsafe version of {@link #eof}. */
	public static long neof(long struct) { return memGetAddress(struct + STBIIOCallbacks.EOF); }

	/** Unsafe version of {@link #read(STBIReadCallbackI) read}. */
	public static void nread(long struct, long value) { memPutAddress(struct + STBIIOCallbacks.READ, checkPointer(value)); }
	/** Unsafe version of {@link #skip(STBISkipCallbackI) skip}. */
	public static void nskip(long struct, long value) { memPutAddress(struct + STBIIOCallbacks.SKIP, checkPointer(value)); }
	/** Unsafe version of {@link #eof(STBIEOFCallbackI) eof}. */
	public static void neof(long struct, long value) { memPutAddress(struct + STBIIOCallbacks.EOF, checkPointer(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + STBIIOCallbacks.READ));
		checkPointer(memGetAddress(struct + STBIIOCallbacks.SKIP));
		checkPointer(memGetAddress(struct + STBIIOCallbacks.EOF));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

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
			return new STBIIOCallbacks(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the {@code STBIReadCallback} instance at the {@code read} field. */
		public STBIReadCallback read() { return STBIReadCallback.create(STBIIOCallbacks.nread(address())); }
		/** Returns the {@code STBISkipCallback} instance at the {@code skip} field. */
		public STBISkipCallback skip() { return STBISkipCallback.create(STBIIOCallbacks.nskip(address())); }
		/** Returns the {@code STBIEOFCallback} instance at the {@code eof} field. */
		public STBIEOFCallback eof() { return STBIEOFCallback.create(STBIIOCallbacks.neof(address())); }

		/** Sets the address of the specified {@link STBIReadCallbackI} to the {@code read} field. */
		public STBIIOCallbacks.Buffer read(STBIReadCallbackI value) { STBIIOCallbacks.nread(address(), addressSafe(value)); return this; }
		/** Sets the address of the specified {@link STBISkipCallbackI} to the {@code skip} field. */
		public STBIIOCallbacks.Buffer skip(STBISkipCallbackI value) { STBIIOCallbacks.nskip(address(), addressSafe(value)); return this; }
		/** Sets the address of the specified {@link STBIEOFCallbackI} to the {@code eof} field. */
		public STBIIOCallbacks.Buffer eof(STBIEOFCallbackI value) { STBIIOCallbacks.neof(address(), addressSafe(value)); return this; }

	}

}