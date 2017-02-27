/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing multiview features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <ul>
 * <li>{@code multiview} indicates whether the implementation supports multiview rendering within a render pass. If this feature is not enabled, the view mask of each subpass <b>must</b> always be zero.</li>
 * <li>{@code multiviewGeometryShader} indicates whether the implementation supports multiview rendering within a render pass, with <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#geometry">geometry shaders</a>. If this feature is not enabled, then a pipeline compiled against a subpass with a non-zero view mask <b>must</b> not include a geometry shader.</li>
 * <li>{@code multiviewTessellationShader} indicates whether the implementation supports multiview rendering within a render pass, with <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#tessellation">tessellation shaders</a>. If this feature is not enabled, then a pipeline compiled against a subpass with a non-zero view mask <b>must</b> not include any tessellation shaders.</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceMultiviewFeaturesKHX} structure is included in the {@code pNext} chain of {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceFeatures2KHR GetPhysicalDeviceFeatures2KHR}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceMultiviewFeaturesKHX} <b>can</b> also be used in the {@code pNext} chain of {@link VK10#vkCreateDevice CreateDevice} to enable features.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code multiviewGeometryShader} is enabled then {@code multiview} <b>must</b> also be enabled.</li>
 * <li>If {@code multiviewTessellationShader} is enabled then {@code multiview} <b>must</b> also be enabled.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXMultiview#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceMultiviewFeaturesKHX {
    VkStructureType sType;
    void * pNext;
    VkBool32 multiview;
    VkBool32 multiviewGeometryShader;
    VkBool32 multiviewTessellationShader;
}</code></pre>
 */
public class VkPhysicalDeviceMultiviewFeaturesKHX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		MULTIVIEW,
		MULTIVIEWGEOMETRYSHADER,
		MULTIVIEWTESSELLATIONSHADER;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		MULTIVIEW = layout.offsetof(2);
		MULTIVIEWGEOMETRYSHADER = layout.offsetof(3);
		MULTIVIEWTESSELLATIONSHADER = layout.offsetof(4);
	}

	VkPhysicalDeviceMultiviewFeaturesKHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPhysicalDeviceMultiviewFeaturesKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPhysicalDeviceMultiviewFeaturesKHX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code multiview} field. */
	public boolean multiview() { return nmultiview(address()) != 0; }
	/** Returns the value of the {@code multiviewGeometryShader} field. */
	public boolean multiviewGeometryShader() { return nmultiviewGeometryShader(address()) != 0; }
	/** Returns the value of the {@code multiviewTessellationShader} field. */
	public boolean multiviewTessellationShader() { return nmultiviewTessellationShader(address()) != 0; }

	/** Sets the specified value to the {@code sType} field. */
	public VkPhysicalDeviceMultiviewFeaturesKHX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPhysicalDeviceMultiviewFeaturesKHX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code multiview} field. */
	public VkPhysicalDeviceMultiviewFeaturesKHX multiview(boolean value) { nmultiview(address(), value ? 1 : 0); return this; }
	/** Sets the specified value to the {@code multiviewGeometryShader} field. */
	public VkPhysicalDeviceMultiviewFeaturesKHX multiviewGeometryShader(boolean value) { nmultiviewGeometryShader(address(), value ? 1 : 0); return this; }
	/** Sets the specified value to the {@code multiviewTessellationShader} field. */
	public VkPhysicalDeviceMultiviewFeaturesKHX multiviewTessellationShader(boolean value) { nmultiviewTessellationShader(address(), value ? 1 : 0); return this; }

	/** Initializes this struct with the specified values. */
	public VkPhysicalDeviceMultiviewFeaturesKHX set(
		int sType,
		long pNext,
		boolean multiview,
		boolean multiviewGeometryShader,
		boolean multiviewTessellationShader
	) {
		sType(sType);
		pNext(pNext);
		multiview(multiview);
		multiviewGeometryShader(multiviewGeometryShader);
		multiviewTessellationShader(multiviewTessellationShader);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkPhysicalDeviceMultiviewFeaturesKHX set(VkPhysicalDeviceMultiviewFeaturesKHX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceMultiviewFeaturesKHX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceMultiviewFeaturesKHX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX} instance allocated with {@link BufferUtils}. */
	public static VkPhysicalDeviceMultiviewFeaturesKHX create() {
		return new VkPhysicalDeviceMultiviewFeaturesKHX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPhysicalDeviceMultiviewFeaturesKHX create(long address) {
		return address == NULL ? null : new VkPhysicalDeviceMultiviewFeaturesKHX(address, null);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPhysicalDeviceMultiviewFeaturesKHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPhysicalDeviceMultiviewFeaturesKHX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPhysicalDeviceMultiviewFeaturesKHX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceMultiviewFeaturesKHX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceMultiviewFeaturesKHX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewFeaturesKHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultiviewFeaturesKHX.PNEXT); }
	/** Unsafe version of {@link #multiview}. */
	public static int nmultiview(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewFeaturesKHX.MULTIVIEW); }
	/** Unsafe version of {@link #multiviewGeometryShader}. */
	public static int nmultiviewGeometryShader(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewFeaturesKHX.MULTIVIEWGEOMETRYSHADER); }
	/** Unsafe version of {@link #multiviewTessellationShader}. */
	public static int nmultiviewTessellationShader(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewFeaturesKHX.MULTIVIEWTESSELLATIONSHADER); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultiviewFeaturesKHX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMultiviewFeaturesKHX.PNEXT, value); }
	/** Unsafe version of {@link #multiview(boolean) multiview}. */
	public static void nmultiview(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultiviewFeaturesKHX.MULTIVIEW, value); }
	/** Unsafe version of {@link #multiviewGeometryShader(boolean) multiviewGeometryShader}. */
	public static void nmultiviewGeometryShader(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultiviewFeaturesKHX.MULTIVIEWGEOMETRYSHADER, value); }
	/** Unsafe version of {@link #multiviewTessellationShader(boolean) multiviewTessellationShader}. */
	public static void nmultiviewTessellationShader(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultiviewFeaturesKHX.MULTIVIEWTESSELLATIONSHADER, value); }

	// -----------------------------------

	/** An array of {@link VkPhysicalDeviceMultiviewFeaturesKHX} structs. */
	public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiviewFeaturesKHX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkPhysicalDeviceMultiviewFeaturesKHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPhysicalDeviceMultiviewFeaturesKHX#SIZEOF}, and its mark will be undefined.
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
		protected VkPhysicalDeviceMultiviewFeaturesKHX newInstance(long address) {
			return new VkPhysicalDeviceMultiviewFeaturesKHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPhysicalDeviceMultiviewFeaturesKHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPhysicalDeviceMultiviewFeaturesKHX.npNext(address()); }
		/** Returns the value of the {@code multiview} field. */
		public boolean multiview() { return VkPhysicalDeviceMultiviewFeaturesKHX.nmultiview(address()) != 0; }
		/** Returns the value of the {@code multiviewGeometryShader} field. */
		public boolean multiviewGeometryShader() { return VkPhysicalDeviceMultiviewFeaturesKHX.nmultiviewGeometryShader(address()) != 0; }
		/** Returns the value of the {@code multiviewTessellationShader} field. */
		public boolean multiviewTessellationShader() { return VkPhysicalDeviceMultiviewFeaturesKHX.nmultiviewTessellationShader(address()) != 0; }

		/** Sets the specified value to the {@code sType} field. */
		public VkPhysicalDeviceMultiviewFeaturesKHX.Buffer sType(int value) { VkPhysicalDeviceMultiviewFeaturesKHX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPhysicalDeviceMultiviewFeaturesKHX.Buffer pNext(long value) { VkPhysicalDeviceMultiviewFeaturesKHX.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code multiview} field. */
		public VkPhysicalDeviceMultiviewFeaturesKHX.Buffer multiview(boolean value) { VkPhysicalDeviceMultiviewFeaturesKHX.nmultiview(address(), value ? 1 : 0); return this; }
		/** Sets the specified value to the {@code multiviewGeometryShader} field. */
		public VkPhysicalDeviceMultiviewFeaturesKHX.Buffer multiviewGeometryShader(boolean value) { VkPhysicalDeviceMultiviewFeaturesKHX.nmultiviewGeometryShader(address(), value ? 1 : 0); return this; }
		/** Sets the specified value to the {@code multiviewTessellationShader} field. */
		public VkPhysicalDeviceMultiviewFeaturesKHX.Buffer multiviewTessellationShader(boolean value) { VkPhysicalDeviceMultiviewFeaturesKHX.nmultiviewTessellationShader(address(), value ? 1 : 0); return this; }

	}

}