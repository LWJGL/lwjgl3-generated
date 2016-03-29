/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
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
 * <pre><code>struct VkDisplayPropertiesKHR {
    VkDisplayKHR display;
    const char * displayName;
    {@link VkExtent2D VkExtent2D} physicalDimensions;
    {@link VkExtent2D VkExtent2D} physicalResolution;
    VkSurfaceTransformFlagsKHR supportedTransforms;
    VkBool32 planeReorderPossible;
    VkBool32 persistentContent;
}</code></pre>
 */
public class VkDisplayPropertiesKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		DISPLAY,
		DISPLAYNAME,
		PHYSICALDIMENSIONS,
		PHYSICALRESOLUTION,
		SUPPORTEDTRANSFORMS,
		PLANEREORDERPOSSIBLE,
		PERSISTENTCONTENT;

	static {
		Layout layout = __struct(
			__member(8),
			__member(POINTER_SIZE),
			__member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
			__member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		DISPLAY = layout.offsetof(0);
		DISPLAYNAME = layout.offsetof(1);
		PHYSICALDIMENSIONS = layout.offsetof(2);
		PHYSICALRESOLUTION = layout.offsetof(3);
		SUPPORTEDTRANSFORMS = layout.offsetof(4);
		PLANEREORDERPOSSIBLE = layout.offsetof(5);
		PERSISTENTCONTENT = layout.offsetof(6);
	}

	VkDisplayPropertiesKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplayPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplayPropertiesKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code display} field. */
	public long display() { return ndisplay(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code displayName} field. */
	public ByteBuffer displayName() { return ndisplayName(address()); }
	/** Decodes the null-terminated string pointed to by the {@code displayName} field. */
	public String displayNameString() { return ndisplayNameString(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code physicalDimensions} field. */
	public VkExtent2D physicalDimensions() { return nphysicalDimensions(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code physicalResolution} field. */
	public VkExtent2D physicalResolution() { return nphysicalResolution(address()); }
	/** Returns the value of the {@code supportedTransforms} field. */
	public int supportedTransforms() { return nsupportedTransforms(address()); }
	/** Returns the value of the {@code planeReorderPossible} field. */
	public int planeReorderPossible() { return nplaneReorderPossible(address()); }
	/** Returns the value of the {@code persistentContent} field. */
	public int persistentContent() { return npersistentContent(address()); }

	// -----------------------------------

	/** Returns a new {@link VkDisplayPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayPropertiesKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDisplayPropertiesKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplayPropertiesKHR} instance allocated with {@link BufferUtils}. */
	public static VkDisplayPropertiesKHR create() {
		return new VkDisplayPropertiesKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplayPropertiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplayPropertiesKHR create(long address) {
		return address == NULL ? null : new VkDisplayPropertiesKHR(address, null);
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplayPropertiesKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayPropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDisplayPropertiesKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDisplayPropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDisplayPropertiesKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayPropertiesKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayPropertiesKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #display}. */
	public static long ndisplay(long struct) { return memGetLong(struct + VkDisplayPropertiesKHR.DISPLAY); }
	/** Unsafe version of {@link #displayName}. */
	public static ByteBuffer ndisplayName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDisplayPropertiesKHR.DISPLAYNAME)); }
	/** Unsafe version of {@link #displayNameString}. */
	public static String ndisplayNameString(long struct) { return memUTF8(memGetAddress(struct + VkDisplayPropertiesKHR.DISPLAYNAME)); }
	/** Unsafe version of {@link #physicalDimensions}. */
	public static VkExtent2D nphysicalDimensions(long struct) { return VkExtent2D.create(struct + VkDisplayPropertiesKHR.PHYSICALDIMENSIONS); }
	/** Unsafe version of {@link #physicalResolution}. */
	public static VkExtent2D nphysicalResolution(long struct) { return VkExtent2D.create(struct + VkDisplayPropertiesKHR.PHYSICALRESOLUTION); }
	/** Unsafe version of {@link #supportedTransforms}. */
	public static int nsupportedTransforms(long struct) { return memGetInt(struct + VkDisplayPropertiesKHR.SUPPORTEDTRANSFORMS); }
	/** Unsafe version of {@link #planeReorderPossible}. */
	public static int nplaneReorderPossible(long struct) { return memGetInt(struct + VkDisplayPropertiesKHR.PLANEREORDERPOSSIBLE); }
	/** Unsafe version of {@link #persistentContent}. */
	public static int npersistentContent(long struct) { return memGetInt(struct + VkDisplayPropertiesKHR.PERSISTENTCONTENT); }

	// -----------------------------------

	/** An array of {@link VkDisplayPropertiesKHR} structs. */
	public static final class Buffer extends StructBuffer<VkDisplayPropertiesKHR, Buffer> {

		/**
		 * Creates a new {@link VkDisplayPropertiesKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplayPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkDisplayPropertiesKHR newInstance(long address) {
			return new VkDisplayPropertiesKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code display} field. */
		public long display() { return VkDisplayPropertiesKHR.ndisplay(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code displayName} field. */
		public ByteBuffer displayName() { return VkDisplayPropertiesKHR.ndisplayName(address()); }
		/** Decodes the null-terminated string pointed to by the {@code displayName} field. */
		public String displayNameString() { return VkDisplayPropertiesKHR.ndisplayNameString(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code physicalDimensions} field. */
		public VkExtent2D physicalDimensions() { return VkDisplayPropertiesKHR.nphysicalDimensions(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code physicalResolution} field. */
		public VkExtent2D physicalResolution() { return VkDisplayPropertiesKHR.nphysicalResolution(address()); }
		/** Returns the value of the {@code supportedTransforms} field. */
		public int supportedTransforms() { return VkDisplayPropertiesKHR.nsupportedTransforms(address()); }
		/** Returns the value of the {@code planeReorderPossible} field. */
		public int planeReorderPossible() { return VkDisplayPropertiesKHR.nplaneReorderPossible(address()); }
		/** Returns the value of the {@code persistentContent} field. */
		public int persistentContent() { return VkDisplayPropertiesKHR.npersistentContent(address()); }

	}

}