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

/**
 * Field Of View (FOV) in tangent of the angle units. As an example, for a standard 90 degree vertical FOV, we would have:
 * <pre><code style="font-family: monospace">
 * { UpTan = tan(90 degrees / 2), DownTan = tan(90 degrees / 2) }</code></pre>.
 */
public class OVRFovPort extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		UPTAN,
		DOWNTAN,
		LEFTTAN,
		RIGHTTAN;

	static {
		IntBuffer offsets = memAllocInt(4);

		SIZEOF = offsets(memAddress(offsets));

		UPTAN = offsets.get(0);
		DOWNTAN = offsets.get(1);
		LEFTTAN = offsets.get(2);
		RIGHTTAN = offsets.get(3);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRFovPort(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRFovPort} instance at the specified memory address. */
	public OVRFovPort(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRFovPort} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRFovPort(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public float getUpTan() { return ngetUpTan(address()); }
	public float getDownTan() { return ngetDownTan(address()); }
	public float getLeftTan() { return ngetLeftTan(address()); }
	public float getRightTan() { return ngetRightTan(address()); }

	public OVRFovPort setUpTan(float UpTan) { nsetUpTan(address(), UpTan); return this; }
	public OVRFovPort setDownTan(float DownTan) { nsetDownTan(address(), DownTan); return this; }
	public OVRFovPort setLeftTan(float LeftTan) { nsetLeftTan(address(), LeftTan); return this; }
	public OVRFovPort setRightTan(float RightTan) { nsetRightTan(address(), RightTan); return this; }

	/** Initializes this struct with the specified values. */
	public OVRFovPort set(
		float UpTan,
		float DownTan,
		float LeftTan,
		float RightTan
	) {
		setUpTan(UpTan);
		setDownTan(DownTan);
		setLeftTan(LeftTan);
		setRightTan(RightTan);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRFovPort nset(long struct) {
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
	public OVRFovPort set(OVRFovPort src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRFovPort set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRFovPort} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRFovPort malloc() {
		return new OVRFovPort(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRFovPort} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRFovPort calloc() {
		return new OVRFovPort(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRFovPort} instance allocated with {@link BufferUtils}. */
	public static OVRFovPort create() {
		return new OVRFovPort(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRFovPort.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static float ngetUpTan(long struct) { return memGetFloat(struct + UPTAN); }
	public static float getUpTan(ByteBuffer struct) { return ngetUpTan(memAddress(struct)); }
	public static float ngetDownTan(long struct) { return memGetFloat(struct + DOWNTAN); }
	public static float getDownTan(ByteBuffer struct) { return ngetDownTan(memAddress(struct)); }
	public static float ngetLeftTan(long struct) { return memGetFloat(struct + LEFTTAN); }
	public static float getLeftTan(ByteBuffer struct) { return ngetLeftTan(memAddress(struct)); }
	public static float ngetRightTan(long struct) { return memGetFloat(struct + RIGHTTAN); }
	public static float getRightTan(ByteBuffer struct) { return ngetRightTan(memAddress(struct)); }

	public static void nsetUpTan(long struct, float UpTan) { memPutFloat(struct + UPTAN, UpTan); }
	public static void setUpTan(ByteBuffer struct, float UpTan) { nsetUpTan(memAddress(struct), UpTan); }
	public static void nsetDownTan(long struct, float DownTan) { memPutFloat(struct + DOWNTAN, DownTan); }
	public static void setDownTan(ByteBuffer struct, float DownTan) { nsetDownTan(memAddress(struct), DownTan); }
	public static void nsetLeftTan(long struct, float LeftTan) { memPutFloat(struct + LEFTTAN, LeftTan); }
	public static void setLeftTan(ByteBuffer struct, float LeftTan) { nsetLeftTan(memAddress(struct), LeftTan); }
	public static void nsetRightTan(long struct, float RightTan) { memPutFloat(struct + RIGHTTAN, RightTan); }
	public static void setRightTan(ByteBuffer struct, float RightTan) { nsetRightTan(memAddress(struct), RightTan); }

	// -----------------------------------

	/** An array of {@link OVRFovPort} structs. */
	public static final class Buffer extends StructBuffer<OVRFovPort, Buffer> {

		/**
		 * Creates a new {@link OVRFovPort.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRFovPort#SIZEOF}, and its mark will be undefined.
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
		protected OVRFovPort newInstance(long address) {
			return new OVRFovPort(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public float getUpTan() { return ngetUpTan(address()); }
		public float getDownTan() { return ngetDownTan(address()); }
		public float getLeftTan() { return ngetLeftTan(address()); }
		public float getRightTan() { return ngetRightTan(address()); }

		public OVRFovPort.Buffer setUpTan(float UpTan) { nsetUpTan(address(), UpTan); return this; }
		public OVRFovPort.Buffer setDownTan(float DownTan) { nsetDownTan(address(), DownTan); return this; }
		public OVRFovPort.Buffer setLeftTan(float LeftTan) { nsetLeftTan(address(), LeftTan); return this; }
		public OVRFovPort.Buffer setRightTan(float RightTan) { nsetRightTan(address(), RightTan); return this; }

	}

}