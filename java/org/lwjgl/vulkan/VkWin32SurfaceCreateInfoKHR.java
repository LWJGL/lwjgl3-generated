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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkWin32SurfaceCreateFlagsKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkWin32SurfaceCreateFlagsKHR">Vulkan Specification</a>
 * 
 * <p>Contains information about how a surface for a Win32 window should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRWin32Surface#VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link KHRWin32Surface#VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code hinstance} &ndash; the WIN32 HINSTANCE for the window to associate the surface with</li>
 * <li>{@code hwnd} &ndash; the WIN32 HWND for the window to associate the surface with</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkWin32SurfaceCreateInfoKHR {
    VkStructureType sType;
    const void * pNext;
    VkWin32SurfaceCreateFlagsKHR flags;
    HINSTANCE hinstance;
    HWND hwnd;
}</code></pre>
 */
public class VkWin32SurfaceCreateInfoKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		HINSTANCE,
		HWND;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		HINSTANCE = layout.offsetof(3);
		HWND = layout.offsetof(4);
	}

	VkWin32SurfaceCreateInfoKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkWin32SurfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkWin32SurfaceCreateInfoKHR(ByteBuffer container) {
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
	/** Returns the value of the {@code hinstance} field. */
	public long hinstance() { return nhinstance(address()); }
	/** Returns the value of the {@code hwnd} field. */
	public long hwnd() { return nhwnd(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkWin32SurfaceCreateInfoKHR sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkWin32SurfaceCreateInfoKHR pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkWin32SurfaceCreateInfoKHR flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code hinstance} field. */
	public VkWin32SurfaceCreateInfoKHR hinstance(long value) { nhinstance(address(), value); return this; }
	/** Sets the specified value to the {@code hwnd} field. */
	public VkWin32SurfaceCreateInfoKHR hwnd(long value) { nhwnd(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkWin32SurfaceCreateInfoKHR set(
		int sType,
		long pNext,
		int flags,
		long hinstance,
		long hwnd
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		hinstance(hinstance);
		hwnd(hwnd);

		return this;
	}

	/** Unsafe version of {@link #set(VkWin32SurfaceCreateInfoKHR) set}. */
	public VkWin32SurfaceCreateInfoKHR nset(long struct) {
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
	public VkWin32SurfaceCreateInfoKHR set(VkWin32SurfaceCreateInfoKHR src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkWin32SurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkWin32SurfaceCreateInfoKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkWin32SurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkWin32SurfaceCreateInfoKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkWin32SurfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
	public static VkWin32SurfaceCreateInfoKHR create() {
		return new VkWin32SurfaceCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkWin32SurfaceCreateInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkWin32SurfaceCreateInfoKHR create(long address) {
		return address == NULL ? null : new VkWin32SurfaceCreateInfoKHR(address, null);
	}

	/**
	 * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkWin32SurfaceCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkWin32SurfaceCreateInfoKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkWin32SurfaceCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkWin32SurfaceCreateInfoKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkWin32SurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkWin32SurfaceCreateInfoKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkWin32SurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkWin32SurfaceCreateInfoKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkWin32SurfaceCreateInfoKHR.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkWin32SurfaceCreateInfoKHR.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkWin32SurfaceCreateInfoKHR.FLAGS); }
	/** Unsafe version of {@link #hinstance}. */
	public static long nhinstance(long struct) { return memGetAddress(struct + VkWin32SurfaceCreateInfoKHR.HINSTANCE); }
	/** Unsafe version of {@link #hwnd}. */
	public static long nhwnd(long struct) { return memGetAddress(struct + VkWin32SurfaceCreateInfoKHR.HWND); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkWin32SurfaceCreateInfoKHR.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkWin32SurfaceCreateInfoKHR.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkWin32SurfaceCreateInfoKHR.FLAGS, value); }
	/** Unsafe version of {@link #hinstance(long) hinstance}. */
	public static void nhinstance(long struct, long value) { memPutAddress(struct + VkWin32SurfaceCreateInfoKHR.HINSTANCE, checkPointer(value)); }
	/** Unsafe version of {@link #hwnd(long) hwnd}. */
	public static void nhwnd(long struct, long value) { memPutAddress(struct + VkWin32SurfaceCreateInfoKHR.HWND, checkPointer(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkWin32SurfaceCreateInfoKHR.HINSTANCE));
		checkPointer(memGetAddress(struct + VkWin32SurfaceCreateInfoKHR.HWND));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkWin32SurfaceCreateInfoKHR} structs. */
	public static final class Buffer extends StructBuffer<VkWin32SurfaceCreateInfoKHR, Buffer> {

		/**
		 * Creates a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkWin32SurfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkWin32SurfaceCreateInfoKHR newInstance(long address) {
			return new VkWin32SurfaceCreateInfoKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkWin32SurfaceCreateInfoKHR.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkWin32SurfaceCreateInfoKHR.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkWin32SurfaceCreateInfoKHR.nflags(address()); }
		/** Returns the value of the {@code hinstance} field. */
		public long hinstance() { return VkWin32SurfaceCreateInfoKHR.nhinstance(address()); }
		/** Returns the value of the {@code hwnd} field. */
		public long hwnd() { return VkWin32SurfaceCreateInfoKHR.nhwnd(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkWin32SurfaceCreateInfoKHR.Buffer sType(int value) { VkWin32SurfaceCreateInfoKHR.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkWin32SurfaceCreateInfoKHR.Buffer pNext(long value) { VkWin32SurfaceCreateInfoKHR.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkWin32SurfaceCreateInfoKHR.Buffer flags(int value) { VkWin32SurfaceCreateInfoKHR.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code hinstance} field. */
		public VkWin32SurfaceCreateInfoKHR.Buffer hinstance(long value) { VkWin32SurfaceCreateInfoKHR.nhinstance(address(), value); return this; }
		/** Sets the specified value to the {@code hwnd} field. */
		public VkWin32SurfaceCreateInfoKHR.Buffer hwnd(long value) { VkWin32SurfaceCreateInfoKHR.nhwnd(address(), value); return this; }

	}

}