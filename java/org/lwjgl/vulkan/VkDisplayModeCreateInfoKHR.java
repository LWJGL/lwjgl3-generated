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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDisplayModeCreateInfoKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDisplayModeCreateInfoKHR">Vulkan Specification</a>
 * 
 * <p>Contains information about how a display mode should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDisplay#VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>The {@code width} and {@code height} members of the {@code visibleRegion} member of {@code parameters} <b>must</b> be greater than 0</li>
 * <li>The {@code refreshRate} member of {@code parameters} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link KHRDisplay#VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use, and <b>must</b> be zero</li>
 * <li>{@code parameters} &ndash; a {@link VkDisplayModeParametersKHR} structure describing the display parameters to use in creating the new mode</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDisplayModeCreateInfoKHR {
    VkStructureType sType;
    const void * pNext;
    VkDisplayModeCreateFlagsKHR flags;
    {@link VkDisplayModeParametersKHR VkDisplayModeParametersKHR} parameters;
}</code></pre>
 */
public class VkDisplayModeCreateInfoKHR extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
			__member(VkDisplayModeParametersKHR.SIZEOF, VkDisplayModeParametersKHR.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

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

	// -----------------------------------

	/** Returns a new {@link VkDisplayModeCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayModeCreateInfoKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayModeCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
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

	// -----------------------------------

	/** Returns a new {@link VkDisplayModeCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDisplayModeCreateInfoKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDisplayModeCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDisplayModeCreateInfoKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayModeCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayModeCreateInfoKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayModeCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayModeCreateInfoKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

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
	public static final class Buffer extends StructBuffer<VkDisplayModeCreateInfoKHR, Buffer> implements NativeResource {

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