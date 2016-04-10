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
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDisplayModeParametersKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDisplayModeParametersKHR">Vulkan Specification</a>
 * 
 * <p>Describes the display parameters associated a display mode.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code visibleRegion} &ndash; the 2D extents of the visible region</li>
 * <li>{@code refreshRate} &ndash; a {@code uint32_t} that is the number of times the display is refreshed each second multiplied by 1000</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDisplayModeParametersKHR {
    {@link VkExtent2D VkExtent2D} visibleRegion;
    uint32_t refreshRate;
}</code></pre>
 */
public class VkDisplayModeParametersKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		VISIBLEREGION,
		REFRESHRATE;

	static {
		Layout layout = __struct(
			__member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		VISIBLEREGION = layout.offsetof(0);
		REFRESHRATE = layout.offsetof(1);
	}

	VkDisplayModeParametersKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplayModeParametersKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplayModeParametersKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link VkExtent2D} view of the {@code visibleRegion} field. */
	public VkExtent2D visibleRegion() { return nvisibleRegion(address()); }
	/** Returns the value of the {@code refreshRate} field. */
	public int refreshRate() { return nrefreshRate(address()); }

	/** Copies the specified {@link VkExtent2D} to the {@code visibleRegion} field. */
	public VkDisplayModeParametersKHR visibleRegion(VkExtent2D value) { nvisibleRegion(address(), value); return this; }
	/** Sets the specified value to the {@code refreshRate} field. */
	public VkDisplayModeParametersKHR refreshRate(int value) { nrefreshRate(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDisplayModeParametersKHR set(
		VkExtent2D visibleRegion,
		int refreshRate
	) {
		visibleRegion(visibleRegion);
		refreshRate(refreshRate);

		return this;
	}

	/** Unsafe version of {@link #set(VkDisplayModeParametersKHR) set}. */
	public VkDisplayModeParametersKHR nset(long struct) {
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
	public VkDisplayModeParametersKHR set(VkDisplayModeParametersKHR src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayModeParametersKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayModeParametersKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayModeParametersKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDisplayModeParametersKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplayModeParametersKHR} instance allocated with {@link BufferUtils}. */
	public static VkDisplayModeParametersKHR create() {
		return new VkDisplayModeParametersKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplayModeParametersKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplayModeParametersKHR create(long address) {
		return address == NULL ? null : new VkDisplayModeParametersKHR(address, null);
	}

	/**
	 * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplayModeParametersKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayModeParametersKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDisplayModeParametersKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDisplayModeParametersKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDisplayModeParametersKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayModeParametersKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayModeParametersKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayModeParametersKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayModeParametersKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #visibleRegion}. */
	public static VkExtent2D nvisibleRegion(long struct) { return VkExtent2D.create(struct + VkDisplayModeParametersKHR.VISIBLEREGION); }
	/** Unsafe version of {@link #refreshRate}. */
	public static int nrefreshRate(long struct) { return memGetInt(struct + VkDisplayModeParametersKHR.REFRESHRATE); }

	/** Unsafe version of {@link #visibleRegion(VkExtent2D) visibleRegion}. */
	public static void nvisibleRegion(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplayModeParametersKHR.VISIBLEREGION, VkExtent2D.SIZEOF); }
	/** Unsafe version of {@link #refreshRate(int) refreshRate}. */
	public static void nrefreshRate(long struct, int value) { memPutInt(struct + VkDisplayModeParametersKHR.REFRESHRATE, value); }

	// -----------------------------------

	/** An array of {@link VkDisplayModeParametersKHR} structs. */
	public static final class Buffer extends StructBuffer<VkDisplayModeParametersKHR, Buffer> {

		/**
		 * Creates a new {@link VkDisplayModeParametersKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplayModeParametersKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkDisplayModeParametersKHR newInstance(long address) {
			return new VkDisplayModeParametersKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link VkExtent2D} view of the {@code visibleRegion} field. */
		public VkExtent2D visibleRegion() { return VkDisplayModeParametersKHR.nvisibleRegion(address()); }
		/** Returns the value of the {@code refreshRate} field. */
		public int refreshRate() { return VkDisplayModeParametersKHR.nrefreshRate(address()); }

		/** Copies the specified {@link VkExtent2D} to the {@code visibleRegion} field. */
		public VkDisplayModeParametersKHR.Buffer visibleRegion(VkExtent2D value) { VkDisplayModeParametersKHR.nvisibleRegion(address(), value); return this; }
		/** Sets the specified value to the {@code refreshRate} field. */
		public VkDisplayModeParametersKHR.Buffer refreshRate(int value) { VkDisplayModeParametersKHR.nrefreshRate(address(), value); return this; }

	}

}