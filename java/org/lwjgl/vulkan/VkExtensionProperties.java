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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkExtensionProperties.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkExtensionProperties">Vulkan Specification</a>
 * 
 * <p>Contains information about a physical device extension.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code extensionName} &ndash; a null-terminated string specifying the name of the extension</li>
 * <li>{@code specVersion} &ndash; the version of this extension</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkExtensionProperties {
    char[256] extensionName;
    uint32_t specVersion;
}</code></pre>
 */
public class VkExtensionProperties extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		EXTENSIONNAME,
		SPECVERSION;

	static {
		Layout layout = __struct(
			__array(1, 256),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		EXTENSIONNAME = layout.offsetof(0);
		SPECVERSION = layout.offsetof(1);
	}

	VkExtensionProperties(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkExtensionProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkExtensionProperties(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ByteBuffer} view of the {@code extensionName} field. */
	public ByteBuffer extensionName() { return nextensionName(address()); }
	/** Decodes the null-terminated string stored in the {@code extensionName} field. */
	public String extensionNameString() { return nextensionNameString(address()); }
	/** Returns the value of the {@code specVersion} field. */
	public int specVersion() { return nspecVersion(address()); }

	// -----------------------------------

	/** Returns a new {@link VkExtensionProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkExtensionProperties malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkExtensionProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkExtensionProperties calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkExtensionProperties} instance allocated with {@link BufferUtils}. */
	public static VkExtensionProperties create() {
		return new VkExtensionProperties(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkExtensionProperties} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkExtensionProperties create(long address) {
		return address == NULL ? null : new VkExtensionProperties(address, null);
	}

	/**
	 * Returns a new {@link VkExtensionProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExtensionProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExtensionProperties.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkExtensionProperties.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkExtensionProperties} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkExtensionProperties mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkExtensionProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkExtensionProperties callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkExtensionProperties} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExtensionProperties mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExtensionProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExtensionProperties callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExtensionProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExtensionProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExtensionProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExtensionProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #extensionName}. */
	public static ByteBuffer nextensionName(long struct) { return memByteBuffer(struct + VkExtensionProperties.EXTENSIONNAME, 256); }
	/** Unsafe version of {@link #extensionNameString}. */
	public static String nextensionNameString(long struct) { return memUTF8(struct + VkExtensionProperties.EXTENSIONNAME); }
	/** Unsafe version of {@link #specVersion}. */
	public static int nspecVersion(long struct) { return memGetInt(struct + VkExtensionProperties.SPECVERSION); }

	// -----------------------------------

	/** An array of {@link VkExtensionProperties} structs. */
	public static final class Buffer extends StructBuffer<VkExtensionProperties, Buffer> {

		/**
		 * Creates a new {@link VkExtensionProperties.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkExtensionProperties#SIZEOF}, and its mark will be undefined.
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
		protected VkExtensionProperties newInstance(long address) {
			return new VkExtensionProperties(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ByteBuffer} view of the {@code extensionName} field. */
		public ByteBuffer extensionName() { return VkExtensionProperties.nextensionName(address()); }
		/** Decodes the null-terminated string stored in the {@code extensionName} field. */
		public String extensionNameString() { return VkExtensionProperties.nextensionNameString(address()); }
		/** Returns the value of the {@code specVersion} field. */
		public int specVersion() { return VkExtensionProperties.nspecVersion(address()); }

	}

}