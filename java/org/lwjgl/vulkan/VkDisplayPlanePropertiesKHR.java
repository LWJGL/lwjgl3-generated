/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDisplayPlanePropertiesKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDisplayPlanePropertiesKHR">Vulkan Specification</a>
 * 
 * <p>Describes properties of a display plane.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code currentDisplay} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code currentDisplay} &ndash; the handle of the display the plane is currently associated with. If the plane is not currently attached to any displays, this will be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}.</li>
 * <li>{@code currentStackIndex} &ndash; the current z-order of the plane</li>
 * </ul>
 * 
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

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

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

	// -----------------------------------

	/** Returns a new {@link VkDisplayPlanePropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDisplayPlanePropertiesKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDisplayPlanePropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDisplayPlanePropertiesKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayPlanePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayPlanePropertiesKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayPlanePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayPlanePropertiesKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #currentDisplay}. */
	public static long ncurrentDisplay(long struct) { return memGetLong(struct + VkDisplayPlanePropertiesKHR.CURRENTDISPLAY); }
	/** Unsafe version of {@link #currentStackIndex}. */
	public static int ncurrentStackIndex(long struct) { return memGetInt(struct + VkDisplayPlanePropertiesKHR.CURRENTSTACKINDEX); }

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
			return new VkDisplayPlanePropertiesKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code currentDisplay} field. */
		public long currentDisplay() { return VkDisplayPlanePropertiesKHR.ncurrentDisplay(address()); }
		/** Returns the value of the {@code currentStackIndex} field. */
		public int currentStackIndex() { return VkDisplayPlanePropertiesKHR.ncurrentStackIndex(address()); }

	}

}