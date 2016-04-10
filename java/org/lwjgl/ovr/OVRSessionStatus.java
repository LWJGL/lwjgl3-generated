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
 * Specifies status information for the current session.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code IsVisible} &ndash; True if the process has VR focus and thus is visible in the HMD.</li>
 * <li>{@code HmdPresent} &ndash; True if an HMD is present.</li>
 * <li>{@code HmdMounted} &ndash; True if the HMD is on the user's head.</li>
 * <li>{@code DisplayLost} &ndash; True if the session is in a display-lost state. See {@link OVR#ovr_SubmitFrame}.</li>
 * <li>{@code ShouldQuit} &ndash; True if the application should initiate shutdown.</li>
 * <li>{@code ShouldRecenter} &ndash; True if UX has requested re-centering. Must call {@link OVR#ovr_ClearShouldRecenterFlag} or {@link OVR#ovr_RecenterTrackingOrigin}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrSessionStatus {
    ovrBool IsVisible;
    ovrBool HmdPresent;
    ovrBool HmdMounted;
    ovrBool DisplayLost;
    ovrBool ShouldQuit;
    ovrBool ShouldRecenter;
}</code></pre>
 */
public class OVRSessionStatus extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ISVISIBLE,
		HMDPRESENT,
		HMDMOUNTED,
		DISPLAYLOST,
		SHOULDQUIT,
		SHOULDRECENTER;

	static {
		Layout layout = __struct(
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ISVISIBLE = layout.offsetof(0);
		HMDPRESENT = layout.offsetof(1);
		HMDMOUNTED = layout.offsetof(2);
		DISPLAYLOST = layout.offsetof(3);
		SHOULDQUIT = layout.offsetof(4);
		SHOULDRECENTER = layout.offsetof(5);
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

	/** Returns the value of the {@code IsVisible} field. */
	public boolean IsVisible() { return nIsVisible(address()); }
	/** Returns the value of the {@code HmdPresent} field. */
	public boolean HmdPresent() { return nHmdPresent(address()); }
	/** Returns the value of the {@code HmdMounted} field. */
	public boolean HmdMounted() { return nHmdMounted(address()); }
	/** Returns the value of the {@code DisplayLost} field. */
	public boolean DisplayLost() { return nDisplayLost(address()); }
	/** Returns the value of the {@code ShouldQuit} field. */
	public boolean ShouldQuit() { return nShouldQuit(address()); }
	/** Returns the value of the {@code ShouldRecenter} field. */
	public boolean ShouldRecenter() { return nShouldRecenter(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRSessionStatus} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRSessionStatus malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRSessionStatus} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
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

	// -----------------------------------

	/** Returns a new {@link OVRSessionStatus} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRSessionStatus mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRSessionStatus} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRSessionStatus callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRSessionStatus} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRSessionStatus mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSessionStatus} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRSessionStatus callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRSessionStatus.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #IsVisible}. */
	public static boolean nIsVisible(long struct) { return memGetByte(struct + OVRSessionStatus.ISVISIBLE) != 0; }
	/** Unsafe version of {@link #HmdPresent}. */
	public static boolean nHmdPresent(long struct) { return memGetByte(struct + OVRSessionStatus.HMDPRESENT) != 0; }
	/** Unsafe version of {@link #HmdMounted}. */
	public static boolean nHmdMounted(long struct) { return memGetByte(struct + OVRSessionStatus.HMDMOUNTED) != 0; }
	/** Unsafe version of {@link #DisplayLost}. */
	public static boolean nDisplayLost(long struct) { return memGetByte(struct + OVRSessionStatus.DISPLAYLOST) != 0; }
	/** Unsafe version of {@link #ShouldQuit}. */
	public static boolean nShouldQuit(long struct) { return memGetByte(struct + OVRSessionStatus.SHOULDQUIT) != 0; }
	/** Unsafe version of {@link #ShouldRecenter}. */
	public static boolean nShouldRecenter(long struct) { return memGetByte(struct + OVRSessionStatus.SHOULDRECENTER) != 0; }

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
			return new OVRSessionStatus(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code IsVisible} field. */
		public boolean IsVisible() { return OVRSessionStatus.nIsVisible(address()); }
		/** Returns the value of the {@code HmdPresent} field. */
		public boolean HmdPresent() { return OVRSessionStatus.nHmdPresent(address()); }
		/** Returns the value of the {@code HmdMounted} field. */
		public boolean HmdMounted() { return OVRSessionStatus.nHmdMounted(address()); }
		/** Returns the value of the {@code DisplayLost} field. */
		public boolean DisplayLost() { return OVRSessionStatus.nDisplayLost(address()); }
		/** Returns the value of the {@code ShouldQuit} field. */
		public boolean ShouldQuit() { return OVRSessionStatus.nShouldQuit(address()); }
		/** Returns the value of the {@code ShouldRecenter} field. */
		public boolean ShouldRecenter() { return OVRSessionStatus.nShouldRecenter(address()); }

	}

}