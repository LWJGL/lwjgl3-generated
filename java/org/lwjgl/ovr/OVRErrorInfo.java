/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Provides information about the last error. */
public final class OVRErrorInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		RESULT,
		ERRORSTRING;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		RESULT = offsets.get(0);
		ERRORSTRING = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

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

	public int getResult() { return ngetResult(address()); }
	public void getErrorString(ByteBuffer ErrorString) { ngetErrorString(address(), ErrorString); }

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

	public static int ngetResult(long struct) { return memGetInt(struct + RESULT); }
	public static int getResult(ByteBuffer struct) { return ngetResult(memAddress(struct)); }
	public static void ngetErrorString(long struct, ByteBuffer ErrorString) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ErrorString, 512 * 1);
		memCopy(struct + ERRORSTRING, memAddress(ErrorString), ErrorString.remaining());
	}
	public static void getErrorString(ByteBuffer struct, ByteBuffer ErrorString) { ngetErrorString(memAddress(struct), ErrorString); }
	public static byte ngetErrorString(long struct, int index) { return memGetByte(struct + ERRORSTRING + index * 1); }
	public static byte getErrorString(ByteBuffer struct, int index) { return ngetErrorString(memAddress(struct), index); }

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

		public int getResult() { return ngetResult(address()); }
		public void getErrorString(ByteBuffer ErrorString) { ngetErrorString(address(), ErrorString); }

	}

}