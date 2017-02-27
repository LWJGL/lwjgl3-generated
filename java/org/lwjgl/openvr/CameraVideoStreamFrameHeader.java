/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct CameraVideoStreamFrameHeader_t {
    EVRTrackedCameraFrameType eFrameType;
    uint32_t nWidth;
    uint32_t nHeight;
    uint32_t nBytesPerPixel;
    uint32_t nFrameSequence;
    {@link TrackedDevicePose TrackedDevicePose_t} standingTrackedDevicePose;
}</code></pre>
 */
public class CameraVideoStreamFrameHeader extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		EFRAMETYPE,
		NWIDTH,
		NHEIGHT,
		NBYTESPERPIXEL,
		NFRAMESEQUENCE,
		STANDINGTRACKEDDEVICEPOSE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(TrackedDevicePose.SIZEOF, TrackedDevicePose.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		EFRAMETYPE = layout.offsetof(0);
		NWIDTH = layout.offsetof(1);
		NHEIGHT = layout.offsetof(2);
		NBYTESPERPIXEL = layout.offsetof(3);
		NFRAMESEQUENCE = layout.offsetof(4);
		STANDINGTRACKEDDEVICEPOSE = layout.offsetof(5);
	}

	CameraVideoStreamFrameHeader(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link CameraVideoStreamFrameHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CameraVideoStreamFrameHeader(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code eFrameType} field. */
	public int eFrameType() { return neFrameType(address()); }
	/** Returns the value of the {@code nWidth} field. */
	public int nWidth() { return nnWidth(address()); }
	/** Returns the value of the {@code nHeight} field. */
	public int nHeight() { return nnHeight(address()); }
	/** Returns the value of the {@code nBytesPerPixel} field. */
	public int nBytesPerPixel() { return nnBytesPerPixel(address()); }
	/** Returns the value of the {@code nFrameSequence} field. */
	public int nFrameSequence() { return nnFrameSequence(address()); }
	/** Returns a {@link TrackedDevicePose} view of the {@code standingTrackedDevicePose} field. */
	public TrackedDevicePose standingTrackedDevicePose() { return nstandingTrackedDevicePose(address()); }

	/** Sets the specified value to the {@code eFrameType} field. */
	public CameraVideoStreamFrameHeader eFrameType(int value) { neFrameType(address(), value); return this; }
	/** Sets the specified value to the {@code nWidth} field. */
	public CameraVideoStreamFrameHeader nWidth(int value) { nnWidth(address(), value); return this; }
	/** Sets the specified value to the {@code nHeight} field. */
	public CameraVideoStreamFrameHeader nHeight(int value) { nnHeight(address(), value); return this; }
	/** Sets the specified value to the {@code nBytesPerPixel} field. */
	public CameraVideoStreamFrameHeader nBytesPerPixel(int value) { nnBytesPerPixel(address(), value); return this; }
	/** Sets the specified value to the {@code nFrameSequence} field. */
	public CameraVideoStreamFrameHeader nFrameSequence(int value) { nnFrameSequence(address(), value); return this; }
	/** Copies the specified {@link TrackedDevicePose} to the {@code standingTrackedDevicePose} field. */
	public CameraVideoStreamFrameHeader standingTrackedDevicePose(TrackedDevicePose value) { nstandingTrackedDevicePose(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public CameraVideoStreamFrameHeader set(
		int eFrameType,
		int nWidth,
		int nHeight,
		int nBytesPerPixel,
		int nFrameSequence,
		TrackedDevicePose standingTrackedDevicePose
	) {
		eFrameType(eFrameType);
		nWidth(nWidth);
		nHeight(nHeight);
		nBytesPerPixel(nBytesPerPixel);
		nFrameSequence(nFrameSequence);
		standingTrackedDevicePose(standingTrackedDevicePose);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public CameraVideoStreamFrameHeader set(CameraVideoStreamFrameHeader src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link CameraVideoStreamFrameHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static CameraVideoStreamFrameHeader malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CameraVideoStreamFrameHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static CameraVideoStreamFrameHeader calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CameraVideoStreamFrameHeader} instance allocated with {@link BufferUtils}. */
	public static CameraVideoStreamFrameHeader create() {
		return new CameraVideoStreamFrameHeader(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link CameraVideoStreamFrameHeader} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static CameraVideoStreamFrameHeader create(long address) {
		return address == NULL ? null : new CameraVideoStreamFrameHeader(address, null);
	}

	/**
	 * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link CameraVideoStreamFrameHeader.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link CameraVideoStreamFrameHeader} instance allocated on the thread-local {@link MemoryStack}. */
	public static CameraVideoStreamFrameHeader mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link CameraVideoStreamFrameHeader} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static CameraVideoStreamFrameHeader callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link CameraVideoStreamFrameHeader} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static CameraVideoStreamFrameHeader mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link CameraVideoStreamFrameHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static CameraVideoStreamFrameHeader callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #eFrameType}. */
	public static int neFrameType(long struct) { return memGetInt(struct + CameraVideoStreamFrameHeader.EFRAMETYPE); }
	/** Unsafe version of {@link #nWidth}. */
	public static int nnWidth(long struct) { return memGetInt(struct + CameraVideoStreamFrameHeader.NWIDTH); }
	/** Unsafe version of {@link #nHeight}. */
	public static int nnHeight(long struct) { return memGetInt(struct + CameraVideoStreamFrameHeader.NHEIGHT); }
	/** Unsafe version of {@link #nBytesPerPixel}. */
	public static int nnBytesPerPixel(long struct) { return memGetInt(struct + CameraVideoStreamFrameHeader.NBYTESPERPIXEL); }
	/** Unsafe version of {@link #nFrameSequence}. */
	public static int nnFrameSequence(long struct) { return memGetInt(struct + CameraVideoStreamFrameHeader.NFRAMESEQUENCE); }
	/** Unsafe version of {@link #standingTrackedDevicePose}. */
	public static TrackedDevicePose nstandingTrackedDevicePose(long struct) { return TrackedDevicePose.create(struct + CameraVideoStreamFrameHeader.STANDINGTRACKEDDEVICEPOSE); }

	/** Unsafe version of {@link #eFrameType(int) eFrameType}. */
	public static void neFrameType(long struct, int value) { memPutInt(struct + CameraVideoStreamFrameHeader.EFRAMETYPE, value); }
	/** Unsafe version of {@link #nWidth(int) nWidth}. */
	public static void nnWidth(long struct, int value) { memPutInt(struct + CameraVideoStreamFrameHeader.NWIDTH, value); }
	/** Unsafe version of {@link #nHeight(int) nHeight}. */
	public static void nnHeight(long struct, int value) { memPutInt(struct + CameraVideoStreamFrameHeader.NHEIGHT, value); }
	/** Unsafe version of {@link #nBytesPerPixel(int) nBytesPerPixel}. */
	public static void nnBytesPerPixel(long struct, int value) { memPutInt(struct + CameraVideoStreamFrameHeader.NBYTESPERPIXEL, value); }
	/** Unsafe version of {@link #nFrameSequence(int) nFrameSequence}. */
	public static void nnFrameSequence(long struct, int value) { memPutInt(struct + CameraVideoStreamFrameHeader.NFRAMESEQUENCE, value); }
	/** Unsafe version of {@link #standingTrackedDevicePose(TrackedDevicePose) standingTrackedDevicePose}. */
	public static void nstandingTrackedDevicePose(long struct, TrackedDevicePose value) { memCopy(value.address(), struct + CameraVideoStreamFrameHeader.STANDINGTRACKEDDEVICEPOSE, TrackedDevicePose.SIZEOF); }

	// -----------------------------------

	/** An array of {@link CameraVideoStreamFrameHeader} structs. */
	public static class Buffer extends StructBuffer<CameraVideoStreamFrameHeader, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link CameraVideoStreamFrameHeader.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link CameraVideoStreamFrameHeader#SIZEOF}, and its mark will be undefined.
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
		protected CameraVideoStreamFrameHeader newInstance(long address) {
			return new CameraVideoStreamFrameHeader(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code eFrameType} field. */
		public int eFrameType() { return CameraVideoStreamFrameHeader.neFrameType(address()); }
		/** Returns the value of the {@code nWidth} field. */
		public int nWidth() { return CameraVideoStreamFrameHeader.nnWidth(address()); }
		/** Returns the value of the {@code nHeight} field. */
		public int nHeight() { return CameraVideoStreamFrameHeader.nnHeight(address()); }
		/** Returns the value of the {@code nBytesPerPixel} field. */
		public int nBytesPerPixel() { return CameraVideoStreamFrameHeader.nnBytesPerPixel(address()); }
		/** Returns the value of the {@code nFrameSequence} field. */
		public int nFrameSequence() { return CameraVideoStreamFrameHeader.nnFrameSequence(address()); }
		/** Returns a {@link TrackedDevicePose} view of the {@code standingTrackedDevicePose} field. */
		public TrackedDevicePose standingTrackedDevicePose() { return CameraVideoStreamFrameHeader.nstandingTrackedDevicePose(address()); }

		/** Sets the specified value to the {@code eFrameType} field. */
		public CameraVideoStreamFrameHeader.Buffer eFrameType(int value) { CameraVideoStreamFrameHeader.neFrameType(address(), value); return this; }
		/** Sets the specified value to the {@code nWidth} field. */
		public CameraVideoStreamFrameHeader.Buffer nWidth(int value) { CameraVideoStreamFrameHeader.nnWidth(address(), value); return this; }
		/** Sets the specified value to the {@code nHeight} field. */
		public CameraVideoStreamFrameHeader.Buffer nHeight(int value) { CameraVideoStreamFrameHeader.nnHeight(address(), value); return this; }
		/** Sets the specified value to the {@code nBytesPerPixel} field. */
		public CameraVideoStreamFrameHeader.Buffer nBytesPerPixel(int value) { CameraVideoStreamFrameHeader.nnBytesPerPixel(address(), value); return this; }
		/** Sets the specified value to the {@code nFrameSequence} field. */
		public CameraVideoStreamFrameHeader.Buffer nFrameSequence(int value) { CameraVideoStreamFrameHeader.nnFrameSequence(address(), value); return this; }
		/** Copies the specified {@link TrackedDevicePose} to the {@code standingTrackedDevicePose} field. */
		public CameraVideoStreamFrameHeader.Buffer standingTrackedDevicePose(TrackedDevicePose value) { CameraVideoStreamFrameHeader.nstandingTrackedDevicePose(address(), value); return this; }

	}

}