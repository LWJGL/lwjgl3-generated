/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Provides information about the last error.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Result} &ndash; the result from the last API call that generated an error {@code ovrResult}</li>
 * <li>{@code ErrorString} &ndash; a UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrErrorInfo {
    ovrResult Result;
    char[512] ErrorString;
}</code></pre>
 */
public class OVRErrorInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		RESULT,
		ERRORSTRING;

	static {
		Layout layout = __struct(
			__member(4),
			__array(1, 512)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		RESULT = layout.offsetof(0);
		ERRORSTRING = layout.offsetof(1);
	}

	OVRErrorInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRErrorInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRErrorInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code Result} field. */
	public int Result() { return nResult(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code ErrorString} field. */
	public ByteBuffer ErrorString() { return nErrorString(address()); }
	/** Decodes the null-terminated string stored in the {@code ErrorString} field. */
	public String ErrorStringString() { return nErrorStringString(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRErrorInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRErrorInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRErrorInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRErrorInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRErrorInfo} instance allocated with {@link BufferUtils}. */
	public static OVRErrorInfo create() {
		return new OVRErrorInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRErrorInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRErrorInfo create(long address) {
		return address == NULL ? null : new OVRErrorInfo(address, null);
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRErrorInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRErrorInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRErrorInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRErrorInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRErrorInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRErrorInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRErrorInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRErrorInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRErrorInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Result}. */
	public static int nResult(long struct) { return memGetInt(struct + OVRErrorInfo.RESULT); }
	/** Unsafe version of {@link #ErrorString}. */
	public static ByteBuffer nErrorString(long struct) { return memByteBuffer(struct + OVRErrorInfo.ERRORSTRING, 512); }
	/** Unsafe version of {@link #ErrorStringString}. */
	public static String nErrorStringString(long struct) { return memUTF8(struct + OVRErrorInfo.ERRORSTRING); }

	// -----------------------------------

	/** An array of {@link OVRErrorInfo} structs. */
	public static final class Buffer extends StructBuffer<OVRErrorInfo, Buffer> {

		/**
		 * Creates a new {@link OVRErrorInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRErrorInfo#SIZEOF}, and its mark will be undefined.
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
		protected OVRErrorInfo newInstance(long address) {
			return new OVRErrorInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code Result} field. */
		public int Result() { return OVRErrorInfo.nResult(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code ErrorString} field. */
		public ByteBuffer ErrorString() { return OVRErrorInfo.nErrorString(address()); }
		/** Decodes the null-terminated string stored in the {@code ErrorString} field. */
		public String ErrorStringString() { return OVRErrorInfo.nErrorStringString(address()); }

	}

}