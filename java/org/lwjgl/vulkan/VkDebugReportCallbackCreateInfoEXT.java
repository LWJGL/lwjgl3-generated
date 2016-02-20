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
 * struct VkDebugReportCallbackCreateInfoEXT {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDebugReportFlagsEXT flags;
 *     PFN_vkDebugReportCallbackEXT pfnCallback;
 *     void * pUserData;
 * }</code></pre>
 */
public class VkDebugReportCallbackCreateInfoEXT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		PFNCALLBACK,
		PUSERDATA;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		PFNCALLBACK = layout.offsetof(3);
		PUSERDATA = layout.offsetof(4);
	}

	VkDebugReportCallbackCreateInfoEXT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDebugReportCallbackCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDebugReportCallbackCreateInfoEXT(ByteBuffer container) {
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
	/** Returns the function address at the {@code pfnCallback} field. */
	public long pfnCallback() { return npfnCallback(address()); }
	/** Returns the {@code VkDebugReportCallbackEXT} instance at the {@code pfnCallback} field. */
	public VkDebugReportCallbackEXT pfnCallbackClosure() { return npfnCallbackClosure(address()); }
	/** Returns the value of the {@code pUserData} field. */
	public long pUserData() { return npUserData(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDebugReportCallbackCreateInfoEXT sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDebugReportCallbackCreateInfoEXT pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkDebugReportCallbackCreateInfoEXT flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified function address to the {@code pfnCallback} field. */
	public VkDebugReportCallbackCreateInfoEXT pfnCallback(long value) { npfnCallback(address(), value); return this; }
	/** Sets the address of the specified {@link VkDebugReportCallbackEXT} to the {@code pfnCallback} field. */
	public VkDebugReportCallbackCreateInfoEXT pfnCallback(VkDebugReportCallbackEXT value) { return pfnCallback(addressSafe(value)); }
	/** Sets the specified value to the {@code pUserData} field. */
	public VkDebugReportCallbackCreateInfoEXT pUserData(long value) { npUserData(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDebugReportCallbackCreateInfoEXT set(
		int sType,
		long pNext,
		int flags,
		VkDebugReportCallbackEXT pfnCallback,
		long pUserData
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		pfnCallback(pfnCallback);
		pUserData(pUserData);

		return this;
	}

	/** Unsafe version of {@link #set(VkDebugReportCallbackCreateInfoEXT) set}. */
	public VkDebugReportCallbackCreateInfoEXT nset(long struct) {
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
	public VkDebugReportCallbackCreateInfoEXT set(VkDebugReportCallbackCreateInfoEXT src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkDebugReportCallbackCreateInfoEXT) set}. */
	public VkDebugReportCallbackCreateInfoEXT set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkDebugReportCallbackCreateInfoEXT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkDebugReportCallbackCreateInfoEXT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance allocated with {@link BufferUtils}. */
	public static VkDebugReportCallbackCreateInfoEXT create() {
		return new VkDebugReportCallbackCreateInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDebugReportCallbackCreateInfoEXT create(long address) {
		return address == NULL ? null : new VkDebugReportCallbackCreateInfoEXT(address, null);
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDebugReportCallbackCreateInfoEXT.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkDebugReportCallbackCreateInfoEXT.FLAGS); }
	/** Unsafe version of {@link #pfnCallback}. */
	public static long npfnCallback(long struct) { return memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PFNCALLBACK); }
	/** Unsafe version of {@link #pfnCallbackClosure}. */
	public static VkDebugReportCallbackEXT npfnCallbackClosure(long struct) { return org.lwjgl.system.libffi.Closure.create(npfnCallback(struct)); }
	/** Unsafe version of {@link #pUserData}. */
	public static long npUserData(long struct) { return memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PUSERDATA); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDebugReportCallbackCreateInfoEXT.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugReportCallbackCreateInfoEXT.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkDebugReportCallbackCreateInfoEXT.FLAGS, value); }
	/** Unsafe version of {@link #pfnCallback(long) pfnCallback}. */
	public static void npfnCallback(long struct, long value) { memPutAddress(struct + VkDebugReportCallbackCreateInfoEXT.PFNCALLBACK, value); }
	/** Unsafe version of {@link #pUserData(long) pUserData}. */
	public static void npUserData(long struct, long value) { memPutAddress(struct + VkDebugReportCallbackCreateInfoEXT.PUSERDATA, value); }

	// -----------------------------------

	/** An array of {@link VkDebugReportCallbackCreateInfoEXT} structs. */
	public static final class Buffer extends StructBuffer<VkDebugReportCallbackCreateInfoEXT, Buffer> {

		/**
		 * Creates a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDebugReportCallbackCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
		protected VkDebugReportCallbackCreateInfoEXT newInstance(long address) {
			return new VkDebugReportCallbackCreateInfoEXT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDebugReportCallbackCreateInfoEXT.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDebugReportCallbackCreateInfoEXT.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkDebugReportCallbackCreateInfoEXT.nflags(address()); }
		/** Returns the function address at the {@code pfnCallback} field. */
		public long pfnCallback() { return VkDebugReportCallbackCreateInfoEXT.npfnCallback(address()); }
		/** Returns the {@code VkDebugReportCallbackEXT} instance at the {@code pfnCallback} field. */
		public VkDebugReportCallbackEXT pfnCallbackClosure() { return VkDebugReportCallbackCreateInfoEXT.npfnCallbackClosure(address()); }
		/** Returns the value of the {@code pUserData} field. */
		public long pUserData() { return VkDebugReportCallbackCreateInfoEXT.npUserData(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer sType(int value) { VkDebugReportCallbackCreateInfoEXT.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer pNext(long value) { VkDebugReportCallbackCreateInfoEXT.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer flags(int value) { VkDebugReportCallbackCreateInfoEXT.nflags(address(), value); return this; }
		/** Sets the specified function address to the {@code pfnCallback} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer pfnCallback(long value) { VkDebugReportCallbackCreateInfoEXT.npfnCallback(address(), value); return this; }
		/** Sets the address of the specified {@link VkDebugReportCallbackEXT} to the {@code pfnCallback} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer pfnCallback(VkDebugReportCallbackEXT value) { return pfnCallback(addressSafe(value)); }
		/** Sets the specified value to the {@code pUserData} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer pUserData(long value) { VkDebugReportCallbackCreateInfoEXT.npUserData(address(), value); return this; }

	}

}