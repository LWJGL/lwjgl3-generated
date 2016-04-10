/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * X11-specific declarations for AWT native interface.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code drawable} &ndash; the drawable</li>
 * <li>{@code display} &ndash; the connection to the X server</li>
 * <li>{@code visualID} &ndash; the VisualID</li>
 * <li>{@code colormapID} &ndash; the colormap</li>
 * <li>{@code depth} &ndash; the depth</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct JAWT_X11DrawingSurfaceInfo {
    Drawable drawable;
    Display * display;
    VisualID visualID;
    Colormap colormapID;
    int depth;
}</code></pre>
 */
public class JAWTX11DrawingSurfaceInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		DRAWABLE,
		DISPLAY,
		VISUALID,
		COLORMAPID,
		DEPTH;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		DRAWABLE = layout.offsetof(0);
		DISPLAY = layout.offsetof(1);
		VISUALID = layout.offsetof(2);
		COLORMAPID = layout.offsetof(3);
		DEPTH = layout.offsetof(4);
	}

	JAWTX11DrawingSurfaceInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link JAWTX11DrawingSurfaceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public JAWTX11DrawingSurfaceInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code drawable} field. */
	public long drawable() { return ndrawable(address()); }
	/** Returns the value of the {@code display} field. */
	public long display() { return ndisplay(address()); }
	/** Returns the value of the {@code visualID} field. */
	public long visualID() { return nvisualID(address()); }
	/** Returns the value of the {@code colormapID} field. */
	public long colormapID() { return ncolormapID(address()); }
	/** Returns the value of the {@code depth} field. */
	public int depth() { return ndepth(address()); }

	// -----------------------------------

	/** Returns a new {@link JAWTX11DrawingSurfaceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static JAWTX11DrawingSurfaceInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link JAWTX11DrawingSurfaceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static JAWTX11DrawingSurfaceInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link JAWTX11DrawingSurfaceInfo} instance allocated with {@link BufferUtils}. */
	public static JAWTX11DrawingSurfaceInfo create() {
		return new JAWTX11DrawingSurfaceInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link JAWTX11DrawingSurfaceInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static JAWTX11DrawingSurfaceInfo create(long address) {
		return address == NULL ? null : new JAWTX11DrawingSurfaceInfo(address, null);
	}

	/**
	 * Returns a new {@link JAWTX11DrawingSurfaceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTX11DrawingSurfaceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTX11DrawingSurfaceInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link JAWTX11DrawingSurfaceInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link JAWTX11DrawingSurfaceInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static JAWTX11DrawingSurfaceInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link JAWTX11DrawingSurfaceInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static JAWTX11DrawingSurfaceInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link JAWTX11DrawingSurfaceInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWTX11DrawingSurfaceInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWTX11DrawingSurfaceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWTX11DrawingSurfaceInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWTX11DrawingSurfaceInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWTX11DrawingSurfaceInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWTX11DrawingSurfaceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTX11DrawingSurfaceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #drawable}. */
	public static long ndrawable(long struct) { return memGetAddress(struct + JAWTX11DrawingSurfaceInfo.DRAWABLE); }
	/** Unsafe version of {@link #display}. */
	public static long ndisplay(long struct) { return memGetAddress(struct + JAWTX11DrawingSurfaceInfo.DISPLAY); }
	/** Unsafe version of {@link #visualID}. */
	public static long nvisualID(long struct) { return memGetAddress(struct + JAWTX11DrawingSurfaceInfo.VISUALID); }
	/** Unsafe version of {@link #colormapID}. */
	public static long ncolormapID(long struct) { return memGetAddress(struct + JAWTX11DrawingSurfaceInfo.COLORMAPID); }
	/** Unsafe version of {@link #depth}. */
	public static int ndepth(long struct) { return memGetInt(struct + JAWTX11DrawingSurfaceInfo.DEPTH); }

	// -----------------------------------

	/** An array of {@link JAWTX11DrawingSurfaceInfo} structs. */
	public static final class Buffer extends StructBuffer<JAWTX11DrawingSurfaceInfo, Buffer> {

		/**
		 * Creates a new {@link JAWTX11DrawingSurfaceInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link JAWTX11DrawingSurfaceInfo#SIZEOF}, and its mark will be undefined.
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
		protected JAWTX11DrawingSurfaceInfo newInstance(long address) {
			return new JAWTX11DrawingSurfaceInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code drawable} field. */
		public long drawable() { return JAWTX11DrawingSurfaceInfo.ndrawable(address()); }
		/** Returns the value of the {@code display} field. */
		public long display() { return JAWTX11DrawingSurfaceInfo.ndisplay(address()); }
		/** Returns the value of the {@code visualID} field. */
		public long visualID() { return JAWTX11DrawingSurfaceInfo.nvisualID(address()); }
		/** Returns the value of the {@code colormapID} field. */
		public long colormapID() { return JAWTX11DrawingSurfaceInfo.ncolormapID(address()); }
		/** Returns the value of the {@code depth} field. */
		public int depth() { return JAWTX11DrawingSurfaceInfo.ndepth(address()); }

	}

}