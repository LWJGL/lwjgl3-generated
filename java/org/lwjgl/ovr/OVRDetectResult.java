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
 * Return values for {@link OVRUtil#ovr_Detect}
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code IsOculusServiceRunning} &ndash; 
 * is {@link OVR#ovrFalse} when the Oculus Service is not running. This means that the Oculus Service is either uninstalled or stopped.
 * {@code IsOculusHMDConnected} will be {@link OVR#ovrFalse} in this case.
 * 
 * <p>is {@link OVR#ovrTrue} when the Oculus Service is running. This means that the Oculus Service is installed and running. {@code IsOculusHMDConnected} will
 * reflect the state of the HMD.</p></li>
 * <li>{@code IsOculusHMDConnected} &ndash; 
 * is {@link OVR#ovrFalse} when an Oculus HMD is not detected. If the Oculus Service is not running, this will be {@link OVR#ovrFalse}.
 * 
 * <p>is {@link OVR#ovrTrue} when an Oculus HMD is detected. This implies that the Oculus Service is also installed and running.</p></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrDetectResult {
    ovrBool IsOculusServiceRunning;
    ovrBool IsOculusHMDConnected;
    char[6];
}</code></pre>
 */
public class OVRDetectResult extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ISOCULUSSERVICERUNNING,
		ISOCULUSHMDCONNECTED;

	static {
		Layout layout = __struct(
			__member(1),
			__member(1),
			__padding(6, true)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ISOCULUSSERVICERUNNING = layout.offsetof(0);
		ISOCULUSHMDCONNECTED = layout.offsetof(1);
	}

	OVRDetectResult(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRDetectResult} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRDetectResult(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code IsOculusServiceRunning} field. */
	public boolean IsOculusServiceRunning() { return nIsOculusServiceRunning(address()); }
	/** Returns the value of the {@code IsOculusHMDConnected} field. */
	public boolean IsOculusHMDConnected() { return nIsOculusHMDConnected(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRDetectResult} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRDetectResult malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRDetectResult} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRDetectResult calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRDetectResult} instance allocated with {@link BufferUtils}. */
	public static OVRDetectResult create() {
		return new OVRDetectResult(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRDetectResult} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRDetectResult create(long address) {
		return address == NULL ? null : new OVRDetectResult(address, null);
	}

	/**
	 * Returns a new {@link OVRDetectResult.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRDetectResult.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRDetectResult.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRDetectResult.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRDetectResult} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRDetectResult mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRDetectResult} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRDetectResult callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRDetectResult} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRDetectResult mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRDetectResult} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRDetectResult callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRDetectResult.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRDetectResult.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRDetectResult.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRDetectResult.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #IsOculusServiceRunning}. */
	public static boolean nIsOculusServiceRunning(long struct) { return memGetByte(struct + OVRDetectResult.ISOCULUSSERVICERUNNING) != 0; }
	/** Unsafe version of {@link #IsOculusHMDConnected}. */
	public static boolean nIsOculusHMDConnected(long struct) { return memGetByte(struct + OVRDetectResult.ISOCULUSHMDCONNECTED) != 0; }

	// -----------------------------------

	/** An array of {@link OVRDetectResult} structs. */
	public static final class Buffer extends StructBuffer<OVRDetectResult, Buffer> {

		/**
		 * Creates a new {@link OVRDetectResult.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRDetectResult#SIZEOF}, and its mark will be undefined.
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
		protected OVRDetectResult newInstance(long address) {
			return new OVRDetectResult(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code IsOculusServiceRunning} field. */
		public boolean IsOculusServiceRunning() { return OVRDetectResult.nIsOculusServiceRunning(address()); }
		/** Returns the value of the {@code IsOculusHMDConnected} field. */
		public boolean IsOculusHMDConnected() { return OVRDetectResult.nIsOculusHMDConnected(address()); }

	}

}