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
 * struct VkAttachmentReference {
 *     uint32_t attachment;
 *     VkImageLayout layout;
 * }</code></pre>
 */
public class VkAttachmentReference extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		ATTACHMENT,
		LAYOUT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		ATTACHMENT = layout.offsetof(0);
		LAYOUT = layout.offsetof(1);
	}

	VkAttachmentReference(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkAttachmentReference} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkAttachmentReference(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code attachment} field. */
	public int attachment() { return nattachment(address()); }
	/** Returns the value of the {@code layout} field. */
	public int layout() { return nlayout(address()); }

	/** Sets the specified value to the {@code attachment} field. */
	public VkAttachmentReference attachment(int value) { nattachment(address(), value); return this; }
	/** Sets the specified value to the {@code layout} field. */
	public VkAttachmentReference layout(int value) { nlayout(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkAttachmentReference set(
		int attachment,
		int layout
	) {
		attachment(attachment);
		layout(layout);

		return this;
	}

	/** Unsafe version of {@link #set(VkAttachmentReference) set}. */
	public VkAttachmentReference nset(long struct) {
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
	public VkAttachmentReference set(VkAttachmentReference src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkAttachmentReference) set}. */
	public VkAttachmentReference set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkAttachmentReference} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkAttachmentReference malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkAttachmentReference} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkAttachmentReference calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkAttachmentReference} instance allocated with {@link BufferUtils}. */
	public static VkAttachmentReference create() {
		return new VkAttachmentReference(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkAttachmentReference} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkAttachmentReference create(long address) {
		return address == NULL ? null : new VkAttachmentReference(address, null);
	}

	/**
	 * Returns a new {@link VkAttachmentReference.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAttachmentReference.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAttachmentReference.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkAttachmentReference.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #attachment}. */
	public static int nattachment(long struct) { return memGetInt(struct + VkAttachmentReference.ATTACHMENT); }
	/** Unsafe version of {@link #layout}. */
	public static int nlayout(long struct) { return memGetInt(struct + VkAttachmentReference.LAYOUT); }

	/** Unsafe version of {@link #attachment(int) attachment}. */
	public static void nattachment(long struct, int value) { memPutInt(struct + VkAttachmentReference.ATTACHMENT, value); }
	/** Unsafe version of {@link #layout(int) layout}. */
	public static void nlayout(long struct, int value) { memPutInt(struct + VkAttachmentReference.LAYOUT, value); }

	// -----------------------------------

	/** An array of {@link VkAttachmentReference} structs. */
	public static final class Buffer extends StructBuffer<VkAttachmentReference, Buffer> {

		/**
		 * Creates a new {@link VkAttachmentReference.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkAttachmentReference#SIZEOF}, and its mark will be undefined.
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
		protected VkAttachmentReference newInstance(long address) {
			return new VkAttachmentReference(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code attachment} field. */
		public int attachment() { return VkAttachmentReference.nattachment(address()); }
		/** Returns the value of the {@code layout} field. */
		public int layout() { return VkAttachmentReference.nlayout(address()); }

		/** Sets the specified value to the {@code attachment} field. */
		public VkAttachmentReference.Buffer attachment(int value) { VkAttachmentReference.nattachment(address(), value); return this; }
		/** Sets the specified value to the {@code layout} field. */
		public VkAttachmentReference.Buffer layout(int value) { VkAttachmentReference.nlayout(address(), value); return this; }

	}

}