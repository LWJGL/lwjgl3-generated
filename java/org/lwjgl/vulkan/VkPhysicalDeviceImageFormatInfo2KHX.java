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
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceImageFormatInfo2KHX {
    VkStructureType sType;
    const void * pNext;
    VkFormat format;
    VkImageType type;
    VkImageTiling tiling;
    VkImageUsageFlags usage;
    VkImageCreateFlags flags;
}</code></pre>
 */
public class VkPhysicalDeviceImageFormatInfo2KHX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FORMAT,
		TYPE,
		TILING,
		USAGE,
		FLAGS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FORMAT = layout.offsetof(2);
		TYPE = layout.offsetof(3);
		TILING = layout.offsetof(4);
		USAGE = layout.offsetof(5);
		FLAGS = layout.offsetof(6);
	}

	VkPhysicalDeviceImageFormatInfo2KHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPhysicalDeviceImageFormatInfo2KHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPhysicalDeviceImageFormatInfo2KHX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns the value of the {@code type} field. */
	public int type() { return ntype(address()); }
	/** Returns the value of the {@code tiling} field. */
	public int tiling() { return ntiling(address()); }
	/** Returns the value of the {@code usage} field. */
	public int usage() { return nusage(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPhysicalDeviceImageFormatInfo2KHX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPhysicalDeviceImageFormatInfo2KHX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public VkPhysicalDeviceImageFormatInfo2KHX format(int value) { nformat(address(), value); return this; }
	/** Sets the specified value to the {@code type} field. */
	public VkPhysicalDeviceImageFormatInfo2KHX type(int value) { ntype(address(), value); return this; }
	/** Sets the specified value to the {@code tiling} field. */
	public VkPhysicalDeviceImageFormatInfo2KHX tiling(int value) { ntiling(address(), value); return this; }
	/** Sets the specified value to the {@code usage} field. */
	public VkPhysicalDeviceImageFormatInfo2KHX usage(int value) { nusage(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPhysicalDeviceImageFormatInfo2KHX flags(int value) { nflags(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPhysicalDeviceImageFormatInfo2KHX set(
		int sType,
		long pNext,
		int format,
		int type,
		int tiling,
		int usage,
		int flags
	) {
		sType(sType);
		pNext(pNext);
		format(format);
		type(type);
		tiling(tiling);
		usage(usage);
		flags(flags);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkPhysicalDeviceImageFormatInfo2KHX set(VkPhysicalDeviceImageFormatInfo2KHX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceImageFormatInfo2KHX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceImageFormatInfo2KHX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX} instance allocated with {@link BufferUtils}. */
	public static VkPhysicalDeviceImageFormatInfo2KHX create() {
		return new VkPhysicalDeviceImageFormatInfo2KHX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPhysicalDeviceImageFormatInfo2KHX create(long address) {
		return address == NULL ? null : new VkPhysicalDeviceImageFormatInfo2KHX(address, null);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPhysicalDeviceImageFormatInfo2KHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPhysicalDeviceImageFormatInfo2KHX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPhysicalDeviceImageFormatInfo2KHX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceImageFormatInfo2KHX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceImageFormatInfo2KHX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageFormatInfo2KHX.PNEXT); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.FORMAT); }
	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.TYPE); }
	/** Unsafe version of {@link #tiling}. */
	public static int ntiling(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.TILING); }
	/** Unsafe version of {@link #usage}. */
	public static int nusage(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.USAGE); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.FLAGS); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageFormatInfo2KHX.PNEXT, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.FORMAT, value); }
	/** Unsafe version of {@link #type(int) type}. */
	public static void ntype(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.TYPE, value); }
	/** Unsafe version of {@link #tiling(int) tiling}. */
	public static void ntiling(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.TILING, value); }
	/** Unsafe version of {@link #usage(int) usage}. */
	public static void nusage(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.USAGE, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHX.FLAGS, value); }

	// -----------------------------------

	/** An array of {@link VkPhysicalDeviceImageFormatInfo2KHX} structs. */
	public static class Buffer extends StructBuffer<VkPhysicalDeviceImageFormatInfo2KHX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkPhysicalDeviceImageFormatInfo2KHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPhysicalDeviceImageFormatInfo2KHX#SIZEOF}, and its mark will be undefined.
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
		protected VkPhysicalDeviceImageFormatInfo2KHX newInstance(long address) {
			return new VkPhysicalDeviceImageFormatInfo2KHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPhysicalDeviceImageFormatInfo2KHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPhysicalDeviceImageFormatInfo2KHX.npNext(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return VkPhysicalDeviceImageFormatInfo2KHX.nformat(address()); }
		/** Returns the value of the {@code type} field. */
		public int type() { return VkPhysicalDeviceImageFormatInfo2KHX.ntype(address()); }
		/** Returns the value of the {@code tiling} field. */
		public int tiling() { return VkPhysicalDeviceImageFormatInfo2KHX.ntiling(address()); }
		/** Returns the value of the {@code usage} field. */
		public int usage() { return VkPhysicalDeviceImageFormatInfo2KHX.nusage(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPhysicalDeviceImageFormatInfo2KHX.nflags(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPhysicalDeviceImageFormatInfo2KHX.Buffer sType(int value) { VkPhysicalDeviceImageFormatInfo2KHX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPhysicalDeviceImageFormatInfo2KHX.Buffer pNext(long value) { VkPhysicalDeviceImageFormatInfo2KHX.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public VkPhysicalDeviceImageFormatInfo2KHX.Buffer format(int value) { VkPhysicalDeviceImageFormatInfo2KHX.nformat(address(), value); return this; }
		/** Sets the specified value to the {@code type} field. */
		public VkPhysicalDeviceImageFormatInfo2KHX.Buffer type(int value) { VkPhysicalDeviceImageFormatInfo2KHX.ntype(address(), value); return this; }
		/** Sets the specified value to the {@code tiling} field. */
		public VkPhysicalDeviceImageFormatInfo2KHX.Buffer tiling(int value) { VkPhysicalDeviceImageFormatInfo2KHX.ntiling(address(), value); return this; }
		/** Sets the specified value to the {@code usage} field. */
		public VkPhysicalDeviceImageFormatInfo2KHX.Buffer usage(int value) { VkPhysicalDeviceImageFormatInfo2KHX.nusage(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPhysicalDeviceImageFormatInfo2KHX.Buffer flags(int value) { VkPhysicalDeviceImageFormatInfo2KHX.nflags(address(), value); return this; }

	}

}