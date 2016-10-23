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
 * Structure specifying parameters of a newly created Xlib surface object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRXlibSurface#VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code dpy} <b>must</b> be a pointer to a {@code Display} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRXlibSurface#vkCreateXlibSurfaceKHR CreateXlibSurfaceKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure and <b>must</b> be {@link KHRXlibSurface#VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR}.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code dpy} &ndash; a pointer to an Xlib {@code Display} connection to the X server.</li>
 * <li>{@code window} &ndash; an Xlib {@code Window} to associate the surface with.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkXlibSurfaceCreateInfoKHR {
    VkStructureType sType;
    const void * pNext;
    VkXlibSurfaceCreateFlagsKHR flags;
    Display * dpy;
    Window window;
}</code></pre>
 */
public class VkXlibSurfaceCreateInfoKHR extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		DPY,
		WINDOW;

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
		DPY = layout.offsetof(3);
		WINDOW = layout.offsetof(4);
	}

	VkXlibSurfaceCreateInfoKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkXlibSurfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkXlibSurfaceCreateInfoKHR(ByteBuffer container) {
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
	/** Returns the value of the {@code dpy} field. */
	public long dpy() { return ndpy(address()); }
	/** Returns the value of the {@code window} field. */
	public long window() { return nwindow(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkXlibSurfaceCreateInfoKHR sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkXlibSurfaceCreateInfoKHR pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkXlibSurfaceCreateInfoKHR flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code dpy} field. */
	public VkXlibSurfaceCreateInfoKHR dpy(long value) { ndpy(address(), value); return this; }
	/** Sets the specified value to the {@code window} field. */
	public VkXlibSurfaceCreateInfoKHR window(long value) { nwindow(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkXlibSurfaceCreateInfoKHR set(
		int sType,
		long pNext,
		int flags,
		long dpy,
		long window
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		dpy(dpy);
		window(window);

		return this;
	}

	/** Unsafe version of {@link #set(VkXlibSurfaceCreateInfoKHR) set}. */
	public VkXlibSurfaceCreateInfoKHR nset(long struct) {
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
	public VkXlibSurfaceCreateInfoKHR set(VkXlibSurfaceCreateInfoKHR src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkXlibSurfaceCreateInfoKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkXlibSurfaceCreateInfoKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
	public static VkXlibSurfaceCreateInfoKHR create() {
		return new VkXlibSurfaceCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkXlibSurfaceCreateInfoKHR create(long address) {
		return address == NULL ? null : new VkXlibSurfaceCreateInfoKHR(address, null);
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkXlibSurfaceCreateInfoKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkXlibSurfaceCreateInfoKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkXlibSurfaceCreateInfoKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkXlibSurfaceCreateInfoKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkXlibSurfaceCreateInfoKHR.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkXlibSurfaceCreateInfoKHR.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkXlibSurfaceCreateInfoKHR.FLAGS); }
	/** Unsafe version of {@link #dpy}. */
	public static long ndpy(long struct) { return memGetAddress(struct + VkXlibSurfaceCreateInfoKHR.DPY); }
	/** Unsafe version of {@link #window}. */
	public static long nwindow(long struct) { return memGetAddress(struct + VkXlibSurfaceCreateInfoKHR.WINDOW); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkXlibSurfaceCreateInfoKHR.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkXlibSurfaceCreateInfoKHR.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkXlibSurfaceCreateInfoKHR.FLAGS, value); }
	/** Unsafe version of {@link #dpy(long) dpy}. */
	public static void ndpy(long struct, long value) { memPutAddress(struct + VkXlibSurfaceCreateInfoKHR.DPY, checkPointer(value)); }
	/** Unsafe version of {@link #window(long) window}. */
	public static void nwindow(long struct, long value) { memPutAddress(struct + VkXlibSurfaceCreateInfoKHR.WINDOW, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkXlibSurfaceCreateInfoKHR.DPY));
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

	/** An array of {@link VkXlibSurfaceCreateInfoKHR} structs. */
	public static class Buffer extends StructBuffer<VkXlibSurfaceCreateInfoKHR, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkXlibSurfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkXlibSurfaceCreateInfoKHR newInstance(long address) {
			return new VkXlibSurfaceCreateInfoKHR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkXlibSurfaceCreateInfoKHR.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkXlibSurfaceCreateInfoKHR.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkXlibSurfaceCreateInfoKHR.nflags(address()); }
		/** Returns the value of the {@code dpy} field. */
		public long dpy() { return VkXlibSurfaceCreateInfoKHR.ndpy(address()); }
		/** Returns the value of the {@code window} field. */
		public long window() { return VkXlibSurfaceCreateInfoKHR.nwindow(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkXlibSurfaceCreateInfoKHR.Buffer sType(int value) { VkXlibSurfaceCreateInfoKHR.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkXlibSurfaceCreateInfoKHR.Buffer pNext(long value) { VkXlibSurfaceCreateInfoKHR.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkXlibSurfaceCreateInfoKHR.Buffer flags(int value) { VkXlibSurfaceCreateInfoKHR.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code dpy} field. */
		public VkXlibSurfaceCreateInfoKHR.Buffer dpy(long value) { VkXlibSurfaceCreateInfoKHR.ndpy(address(), value); return this; }
		/** Sets the specified value to the {@code window} field. */
		public VkXlibSurfaceCreateInfoKHR.Buffer window(long value) { VkXlibSurfaceCreateInfoKHR.nwindow(address(), value); return this; }

	}

}