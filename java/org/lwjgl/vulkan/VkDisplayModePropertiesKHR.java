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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDisplayModePropertiesKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDisplayModePropertiesKHR">Vulkan Specification</a>
 * 
 * <p>Describes properties of a display mode.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code displayMode} <b>must</b> be a valid {@code VkDisplayModeKHR} handle</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code displayMode} &ndash; a handle to the display mode described in this structure. This handle will be valid for the lifetime of the Vulkan instance.</li>
 * <li>{@code parameters} &ndash; a {@link VkDisplayModeParametersKHR} structure describing the display parameters associated with {@code displayMode}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDisplayModePropertiesKHR {
    VkDisplayModeKHR displayMode;
    {@link VkDisplayModeParametersKHR VkDisplayModeParametersKHR} parameters;
}</code></pre>
 */
public class VkDisplayModePropertiesKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		DISPLAYMODE,
		PARAMETERS;

	static {
		Layout layout = __struct(
			__member(8),
			__member(VkDisplayModeParametersKHR.SIZEOF, VkDisplayModeParametersKHR.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		DISPLAYMODE = layout.offsetof(0);
		PARAMETERS = layout.offsetof(1);
	}

	VkDisplayModePropertiesKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplayModePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplayModePropertiesKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code displayMode} field. */
	public long displayMode() { return ndisplayMode(address()); }
	/** Returns a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
	public VkDisplayModeParametersKHR parameters() { return nparameters(address()); }

	// -----------------------------------

	/** Returns a new {@link VkDisplayModePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayModePropertiesKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayModePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDisplayModePropertiesKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplayModePropertiesKHR} instance allocated with {@link BufferUtils}. */
	public static VkDisplayModePropertiesKHR create() {
		return new VkDisplayModePropertiesKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplayModePropertiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplayModePropertiesKHR create(long address) {
		return address == NULL ? null : new VkDisplayModePropertiesKHR(address, null);
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplayModePropertiesKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayModePropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDisplayModePropertiesKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDisplayModePropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDisplayModePropertiesKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayModePropertiesKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayModePropertiesKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #displayMode}. */
	public static long ndisplayMode(long struct) { return memGetLong(struct + VkDisplayModePropertiesKHR.DISPLAYMODE); }
	/** Unsafe version of {@link #parameters}. */
	public static VkDisplayModeParametersKHR nparameters(long struct) { return VkDisplayModeParametersKHR.create(struct + VkDisplayModePropertiesKHR.PARAMETERS); }

	// -----------------------------------

	/** An array of {@link VkDisplayModePropertiesKHR} structs. */
	public static final class Buffer extends StructBuffer<VkDisplayModePropertiesKHR, Buffer> {

		/**
		 * Creates a new {@link VkDisplayModePropertiesKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplayModePropertiesKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkDisplayModePropertiesKHR newInstance(long address) {
			return new VkDisplayModePropertiesKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code displayMode} field. */
		public long displayMode() { return VkDisplayModePropertiesKHR.ndisplayMode(address()); }
		/** Returns a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
		public VkDisplayModeParametersKHR parameters() { return VkDisplayModePropertiesKHR.nparameters(address()); }

	}

}