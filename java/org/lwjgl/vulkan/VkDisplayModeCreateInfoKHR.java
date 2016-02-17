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
 * struct VkDisplayModeCreateInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDisplayModeCreateFlagsKHR flags;
 *     {@link VkDisplayModeParametersKHR VkDisplayModeParametersKHR} parameters;
 * }</code></pre>
 */
public class VkDisplayModeCreateInfoKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		PARAMETERS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(VkDisplayModeParametersKHR.SIZEOF, VkDisplayModeParametersKHR.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		PARAMETERS = layout.offsetof(3);
	}

	VkDisplayModeCreateInfoKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplayModeCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplayModeCreateInfoKHR(ByteBuffer container) {
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
	/** Returns a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
	public VkDisplayModeParametersKHR parameters() { return nparameters(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDisplayModeCreateInfoKHR sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDisplayModeCreateInfoKHR pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkDisplayModeCreateInfoKHR flags(int value) { nflags(address(), value); return this; }
	/** Copies the specified {@link VkDisplayModeParametersKHR} to the {@code parameters} field. */
	public VkDisplayModeCreateInfoKHR parameters(VkDisplayModeParametersKHR value) { nparameters(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDisplayModeCreateInfoKHR set(
		int sType,
		long pNext,
		int flags,
		VkDisplayModeParametersKHR parameters
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		parameters(parameters);

		return this;
	}

	/** Unsafe version of {@link #set(VkDisplayModeCreateInfoKHR) set}. */
	public VkDisplayModeCreateInfoKHR nset(long struct) {
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
	public VkDisplayModeCreateInfoKHR set(VkDisplayModeCreateInfoKHR src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkDisplayModeCreateInfoKHR) set}. */
	public VkDisplayModeCreateInfoKHR set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayModeCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayModeCreateInfoKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayModeCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkDisplayModeCreateInfoKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplayModeCreateInfoKHR} instance allocated with {@link BufferUtils}. */
	public static VkDisplayModeCreateInfoKHR create() {
		return new VkDisplayModeCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplayModeCreateInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplayModeCreateInfoKHR create(long address) {
		return address == NULL ? null : new VkDisplayModeCreateInfoKHR(address, null);
	}

	/**
	 * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplayModeCreateInfoKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDisplayModeCreateInfoKHR.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDisplayModeCreateInfoKHR.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkDisplayModeCreateInfoKHR.FLAGS); }
	/** Unsafe version of {@link #parameters}. */
	public static VkDisplayModeParametersKHR nparameters(long struct) { return VkDisplayModeParametersKHR.create(struct + VkDisplayModeCreateInfoKHR.PARAMETERS); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDisplayModeCreateInfoKHR.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayModeCreateInfoKHR.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkDisplayModeCreateInfoKHR.FLAGS, value); }
	/** Unsafe version of {@link #parameters(VkDisplayModeParametersKHR) parameters}. */
	public static void nparameters(long struct, VkDisplayModeParametersKHR value) { memCopy(value.address(), struct + VkDisplayModeCreateInfoKHR.PARAMETERS, VkDisplayModeParametersKHR.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkDisplayModeCreateInfoKHR} structs. */
	public static final class Buffer extends StructBuffer<VkDisplayModeCreateInfoKHR, Buffer> {

		/**
		 * Creates a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplayModeCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkDisplayModeCreateInfoKHR newInstance(long address) {
			return new VkDisplayModeCreateInfoKHR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDisplayModeCreateInfoKHR.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDisplayModeCreateInfoKHR.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkDisplayModeCreateInfoKHR.nflags(address()); }
		/** Returns a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
		public VkDisplayModeParametersKHR parameters() { return VkDisplayModeCreateInfoKHR.nparameters(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDisplayModeCreateInfoKHR.Buffer sType(int value) { VkDisplayModeCreateInfoKHR.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDisplayModeCreateInfoKHR.Buffer pNext(long value) { VkDisplayModeCreateInfoKHR.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkDisplayModeCreateInfoKHR.Buffer flags(int value) { VkDisplayModeCreateInfoKHR.nflags(address(), value); return this; }
		/** Copies the specified {@link VkDisplayModeParametersKHR} to the {@code parameters} field. */
		public VkDisplayModeCreateInfoKHR.Buffer parameters(VkDisplayModeParametersKHR value) { VkDisplayModeCreateInfoKHR.nparameters(address(), value); return this; }

	}

}