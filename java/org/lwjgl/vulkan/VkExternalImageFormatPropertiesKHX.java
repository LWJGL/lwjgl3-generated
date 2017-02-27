/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure specifying supported external handle properties.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code externalMemoryProperties} &ndash; an instance of the {@link VkExternalMemoryPropertiesKHX} structure specifying various capabilities of the external handle type when used with the specified image creation parameters.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkExternalImageFormatPropertiesKHX {
    VkStructureType sType;
    void * pNext;
    {@link VkExternalMemoryPropertiesKHX VkExternalMemoryPropertiesKHX} externalMemoryProperties;
}</code></pre>
 */
public class VkExternalImageFormatPropertiesKHX extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		EXTERNALMEMORYPROPERTIES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(VkExternalMemoryPropertiesKHX.SIZEOF, VkExternalMemoryPropertiesKHX.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		EXTERNALMEMORYPROPERTIES = layout.offsetof(2);
	}

	VkExternalImageFormatPropertiesKHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkExternalImageFormatPropertiesKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkExternalImageFormatPropertiesKHX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns a {@link VkExternalMemoryPropertiesKHX} view of the {@code externalMemoryProperties} field. */
	public VkExternalMemoryPropertiesKHX externalMemoryProperties() { return nexternalMemoryProperties(address()); }

	// -----------------------------------

	/** Returns a new {@link VkExternalImageFormatPropertiesKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkExternalImageFormatPropertiesKHX create(long address) {
		return address == NULL ? null : new VkExternalImageFormatPropertiesKHX(address, null);
	}

	/**
	 * Create a {@link VkExternalImageFormatPropertiesKHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkExternalImageFormatPropertiesKHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkExternalImageFormatPropertiesKHX.PNEXT); }
	/** Unsafe version of {@link #externalMemoryProperties}. */
	public static VkExternalMemoryPropertiesKHX nexternalMemoryProperties(long struct) { return VkExternalMemoryPropertiesKHX.create(struct + VkExternalImageFormatPropertiesKHX.EXTERNALMEMORYPROPERTIES); }

	// -----------------------------------

	/** An array of {@link VkExternalImageFormatPropertiesKHX} structs. */
	public static class Buffer extends StructBuffer<VkExternalImageFormatPropertiesKHX, Buffer> {

		/**
		 * Creates a new {@link VkExternalImageFormatPropertiesKHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkExternalImageFormatPropertiesKHX#SIZEOF}, and its mark will be undefined.
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
		protected VkExternalImageFormatPropertiesKHX newInstance(long address) {
			return new VkExternalImageFormatPropertiesKHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkExternalImageFormatPropertiesKHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkExternalImageFormatPropertiesKHX.npNext(address()); }
		/** Returns a {@link VkExternalMemoryPropertiesKHX} view of the {@code externalMemoryProperties} field. */
		public VkExternalMemoryPropertiesKHX externalMemoryProperties() { return VkExternalImageFormatPropertiesKHX.nexternalMemoryProperties(address()); }

	}

}