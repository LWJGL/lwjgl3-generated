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

/** Frame timing data reported by {@link OVR#ovrHmd_GetFrameTiming}. */
public final class OVRFrameTiming extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		DISPLAYMIDPOINTSECONDS,
		FRAMEINTERVALSECONDS,
		APPFRAMEINDEX,
		DISPLAYFRAMEINDEX;

	static {
		IntBuffer offsets = memAllocInt(4);

		SIZEOF = offsets(memAddress(offsets));

		DISPLAYMIDPOINTSECONDS = offsets.get(0);
		FRAMEINTERVALSECONDS = offsets.get(1);
		APPFRAMEINDEX = offsets.get(2);
		DISPLAYFRAMEINDEX = offsets.get(3);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRFrameTiming(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRFrameTiming} instance at the specified memory address. */
	public OVRFrameTiming(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRFrameTiming} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRFrameTiming(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public double getDisplayMidpointSeconds() { return ngetDisplayMidpointSeconds(address()); }
	public double getFrameIntervalSeconds() { return ngetFrameIntervalSeconds(address()); }
	public double getAppFrameIndex() { return ngetAppFrameIndex(address()); }
	public double getDisplayFrameIndex() { return ngetDisplayFrameIndex(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRFrameTiming} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRFrameTiming malloc() {
		return new OVRFrameTiming(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRFrameTiming} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRFrameTiming calloc() {
		return new OVRFrameTiming(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRFrameTiming} instance allocated with {@link BufferUtils}. */
	public static OVRFrameTiming create() {
		return new OVRFrameTiming(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFrameTiming.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFrameTiming.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFrameTiming.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static double ngetDisplayMidpointSeconds(long struct) { return memGetDouble(struct + DISPLAYMIDPOINTSECONDS); }
	public static double getDisplayMidpointSeconds(ByteBuffer struct) { return ngetDisplayMidpointSeconds(memAddress(struct)); }
	public static double ngetFrameIntervalSeconds(long struct) { return memGetDouble(struct + FRAMEINTERVALSECONDS); }
	public static double getFrameIntervalSeconds(ByteBuffer struct) { return ngetFrameIntervalSeconds(memAddress(struct)); }
	public static double ngetAppFrameIndex(long struct) { return memGetDouble(struct + APPFRAMEINDEX); }
	public static double getAppFrameIndex(ByteBuffer struct) { return ngetAppFrameIndex(memAddress(struct)); }
	public static double ngetDisplayFrameIndex(long struct) { return memGetDouble(struct + DISPLAYFRAMEINDEX); }
	public static double getDisplayFrameIndex(ByteBuffer struct) { return ngetDisplayFrameIndex(memAddress(struct)); }

	// -----------------------------------

	/** An array of {@link OVRFrameTiming} structs. */
	public static final class Buffer extends StructBuffer<OVRFrameTiming, Buffer> {

		/**
		 * Creates a new {@link OVRFrameTiming.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRFrameTiming#SIZEOF}, and its mark will be undefined.
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
		protected OVRFrameTiming newInstance(long address) {
			return new OVRFrameTiming(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public double getDisplayMidpointSeconds() { return ngetDisplayMidpointSeconds(address()); }
		public double getFrameIntervalSeconds() { return ngetFrameIntervalSeconds(address()); }
		public double getAppFrameIndex() { return ngetAppFrameIndex(address()); }
		public double getDisplayFrameIndex() { return ngetDisplayFrameIndex(address()); }

	}

}