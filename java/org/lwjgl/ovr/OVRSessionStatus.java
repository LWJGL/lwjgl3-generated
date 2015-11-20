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
 * <h3>ovrSessionStatus members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>HasVrFocus</td><td class="nw">ovrBool</td><td>true if the process has VR focus and thus is visible in the HMD</td></tr>
 * <tr><td>HmdPresent</td><td class="nw">ovrBool</td><td>true if an HMD is present</td></tr>
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
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRSessionStatus} instance at the specified memory address. */
	public OVRSessionStatus(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRSessionStatus} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRSessionStatus(ByteBuffer container) {
		this(memAddress(container), container);
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
		return new OVRSessionStatus(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRSessionStatus} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRSessionStatus calloc() {
		return new OVRSessionStatus(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRSessionStatus} instance allocated with {@link BufferUtils}. */
	public static OVRSessionStatus create() {
		return new OVRSessionStatus(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRSessionStatus.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
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
		protected OVRSessionStatus newInstance(long address) {
			return new OVRSessionStatus(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code HasVrFocus} field. */
		public boolean HasVrFocus() { return nHasVrFocus(address()); }
		/** Returns the value of the {@code HmdPresent} field. */
		public boolean HmdPresent() { return nHmdPresent(address()); }

	}

}