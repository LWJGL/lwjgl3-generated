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
 * (no short description available).
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code viewportCount} <b>must</b> match the {@code viewportCount} set in {@link VkPipelineViewportStateCreateInfo}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVViewportSwizzle#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkViewportSwizzleNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code viewportCount} &ndash; the number of viewport swizzles used by the pipeline.</li>
 * <li>{@code pViewportSwizzles} &ndash; a pointer to an array of {@link VkViewportSwizzleNV} structures, defining the viewport swizzles.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPipelineViewportSwizzleStateCreateInfoNV {
    VkStructureType sType;
    const void * pNext;
    VkPipelineViewportSwizzleStateCreateFlagsNV flags;
    uint32_t viewportCount;
    const {@link VkViewportSwizzleNV VkViewportSwizzleNV} * pViewportSwizzles;
}</code></pre>
 */
public class VkPipelineViewportSwizzleStateCreateInfoNV extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		VIEWPORTCOUNT,
		PVIEWPORTSWIZZLES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		VIEWPORTCOUNT = layout.offsetof(3);
		PVIEWPORTSWIZZLES = layout.offsetof(4);
	}

	VkPipelineViewportSwizzleStateCreateInfoNV(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineViewportSwizzleStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineViewportSwizzleStateCreateInfoNV(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code viewportCount} field. */
	public int viewportCount() { return nviewportCount(address()); }
	/** Returns a {@link VkViewportSwizzleNV.Buffer} view of the struct array pointed to by the {@code pViewportSwizzles} field. */
	public VkViewportSwizzleNV.Buffer pViewportSwizzles() { return npViewportSwizzles(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineViewportSwizzleStateCreateInfoNV sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineViewportSwizzleStateCreateInfoNV pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineViewportSwizzleStateCreateInfoNV flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code viewportCount} field. */
	public VkPipelineViewportSwizzleStateCreateInfoNV viewportCount(int value) { nviewportCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkViewportSwizzleNV.Buffer} to the {@code pViewportSwizzles} field. */
	public VkPipelineViewportSwizzleStateCreateInfoNV pViewportSwizzles(VkViewportSwizzleNV.Buffer value) { npViewportSwizzles(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineViewportSwizzleStateCreateInfoNV set(
		int sType,
		long pNext,
		int flags,
		int viewportCount,
		VkViewportSwizzleNV.Buffer pViewportSwizzles
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		viewportCount(viewportCount);
		pViewportSwizzles(pViewportSwizzles);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkPipelineViewportSwizzleStateCreateInfoNV set(VkPipelineViewportSwizzleStateCreateInfoNV src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineViewportSwizzleStateCreateInfoNV malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineViewportSwizzleStateCreateInfoNV calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
	public static VkPipelineViewportSwizzleStateCreateInfoNV create() {
		return new VkPipelineViewportSwizzleStateCreateInfoNV(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineViewportSwizzleStateCreateInfoNV create(long address) {
		return address == NULL ? null : new VkPipelineViewportSwizzleStateCreateInfoNV(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPipelineViewportSwizzleStateCreateInfoNV mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPipelineViewportSwizzleStateCreateInfoNV callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineViewportSwizzleStateCreateInfoNV mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineViewportSwizzleStateCreateInfoNV callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineViewportSwizzleStateCreateInfoNV.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportSwizzleStateCreateInfoNV.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineViewportSwizzleStateCreateInfoNV.FLAGS); }
	/** Unsafe version of {@link #viewportCount}. */
	public static int nviewportCount(long struct) { return memGetInt(struct + VkPipelineViewportSwizzleStateCreateInfoNV.VIEWPORTCOUNT); }
	/** Unsafe version of {@link #pViewportSwizzles}. */
	public static VkViewportSwizzleNV.Buffer npViewportSwizzles(long struct) { return VkViewportSwizzleNV.create(memGetAddress(struct + VkPipelineViewportSwizzleStateCreateInfoNV.PVIEWPORTSWIZZLES), nviewportCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineViewportSwizzleStateCreateInfoNV.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportSwizzleStateCreateInfoNV.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineViewportSwizzleStateCreateInfoNV.FLAGS, value); }
	/** Sets the specified value to the {@code viewportCount} field of the specified {@code struct}. */
	public static void nviewportCount(long struct, int value) { memPutInt(struct + VkPipelineViewportSwizzleStateCreateInfoNV.VIEWPORTCOUNT, value); }
	/** Unsafe version of {@link #pViewportSwizzles(VkViewportSwizzleNV.Buffer) pViewportSwizzles}. */
	public static void npViewportSwizzles(long struct, VkViewportSwizzleNV.Buffer value) { memPutAddress(struct + VkPipelineViewportSwizzleStateCreateInfoNV.PVIEWPORTSWIZZLES, addressSafe(value)); if ( value != null ) nviewportCount(struct, value.remaining()); }

	// -----------------------------------

	/** An array of {@link VkPipelineViewportSwizzleStateCreateInfoNV} structs. */
	public static class Buffer extends StructBuffer<VkPipelineViewportSwizzleStateCreateInfoNV, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineViewportSwizzleStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineViewportSwizzleStateCreateInfoNV newInstance(long address) {
			return new VkPipelineViewportSwizzleStateCreateInfoNV(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineViewportSwizzleStateCreateInfoNV.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineViewportSwizzleStateCreateInfoNV.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineViewportSwizzleStateCreateInfoNV.nflags(address()); }
		/** Returns the value of the {@code viewportCount} field. */
		public int viewportCount() { return VkPipelineViewportSwizzleStateCreateInfoNV.nviewportCount(address()); }
		/** Returns a {@link VkViewportSwizzleNV.Buffer} view of the struct array pointed to by the {@code pViewportSwizzles} field. */
		public VkViewportSwizzleNV.Buffer pViewportSwizzles() { return VkPipelineViewportSwizzleStateCreateInfoNV.npViewportSwizzles(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineViewportSwizzleStateCreateInfoNV.Buffer sType(int value) { VkPipelineViewportSwizzleStateCreateInfoNV.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineViewportSwizzleStateCreateInfoNV.Buffer pNext(long value) { VkPipelineViewportSwizzleStateCreateInfoNV.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineViewportSwizzleStateCreateInfoNV.Buffer flags(int value) { VkPipelineViewportSwizzleStateCreateInfoNV.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code viewportCount} field. */
		public VkPipelineViewportSwizzleStateCreateInfoNV.Buffer viewportCount(int value) { VkPipelineViewportSwizzleStateCreateInfoNV.nviewportCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkViewportSwizzleNV.Buffer} to the {@code pViewportSwizzles} field. */
		public VkPipelineViewportSwizzleStateCreateInfoNV.Buffer pViewportSwizzles(VkViewportSwizzleNV.Buffer value) { VkPipelineViewportSwizzleStateCreateInfoNV.npViewportSwizzles(address(), value); return this; }

	}

}