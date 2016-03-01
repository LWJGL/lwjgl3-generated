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
 * <pre><code>struct VkClearAttachment {
    VkImageAspectFlags aspectMask;
    uint32_t colorAttachment;
    {@link VkClearValue VkClearValue} clearValue;
}</code></pre>
 */
public class VkClearAttachment extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		ASPECTMASK,
		COLORATTACHMENT,
		CLEARVALUE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(VkClearValue.SIZEOF, VkClearValue.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		ASPECTMASK = layout.offsetof(0);
		COLORATTACHMENT = layout.offsetof(1);
		CLEARVALUE = layout.offsetof(2);
	}

	VkClearAttachment(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkClearAttachment} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkClearAttachment(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code aspectMask} field. */
	public int aspectMask() { return naspectMask(address()); }
	/** Returns the value of the {@code colorAttachment} field. */
	public int colorAttachment() { return ncolorAttachment(address()); }
	/** Returns a {@link VkClearValue} view of the {@code clearValue} field. */
	public VkClearValue clearValue() { return nclearValue(address()); }

	/** Sets the specified value to the {@code aspectMask} field. */
	public VkClearAttachment aspectMask(int value) { naspectMask(address(), value); return this; }
	/** Sets the specified value to the {@code colorAttachment} field. */
	public VkClearAttachment colorAttachment(int value) { ncolorAttachment(address(), value); return this; }
	/** Copies the specified {@link VkClearValue} to the {@code clearValue} field. */
	public VkClearAttachment clearValue(VkClearValue value) { nclearValue(address(), value); return this; }

	/** Unsafe version of {@link #set(VkClearAttachment) set}. */
	public VkClearAttachment nset(long struct) {
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
	public VkClearAttachment set(VkClearAttachment src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkClearAttachment} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkClearAttachment malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkClearAttachment} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkClearAttachment calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkClearAttachment} instance allocated with {@link BufferUtils}. */
	public static VkClearAttachment create() {
		return new VkClearAttachment(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkClearAttachment} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkClearAttachment create(long address) {
		return address == NULL ? null : new VkClearAttachment(address, null);
	}

	/**
	 * Returns a new {@link VkClearAttachment.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkClearAttachment.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkClearAttachment.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkClearAttachment.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #aspectMask}. */
	public static int naspectMask(long struct) { return memGetInt(struct + VkClearAttachment.ASPECTMASK); }
	/** Unsafe version of {@link #colorAttachment}. */
	public static int ncolorAttachment(long struct) { return memGetInt(struct + VkClearAttachment.COLORATTACHMENT); }
	/** Unsafe version of {@link #clearValue}. */
	public static VkClearValue nclearValue(long struct) { return VkClearValue.create(struct + VkClearAttachment.CLEARVALUE); }

	/** Unsafe version of {@link #aspectMask(int) aspectMask}. */
	public static void naspectMask(long struct, int value) { memPutInt(struct + VkClearAttachment.ASPECTMASK, value); }
	/** Unsafe version of {@link #colorAttachment(int) colorAttachment}. */
	public static void ncolorAttachment(long struct, int value) { memPutInt(struct + VkClearAttachment.COLORATTACHMENT, value); }
	/** Unsafe version of {@link #clearValue(VkClearValue) clearValue}. */
	public static void nclearValue(long struct, VkClearValue value) { memCopy(value.address(), struct + VkClearAttachment.CLEARVALUE, VkClearValue.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkClearAttachment} structs. */
	public static final class Buffer extends StructBuffer<VkClearAttachment, Buffer> {

		/**
		 * Creates a new {@link VkClearAttachment.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkClearAttachment#SIZEOF}, and its mark will be undefined.
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
		protected VkClearAttachment newInstance(long address) {
			return new VkClearAttachment(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code aspectMask} field. */
		public int aspectMask() { return VkClearAttachment.naspectMask(address()); }
		/** Returns the value of the {@code colorAttachment} field. */
		public int colorAttachment() { return VkClearAttachment.ncolorAttachment(address()); }
		/** Returns a {@link VkClearValue} view of the {@code clearValue} field. */
		public VkClearValue clearValue() { return VkClearAttachment.nclearValue(address()); }

		/** Sets the specified value to the {@code aspectMask} field. */
		public VkClearAttachment.Buffer aspectMask(int value) { VkClearAttachment.naspectMask(address(), value); return this; }
		/** Sets the specified value to the {@code colorAttachment} field. */
		public VkClearAttachment.Buffer colorAttachment(int value) { VkClearAttachment.ncolorAttachment(address(), value); return this; }
		/** Copies the specified {@link VkClearValue} to the {@code clearValue} field. */
		public VkClearAttachment.Buffer clearValue(VkClearValue value) { VkClearAttachment.nclearValue(address(), value); return this; }

	}

}