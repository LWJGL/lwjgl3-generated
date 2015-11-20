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
 * Return values for {@link OVRUtil#ovr_Detect}
 * 
 * <h3>ovrDetectResult members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>IsOculusServiceRunning</td><td class="nw">ovrBool</td><td>is {@link OVR#ovrFalse} when the Oculus Service is not running. This means that the Oculus Service is either uninstalled or stopped.
 * {@code IsOculusHMDConnected} will be {@link OVR#ovrFalse} in this case.
 * 
 * <p>is {@link OVR#ovrTrue} when the Oculus Service is running. This means that the Oculus Service is installed and running. {@code IsOculusHMDConnected} will
 * reflect the state of the HMD.</td></tr>
 * <tr><td>IsOculusHMDConnected</td><td class="nw">ovrBool</td><td>is {@link OVR#ovrFalse} when an Oculus HMD is not detected. If the Oculus Service is not running, this will be {@link OVR#ovrFalse}.</p>
 * 
 * <p>is {@link OVR#ovrTrue} when an Oculus HMD is detected. This implies that the Oculus Service is also installed and running.</td></tr>
 * <tr><td>*</td><td class="nw">char[6]</td><td></td></tr>
 * </table></p>
 */
public class OVRDetectResult extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		__ALIGNMENT = layout.getAlignment();

		ISOCULUSSERVICERUNNING = layout.offsetof(0);
		ISOCULUSHMDCONNECTED = layout.offsetof(1);
	}

	OVRDetectResult(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRDetectResult} instance at the specified memory address. */
	public OVRDetectResult(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRDetectResult} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRDetectResult(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code IsOculusServiceRunning} field. */
	public boolean IsOculusServiceRunning() { return nIsOculusServiceRunning(address()); }
	/** Returns the value of the {@code IsOculusHMDConnected} field. */
	public boolean IsOculusHMDConnected() { return nIsOculusHMDConnected(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRDetectResult} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRDetectResult malloc() {
		return new OVRDetectResult(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRDetectResult} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRDetectResult calloc() {
		return new OVRDetectResult(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRDetectResult} instance allocated with {@link BufferUtils}. */
	public static OVRDetectResult create() {
		return new OVRDetectResult(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRDetectResult.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRDetectResult.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRDetectResult.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRDetectResult.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

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
		protected OVRDetectResult newInstance(long address) {
			return new OVRDetectResult(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code IsOculusServiceRunning} field. */
		public boolean IsOculusServiceRunning() { return nIsOculusServiceRunning(address()); }
		/** Returns the value of the {@code IsOculusHMDConnected} field. */
		public boolean IsOculusHMDConnected() { return nIsOculusHMDConnected(address()); }

	}

}