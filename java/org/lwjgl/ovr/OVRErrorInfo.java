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

/**
 * Provides information about the last error.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct ovrErrorInfo {
 *     ovrResult Result;
 *     char[512] ErrorString;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>Result</td><td>the result from the last API call that generated an error ovrResult</td></tr>
 * <tr><td>ErrorString</td><td>a UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions</td></tr>
 * </table>
 */
public class OVRErrorInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		__ALIGNMENT = layout.getAlignment();

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
	/** Returns the value at the specified index of the {@code ErrorString} field. */
	public byte ErrorString(int index) { return nErrorString(address(), index); }

	// -----------------------------------

	/** Returns a new {@link OVRErrorInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRErrorInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRErrorInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
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

	/** Unsafe version of {@link #Result}. */
	public static int nResult(long struct) { return memGetInt(struct + OVRErrorInfo.RESULT); }
	/** Unsafe version of {@link #ErrorString}. */
	public static ByteBuffer nErrorString(long struct) {
		return memByteBuffer(struct + OVRErrorInfo.ERRORSTRING, 512);
	}
	/** Unsafe version of {@link #ErrorString(int) ErrorString}. */
	public static byte nErrorString(long struct, int index) { return memGetByte(struct + OVRErrorInfo.ERRORSTRING + index * 1); }

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
			return new OVRErrorInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code Result} field. */
		public int Result() { return OVRErrorInfo.nResult(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code ErrorString} field. */
		public ByteBuffer ErrorString() { return OVRErrorInfo.nErrorString(address()); }
		/** Returns the value at the specified index of the {@code ErrorString} field. */
		public byte ErrorString(int index) { return OVRErrorInfo.nErrorString(address(), index); }

	}

}