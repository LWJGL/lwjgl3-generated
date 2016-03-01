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
 * <pre><code>struct VkDisplayPlanePropertiesKHR {
    VkDisplayKHR currentDisplay;
    uint32_t currentStackIndex;
}</code></pre>
 */
public class VkDisplayPlanePropertiesKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		CURRENTDISPLAY,
		CURRENTSTACKINDEX;

	static {
		Layout layout = __struct(
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		CURRENTDISPLAY = layout.offsetof(0);
		CURRENTSTACKINDEX = layout.offsetof(1);
	}

	VkDisplayPlanePropertiesKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplayPlanePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplayPlanePropertiesKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code currentDisplay} field. */
	public long currentDisplay() { return ncurrentDisplay(address()); }
	/** Returns the value of the {@code currentStackIndex} field. */
	public int currentStackIndex() { return ncurrentStackIndex(address()); }

	/** Sets the specified value to the {@code currentDisplay} field. */
	public VkDisplayPlanePropertiesKHR currentDisplay(long value) { ncurrentDisplay(address(), value); return this; }
	/** Sets the specified value to the {@code currentStackIndex} field. */
	public VkDisplayPlanePropertiesKHR currentStackIndex(int value) { ncurrentStackIndex(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDisplayPlanePropertiesKHR set(
		long currentDisplay,
		int currentStackIndex
	) {
		currentDisplay(currentDisplay);
		currentStackIndex(currentStackIndex);

		return this;
	}

	/** Unsafe version of {@link #set(VkDisplayPlanePropertiesKHR) set}. */
	public VkDisplayPlanePropertiesKHR nset(long struct) {
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
	public VkDisplayPlanePropertiesKHR set(VkDisplayPlanePropertiesKHR src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayPlanePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayPlanePropertiesKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayPlanePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDisplayPlanePropertiesKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplayPlanePropertiesKHR} instance allocated with {@link BufferUtils}. */
	public static VkDisplayPlanePropertiesKHR create() {
		return new VkDisplayPlanePropertiesKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplayPlanePropertiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplayPlanePropertiesKHR create(long address) {
		return address == NULL ? null : new VkDisplayPlanePropertiesKHR(address, null);
	}

	/**
	 * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplayPlanePropertiesKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #currentDisplay}. */
	public static long ncurrentDisplay(long struct) { return memGetLong(struct + VkDisplayPlanePropertiesKHR.CURRENTDISPLAY); }
	/** Unsafe version of {@link #currentStackIndex}. */
	public static int ncurrentStackIndex(long struct) { return memGetInt(struct + VkDisplayPlanePropertiesKHR.CURRENTSTACKINDEX); }

	/** Unsafe version of {@link #currentDisplay(long) currentDisplay}. */
	public static void ncurrentDisplay(long struct, long value) { memPutLong(struct + VkDisplayPlanePropertiesKHR.CURRENTDISPLAY, value); }
	/** Unsafe version of {@link #currentStackIndex(int) currentStackIndex}. */
	public static void ncurrentStackIndex(long struct, int value) { memPutInt(struct + VkDisplayPlanePropertiesKHR.CURRENTSTACKINDEX, value); }

	// -----------------------------------

	/** An array of {@link VkDisplayPlanePropertiesKHR} structs. */
	public static final class Buffer extends StructBuffer<VkDisplayPlanePropertiesKHR, Buffer> {

		/**
		 * Creates a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplayPlanePropertiesKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkDisplayPlanePropertiesKHR newInstance(long address) {
			return new VkDisplayPlanePropertiesKHR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code currentDisplay} field. */
		public long currentDisplay() { return VkDisplayPlanePropertiesKHR.ncurrentDisplay(address()); }
		/** Returns the value of the {@code currentStackIndex} field. */
		public int currentStackIndex() { return VkDisplayPlanePropertiesKHR.ncurrentStackIndex(address()); }

		/** Sets the specified value to the {@code currentDisplay} field. */
		public VkDisplayPlanePropertiesKHR.Buffer currentDisplay(long value) { VkDisplayPlanePropertiesKHR.ncurrentDisplay(address(), value); return this; }
		/** Sets the specified value to the {@code currentStackIndex} field. */
		public VkDisplayPlanePropertiesKHR.Buffer currentStackIndex(int value) { VkDisplayPlanePropertiesKHR.ncurrentStackIndex(address(), value); return this; }

	}

}