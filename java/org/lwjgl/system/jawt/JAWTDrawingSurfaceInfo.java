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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code platformInfo} &ndash; 
 * Pointer to the platform-specific information. This can be safely cast to a {@code JAWT_Win32DrawingSurfaceInfo} on Windows or a
 * {@code JAWT_X11DrawingSurfaceInfo} on Solaris. On Mac OS X this is a pointer to a {@code NSObject} that conforms to the {@code JAWT_SurfaceLayers}
 * protocol.</li>
 * <li>{@code ds} &ndash; Cached pointer to the underlying drawing surface.</li>
 * <li>{@code bounds} &ndash; Bounding rectangle of the drawing surface.</li>
 * <li>{@code clipSize} &ndash; Number of rectangles in the clip.</li>
 * <li>{@code clip} &ndash; Clip rectangle array.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct JAWT_DrawingSurfaceInfo {
    void * platformInfo;
    JAWT_DrawingSurface * ds;
    {@link JAWTRectangle JAWT_Rectangle} bounds;
    jint clipSize;
    JAWT_Rectangle * clip;
}</code></pre>
 */
public class JAWTDrawingSurfaceInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		PLATFORMINFO,
		DS,
		BOUNDS,
		CLIPSIZE,
		CLIP;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(JAWTRectangle.SIZEOF, JAWTRectangle.ALIGNOF),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		PLATFORMINFO = layout.offsetof(0);
		DS = layout.offsetof(1);
		BOUNDS = layout.offsetof(2);
		CLIPSIZE = layout.offsetof(3);
		CLIP = layout.offsetof(4);
	}

	JAWTDrawingSurfaceInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link JAWTDrawingSurfaceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public JAWTDrawingSurfaceInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code platformInfo} field. */
	public long platformInfo() { return nplatformInfo(address()); }
	/** Returns a {@link JAWTDrawingSurface} view of the struct pointed to by the {@code ds} field. */
	public JAWTDrawingSurface ds() { return nds(address()); }
	/** Returns a {@link JAWTRectangle} view of the {@code bounds} field. */
	public JAWTRectangle bounds() { return nbounds(address()); }
	/** Returns the value of the {@code clipSize} field. */
	public int clipSize() { return nclipSize(address()); }
	/** Returns a {@link JAWTRectangle.Buffer} view of the struct array pointed to by the {@code clip} field. */
	public JAWTRectangle.Buffer clip() { return nclip(address()); }

	// -----------------------------------

	/** Returns a new {@link JAWTDrawingSurfaceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static JAWTDrawingSurfaceInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link JAWTDrawingSurfaceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static JAWTDrawingSurfaceInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link JAWTDrawingSurfaceInfo} instance allocated with {@link BufferUtils}. */
	public static JAWTDrawingSurfaceInfo create() {
		return new JAWTDrawingSurfaceInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link JAWTDrawingSurfaceInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static JAWTDrawingSurfaceInfo create(long address) {
		return address == NULL ? null : new JAWTDrawingSurfaceInfo(address, null);
	}

	/**
	 * Returns a new {@link JAWTDrawingSurfaceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTDrawingSurfaceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTDrawingSurfaceInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link JAWTDrawingSurfaceInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link JAWTDrawingSurfaceInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static JAWTDrawingSurfaceInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link JAWTDrawingSurfaceInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static JAWTDrawingSurfaceInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link JAWTDrawingSurfaceInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWTDrawingSurfaceInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWTDrawingSurfaceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWTDrawingSurfaceInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWTDrawingSurfaceInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWTDrawingSurfaceInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWTDrawingSurfaceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTDrawingSurfaceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #platformInfo}. */
	public static long nplatformInfo(long struct) { return memGetAddress(struct + JAWTDrawingSurfaceInfo.PLATFORMINFO); }
	/** Unsafe version of {@link #ds}. */
	public static JAWTDrawingSurface nds(long struct) { return JAWTDrawingSurface.create(memGetAddress(struct + JAWTDrawingSurfaceInfo.DS)); }
	/** Unsafe version of {@link #bounds}. */
	public static JAWTRectangle nbounds(long struct) { return JAWTRectangle.create(struct + JAWTDrawingSurfaceInfo.BOUNDS); }
	/** Unsafe version of {@link #clipSize}. */
	public static int nclipSize(long struct) { return memGetInt(struct + JAWTDrawingSurfaceInfo.CLIPSIZE); }
	/** Unsafe version of {@link #clip}. */
	public static JAWTRectangle.Buffer nclip(long struct) { return JAWTRectangle.create(memGetAddress(struct + JAWTDrawingSurfaceInfo.CLIP), nclipSize(struct)); }

	// -----------------------------------

	/** An array of {@link JAWTDrawingSurfaceInfo} structs. */
	public static final class Buffer extends StructBuffer<JAWTDrawingSurfaceInfo, Buffer> {

		/**
		 * Creates a new {@link JAWTDrawingSurfaceInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link JAWTDrawingSurfaceInfo#SIZEOF}, and its mark will be undefined.
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
		protected JAWTDrawingSurfaceInfo newInstance(long address) {
			return new JAWTDrawingSurfaceInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code platformInfo} field. */
		public long platformInfo() { return JAWTDrawingSurfaceInfo.nplatformInfo(address()); }
		/** Returns a {@link JAWTDrawingSurface} view of the struct pointed to by the {@code ds} field. */
		public JAWTDrawingSurface ds() { return JAWTDrawingSurfaceInfo.nds(address()); }
		/** Returns a {@link JAWTRectangle} view of the {@code bounds} field. */
		public JAWTRectangle bounds() { return JAWTDrawingSurfaceInfo.nbounds(address()); }
		/** Returns the value of the {@code clipSize} field. */
		public int clipSize() { return JAWTDrawingSurfaceInfo.nclipSize(address()); }
		/** Returns a {@link JAWTRectangle.Buffer} view of the struct array pointed to by the {@code clip} field. */
		public JAWTRectangle.Buffer clip() { return JAWTDrawingSurfaceInfo.nclip(address()); }

	}

}