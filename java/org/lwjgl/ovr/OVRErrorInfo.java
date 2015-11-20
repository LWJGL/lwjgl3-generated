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
 * <h3>ovrErrorInfo members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Result</td><td class="nw">ovrResult</td><td>the result from the last API call that generated an error ovrResult</td></tr>
 * <tr><td>ErrorString</td><td class="nw">char[512]</td><td>a UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions</td></tr>
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
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRErrorInfo} instance at the specified memory address. */
	public OVRErrorInfo(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRErrorInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRErrorInfo(ByteBuffer container) {
		this(memAddress(container), container);
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
		return new OVRErrorInfo(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRErrorInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRErrorInfo calloc() {
		return new OVRErrorInfo(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRErrorInfo} instance allocated with {@link BufferUtils}. */
	public static OVRErrorInfo create() {
		return new OVRErrorInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRErrorInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
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
		protected OVRErrorInfo newInstance(long address) {
			return new OVRErrorInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code Result} field. */
		public int Result() { return nResult(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code ErrorString} field. */
		public ByteBuffer ErrorString() { return nErrorString(address()); }
		/** Returns the value at the specified index of the {@code ErrorString} field. */
		public byte ErrorString(int index) { return nErrorString(address(), index); }

	}

}