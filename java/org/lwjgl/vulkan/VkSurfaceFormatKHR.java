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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSurfaceFormatKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSurfaceFormatKHR">Vulkan Specification</a>
 * 
 * <p>Describes a surface format.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code colorSpace} <b>must</b> be a valid {@code VkColorSpaceKHR} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code format} &ndash; a {@code VkFormat} that is compatible with the surface</li>
 * <li>{@code colorSpace} &ndash; a presentation {@code VkColorSpaceKHR} that is compatible with the surface. Must be:<br><table><tr><td>{@link KHRSurface#VK_COLOR_SPACE_SRGB_NONLINEAR_KHR COLOR_SPACE_SRGB_NONLINEAR_KHR}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSurfaceFormatKHR {
    VkFormat format;
    VkColorSpaceKHR colorSpace;
}</code></pre>
 */
public class VkSurfaceFormatKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		FORMAT,
		COLORSPACE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		FORMAT = layout.offsetof(0);
		COLORSPACE = layout.offsetof(1);
	}

	VkSurfaceFormatKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSurfaceFormatKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSurfaceFormatKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns the value of the {@code colorSpace} field. */
	public int colorSpace() { return ncolorSpace(address()); }

	// -----------------------------------

	/** Returns a new {@link VkSurfaceFormatKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSurfaceFormatKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSurfaceFormatKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSurfaceFormatKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSurfaceFormatKHR} instance allocated with {@link BufferUtils}. */
	public static VkSurfaceFormatKHR create() {
		return new VkSurfaceFormatKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSurfaceFormatKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSurfaceFormatKHR create(long address) {
		return address == NULL ? null : new VkSurfaceFormatKHR(address, null);
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSurfaceFormatKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSurfaceFormatKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSurfaceFormatKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSurfaceFormatKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSurfaceFormatKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSurfaceFormatKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSurfaceFormatKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkSurfaceFormatKHR.FORMAT); }
	/** Unsafe version of {@link #colorSpace}. */
	public static int ncolorSpace(long struct) { return memGetInt(struct + VkSurfaceFormatKHR.COLORSPACE); }

	// -----------------------------------

	/** An array of {@link VkSurfaceFormatKHR} structs. */
	public static final class Buffer extends StructBuffer<VkSurfaceFormatKHR, Buffer> {

		/**
		 * Creates a new {@link VkSurfaceFormatKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSurfaceFormatKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkSurfaceFormatKHR newInstance(long address) {
			return new VkSurfaceFormatKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code format} field. */
		public int format() { return VkSurfaceFormatKHR.nformat(address()); }
		/** Returns the value of the {@code colorSpace} field. */
		public int colorSpace() { return VkSurfaceFormatKHR.ncolorSpace(address()); }

	}

}