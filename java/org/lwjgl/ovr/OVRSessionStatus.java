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
 * Specifies status information for the current session.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct ovrSessionStatus {
 *     ovrBool HasVrFocus;
 *     ovrBool HmdPresent;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>HasVrFocus</td><td>true if the process has VR focus and thus is visible in the HMD</td></tr>
 * <tr><td>HmdPresent</td><td>true if an HMD is present</td></tr>
 * </table>
 */
public class OVRSessionStatus extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		HASVRFOCUS,
		HMDPRESENT;

	static {
		Layout layout = __struct(
			__member(1),
			__member(1)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		HASVRFOCUS = layout.offsetof(0);
		HMDPRESENT = layout.offsetof(1);
	}

	OVRSessionStatus(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRSessionStatus} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRSessionStatus(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code HasVrFocus} field. */
	public boolean HasVrFocus() { return nHasVrFocus(address()); }
	/** Returns the value of the {@code HmdPresent} field. */
	public boolean HmdPresent() { return nHmdPresent(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRSessionStatus} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRSessionStatus malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRSessionStatus} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRSessionStatus calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRSessionStatus} instance allocated with {@link BufferUtils}. */
	public static OVRSessionStatus create() {
		return new OVRSessionStatus(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRSessionStatus} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRSessionStatus create(long address) {
		return address == NULL ? null : new OVRSessionStatus(address, null);
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRSessionStatus.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #HasVrFocus}. */
	public static boolean nHasVrFocus(long struct) { return memGetByte(struct + OVRSessionStatus.HASVRFOCUS) != 0; }
	/** Unsafe version of {@link #HmdPresent}. */
	public static boolean nHmdPresent(long struct) { return memGetByte(struct + OVRSessionStatus.HMDPRESENT) != 0; }

	// -----------------------------------

	/** An array of {@link OVRSessionStatus} structs. */
	public static final class Buffer extends StructBuffer<OVRSessionStatus, Buffer> {

		/**
		 * Creates a new {@link OVRSessionStatus.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRSessionStatus#SIZEOF}, and its mark will be undefined.
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
		protected OVRSessionStatus newInstance(long address) {
			return new OVRSessionStatus(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code HasVrFocus} field. */
		public boolean HasVrFocus() { return OVRSessionStatus.nHasVrFocus(address()); }
		/** Returns the value of the {@code HmdPresent} field. */
		public boolean HmdPresent() { return OVRSessionStatus.nHmdPresent(address()); }

	}

}