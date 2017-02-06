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
 * Describe a display event to create.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code displayEvent} <b>must</b> be a valid {@code VkDisplayEventTypeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDisplayControl#vkRegisterDisplayEventEXT RegisterDisplayEventEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code displayEvent} &ndash; specifies when the fence will be signaled. Possible values are:
 * 
 * <pre><code>typedef enum VkDisplayEventTypeEXT {
    VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0,
} VkDisplayEventTypeEXT;</code></pre>
 * 
 * <ul>
 * <li>{@link EXTDisplayControl#VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT} occurs when the first pixel of the next display refresh cycle leaves the display engine for the display.</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDisplayEventInfoEXT {
    VkStructureType sType;
    const void * pNext;
    VkDisplayEventTypeEXT displayEvent;
}</code></pre>
 */
public class VkDisplayEventInfoEXT extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		DISPLAYEVENT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		DISPLAYEVENT = layout.offsetof(2);
	}

	VkDisplayEventInfoEXT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplayEventInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplayEventInfoEXT(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code displayEvent} field. */
	public int displayEvent() { return ndisplayEvent(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDisplayEventInfoEXT sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDisplayEventInfoEXT pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code displayEvent} field. */
	public VkDisplayEventInfoEXT displayEvent(int value) { ndisplayEvent(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDisplayEventInfoEXT set(
		int sType,
		long pNext,
		int displayEvent
	) {
		sType(sType);
		pNext(pNext);
		displayEvent(displayEvent);

		return this;
	}

	/** Unsafe version of {@link #set(VkDisplayEventInfoEXT) set}. */
	public VkDisplayEventInfoEXT nset(long struct) {
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
	public VkDisplayEventInfoEXT set(VkDisplayEventInfoEXT src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayEventInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayEventInfoEXT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayEventInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDisplayEventInfoEXT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplayEventInfoEXT} instance allocated with {@link BufferUtils}. */
	public static VkDisplayEventInfoEXT create() {
		return new VkDisplayEventInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplayEventInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplayEventInfoEXT create(long address) {
		return address == NULL ? null : new VkDisplayEventInfoEXT(address, null);
	}

	/**
	 * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplayEventInfoEXT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayEventInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDisplayEventInfoEXT mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDisplayEventInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDisplayEventInfoEXT callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayEventInfoEXT} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayEventInfoEXT mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayEventInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayEventInfoEXT callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDisplayEventInfoEXT.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDisplayEventInfoEXT.PNEXT); }
	/** Unsafe version of {@link #displayEvent}. */
	public static int ndisplayEvent(long struct) { return memGetInt(struct + VkDisplayEventInfoEXT.DISPLAYEVENT); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDisplayEventInfoEXT.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayEventInfoEXT.PNEXT, value); }
	/** Unsafe version of {@link #displayEvent(int) displayEvent}. */
	public static void ndisplayEvent(long struct, int value) { memPutInt(struct + VkDisplayEventInfoEXT.DISPLAYEVENT, value); }

	// -----------------------------------

	/** An array of {@link VkDisplayEventInfoEXT} structs. */
	public static class Buffer extends StructBuffer<VkDisplayEventInfoEXT, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkDisplayEventInfoEXT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplayEventInfoEXT#SIZEOF}, and its mark will be undefined.
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
		protected VkDisplayEventInfoEXT newInstance(long address) {
			return new VkDisplayEventInfoEXT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDisplayEventInfoEXT.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDisplayEventInfoEXT.npNext(address()); }
		/** Returns the value of the {@code displayEvent} field. */
		public int displayEvent() { return VkDisplayEventInfoEXT.ndisplayEvent(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDisplayEventInfoEXT.Buffer sType(int value) { VkDisplayEventInfoEXT.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDisplayEventInfoEXT.Buffer pNext(long value) { VkDisplayEventInfoEXT.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code displayEvent} field. */
		public VkDisplayEventInfoEXT.Buffer displayEvent(int value) { VkDisplayEventInfoEXT.ndisplayEvent(address(), value); return this; }

	}

}