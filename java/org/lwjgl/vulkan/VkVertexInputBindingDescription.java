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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkVertexInputBindingDescription.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkVertexInputBindingDescription">Vulkan Specification</a>
 * 
 * <p>Describes a vertex input binding.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code inputRate} <b>must</b> be a valid {@code VkVertexInputRate} value</li>
 * <li>{@code binding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
 * <li>{@code stride} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindingStride}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code binding} &ndash; the binding number that this structure describes</li>
 * <li>{@code stride} &ndash; the distance in bytes between two consecutive elements within the buffer</li>
 * <li>{@code inputRate} &ndash; a {@code VkVertexInputRate} value that specifies whether vertex attribute addressing is a function of the vertex index or of the instance index. One of:<br><table><tr><td>{@link VK10#VK_VERTEX_INPUT_RATE_INSTANCE VERTEX_INPUT_RATE_INSTANCE}</td><td>{@link VK10#VK_VERTEX_INPUT_RATE_VERTEX VERTEX_INPUT_RATE_VERTEX}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkVertexInputBindingDescription {
    uint32_t binding;
    uint32_t stride;
    VkVertexInputRate inputRate;
}</code></pre>
 */
public class VkVertexInputBindingDescription extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BINDING,
		STRIDE,
		INPUTRATE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BINDING = layout.offsetof(0);
		STRIDE = layout.offsetof(1);
		INPUTRATE = layout.offsetof(2);
	}

	VkVertexInputBindingDescription(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkVertexInputBindingDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkVertexInputBindingDescription(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code binding} field. */
	public int binding() { return nbinding(address()); }
	/** Returns the value of the {@code stride} field. */
	public int stride() { return nstride(address()); }
	/** Returns the value of the {@code inputRate} field. */
	public int inputRate() { return ninputRate(address()); }

	/** Sets the specified value to the {@code binding} field. */
	public VkVertexInputBindingDescription binding(int value) { nbinding(address(), value); return this; }
	/** Sets the specified value to the {@code stride} field. */
	public VkVertexInputBindingDescription stride(int value) { nstride(address(), value); return this; }
	/** Sets the specified value to the {@code inputRate} field. */
	public VkVertexInputBindingDescription inputRate(int value) { ninputRate(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkVertexInputBindingDescription set(
		int binding,
		int stride,
		int inputRate
	) {
		binding(binding);
		stride(stride);
		inputRate(inputRate);

		return this;
	}

	/** Unsafe version of {@link #set(VkVertexInputBindingDescription) set}. */
	public VkVertexInputBindingDescription nset(long struct) {
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
	public VkVertexInputBindingDescription set(VkVertexInputBindingDescription src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkVertexInputBindingDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkVertexInputBindingDescription malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkVertexInputBindingDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkVertexInputBindingDescription calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkVertexInputBindingDescription} instance allocated with {@link BufferUtils}. */
	public static VkVertexInputBindingDescription create() {
		return new VkVertexInputBindingDescription(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkVertexInputBindingDescription} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkVertexInputBindingDescription create(long address) {
		return address == NULL ? null : new VkVertexInputBindingDescription(address, null);
	}

	/**
	 * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkVertexInputBindingDescription.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkVertexInputBindingDescription} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkVertexInputBindingDescription mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkVertexInputBindingDescription} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkVertexInputBindingDescription callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkVertexInputBindingDescription} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkVertexInputBindingDescription mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkVertexInputBindingDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkVertexInputBindingDescription callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #binding}. */
	public static int nbinding(long struct) { return memGetInt(struct + VkVertexInputBindingDescription.BINDING); }
	/** Unsafe version of {@link #stride}. */
	public static int nstride(long struct) { return memGetInt(struct + VkVertexInputBindingDescription.STRIDE); }
	/** Unsafe version of {@link #inputRate}. */
	public static int ninputRate(long struct) { return memGetInt(struct + VkVertexInputBindingDescription.INPUTRATE); }

	/** Unsafe version of {@link #binding(int) binding}. */
	public static void nbinding(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription.BINDING, value); }
	/** Unsafe version of {@link #stride(int) stride}. */
	public static void nstride(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription.STRIDE, value); }
	/** Unsafe version of {@link #inputRate(int) inputRate}. */
	public static void ninputRate(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription.INPUTRATE, value); }

	// -----------------------------------

	/** An array of {@link VkVertexInputBindingDescription} structs. */
	public static final class Buffer extends StructBuffer<VkVertexInputBindingDescription, Buffer> {

		/**
		 * Creates a new {@link VkVertexInputBindingDescription.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkVertexInputBindingDescription#SIZEOF}, and its mark will be undefined.
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
		protected VkVertexInputBindingDescription newInstance(long address) {
			return new VkVertexInputBindingDescription(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code binding} field. */
		public int binding() { return VkVertexInputBindingDescription.nbinding(address()); }
		/** Returns the value of the {@code stride} field. */
		public int stride() { return VkVertexInputBindingDescription.nstride(address()); }
		/** Returns the value of the {@code inputRate} field. */
		public int inputRate() { return VkVertexInputBindingDescription.ninputRate(address()); }

		/** Sets the specified value to the {@code binding} field. */
		public VkVertexInputBindingDescription.Buffer binding(int value) { VkVertexInputBindingDescription.nbinding(address(), value); return this; }
		/** Sets the specified value to the {@code stride} field. */
		public VkVertexInputBindingDescription.Buffer stride(int value) { VkVertexInputBindingDescription.nstride(address(), value); return this; }
		/** Sets the specified value to the {@code inputRate} field. */
		public VkVertexInputBindingDescription.Buffer inputRate(int value) { VkVertexInputBindingDescription.ninputRate(address(), value); return this; }

	}

}