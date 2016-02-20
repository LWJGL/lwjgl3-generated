/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkXlibSurfaceCreateInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkXlibSurfaceCreateFlagsKHR flags;
 *     Display * dpy;
 *     Window window;
 * }</code></pre>
 */
public class VkXlibSurfaceCreateInfoKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		DPY,
		WINDOW;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		DPY = layout.offsetof(3);
		WINDOW = layout.offsetof(4);
	}

	VkXlibSurfaceCreateInfoKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkXlibSurfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkXlibSurfaceCreateInfoKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code dpy} field. */
	public long dpy() { return ndpy(address()); }
	/** Returns the value of the {@code window} field. */
	public long window() { return nwindow(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkXlibSurfaceCreateInfoKHR sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkXlibSurfaceCreateInfoKHR pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkXlibSurfaceCreateInfoKHR flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code dpy} field. */
	public VkXlibSurfaceCreateInfoKHR dpy(long value) { ndpy(address(), value); return this; }
	/** Sets the specified value to the {@code window} field. */
	public VkXlibSurfaceCreateInfoKHR window(long value) { nwindow(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkXlibSurfaceCreateInfoKHR set(
		int sType,
		long pNext,
		int flags,
		long dpy,
		long window
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		dpy(dpy);
		window(window);

		return this;
	}

	/** Unsafe version of {@link #set(VkXlibSurfaceCreateInfoKHR) set}. */
	public VkXlibSurfaceCreateInfoKHR nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkXlibSurfaceCreateInfoKHR set(VkXlibSurfaceCreateInfoKHR src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkXlibSurfaceCreateInfoKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkXlibSurfaceCreateInfoKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
	public static VkXlibSurfaceCreateInfoKHR create() {
		return new VkXlibSurfaceCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkXlibSurfaceCreateInfoKHR create(long address) {
		return address == NULL ? null : new VkXlibSurfaceCreateInfoKHR(address, null);
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkXlibSurfaceCreateInfoKHR.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkXlibSurfaceCreateInfoKHR.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkXlibSurfaceCreateInfoKHR.FLAGS); }
	/** Unsafe version of {@link #dpy}. */
	public static long ndpy(long struct) { return memGetAddress(struct + VkXlibSurfaceCreateInfoKHR.DPY); }
	/** Unsafe version of {@link #window}. */
	public static long nwindow(long struct) { return memGetAddress(struct + VkXlibSurfaceCreateInfoKHR.WINDOW); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkXlibSurfaceCreateInfoKHR.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkXlibSurfaceCreateInfoKHR.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkXlibSurfaceCreateInfoKHR.FLAGS, value); }
	/** Unsafe version of {@link #dpy(long) dpy}. */
	public static void ndpy(long struct, long value) { memPutAddress(struct + VkXlibSurfaceCreateInfoKHR.DPY, value); }
	/** Unsafe version of {@link #window(long) window}. */
	public static void nwindow(long struct, long value) { memPutAddress(struct + VkXlibSurfaceCreateInfoKHR.WINDOW, value); }

	// -----------------------------------

	/** An array of {@link VkXlibSurfaceCreateInfoKHR} structs. */
	public static final class Buffer extends StructBuffer<VkXlibSurfaceCreateInfoKHR, Buffer> {

		/**
		 * Creates a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkXlibSurfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkXlibSurfaceCreateInfoKHR newInstance(long address) {
			return new VkXlibSurfaceCreateInfoKHR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkXlibSurfaceCreateInfoKHR.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkXlibSurfaceCreateInfoKHR.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkXlibSurfaceCreateInfoKHR.nflags(address()); }
		/** Returns the value of the {@code dpy} field. */
		public long dpy() { return VkXlibSurfaceCreateInfoKHR.ndpy(address()); }
		/** Returns the value of the {@code window} field. */
		public long window() { return VkXlibSurfaceCreateInfoKHR.nwindow(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkXlibSurfaceCreateInfoKHR.Buffer sType(int value) { VkXlibSurfaceCreateInfoKHR.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkXlibSurfaceCreateInfoKHR.Buffer pNext(long value) { VkXlibSurfaceCreateInfoKHR.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkXlibSurfaceCreateInfoKHR.Buffer flags(int value) { VkXlibSurfaceCreateInfoKHR.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code dpy} field. */
		public VkXlibSurfaceCreateInfoKHR.Buffer dpy(long value) { VkXlibSurfaceCreateInfoKHR.ndpy(address(), value); return this; }
		/** Sets the specified value to the {@code window} field. */
		public VkXlibSurfaceCreateInfoKHR.Buffer window(long value) { VkXlibSurfaceCreateInfoKHR.nwindow(address(), value); return this; }

	}

}