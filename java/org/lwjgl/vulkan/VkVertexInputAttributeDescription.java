/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkVertexInputAttributeDescription.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkVertexInputAttributeDescription">Vulkan Specification</a>
 * 
 * <p>Describes a vertex input attribute.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code location} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputAttributes}</li>
 * <li>{@code binding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
 * <li>{@code offset} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputAttributeOffset}</li>
 * <li>{@code format} <b>must</b> be allowed as a vertex buffer format, as specified by the {@link VK10#VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT FORMAT_FEATURE_VERTEX_BUFFER_BIT} flag in
 * {@link VkFormatProperties}{@code ::bufferFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code location} &ndash; the shader binding location number for this attribute</li>
 * <li>{@code binding} &ndash; the binding number which this attribute takes its data from</li>
 * <li>{@code format} &ndash; the size and type of the vertex attribute data</li>
 * <li>{@code offset} &ndash; a byte offset of this attribute relative to the start of an element in the vertex input binding</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkVertexInputAttributeDescription {
    uint32_t location;
    uint32_t binding;
    VkFormat format;
    uint32_t offset;
}</code></pre>
 */
public class VkVertexInputAttributeDescription extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		LOCATION,
		BINDING,
		FORMAT,
		OFFSET;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		LOCATION = layout.offsetof(0);
		BINDING = layout.offsetof(1);
		FORMAT = layout.offsetof(2);
		OFFSET = layout.offsetof(3);
	}

	VkVertexInputAttributeDescription(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkVertexInputAttributeDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkVertexInputAttributeDescription(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code location} field. */
	public int location() { return nlocation(address()); }
	/** Returns the value of the {@code binding} field. */
	public int binding() { return nbinding(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns the value of the {@code offset} field. */
	public int offset() { return noffset(address()); }

	/** Sets the specified value to the {@code location} field. */
	public VkVertexInputAttributeDescription location(int value) { nlocation(address(), value); return this; }
	/** Sets the specified value to the {@code binding} field. */
	public VkVertexInputAttributeDescription binding(int value) { nbinding(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public VkVertexInputAttributeDescription format(int value) { nformat(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public VkVertexInputAttributeDescription offset(int value) { noffset(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkVertexInputAttributeDescription set(
		int location,
		int binding,
		int format,
		int offset
	) {
		location(location);
		binding(binding);
		format(format);
		offset(offset);

		return this;
	}

	/** Unsafe version of {@link #set(VkVertexInputAttributeDescription) set}. */
	public VkVertexInputAttributeDescription nset(long struct) {
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
	public VkVertexInputAttributeDescription set(VkVertexInputAttributeDescription src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkVertexInputAttributeDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkVertexInputAttributeDescription malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkVertexInputAttributeDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkVertexInputAttributeDescription calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkVertexInputAttributeDescription} instance allocated with {@link BufferUtils}. */
	public static VkVertexInputAttributeDescription create() {
		return new VkVertexInputAttributeDescription(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkVertexInputAttributeDescription} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkVertexInputAttributeDescription create(long address) {
		return address == NULL ? null : new VkVertexInputAttributeDescription(address, null);
	}

	/**
	 * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkVertexInputAttributeDescription.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkVertexInputAttributeDescription} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkVertexInputAttributeDescription mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkVertexInputAttributeDescription} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkVertexInputAttributeDescription callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkVertexInputAttributeDescription} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkVertexInputAttributeDescription mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkVertexInputAttributeDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkVertexInputAttributeDescription callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #location}. */
	public static int nlocation(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription.LOCATION); }
	/** Unsafe version of {@link #binding}. */
	public static int nbinding(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription.BINDING); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription.FORMAT); }
	/** Unsafe version of {@link #offset}. */
	public static int noffset(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription.OFFSET); }

	/** Unsafe version of {@link #location(int) location}. */
	public static void nlocation(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription.LOCATION, value); }
	/** Unsafe version of {@link #binding(int) binding}. */
	public static void nbinding(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription.BINDING, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription.FORMAT, value); }
	/** Unsafe version of {@link #offset(int) offset}. */
	public static void noffset(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription.OFFSET, value); }

	// -----------------------------------

	/** An array of {@link VkVertexInputAttributeDescription} structs. */
	public static final class Buffer extends StructBuffer<VkVertexInputAttributeDescription, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkVertexInputAttributeDescription.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkVertexInputAttributeDescription#SIZEOF}, and its mark will be undefined.
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
		protected VkVertexInputAttributeDescription newInstance(long address) {
			return new VkVertexInputAttributeDescription(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code location} field. */
		public int location() { return VkVertexInputAttributeDescription.nlocation(address()); }
		/** Returns the value of the {@code binding} field. */
		public int binding() { return VkVertexInputAttributeDescription.nbinding(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return VkVertexInputAttributeDescription.nformat(address()); }
		/** Returns the value of the {@code offset} field. */
		public int offset() { return VkVertexInputAttributeDescription.noffset(address()); }

		/** Sets the specified value to the {@code location} field. */
		public VkVertexInputAttributeDescription.Buffer location(int value) { VkVertexInputAttributeDescription.nlocation(address(), value); return this; }
		/** Sets the specified value to the {@code binding} field. */
		public VkVertexInputAttributeDescription.Buffer binding(int value) { VkVertexInputAttributeDescription.nbinding(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public VkVertexInputAttributeDescription.Buffer format(int value) { VkVertexInputAttributeDescription.nformat(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public VkVertexInputAttributeDescription.Buffer offset(int value) { VkVertexInputAttributeDescription.noffset(address(), value); return this; }

	}

}